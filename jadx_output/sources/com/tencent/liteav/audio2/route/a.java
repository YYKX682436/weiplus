package com.tencent.liteav.audio2.route;

/* loaded from: classes14.dex */
public final class a extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final android.content.Context f46270a;

    /* renamed from: b, reason: collision with root package name */
    private final com.tencent.liteav.audio2.route.a.InterfaceC0010a f46271b;

    /* renamed from: com.tencent.liteav.audio2.route.a$a, reason: collision with other inner class name */
    /* loaded from: classes14.dex */
    public interface InterfaceC0010a {
        void onBluetoothConnectionChanged(boolean z17);

        void onBluetoothScoConnected(boolean z17);

        void onSystemVolumeChanged();

        void onUsbConnectionChanged(java.lang.String str, boolean z17);

        void onWiredHeadsetConnectionChanged(boolean z17);
    }

    public a(android.content.Context context, com.tencent.liteav.audio2.route.a.InterfaceC0010a interfaceC0010a) {
        this.f46270a = context;
        this.f46271b = interfaceC0010a;
    }

    private static java.lang.String a(int i17) {
        switch (i17) {
            case 10:
                return "STATE_OFF";
            case 11:
                return "STATE_TURNING_ON";
            case 12:
                return "STATE_ON";
            case 13:
                return "STATE_TURNING_OFF";
            default:
                return com.eclipsesource.mmv8.Platform.UNKNOWN;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        char c17;
        if (intent == null || context == null) {
            com.tencent.liteav.base.Log.e("AudioEventBroadcastReceiver", "Receive intent or context is null", new java.lang.Object[0]);
            return;
        }
        java.lang.String action = intent.getAction();
        if (action == null) {
            return;
        }
        switch (action.hashCode()) {
            case -2114103349:
                if (action.equals("android.hardware.usb.action.USB_DEVICE_ATTACHED")) {
                    c17 = 0;
                    break;
                }
                c17 = 65535;
                break;
            case -1940635523:
                if (action.equals("android.media.VOLUME_CHANGED_ACTION")) {
                    c17 = 1;
                    break;
                }
                c17 = 65535;
                break;
            case -1676458352:
                if (action.equals("android.intent.action.HEADSET_PLUG")) {
                    c17 = 2;
                    break;
                }
                c17 = 65535;
                break;
            case -1608292967:
                if (action.equals("android.hardware.usb.action.USB_DEVICE_DETACHED")) {
                    c17 = 3;
                    break;
                }
                c17 = 65535;
                break;
            case -1530327060:
                if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                    c17 = 4;
                    break;
                }
                c17 = 65535;
                break;
            case -1435586571:
                if (action.equals("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED")) {
                    c17 = 5;
                    break;
                }
                c17 = 65535;
                break;
            case 545516589:
                if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                    c17 = 6;
                    break;
                }
                c17 = 65535;
                break;
            default:
                c17 = 65535;
                break;
        }
        switch (c17) {
            case 0:
            case 3:
                android.hardware.usb.UsbDevice usbDevice = (android.hardware.usb.UsbDevice) intent.getParcelableExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_NAME);
                if (usbDevice != null) {
                    if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 21) {
                        com.tencent.liteav.base.Log.i("AudioEventBroadcastReceiver", "Usb device attached " + usbDevice.getProductName() + " manufacture " + usbDevice.getManufacturerName(), new java.lang.Object[0]);
                    }
                    if (!com.tencent.liteav.audio2.route.AudioDeviceProperty.isUsbHeadsetDevice(usbDevice)) {
                        com.tencent.liteav.base.Log.i("AudioEventBroadcastReceiver", "The attached usb device doesn't seem to support audio, ignore it", new java.lang.Object[0]);
                        return;
                    }
                    if ("android.hardware.usb.action.USB_DEVICE_ATTACHED".equals(intent.getAction())) {
                        this.f46271b.onUsbConnectionChanged(usbDevice.getProductName(), true);
                        return;
                    } else {
                        if ("android.hardware.usb.action.USB_DEVICE_DETACHED".equals(intent.getAction())) {
                            this.f46271b.onUsbConnectionChanged(usbDevice.getProductName(), false);
                            return;
                        }
                        com.tencent.liteav.base.Log.i("AudioEventBroadcastReceiver", "Unknown action, ignore it " + intent.getAction(), new java.lang.Object[0]);
                        return;
                    }
                }
                return;
            case 1:
                com.tencent.liteav.audio2.route.a.InterfaceC0010a interfaceC0010a = this.f46271b;
                if (interfaceC0010a != null) {
                    interfaceC0010a.onSystemVolumeChanged();
                    return;
                }
                return;
            case 2:
                int a17 = a(intent, "state", -1);
                com.tencent.liteav.base.Log.i("AudioEventBroadcastReceiver", "Receive ACTION_HEADSET_PLUG, EXTRA_STATE:".concat(java.lang.String.valueOf(a17)), new java.lang.Object[0]);
                if (a17 == -1) {
                    com.tencent.liteav.base.Log.e("AudioEventBroadcastReceiver", "Unknown headset state, ignore...", new java.lang.Object[0]);
                    return;
                } else {
                    this.f46271b.onWiredHeadsetConnectionChanged(a17 != 0);
                    return;
                }
            case 4:
                int a18 = a(intent, "android.bluetooth.adapter.extra.STATE", 0);
                com.tencent.liteav.base.Log.i("AudioEventBroadcastReceiver", "Receive ACTION_STATE_CHANGED, EXTRA_STATE:" + a(a18) + " EXTRA_PREVIOUS_STATE: " + a(a(intent, "android.bluetooth.adapter.extra.PREVIOUS_STATE", 0)), new java.lang.Object[0]);
                if (a18 == 10) {
                    this.f46271b.onBluetoothConnectionChanged(false);
                    return;
                }
                return;
            case 5:
                int a19 = a(intent, "android.bluetooth.profile.extra.STATE", 10);
                if (a19 == 12) {
                    com.tencent.liteav.base.Log.i("AudioEventBroadcastReceiver", "Receive bluetooth audio state changed to STATE_AUDIO_CONNECTED", new java.lang.Object[0]);
                    this.f46271b.onBluetoothScoConnected(true);
                    return;
                } else {
                    if (a19 == 10) {
                        com.tencent.liteav.base.Log.i("AudioEventBroadcastReceiver", "Receive bluetooth audio state changed to STATE_AUDIO_DISCONNECTED", new java.lang.Object[0]);
                        this.f46271b.onBluetoothScoConnected(false);
                        return;
                    }
                    return;
                }
            case 6:
                int a27 = a(intent, "android.bluetooth.profile.extra.STATE", -1);
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = a27 != 0 ? a27 != 1 ? a27 != 2 ? a27 != 3 ? com.eclipsesource.mmv8.Platform.UNKNOWN : "STATE_DISCONNECTING" : "STATE_CONNECTED" : "STATE_CONNECTING" : "STATE_DISCONNECTED";
                com.tencent.liteav.base.Log.i("AudioEventBroadcastReceiver", "Receive bluetooth headset connection state changed: %s", objArr);
                if (a27 == 0) {
                    this.f46271b.onBluetoothConnectionChanged(false);
                    return;
                } else {
                    if (a27 != 2) {
                        return;
                    }
                    this.f46271b.onBluetoothConnectionChanged(true);
                    return;
                }
            default:
                com.tencent.liteav.base.Log.w("AudioEventBroadcastReceiver", "Ignore unknown Action:".concat(action), new java.lang.Object[0]);
                return;
        }
    }

    private static int a(android.content.Intent intent, java.lang.String str, int i17) {
        try {
            return intent.getIntExtra(str, i17);
        } catch (java.lang.Exception e17) {
            com.tencent.liteav.base.Log.e("AudioEventBroadcastReceiver", "getIntentIntExtra ".concat(java.lang.String.valueOf(e17)), new java.lang.Object[0]);
            return i17;
        }
    }
}
