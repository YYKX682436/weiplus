package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/MmAoaManager;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "com/tencent/mm/plugin/backup/roambackup/k", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.backup.roambackup.MmAoaManager */
/* loaded from: classes5.dex */
public final class C12844xf7745c1a extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.C12844xf7745c1a f174086a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f174087b;

    /* renamed from: c, reason: collision with root package name */
    public static final android.hardware.usb.UsbManager f174088c;

    /* renamed from: d, reason: collision with root package name */
    public static final android.util.SparseIntArray f174089d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.ArrayList f174090e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f174091f;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.C12844xf7745c1a c12844xf7745c1a = new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.C12844xf7745c1a();
        f174086a = c12844xf7745c1a;
        f174087b = kz5.p1.d("WeChatUSB");
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("usb");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.hardware.usb.UsbManager");
        f174088c = (android.hardware.usb.UsbManager) systemService;
        f174089d = new android.util.SparseIntArray();
        f174090e = new java.util.ArrayList();
        f174091f = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l.f174167d);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("com.tencent.mm.aoa.action.USB_PERMISSION");
        intentFilter.addAction("android.hardware.usb.action.USB_ACCESSORY_DETACHED");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(c12844xf7745c1a, intentFilter, 4);
    }

    private C12844xf7745c1a() {
    }

    public final jz5.l a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MmAoaManager", "Try to find the target accessory to open");
        android.hardware.usb.UsbManager usbManager = f174088c;
        android.hardware.usb.UsbAccessory[] accessoryList = usbManager.getAccessoryList();
        if (accessoryList != null) {
            for (android.hardware.usb.UsbAccessory usbAccessory : accessoryList) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MmAoaManager", "List UsbAccessory: " + usbAccessory);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(usbAccessory);
                if (f174086a.b(usbAccessory)) {
                    if (!usbManager.hasPermission(usbAccessory)) {
                        return new jz5.l(usbAccessory, java.lang.Boolean.FALSE);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MmAoaManager", "A available accessory is found. " + usbAccessory);
                    return new jz5.l(usbAccessory, java.lang.Boolean.TRUE);
                }
            }
        }
        return new jz5.l(null, java.lang.Boolean.TRUE);
    }

    public final boolean b(android.hardware.usb.UsbAccessory usbAccessory) {
        java.lang.Object obj;
        jz5.g gVar = f174091f;
        if (((java.util.List) ((jz5.n) gVar).mo141623x754a37bb()) != null) {
            java.util.List list = (java.util.List) ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                jz5.l lVar = (jz5.l) obj;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(usbAccessory.getManufacturer(), lVar.f384366d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(usbAccessory.getModel(), lVar.f384367e)) {
                    break;
                }
            }
            if (obj != null) {
                return true;
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(usbAccessory.getManufacturer(), "WeChat") && f174087b.contains(usbAccessory.getModel())) {
            return true;
        }
        return false;
    }

    public final synchronized void c(android.hardware.usb.UsbAccessory usbAccessory) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MmAoaManager", "try to open an accessory = " + usbAccessory);
        if (!b(usbAccessory)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MmAoaManager", "Try to open an unsupported accessory.");
            return;
        }
        try {
            android.os.ParcelFileDescriptor openAccessory = f174088c.openAccessory(usbAccessory);
            if (openAccessory != null) {
                ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.m(openAccessory.getFd(), openAccessory), "onAccessoryOpened");
            }
        } catch (java.lang.RuntimeException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MmAoaManager", e17, "Fail to open an accessory", new java.lang.Object[0]);
        }
    }

    public final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.k listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MmAoaManager", "registerAccessoryListener listener=" + listener.hashCode());
        java.util.ArrayList arrayList = f174090e;
        synchronized (arrayList) {
            arrayList.add(listener);
        }
    }

    public final void e(android.hardware.usb.UsbAccessory accessory) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(accessory, "accessory");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MmAoaManager", "Requesting USB permission");
        f174088c.requestPermission(accessory, android.app.PendingIntent.getBroadcast(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 0, new android.content.Intent("com.tencent.mm.aoa.action.USB_PERMISSION"), 67108864));
        int hashCode = accessory.hashCode();
        android.util.SparseIntArray sparseIntArray = f174089d;
        synchronized (sparseIntArray) {
            i17 = sparseIntArray.get(hashCode) + 1;
            sparseIntArray.put(hashCode, i17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MmAoaManager", "Asked %s times = %s", accessory, java.lang.Integer.valueOf(i17));
    }

    public final void f(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.k listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MmAoaManager", "unregisterAccessoryListener listener=" + listener.hashCode());
        java.util.ArrayList arrayList = f174090e;
        synchronized (arrayList) {
            arrayList.remove(listener);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        synchronized (this) {
            java.lang.String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                boolean z17 = true;
                if (hashCode != 499619855) {
                    if (hashCode != 1099555123) {
                        if (hashCode == 1605365505 && action.equals("android.hardware.usb.action.USB_ACCESSORY_DETACHED")) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MmAoaManager", "action: %s", "android.hardware.usb.action.USB_ACCESSORY_DETACHED");
                            java.util.ArrayList arrayList = f174090e;
                            synchronized (arrayList) {
                                java.util.Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.k) it.next()).a(false);
                                }
                            }
                            android.util.SparseIntArray sparseIntArray = f174089d;
                            synchronized (sparseIntArray) {
                                sparseIntArray.clear();
                            }
                        }
                    } else if (action.equals("android.hardware.usb.action.USB_ACCESSORY_ATTACHED")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MmAoaManager", "action: %s", "android.hardware.usb.action.USB_ACCESSORY_ATTACHED");
                        android.hardware.usb.UsbAccessory usbAccessory = (android.hardware.usb.UsbAccessory) intent.getParcelableExtra("accessory");
                        if (usbAccessory != null) {
                            z17 = false;
                        }
                        if (z17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MmAoaManager", "Accessory is null.");
                            return;
                        }
                        if (!b(usbAccessory)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MmAoaManager", "Skip an unsupported accessory.");
                            return;
                        }
                        if (!intent.getBooleanExtra("permission", false)) {
                            android.hardware.usb.UsbManager usbManager = f174088c;
                            if (!usbManager.hasPermission(usbAccessory)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MmAoaManager", "Try request permission");
                                android.content.Intent intent2 = new android.content.Intent("com.tencent.mm.aoa.action.USB_PERMISSION");
                                intent2.putExtra("accessory", usbAccessory);
                                usbManager.requestPermission(usbAccessory, android.app.PendingIntent.getBroadcast(context, 0, intent2, 67108864));
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MmAoaManager", "Permission Granted");
                        c(usbAccessory);
                    }
                } else if (action.equals("com.tencent.mm.aoa.action.USB_PERMISSION")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MmAoaManager", "action: %s", "com.tencent.mm.aoa.action.USB_PERMISSION");
                    android.hardware.usb.UsbAccessory usbAccessory2 = (android.hardware.usb.UsbAccessory) intent.getParcelableExtra("accessory");
                    if (usbAccessory2 != null) {
                        z17 = false;
                    }
                    if (z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MmAoaManager", "Accessory is null.");
                        return;
                    }
                    if (!b(usbAccessory2)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MmAoaManager", "Found a unsupported accessory.");
                        return;
                    } else if (intent.getBooleanExtra("permission", false)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MmAoaManager", "Permission Granted");
                        c(usbAccessory2);
                        android.util.SparseIntArray sparseIntArray2 = f174089d;
                        synchronized (sparseIntArray2) {
                            sparseIntArray2.clear();
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MmAoaManager", "Permission NOT Granted");
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MmAoaManager", "action:" + intent.getAction());
        }
    }
}
