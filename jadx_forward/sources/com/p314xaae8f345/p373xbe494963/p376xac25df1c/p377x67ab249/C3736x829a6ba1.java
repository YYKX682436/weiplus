package com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::audio")
/* renamed from: com.tencent.liteav.audio2.route.AudioDeviceProperty */
/* loaded from: classes14.dex */
public class C3736x829a6ba1 implements com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.a.InterfaceC30880a {
    private static final java.lang.String TAG = "AudioDeviceProperty";

    /* renamed from: _hellAccFlag_ */
    private byte f14589x7f11beae;

    /* renamed from: mAudioDeviceCallback */
    private android.media.AudioDeviceCallback f14590x5370f484;

    /* renamed from: mAudioDeviceCallbackAvailable */
    private boolean f14591xcbf38aa5 = false;

    /* renamed from: mAudioEventBroadcastReceiver */
    private com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.a f14592x17be291f;

    /* renamed from: mAudioManager */
    private final android.media.AudioManager f14593x6ad04804;

    /* renamed from: mBluetoothHeadsetListener */
    private com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.b f14594x191c9a55;

    /* renamed from: mContext */
    private final android.content.Context f14595xd6cfe882;

    /* renamed from: mNativeAudioDeviceProperty */
    private long f14596xc1f223d;

    /* renamed from: com.tencent.liteav.audio2.route.AudioDeviceProperty$UsbAudioDeviceInfo */
    /* loaded from: classes14.dex */
    public static class UsbAudioDeviceInfo {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.String f127801a = "";

        /* renamed from: b, reason: collision with root package name */
        public java.lang.String f127802b = "";

        /* renamed from: getName */
        public java.lang.String m29233xfb82e301() {
            return this.f127801a;
        }

        /* renamed from: getVidPid */
        public java.lang.String m29234x34694eb0() {
            return this.f127802b;
        }
    }

    public C3736x829a6ba1(long j17) {
        this.f14596xc1f223d = j17;
        android.content.Context m29240x6e669035 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035();
        this.f14595xd6cfe882 = m29240x6e669035;
        this.f14593x6ad04804 = (android.media.AudioManager) m29240x6e669035.getSystemService("audio");
    }

    /* renamed from: buildAudioDeviceCallback */
    private void m29201xd6544e3() {
        if (this.f14590x5370f484 != null) {
            return;
        }
        this.f14590x5370f484 = new android.media.AudioDeviceCallback() { // from class: com.tencent.liteav.audio2.route.AudioDeviceProperty.1
            @Override // android.media.AudioDeviceCallback
            public final void onAudioDevicesAdded(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
                if (audioDeviceInfoArr.length == 0) {
                    return;
                }
                com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.C3736x829a6ba1.this.f14591xcbf38aa5 = true;
                for (android.media.AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.C3736x829a6ba1.TAG, "added device type is " + audioDeviceInfo.getType() + " sink: " + audioDeviceInfo.isSink() + " product name: " + ((java.lang.Object) audioDeviceInfo.getProductName()), new java.lang.Object[0]);
                    if (audioDeviceInfo.getType() == 8 && com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() > 30) {
                        com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.C3736x829a6ba1.m29203xb46e7454(com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.C3736x829a6ba1.this.f14596xc1f223d, true);
                    } else if (audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 12 || audioDeviceInfo.getType() == 22) {
                        com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.C3736x829a6ba1.m29206x4a8e763e(com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.C3736x829a6ba1.this.f14596xc1f223d, audioDeviceInfo.getProductName().toString(), com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.C3736x829a6ba1.this.m29218x85640281());
                    } else if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 4) {
                        com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.C3736x829a6ba1.m29207x79ba32df(com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.C3736x829a6ba1.this.f14596xc1f223d, true);
                    }
                }
            }

