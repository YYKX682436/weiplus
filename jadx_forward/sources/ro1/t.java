package ro1;

/* loaded from: classes5.dex */
public final class t implements ro1.e {

    /* renamed from: d, reason: collision with root package name */
    public static final ro1.t f479541d = new ro1.t();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f479542e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f479543f = java.util.Collections.synchronizedSet(new java.util.HashSet());

    /* renamed from: g, reason: collision with root package name */
    public static final android.content.BroadcastReceiver f479544g = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.backup.roambackup.udisk.UsbDevicesDiscover$mUsbReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
            java.lang.String action = intent.getAction();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.roam_backup.USB_PERMISSION", action)) {
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(ro1.t.f479542e.remove(java.lang.Integer.valueOf(intent.getIntExtra("hashcode", 0))));
                intent.getBooleanExtra("permission", false);
            } else {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("android.hardware.usb.action.USB_DEVICE_ATTACHED", action)) {
                    android.hardware.usb.UsbDevice usbDevice = (android.hardware.usb.UsbDevice) intent.getParcelableExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54472x96df1280);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.UsbDevicesDiscover", "USB device attached");
                    if (usbDevice != null) {
                        ro1.t.f479541d.a(1);
                        return;
                    }
                    return;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("android.hardware.usb.action.USB_DEVICE_DETACHED", action)) {
                    android.hardware.usb.UsbDevice usbDevice2 = (android.hardware.usb.UsbDevice) intent.getParcelableExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54472x96df1280);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.UsbDevicesDiscover", "USB device detached");
                    if (usbDevice2 != null) {
                        ro1.t.f479541d.a(1);
                    }
                }
            }
        }
    };

    /* renamed from: h, reason: collision with root package name */
    public static java.util.List f479545h = ro1.v.f479547a.b();

    @Override // ro1.e
    public void X4(java.util.List devices) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(devices, "devices");
        if (devices.isEmpty()) {
            return;
        }
        java.util.List a17 = ro1.v.f479547a.a();
        java.util.ArrayList<po1.d> arrayList = new java.util.ArrayList();
        java.util.Iterator it = a17.iterator();
        while (true) {
            boolean z17 = true;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            po1.d dVar = (po1.d) next;
            if (!devices.isEmpty()) {
                java.util.Iterator it6 = devices.iterator();
                while (it6.hasNext()) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar.f438833f, ((po1.d) it6.next()).f438833f)) {
                        break;
                    }
                }
            }
            z17 = false;
            if (z17) {
                arrayList.add(next);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.UsbDevicesDiscover", "onVolumeUnmounted, boundDevices = " + arrayList);
        if (!arrayList.isEmpty()) {
            for (po1.d dVar2 : arrayList) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.UsbDevicesDiscover", "onVolumeUnmounted, disconnectAsync = " + dVar2.f438828a);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o1 c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.c(dVar2.f438828a);
                if (c17 != null) {
                    c17.b(ro1.o.f479531a);
                }
            }
        }
    }

    public final void a(int i17) {
        if (i17 > 7) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.UsbDevicesDiscover", "Try check storage volumes time: %s", java.lang.Integer.valueOf(i17));
        ku5.t0 t0Var = (ku5.t0) ku5.t0.f394148d;
        t0Var.getClass();
        t0Var.w(new ro1.m(i17), i17 * 1000, "StorageVolumeChanges");
    }

    @Override // ro1.e
    public void e5(java.util.List devices) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(devices, "devices");
        if (devices.isEmpty()) {
            return;
        }
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RoamBackup.UsbDevicesDiscover", "Account not ready. Ignore this event.");
            return;
        }
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e.f174347u;
        java.lang.ref.WeakReference weakReference2 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e.f174347u;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e activityC12868xd8a7d79e = weakReference2 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e) weakReference2.get() : null;
        if (activityC12868xd8a7d79e != null && !activityC12868xd8a7d79e.isFinishing() && !activityC12868xd8a7d79e.isDestroyed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.UsbDevicesDiscover", "Skip showing the bottom sheet because the user already in CreatePackageUI");
            return;
        }
        if (ho1.c.f364166b > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.UsbDevicesDiscover", "Skip showing the bottom sheet because backup activity is running");
            return;
        }
        java.util.List a17 = ro1.v.f479547a.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : a17) {
            po1.d dVar = (po1.d) obj;
            if (!devices.isEmpty()) {
                java.util.Iterator it = devices.iterator();
                while (it.hasNext()) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar.f438833f, ((po1.d) it.next()).f438833f)) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (z17) {
                arrayList.add(obj);
            }
        }
        new ro1.n(new p3321xbce91901.jvm.p3324x21ffc6bd.f0(), arrayList, devices).run();
    }
}
