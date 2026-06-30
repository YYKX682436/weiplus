package com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249;

/* loaded from: classes14.dex */
public final class a extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final android.content.Context f127803a;

    /* renamed from: b, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.a.InterfaceC30880a f127804b;

    /* renamed from: com.tencent.liteav.audio2.route.a$a, reason: collision with other inner class name */
    /* loaded from: classes14.dex */
    public interface InterfaceC30880a {
        /* renamed from: onBluetoothConnectionChanged */
        void mo29220x6fd51627(boolean z17);

        /* renamed from: onBluetoothScoConnected */
        void mo29221x5ffcfed9(boolean z17);

        /* renamed from: onSystemVolumeChanged */
        void mo29222x3eca1bec();

        /* renamed from: onUsbConnectionChanged */
        void mo29223x16f2f551(java.lang.String str, boolean z17);

        /* renamed from: onWiredHeadsetConnectionChanged */
        void mo29224x2a4b1194(boolean z17);
    }

    public a(android.content.Context context, com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.a.InterfaceC30880a interfaceC30880a) {
        this.f127803a = context;
        this.f127804b = interfaceC30880a;
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
                return com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        char c17;
        if (intent == null || context == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e("AudioEventBroadcastReceiver", "Receive intent or context is null", new java.lang.Object[0]);
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
                android.hardware.usb.UsbDevice usbDevice = (android.hardware.usb.UsbDevice) intent.getParcelableExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54472x96df1280);
                if (usbDevice != null) {
                    if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 21) {
                        com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i("AudioEventBroadcastReceiver", "Usb device attached " + usbDevice.getProductName() + " manufacture " + usbDevice.getManufacturerName(), new java.lang.Object[0]);
                    }
                    if (!com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.C3736x829a6ba1.m29202x940a819e(usbDevice)) {
                        com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i("AudioEventBroadcastReceiver", "The attached usb device doesn't seem to support audio, ignore it", new java.lang.Object[0]);
                        return;
                    }
                    if ("android.hardware.usb.action.USB_DEVICE_ATTACHED".equals(intent.getAction())) {
                        this.f127804b.mo29223x16f2f551(usbDevice.getProductName(), true);
                        return;
                    } else {
                        if ("android.hardware.usb.action.USB_DEVICE_DETACHED".equals(intent.getAction())) {
                            this.f127804b.mo29223x16f2f551(usbDevice.getProductName(), false);
                            return;
                        }
                        com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i("AudioEventBroadcastReceiver", "Unknown action, ignore it " + intent.getAction(), new java.lang.Object[0]);
                        return;
                    }
                }
                return;
            case 1:
                com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.a.InterfaceC30880a interfaceC30880a = this.f127804b;
                if (interfaceC30880a != null) {
                    interfaceC30880a.mo29222x3eca1bec();
                    return;
                }
                return;
            case 2:
                int a17 = a(intent, "state", -1);
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i("AudioEventBroadcastReceiver", "Receive ACTION_HEADSET_PLUG, EXTRA_STATE:".concat(java.lang.String.valueOf(a17)), new java.lang.Object[0]);
                if (a17 == -1) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e("AudioEventBroadcastReceiver", "Unknown headset state, ignore...", new java.lang.Object[0]);
                    return;
                } else {
                    this.f127804b.mo29224x2a4b1194(a17 != 0);
                    return;
                }
            case 4:
                int a18 = a(intent, "android.bluetooth.adapter.extra.STATE", 0);
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i("AudioEventBroadcastReceiver", "Receive ACTION_STATE_CHANGED, EXTRA_STATE:" + a(a18) + " EXTRA_PREVIOUS_STATE: " + a(a(intent, "android.bluetooth.adapter.extra.PREVIOUS_STATE", 0)), new java.lang.Object[0]);
                if (a18 == 10) {
                    this.f127804b.mo29220x6fd51627(false);
                    return;
                }
                return;
            case 5:
                int a19 = a(intent, "android.bluetooth.profile.extra.STATE", 10);
                if (a19 == 12) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i("AudioEventBroadcastReceiver", "Receive bluetooth audio state changed to STATE_AUDIO_CONNECTED", new java.lang.Object[0]);
                    this.f127804b.mo29221x5ffcfed9(true);
                    return;
                } else {
                    if (a19 == 10) {
                        com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i("AudioEventBroadcastReceiver", "Receive bluetooth audio state changed to STATE_AUDIO_DISCONNECTED", new java.lang.Object[0]);
                        this.f127804b.mo29221x5ffcfed9(false);
                        return;
                    }
                    return;
                }
            case 6:
                int a27 = a(intent, "android.bluetooth.profile.extra.STATE", -1);
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = a27 != 0 ? a27 != 1 ? a27 != 2 ? a27 != 3 ? com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a : "STATE_DISCONNECTING" : "STATE_CONNECTED" : "STATE_CONNECTING" : "STATE_DISCONNECTED";
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i("AudioEventBroadcastReceiver", "Receive bluetooth headset connection state changed: %s", objArr);
                if (a27 == 0) {
                    this.f127804b.mo29220x6fd51627(false);
                    return;
                } else {
                    if (a27 != 2) {
                        return;
                    }
                    this.f127804b.mo29220x6fd51627(true);
                    return;
                }
            default:
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.w("AudioEventBroadcastReceiver", "Ignore unknown Action:".concat(action), new java.lang.Object[0]);
                return;
        }
    }

    private static int a(android.content.Intent intent, java.lang.String str, int i17) {
        try {
            return intent.getIntExtra(str, i17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e("AudioEventBroadcastReceiver", "getIntentIntExtra ".concat(java.lang.String.valueOf(e17)), new java.lang.Object[0]);
            return i17;
        }
    }
}
