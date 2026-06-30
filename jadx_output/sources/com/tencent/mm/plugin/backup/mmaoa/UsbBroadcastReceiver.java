package com.tencent.mm.plugin.backup.mmaoa;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/backup/mmaoa/UsbBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "zn1/w", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class UsbBroadcastReceiver extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final zn1.w f92551a = new zn1.w(null);

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.coroutines.flow.i2 f92552b = kotlinx.coroutines.flow.r2.b(5, 0, null, 6, null);

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        android.hardware.usb.UsbDevice usbDevice;
        android.hardware.usb.UsbAccessory usbAccessory;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        com.tencent.mars.xlog.Log.i("UsbBroadcastReceiver", "[onReceive] action=" + intent.getAction() + ", intent.extras=" + intent.getExtras());
        java.lang.String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -2114103349:
                    if (action.equals("android.hardware.usb.action.USB_DEVICE_ATTACHED")) {
                        android.hardware.usb.UsbDevice usbDevice2 = (android.hardware.usb.UsbDevice) intent.getParcelableExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_NAME);
                        if (usbDevice2 == null) {
                            com.tencent.mars.xlog.Log.w("UsbBroadcastReceiver", "[ACTION_USB_DEVICE_ATTACHED] Fail to get device from intent");
                            return;
                        }
                        if (!com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.isForeground()) {
                            com.tencent.mars.xlog.Log.i("UsbBroadcastReceiver", "Skip processing device in background. device=" + usbDevice2);
                            return;
                        } else {
                            if (((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Di()) {
                                ((ku5.t0) ku5.t0.f312615d).g(zn1.y.f474482d);
                                return;
                            }
                            com.tencent.mars.xlog.Log.w("UsbBroadcastReceiver", "Aoa expt is not enable, skip processing device. device=" + usbDevice2);
                            return;
                        }
                    }
                    return;
                case -1608292967:
                    if (action.equals("android.hardware.usb.action.USB_DEVICE_DETACHED") && (usbDevice = (android.hardware.usb.UsbDevice) intent.getParcelableExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_NAME)) != null) {
                        com.tencent.mars.xlog.Log.i("UsbBroadcastReceiver", "device detached: " + usbDevice);
                        return;
                    }
                    return;
                case -778913588:
                    if (action.equals("com.tencent.mmaoa.USB_DEVICE_PERMISSION")) {
                        java.lang.String stringExtra = intent.getStringExtra("mmaoa.permission_req_uuid");
                        if (stringExtra == null) {
                            com.tencent.mars.xlog.Log.w("UsbBroadcastReceiver", "Fail to get reqUuid from intent");
                            return;
                        }
                        android.hardware.usb.UsbDevice usbDevice3 = (android.hardware.usb.UsbDevice) intent.getParcelableExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_NAME);
                        if (usbDevice3 == null) {
                            com.tencent.mars.xlog.Log.w("UsbBroadcastReceiver", "Fail to get device from intent");
                            ((kotlinx.coroutines.flow.q2) f92552b).e(new zn1.l0(stringExtra));
                            return;
                        } else {
                            if (intent.getBooleanExtra("permission", false)) {
                                ((kotlinx.coroutines.flow.q2) f92552b).e(new zn1.k0(stringExtra));
                                return;
                            }
                            com.tencent.mars.xlog.Log.i("UsbBroadcastReceiver", "permission denied for device " + usbDevice3);
                            ((kotlinx.coroutines.flow.q2) f92552b).e(new zn1.j0(stringExtra));
                            return;
                        }
                    }
                    return;
                case -402758840:
                    if (action.equals("com.tencent.mmaoa.USB_ACCESSORY_PERMISSION")) {
                        java.lang.String stringExtra2 = intent.getStringExtra("mmaoa.permission_req_uuid");
                        if (stringExtra2 == null) {
                            com.tencent.mars.xlog.Log.w("UsbBroadcastReceiver", "Fail to get reqUuid from intent");
                            return;
                        }
                        android.hardware.usb.UsbAccessory usbAccessory2 = (android.hardware.usb.UsbAccessory) intent.getParcelableExtra("accessory");
                        if (usbAccessory2 == null) {
                            com.tencent.mars.xlog.Log.w("UsbBroadcastReceiver", "Fail to get accessory from intent");
                            ((kotlinx.coroutines.flow.q2) f92552b).e(new zn1.l0(stringExtra2));
                            return;
                        } else {
                            if (intent.getBooleanExtra("permission", false)) {
                                ((kotlinx.coroutines.flow.q2) f92552b).e(new zn1.k0(stringExtra2));
                                return;
                            }
                            com.tencent.mars.xlog.Log.i("UsbBroadcastReceiver", "permission denied for accessory=" + usbAccessory2);
                            ((kotlinx.coroutines.flow.q2) f92552b).e(new zn1.j0(stringExtra2));
                            return;
                        }
                    }
                    return;
                case 1605365505:
                    if (action.equals("android.hardware.usb.action.USB_ACCESSORY_DETACHED") && (usbAccessory = (android.hardware.usb.UsbAccessory) intent.getParcelableExtra("accessory")) != null) {
                        com.tencent.mars.xlog.Log.i("UsbBroadcastReceiver", "accessory detached: " + usbAccessory);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
