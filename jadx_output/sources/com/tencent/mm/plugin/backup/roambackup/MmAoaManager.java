package com.tencent.mm.plugin.backup.roambackup;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/MmAoaManager;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "com/tencent/mm/plugin/backup/roambackup/k", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MmAoaManager extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.backup.roambackup.MmAoaManager f92553a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f92554b;

    /* renamed from: c, reason: collision with root package name */
    public static final android.hardware.usb.UsbManager f92555c;

    /* renamed from: d, reason: collision with root package name */
    public static final android.util.SparseIntArray f92556d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.ArrayList f92557e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f92558f;

    static {
        com.tencent.mm.plugin.backup.roambackup.MmAoaManager mmAoaManager = new com.tencent.mm.plugin.backup.roambackup.MmAoaManager();
        f92553a = mmAoaManager;
        f92554b = kz5.p1.d("WeChatUSB");
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("usb");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.hardware.usb.UsbManager");
        f92555c = (android.hardware.usb.UsbManager) systemService;
        f92556d = new android.util.SparseIntArray();
        f92557e = new java.util.ArrayList();
        f92558f = jz5.h.b(com.tencent.mm.plugin.backup.roambackup.l.f92634d);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("com.tencent.mm.aoa.action.USB_PERMISSION");
        intentFilter.addAction("android.hardware.usb.action.USB_ACCESSORY_DETACHED");
        com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(mmAoaManager, intentFilter, 4);
    }

    private MmAoaManager() {
    }

    public final jz5.l a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MmAoaManager", "Try to find the target accessory to open");
        android.hardware.usb.UsbManager usbManager = f92555c;
        android.hardware.usb.UsbAccessory[] accessoryList = usbManager.getAccessoryList();
        if (accessoryList != null) {
            for (android.hardware.usb.UsbAccessory usbAccessory : accessoryList) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MmAoaManager", "List UsbAccessory: " + usbAccessory);
                kotlin.jvm.internal.o.d(usbAccessory);
                if (f92553a.b(usbAccessory)) {
                    if (!usbManager.hasPermission(usbAccessory)) {
                        return new jz5.l(usbAccessory, java.lang.Boolean.FALSE);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.MmAoaManager", "A available accessory is found. " + usbAccessory);
                    return new jz5.l(usbAccessory, java.lang.Boolean.TRUE);
                }
            }
        }
        return new jz5.l(null, java.lang.Boolean.TRUE);
    }

    public final boolean b(android.hardware.usb.UsbAccessory usbAccessory) {
        java.lang.Object obj;
        jz5.g gVar = f92558f;
        if (((java.util.List) ((jz5.n) gVar).getValue()) != null) {
            java.util.List list = (java.util.List) ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.d(list);
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                jz5.l lVar = (jz5.l) obj;
                if (kotlin.jvm.internal.o.b(usbAccessory.getManufacturer(), lVar.f302833d) && kotlin.jvm.internal.o.b(usbAccessory.getModel(), lVar.f302834e)) {
                    break;
                }
            }
            if (obj != null) {
                return true;
            }
        } else if (kotlin.jvm.internal.o.b(usbAccessory.getManufacturer(), "WeChat") && f92554b.contains(usbAccessory.getModel())) {
            return true;
        }
        return false;
    }

    public final synchronized void c(android.hardware.usb.UsbAccessory usbAccessory) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MmAoaManager", "try to open an accessory = " + usbAccessory);
        if (!b(usbAccessory)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MmAoaManager", "Try to open an unsupported accessory.");
            return;
        }
        try {
            android.os.ParcelFileDescriptor openAccessory = f92555c.openAccessory(usbAccessory);
            if (openAccessory != null) {
                ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.backup.roambackup.m(openAccessory.getFd(), openAccessory), "onAccessoryOpened");
            }
        } catch (java.lang.RuntimeException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MmAoaManager", e17, "Fail to open an accessory", new java.lang.Object[0]);
        }
    }

    public final void d(com.tencent.mm.plugin.backup.roambackup.k listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mars.xlog.Log.i("MicroMsg.MmAoaManager", "registerAccessoryListener listener=" + listener.hashCode());
        java.util.ArrayList arrayList = f92557e;
        synchronized (arrayList) {
            arrayList.add(listener);
        }
    }

    public final void e(android.hardware.usb.UsbAccessory accessory) {
        int i17;
        kotlin.jvm.internal.o.g(accessory, "accessory");
        com.tencent.mars.xlog.Log.i("MicroMsg.MmAoaManager", "Requesting USB permission");
        f92555c.requestPermission(accessory, android.app.PendingIntent.getBroadcast(com.tencent.mm.sdk.platformtools.x2.f193071a, 0, new android.content.Intent("com.tencent.mm.aoa.action.USB_PERMISSION"), 67108864));
        int hashCode = accessory.hashCode();
        android.util.SparseIntArray sparseIntArray = f92556d;
        synchronized (sparseIntArray) {
            i17 = sparseIntArray.get(hashCode) + 1;
            sparseIntArray.put(hashCode, i17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MmAoaManager", "Asked %s times = %s", accessory, java.lang.Integer.valueOf(i17));
    }

    public final void f(com.tencent.mm.plugin.backup.roambackup.k listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mars.xlog.Log.i("MicroMsg.MmAoaManager", "unregisterAccessoryListener listener=" + listener.hashCode());
        java.util.ArrayList arrayList = f92557e;
        synchronized (arrayList) {
            arrayList.remove(listener);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        synchronized (this) {
            java.lang.String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                boolean z17 = true;
                if (hashCode != 499619855) {
                    if (hashCode != 1099555123) {
                        if (hashCode == 1605365505 && action.equals("android.hardware.usb.action.USB_ACCESSORY_DETACHED")) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.MmAoaManager", "action: %s", "android.hardware.usb.action.USB_ACCESSORY_DETACHED");
                            java.util.ArrayList arrayList = f92557e;
                            synchronized (arrayList) {
                                java.util.Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ((com.tencent.mm.plugin.backup.roambackup.k) it.next()).a(false);
                                }
                            }
                            android.util.SparseIntArray sparseIntArray = f92556d;
                            synchronized (sparseIntArray) {
                                sparseIntArray.clear();
                            }
                        }
                    } else if (action.equals("android.hardware.usb.action.USB_ACCESSORY_ATTACHED")) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MmAoaManager", "action: %s", "android.hardware.usb.action.USB_ACCESSORY_ATTACHED");
                        android.hardware.usb.UsbAccessory usbAccessory = (android.hardware.usb.UsbAccessory) intent.getParcelableExtra("accessory");
                        if (usbAccessory != null) {
                            z17 = false;
                        }
                        if (z17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.MmAoaManager", "Accessory is null.");
                            return;
                        }
                        if (!b(usbAccessory)) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.MmAoaManager", "Skip an unsupported accessory.");
                            return;
                        }
                        if (!intent.getBooleanExtra("permission", false)) {
                            android.hardware.usb.UsbManager usbManager = f92555c;
                            if (!usbManager.hasPermission(usbAccessory)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.MmAoaManager", "Try request permission");
                                android.content.Intent intent2 = new android.content.Intent("com.tencent.mm.aoa.action.USB_PERMISSION");
                                intent2.putExtra("accessory", usbAccessory);
                                usbManager.requestPermission(usbAccessory, android.app.PendingIntent.getBroadcast(context, 0, intent2, 67108864));
                            }
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.MmAoaManager", "Permission Granted");
                        c(usbAccessory);
                    }
                } else if (action.equals("com.tencent.mm.aoa.action.USB_PERMISSION")) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MmAoaManager", "action: %s", "com.tencent.mm.aoa.action.USB_PERMISSION");
                    android.hardware.usb.UsbAccessory usbAccessory2 = (android.hardware.usb.UsbAccessory) intent.getParcelableExtra("accessory");
                    if (usbAccessory2 != null) {
                        z17 = false;
                    }
                    if (z17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MmAoaManager", "Accessory is null.");
                        return;
                    }
                    if (!b(usbAccessory2)) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.MmAoaManager", "Found a unsupported accessory.");
                        return;
                    } else if (intent.getBooleanExtra("permission", false)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MmAoaManager", "Permission Granted");
                        c(usbAccessory2);
                        android.util.SparseIntArray sparseIntArray2 = f92556d;
                        synchronized (sparseIntArray2) {
                            sparseIntArray2.clear();
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MmAoaManager", "Permission NOT Granted");
                    }
                }
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.MmAoaManager", "action:" + intent.getAction());
        }
    }
}
