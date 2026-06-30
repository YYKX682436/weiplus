package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1257x6330853;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/backup/mmaoa/UsbBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "zn1/w", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.backup.mmaoa.UsbBroadcastReceiver */
/* loaded from: classes11.dex */
public final class C12843xa53acccc extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final zn1.w f174084a = new zn1.w(null);

    /* renamed from: b, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f174085b = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(5, 0, null, 6, null);

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        android.hardware.usb.UsbDevice usbDevice;
        android.hardware.usb.UsbAccessory usbAccessory;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UsbBroadcastReceiver", "[onReceive] action=" + intent.getAction() + ", intent.extras=" + intent.getExtras());
        java.lang.String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -2114103349:
                    if (action.equals("android.hardware.usb.action.USB_DEVICE_ATTACHED")) {
                        android.hardware.usb.UsbDevice usbDevice2 = (android.hardware.usb.UsbDevice) intent.getParcelableExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54472x96df1280);
                        if (usbDevice2 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("UsbBroadcastReceiver", "[ACTION_USB_DEVICE_ATTACHED] Fail to get device from intent");
                            return;
                        }
                        if (!com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40975xf7b3660d()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UsbBroadcastReceiver", "Skip processing device in background. device=" + usbDevice2);
                            return;
                        } else {
                            if (((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Di()) {
                                ((ku5.t0) ku5.t0.f394148d).g(zn1.y.f556015d);
                                return;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("UsbBroadcastReceiver", "Aoa expt is not enable, skip processing device. device=" + usbDevice2);
                            return;
                        }
                    }
                    return;
                case -1608292967:
                    if (action.equals("android.hardware.usb.action.USB_DEVICE_DETACHED") && (usbDevice = (android.hardware.usb.UsbDevice) intent.getParcelableExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54472x96df1280)) != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UsbBroadcastReceiver", "device detached: " + usbDevice);
                        return;
                    }
                    return;
                case -778913588:
                    if (action.equals("com.tencent.mmaoa.USB_DEVICE_PERMISSION")) {
                        java.lang.String stringExtra = intent.getStringExtra("mmaoa.permission_req_uuid");
                        if (stringExtra == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("UsbBroadcastReceiver", "Fail to get reqUuid from intent");
                            return;
                        }
                        android.hardware.usb.UsbDevice usbDevice3 = (android.hardware.usb.UsbDevice) intent.getParcelableExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54472x96df1280);
                        if (usbDevice3 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("UsbBroadcastReceiver", "Fail to get device from intent");
                            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) f174085b).e(new zn1.l0(stringExtra));
                            return;
                        } else {
                            if (intent.getBooleanExtra("permission", false)) {
                                ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) f174085b).e(new zn1.k0(stringExtra));
                                return;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UsbBroadcastReceiver", "permission denied for device " + usbDevice3);
                            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) f174085b).e(new zn1.j0(stringExtra));
                            return;
                        }
                    }
                    return;
                case -402758840:
                    if (action.equals("com.tencent.mmaoa.USB_ACCESSORY_PERMISSION")) {
                        java.lang.String stringExtra2 = intent.getStringExtra("mmaoa.permission_req_uuid");
                        if (stringExtra2 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("UsbBroadcastReceiver", "Fail to get reqUuid from intent");
                            return;
                        }
                        android.hardware.usb.UsbAccessory usbAccessory2 = (android.hardware.usb.UsbAccessory) intent.getParcelableExtra("accessory");
                        if (usbAccessory2 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("UsbBroadcastReceiver", "Fail to get accessory from intent");
                            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) f174085b).e(new zn1.l0(stringExtra2));
                            return;
                        } else {
                            if (intent.getBooleanExtra("permission", false)) {
                                ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) f174085b).e(new zn1.k0(stringExtra2));
                                return;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UsbBroadcastReceiver", "permission denied for accessory=" + usbAccessory2);
                            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) f174085b).e(new zn1.j0(stringExtra2));
                            return;
                        }
                    }
                    return;
                case 1605365505:
                    if (action.equals("android.hardware.usb.action.USB_ACCESSORY_DETACHED") && (usbAccessory = (android.hardware.usb.UsbAccessory) intent.getParcelableExtra("accessory")) != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UsbBroadcastReceiver", "accessory detached: " + usbAccessory);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
