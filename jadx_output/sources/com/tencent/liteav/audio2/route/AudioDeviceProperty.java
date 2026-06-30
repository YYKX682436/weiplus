package com.tencent.liteav.audio2.route;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::audio")
/* loaded from: classes14.dex */
public class AudioDeviceProperty implements com.tencent.liteav.audio2.route.a.InterfaceC0010a {
    private static final java.lang.String TAG = "AudioDeviceProperty";
    private byte _hellAccFlag_;
    private android.media.AudioDeviceCallback mAudioDeviceCallback;
    private boolean mAudioDeviceCallbackAvailable = false;
    private com.tencent.liteav.audio2.route.a mAudioEventBroadcastReceiver;
    private final android.media.AudioManager mAudioManager;
    private com.tencent.liteav.audio2.route.b mBluetoothHeadsetListener;
    private final android.content.Context mContext;
    private long mNativeAudioDeviceProperty;

    /* loaded from: classes14.dex */
    public static class UsbAudioDeviceInfo {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.String f46268a = "";

        /* renamed from: b, reason: collision with root package name */
        public java.lang.String f46269b = "";

        public java.lang.String getName() {
            return this.f46268a;
        }

        public java.lang.String getVidPid() {
            return this.f46269b;
        }
    }

    public AudioDeviceProperty(long j17) {
        this.mNativeAudioDeviceProperty = j17;
        android.content.Context applicationContext = com.tencent.liteav.base.ContextUtils.getApplicationContext();
        this.mContext = applicationContext;
        this.mAudioManager = (android.media.AudioManager) applicationContext.getSystemService("audio");
    }