            @Override // android.media.AudioDeviceCallback
            public final void onAudioDevicesRemoved(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
                if (audioDeviceInfoArr.length == 0) {
                    return;
                }
                for (android.media.AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.C3736x829a6ba1.TAG, "removed device type is " + audioDeviceInfo.getType() + " sink: " + audioDeviceInfo.isSink() + " product name: " + ((java.lang.Object) audioDeviceInfo.getProductName()), new java.lang.Object[0]);
                    if (audioDeviceInfo.getType() == 8 && com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() > 30) {
                        com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.C3736x829a6ba1.m29203xb46e7454(com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.C3736x829a6ba1.this.f14596xc1f223d, false);
                    } else if (audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 12 || audioDeviceInfo.getType() == 22) {
                        com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.C3736x829a6ba1.m29206x4a8e763e(com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.C3736x829a6ba1.this.f14596xc1f223d, audioDeviceInfo.getProductName().toString(), com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.C3736x829a6ba1.this.m29218x85640281());
                    } else if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 4) {
                        com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.C3736x829a6ba1.m29207x79ba32df(com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.C3736x829a6ba1.this.f14596xc1f223d, false);
                    }
                }
            }
        };
    }

    /* renamed from: isUsbHeadsetDevice */
    public static boolean m29202x940a819e(android.hardware.usb.UsbDevice usbDevice) {
        if (usbDevice == null) {
            return false;
        }
        for (int i17 = 0; i17 < usbDevice.getInterfaceCount(); i17++) {
            try {
                if (usbDevice.getInterface(i17).getInterfaceClass() == 1) {
                    return true;
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "Get interface exception " + th6.getMessage(), new java.lang.Object[0]);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeNotifyBluetoothConnectionChangedFromJava */
    public static native void m29203xb46e7454(long j17, boolean z17);

    /* renamed from: nativeNotifyBluetoothScoConnectedFromJava */
    private static native void m29204x5028ba24(long j17, boolean z17);

    /* renamed from: nativeNotifySystemVolumeChangedFromJava */
    private static native void m29205xd97dd7f7(long j17);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeNotifyUsbConnectionChangedFromJava */
    public static native void m29206x4a8e763e(long j17, java.lang.String str, boolean z17);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeNotifyWiredHeadsetConnectionChangedFromJava */
    public static native void m29207x79ba32df(long j17, boolean z17);

    /* renamed from: registerAudioDeviceCallback */
    private void m29208xe7bd3e8e() {
        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() < 23) {
            return;
        }
        if (this.f14590x5370f484 == null) {
            m29201xd6544e3();
        }
        android.media.AudioDeviceCallback audioDeviceCallback = this.f14590x5370f484;
        if (audioDeviceCallback == null) {
            return;
        }
        try {
            this.f14593x6ad04804.registerAudioDeviceCallback(audioDeviceCallback, null);
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "register audio device callback", new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "registerAudioDeviceCallback exception " + th6.getMessage(), new java.lang.Object[0]);
        }
    }

    /* renamed from: unregisterAudioDeviceCallback */
    private void m29209x4311d855() {
        android.media.AudioDeviceCallback audioDeviceCallback;
        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 23 && (audioDeviceCallback = this.f14590x5370f484) != null) {
            try {
                this.f14593x6ad04804.unregisterAudioDeviceCallback(audioDeviceCallback);
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "unregister audio device callback", new java.lang.Object[0]);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "unregisterAudioDeviceCallback exception " + th6.getMessage(), new java.lang.Object[0]);
            }
        }
    }

    /* renamed from: GetUsbAudioDeviceInfo */
    public com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.C3736x829a6ba1.UsbAudioDeviceInfo m29210x7fb46c4c(java.lang.String str) {
        android.hardware.usb.UsbManager usbManager;
        com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.C3736x829a6ba1.UsbAudioDeviceInfo usbAudioDeviceInfo = new com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.C3736x829a6ba1.UsbAudioDeviceInfo();
        try {
            usbManager = (android.hardware.usb.UsbManager) this.f14595xd6cfe882.getSystemService("usb");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "getDeviceList exception " + th6.getMessage(), new java.lang.Object[0]);
        }
        if (usbManager != null && com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 21) {
            for (android.hardware.usb.UsbDevice usbDevice : usbManager.getDeviceList().values()) {
                if (str.contains(usbDevice.getProductName()) || m29202x940a819e(usbDevice)) {
                    usbAudioDeviceInfo.f127801a = usbDevice.getProductName();
                    usbAudioDeviceInfo.f127802b = java.lang.String.valueOf(usbDevice.getVendorId()) + usbDevice.getProductId();
                }
            }
            return usbAudioDeviceInfo;
        }
        return usbAudioDeviceInfo;
    }

    /* renamed from: checkBluetoothPermission */
    public boolean m29211x8dbbd8f5() {
        return com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.b.a(this.f14595xd6cfe882);
    }

    /* renamed from: getMode */
    public int m29212xfb82a219() {
        try {
            return this.f14593x6ad04804.getMode();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "Get mode exception " + th6.getMessage(), new java.lang.Object[0]);
            return 0;
        }
    }

    /* renamed from: getSystemVolume */
    public int m29213x3cc6389f() {
        try {
            android.media.AudioManager audioManager = this.f14593x6ad04804;
            return audioManager.getStreamVolume(audioManager.getMode() == 0 ? 3 : 0);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "getStreamVolume exception " + th6.getMessage(), new java.lang.Object[0]);
            return -1;
        }
    }

    /* renamed from: isBluetoothHeadsetConnected */
    public boolean m29214xbdeca36b() {
        com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.b bVar = this.f14594x191c9a55;
        if (bVar != null) {
            return bVar.a();
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "mBluetoothHeadsetListener is null", new java.lang.Object[0]);
        return false;
    }

    /* renamed from: isBluetoothScoConnected */
    public boolean m29215x43700c6e() {
        try {
            new android.content.IntentFilter();
            android.content.Intent registerReceiver = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035().registerReceiver(null, new android.content.IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
            if (registerReceiver == null) {
                return false;
            }
            return registerReceiver.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0) == 1;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "isBluetoothScoConnected exception " + th6.getMessage(), new java.lang.Object[0]);
            return false;
        }
    }

    /* renamed from: isBluetoothScoOn */
    public boolean m29216xb3658c1a() {
        try {
            return this.f14593x6ad04804.isBluetoothScoOn();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "isBluetoothScoOn exception " + th6.getMessage(), new java.lang.Object[0]);
            return false;
        }
    }

    /* renamed from: isSpeakerphoneOn */
    public boolean m29217xa2d79ed8() {
        try {
            return this.f14593x6ad04804.isSpeakerphoneOn();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "isSpeakerphoneOn exception " + th6.getMessage(), new java.lang.Object[0]);
            return false;
        }
    }

    /* renamed from: isUsbHeadsetAvailable */
    public boolean m29218x85640281() {
        android.hardware.usb.UsbManager usbManager;
        try {
            usbManager = (android.hardware.usb.UsbManager) this.f14595xd6cfe882.getSystemService("usb");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "getDeviceList exception " + th6.getMessage(), new java.lang.Object[0]);
        }
        if (usbManager == null) {
            return false;
        }
        java.util.Iterator<android.hardware.usb.UsbDevice> it = usbManager.getDeviceList().values().iterator();
        while (it.hasNext()) {
            if (m29202x940a819e(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isWiredHeadsetOn */
    public boolean m29219x7c037a0c() {
        try {
            return this.f14593x6ad04804.isWiredHeadsetOn();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "isWiredHeadsetOn exception " + th6.getMessage(), new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.a.InterfaceC30880a
    /* renamed from: onBluetoothConnectionChanged */
    public void mo29220x6fd51627(boolean z17) {
        m29203xb46e7454(this.f14596xc1f223d, z17);
    }

    @Override // com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.a.InterfaceC30880a
    /* renamed from: onBluetoothScoConnected */
    public void mo29221x5ffcfed9(boolean z17) {
        m29204x5028ba24(this.f14596xc1f223d, z17);
    }

    @Override // com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.a.InterfaceC30880a
    /* renamed from: onSystemVolumeChanged */
    public void mo29222x3eca1bec() {
        m29205xd97dd7f7(this.f14596xc1f223d);
    }

    @Override // com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.a.InterfaceC30880a
    /* renamed from: onUsbConnectionChanged */
    public void mo29223x16f2f551(java.lang.String str, boolean z17) {
        if (this.f14591xcbf38aa5) {
            return;
        }
        m29206x4a8e763e(this.f14596xc1f223d, str, z17);
    }

    @Override // com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.a.InterfaceC30880a
    /* renamed from: onWiredHeadsetConnectionChanged */
    public void mo29224x2a4b1194(boolean z17) {
        if (this.f14591xcbf38aa5) {
            return;
        }
        m29207x79ba32df(this.f14596xc1f223d, z17);
    }

    /* renamed from: setBluetoothScoOn */
    public void m29225xc3483952(boolean z17) {
        try {
            this.f14593x6ad04804.setBluetoothScoOn(z17);
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "setBluetoothScoOn ".concat(java.lang.String.valueOf(z17)), new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "setBluetoothScoOn exception " + th6.getMessage(), new java.lang.Object[0]);
        }
    }

    /* renamed from: setSpeakerphoneOn */
    public void m29226xb2ba4c10(boolean z17) {
        try {
            this.f14593x6ad04804.setSpeakerphoneOn(z17);
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "setSpeakerphoneOn ".concat(java.lang.String.valueOf(z17)), new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "setSpeakerphoneOn exception " + th6.getMessage(), new java.lang.Object[0]);
        }
    }

    /* renamed from: setVoip */
    public void m29227x76518122(boolean z17) {
        int i17 = z17 ? 3 : 0;
        try {
            this.f14593x6ad04804.setMode(i17);
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "setMode ".concat(java.lang.String.valueOf(i17)), new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "Set mode exception " + th6.getMessage(), new java.lang.Object[0]);
        }
    }

    /* renamed from: setWiredHeadsetOn */
    public void m29228x8be62744(boolean z17) {
        try {
            this.f14593x6ad04804.setWiredHeadsetOn(z17);
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "setWiredHeadsetOn ".concat(java.lang.String.valueOf(z17)), new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "setWiredHeadsetOn exception " + th6.getMessage(), new java.lang.Object[0]);
        }
    }

    /* renamed from: start */
    public void m29229x68ac462() {
        m29208xe7bd3e8e();
        com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.a aVar = new com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.a(this.f14595xd6cfe882, this);
        this.f14592x17be291f = aVar;
        try {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
            intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            aVar.f127803a.registerReceiver(aVar, intentFilter);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e("AudioEventBroadcastReceiver", "register broadcast exception", new java.lang.Object[0]);
        }
        this.f14594x191c9a55 = new com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.b(this.f14595xd6cfe882);
    }

    /* renamed from: startBluetoothSco */
    public void m29230xdd5ef013() {
        try {
            android.media.AudioManager audioManager = this.f14593x6ad04804;
            yj0.a.c(audioManager, "com/tencent/liteav/audio2/route/AudioDeviceProperty", "startBluetoothSco", "()V", "android/media/AudioManager_EXEC_", "startBluetoothSco", "()V");
            audioManager.startBluetoothSco();
            yj0.a.f(audioManager, "com/tencent/liteav/audio2/route/AudioDeviceProperty", "startBluetoothSco", "()V", "android/media/AudioManager_EXEC_", "startBluetoothSco", "()V");
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "startBluetoothSco", new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "startBluetoothSco exception " + th6.getMessage(), new java.lang.Object[0]);
        }
    }

    /* renamed from: stop */
    public void m29231x360802() {
        android.content.Context context;
        com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.a aVar = this.f14592x17be291f;
        if (aVar != null && (context = aVar.f127803a) != null) {
            try {
                context.unregisterReceiver(aVar);
            } catch (java.lang.Exception unused) {
            }
        }
        this.f14592x17be291f = null;
        com.p314xaae8f345.p373xbe494963.p376xac25df1c.p377x67ab249.b bVar = this.f14594x191c9a55;
        if (bVar != null) {
            synchronized (bVar.f127807c) {
                if (bVar.f127805a != null && bVar.f127806b != null) {
                    bVar.b();
                    bVar.f127806b = null;
                }
            }
        }
        this.f14594x191c9a55 = null;
        m29209x4311d855();
    }

    /* renamed from: stopBluetoothSco */
    public void m29232xb21c3b3() {
        try {
            android.media.AudioManager audioManager = this.f14593x6ad04804;
            yj0.a.c(audioManager, "com/tencent/liteav/audio2/route/AudioDeviceProperty", "stopBluetoothSco", "()V", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
            audioManager.stopBluetoothSco();
            yj0.a.f(audioManager, "com/tencent/liteav/audio2/route/AudioDeviceProperty", "stopBluetoothSco", "()V", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "stopBluetoothSco", new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "stopBluetoothSco exception " + th6.getMessage(), new java.lang.Object[0]);
        }
    }
}