    private void buildAudioDeviceCallback() {
        if (this.mAudioDeviceCallback != null) {
            return;
        }
        this.mAudioDeviceCallback = new android.media.AudioDeviceCallback() { // from class: com.tencent.liteav.audio2.route.AudioDeviceProperty.1
            @Override // android.media.AudioDeviceCallback
            public final void onAudioDevicesAdded(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
                if (audioDeviceInfoArr.length == 0) {
                    return;
                }
                com.tencent.liteav.audio2.route.AudioDeviceProperty.this.mAudioDeviceCallbackAvailable = true;
                for (android.media.AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    com.tencent.liteav.base.Log.i(com.tencent.liteav.audio2.route.AudioDeviceProperty.TAG, "added device type is " + audioDeviceInfo.getType() + " sink: " + audioDeviceInfo.isSink() + " product name: " + ((java.lang.Object) audioDeviceInfo.getProductName()), new java.lang.Object[0]);
                    if (audioDeviceInfo.getType() == 8 && com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() > 30) {
                        com.tencent.liteav.audio2.route.AudioDeviceProperty.nativeNotifyBluetoothConnectionChangedFromJava(com.tencent.liteav.audio2.route.AudioDeviceProperty.this.mNativeAudioDeviceProperty, true);
                    } else if (audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 12 || audioDeviceInfo.getType() == 22) {
                        com.tencent.liteav.audio2.route.AudioDeviceProperty.nativeNotifyUsbConnectionChangedFromJava(com.tencent.liteav.audio2.route.AudioDeviceProperty.this.mNativeAudioDeviceProperty, audioDeviceInfo.getProductName().toString(), com.tencent.liteav.audio2.route.AudioDeviceProperty.this.isUsbHeadsetAvailable());
                    } else if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 4) {
                        com.tencent.liteav.audio2.route.AudioDeviceProperty.nativeNotifyWiredHeadsetConnectionChangedFromJava(com.tencent.liteav.audio2.route.AudioDeviceProperty.this.mNativeAudioDeviceProperty, true);
                    }
                }
            }

            @Override // android.media.AudioDeviceCallback
            public final void onAudioDevicesRemoved(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
                if (audioDeviceInfoArr.length == 0) {
                    return;
                }
                for (android.media.AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    com.tencent.liteav.base.Log.i(com.tencent.liteav.audio2.route.AudioDeviceProperty.TAG, "removed device type is " + audioDeviceInfo.getType() + " sink: " + audioDeviceInfo.isSink() + " product name: " + ((java.lang.Object) audioDeviceInfo.getProductName()), new java.lang.Object[0]);
                    if (audioDeviceInfo.getType() == 8 && com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() > 30) {
                        com.tencent.liteav.audio2.route.AudioDeviceProperty.nativeNotifyBluetoothConnectionChangedFromJava(com.tencent.liteav.audio2.route.AudioDeviceProperty.this.mNativeAudioDeviceProperty, false);
                    } else if (audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 12 || audioDeviceInfo.getType() == 22) {
                        com.tencent.liteav.audio2.route.AudioDeviceProperty.nativeNotifyUsbConnectionChangedFromJava(com.tencent.liteav.audio2.route.AudioDeviceProperty.this.mNativeAudioDeviceProperty, audioDeviceInfo.getProductName().toString(), com.tencent.liteav.audio2.route.AudioDeviceProperty.this.isUsbHeadsetAvailable());
                    } else if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 4) {
                        com.tencent.liteav.audio2.route.AudioDeviceProperty.nativeNotifyWiredHeadsetConnectionChangedFromJava(com.tencent.liteav.audio2.route.AudioDeviceProperty.this.mNativeAudioDeviceProperty, false);
                    }
                }
            }
        };
    }

    public static boolean isUsbHeadsetDevice(android.hardware.usb.UsbDevice usbDevice) {
        if (usbDevice == null) {
            return false;
        }
        for (int i17 = 0; i17 < usbDevice.getInterfaceCount(); i17++) {
            try {
                if (usbDevice.getInterface(i17).getInterfaceClass() == 1) {
                    return true;
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.liteav.base.Log.e(TAG, "Get interface exception " + th6.getMessage(), new java.lang.Object[0]);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeNotifyBluetoothConnectionChangedFromJava(long j17, boolean z17);

    private static native void nativeNotifyBluetoothScoConnectedFromJava(long j17, boolean z17);

    private static native void nativeNotifySystemVolumeChangedFromJava(long j17);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeNotifyUsbConnectionChangedFromJava(long j17, java.lang.String str, boolean z17);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeNotifyWiredHeadsetConnectionChangedFromJava(long j17, boolean z17);

    private void registerAudioDeviceCallback() {
        if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() < 23) {
            return;
        }
        if (this.mAudioDeviceCallback == null) {
            buildAudioDeviceCallback();
        }
        android.media.AudioDeviceCallback audioDeviceCallback = this.mAudioDeviceCallback;
        if (audioDeviceCallback == null) {
            return;
        }
        try {
            this.mAudioManager.registerAudioDeviceCallback(audioDeviceCallback, null);
            com.tencent.liteav.base.Log.i(TAG, "register audio device callback", new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.Log.e(TAG, "registerAudioDeviceCallback exception " + th6.getMessage(), new java.lang.Object[0]);
        }
    }

    private void unregisterAudioDeviceCallback() {
        android.media.AudioDeviceCallback audioDeviceCallback;
        if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 23 && (audioDeviceCallback = this.mAudioDeviceCallback) != null) {
            try {
                this.mAudioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
                com.tencent.liteav.base.Log.i(TAG, "unregister audio device callback", new java.lang.Object[0]);
            } catch (java.lang.Throwable th6) {
                com.tencent.liteav.base.Log.e(TAG, "unregisterAudioDeviceCallback exception " + th6.getMessage(), new java.lang.Object[0]);
            }
        }
    }

    public com.tencent.liteav.audio2.route.AudioDeviceProperty.UsbAudioDeviceInfo GetUsbAudioDeviceInfo(java.lang.String str) {
        android.hardware.usb.UsbManager usbManager;
        com.tencent.liteav.audio2.route.AudioDeviceProperty.UsbAudioDeviceInfo usbAudioDeviceInfo = new com.tencent.liteav.audio2.route.AudioDeviceProperty.UsbAudioDeviceInfo();
        try {
            usbManager = (android.hardware.usb.UsbManager) this.mContext.getSystemService("usb");
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.Log.i(TAG, "getDeviceList exception " + th6.getMessage(), new java.lang.Object[0]);
        }
        if (usbManager != null && com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 21) {
            for (android.hardware.usb.UsbDevice usbDevice : usbManager.getDeviceList().values()) {
                if (str.contains(usbDevice.getProductName()) || isUsbHeadsetDevice(usbDevice)) {
                    usbAudioDeviceInfo.f46268a = usbDevice.getProductName();
                    usbAudioDeviceInfo.f46269b = java.lang.String.valueOf(usbDevice.getVendorId()) + usbDevice.getProductId();
                }
            }
            return usbAudioDeviceInfo;
        }
        return usbAudioDeviceInfo;
    }

    public boolean checkBluetoothPermission() {
        return com.tencent.liteav.audio2.route.b.a(this.mContext);
    }

    public int getMode() {
        try {
            return this.mAudioManager.getMode();
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.Log.i(TAG, "Get mode exception " + th6.getMessage(), new java.lang.Object[0]);
            return 0;
        }
    }

    public int getSystemVolume() {
        try {
            android.media.AudioManager audioManager = this.mAudioManager;
            return audioManager.getStreamVolume(audioManager.getMode() == 0 ? 3 : 0);
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.Log.e(TAG, "getStreamVolume exception " + th6.getMessage(), new java.lang.Object[0]);
            return -1;
        }
    }

    public boolean isBluetoothHeadsetConnected() {
        com.tencent.liteav.audio2.route.b bVar = this.mBluetoothHeadsetListener;
        if (bVar != null) {
            return bVar.a();
        }
        com.tencent.liteav.base.Log.e(TAG, "mBluetoothHeadsetListener is null", new java.lang.Object[0]);
        return false;
    }

    public boolean isBluetoothScoConnected() {
        try {
            new android.content.IntentFilter();
            android.content.Intent registerReceiver = com.tencent.liteav.base.ContextUtils.getApplicationContext().registerReceiver(null, new android.content.IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
            if (registerReceiver == null) {
                return false;
            }
            return registerReceiver.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0) == 1;
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.Log.i(TAG, "isBluetoothScoConnected exception " + th6.getMessage(), new java.lang.Object[0]);
            return false;
        }
    }

    public boolean isBluetoothScoOn() {
        try {
            return this.mAudioManager.isBluetoothScoOn();
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.Log.i(TAG, "isBluetoothScoOn exception " + th6.getMessage(), new java.lang.Object[0]);
            return false;
        }
    }

    public boolean isSpeakerphoneOn() {
        try {
            return this.mAudioManager.isSpeakerphoneOn();
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.Log.i(TAG, "isSpeakerphoneOn exception " + th6.getMessage(), new java.lang.Object[0]);
            return false;
        }
    }

    public boolean isUsbHeadsetAvailable() {
        android.hardware.usb.UsbManager usbManager;
        try {
            usbManager = (android.hardware.usb.UsbManager) this.mContext.getSystemService("usb");
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.Log.i(TAG, "getDeviceList exception " + th6.getMessage(), new java.lang.Object[0]);
        }
        if (usbManager == null) {
            return false;
        }
        java.util.Iterator<android.hardware.usb.UsbDevice> it = usbManager.getDeviceList().values().iterator();
        while (it.hasNext()) {
            if (isUsbHeadsetDevice(it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean isWiredHeadsetOn() {
        try {
            return this.mAudioManager.isWiredHeadsetOn();
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.Log.i(TAG, "isWiredHeadsetOn exception " + th6.getMessage(), new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.tencent.liteav.audio2.route.a.InterfaceC0010a
    public void onBluetoothConnectionChanged(boolean z17) {
        nativeNotifyBluetoothConnectionChangedFromJava(this.mNativeAudioDeviceProperty, z17);
    }

    @Override // com.tencent.liteav.audio2.route.a.InterfaceC0010a
    public void onBluetoothScoConnected(boolean z17) {
        nativeNotifyBluetoothScoConnectedFromJava(this.mNativeAudioDeviceProperty, z17);
    }

    @Override // com.tencent.liteav.audio2.route.a.InterfaceC0010a
    public void onSystemVolumeChanged() {
        nativeNotifySystemVolumeChangedFromJava(this.mNativeAudioDeviceProperty);
    }

    @Override // com.tencent.liteav.audio2.route.a.InterfaceC0010a
    public void onUsbConnectionChanged(java.lang.String str, boolean z17) {
        if (this.mAudioDeviceCallbackAvailable) {
            return;
        }
        nativeNotifyUsbConnectionChangedFromJava(this.mNativeAudioDeviceProperty, str, z17);
    }

    @Override // com.tencent.liteav.audio2.route.a.InterfaceC0010a
    public void onWiredHeadsetConnectionChanged(boolean z17) {
        if (this.mAudioDeviceCallbackAvailable) {
            return;
        }
        nativeNotifyWiredHeadsetConnectionChangedFromJava(this.mNativeAudioDeviceProperty, z17);
    }

    public void setBluetoothScoOn(boolean z17) {
        try {
            this.mAudioManager.setBluetoothScoOn(z17);
            com.tencent.liteav.base.Log.i(TAG, "setBluetoothScoOn ".concat(java.lang.String.valueOf(z17)), new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.Log.i(TAG, "setBluetoothScoOn exception " + th6.getMessage(), new java.lang.Object[0]);
        }
    }

    public void setSpeakerphoneOn(boolean z17) {
        try {
            this.mAudioManager.setSpeakerphoneOn(z17);
            com.tencent.liteav.base.Log.i(TAG, "setSpeakerphoneOn ".concat(java.lang.String.valueOf(z17)), new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.Log.i(TAG, "setSpeakerphoneOn exception " + th6.getMessage(), new java.lang.Object[0]);
        }
    }

    public void setVoip(boolean z17) {
        int i17 = z17 ? 3 : 0;
        try {
            this.mAudioManager.setMode(i17);
            com.tencent.liteav.base.Log.i(TAG, "setMode ".concat(java.lang.String.valueOf(i17)), new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.Log.i(TAG, "Set mode exception " + th6.getMessage(), new java.lang.Object[0]);
        }
    }

    public void setWiredHeadsetOn(boolean z17) {
        try {
            this.mAudioManager.setWiredHeadsetOn(z17);
            com.tencent.liteav.base.Log.i(TAG, "setWiredHeadsetOn ".concat(java.lang.String.valueOf(z17)), new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.Log.i(TAG, "setWiredHeadsetOn exception " + th6.getMessage(), new java.lang.Object[0]);
        }
    }

    public void start() {
        registerAudioDeviceCallback();
        com.tencent.liteav.audio2.route.a aVar = new com.tencent.liteav.audio2.route.a(this.mContext, this);
        this.mAudioEventBroadcastReceiver = aVar;
        try {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
            intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            aVar.f46270a.registerReceiver(aVar, intentFilter);
        } catch (java.lang.Throwable unused) {
            com.tencent.liteav.base.Log.e("AudioEventBroadcastReceiver", "register broadcast exception", new java.lang.Object[0]);
        }
        this.mBluetoothHeadsetListener = new com.tencent.liteav.audio2.route.b(this.mContext);
    }

    public void startBluetoothSco() {
        try {
            android.media.AudioManager audioManager = this.mAudioManager;
            yj0.a.c(audioManager, "com/tencent/liteav/audio2/route/AudioDeviceProperty", "startBluetoothSco", "()V", "android/media/AudioManager_EXEC_", "startBluetoothSco", "()V");
            audioManager.startBluetoothSco();
            yj0.a.f(audioManager, "com/tencent/liteav/audio2/route/AudioDeviceProperty", "startBluetoothSco", "()V", "android/media/AudioManager_EXEC_", "startBluetoothSco", "()V");
            com.tencent.liteav.base.Log.i(TAG, "startBluetoothSco", new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.Log.i(TAG, "startBluetoothSco exception " + th6.getMessage(), new java.lang.Object[0]);
        }
    }

    public void stop() {
        android.content.Context context;
        com.tencent.liteav.audio2.route.a aVar = this.mAudioEventBroadcastReceiver;
        if (aVar != null && (context = aVar.f46270a) != null) {
            try {
                context.unregisterReceiver(aVar);
            } catch (java.lang.Exception unused) {
            }
        }
        this.mAudioEventBroadcastReceiver = null;
        com.tencent.liteav.audio2.route.b bVar = this.mBluetoothHeadsetListener;
        if (bVar != null) {
            synchronized (bVar.f46274c) {
                if (bVar.f46272a != null && bVar.f46273b != null) {
                    bVar.b();
                    bVar.f46273b = null;
                }
            }
        }
        this.mBluetoothHeadsetListener = null;
        unregisterAudioDeviceCallback();
    }

    public void stopBluetoothSco() {
        try {
            android.media.AudioManager audioManager = this.mAudioManager;
            yj0.a.c(audioManager, "com/tencent/liteav/audio2/route/AudioDeviceProperty", "stopBluetoothSco", "()V", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
            audioManager.stopBluetoothSco();
            yj0.a.f(audioManager, "com/tencent/liteav/audio2/route/AudioDeviceProperty", "stopBluetoothSco", "()V", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
            com.tencent.liteav.base.Log.i(TAG, "stopBluetoothSco", new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.Log.i(TAG, "stopBluetoothSco exception " + th6.getMessage(), new java.lang.Object[0]);
        }
    }
}
