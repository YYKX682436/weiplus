package com.p314xaae8f345.p373xbe494963.p393x32b0ec;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav")
/* renamed from: com.tencent.liteav.live.TXLivePlayerJni */
/* loaded from: classes14.dex */
public class C3796x213fa554 implements com.p314xaae8f345.p2926x359365.a, com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.b {
    private static final java.lang.String TAG = "TXLivePlayerJni";

    /* renamed from: mAudioRawDataListener */
    private com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXAudioRawDataListener f14811xbe5bd01d;

    /* renamed from: mAudioVolumeEvaluationListener */
    private com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXAudioVolumeEvaluationListener f14812xfaaa553;

    /* renamed from: mGLContext */
    private java.lang.Object f14813x9509133d = null;

    /* renamed from: mListener */
    private com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 f14814x753a6c41;

    /* renamed from: mNativeTXLivePlayerJni */
    protected long f14815x10009f0;

    /* renamed from: mSnapshotListener */
    private com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXSnapshotListener f14816x65e9c525;

    /* renamed from: mVideoRawDataListener */
    private com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXVideoRawDataListener f14817xd7fe58d8;

    /* renamed from: mVideoRecordListener */
    private com.p314xaae8f345.ugc.C26824x75ddfa40.ITXVideoRecordListener f14818xd124afd3;

    /* renamed from: mVideoRenderListener */
    private com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXLivePlayVideoRenderListener f14819x73f67018;

    public C3796x213fa554(android.content.Context context) {
        this.f14815x10009f0 = 0L;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29241x91f62b6f(context.getApplicationContext());
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29246xa5f59752("liteav");
        this.f14815x10009f0 = m29742x73c02ff3(new java.lang.ref.WeakReference(this));
    }

    /* renamed from: genFilePath */
    private static java.lang.String m29737xd6665331(android.content.Context context, java.lang.String str) {
        if (context == null) {
            return null;
        }
        try {
            java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis() / 1000);
            java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss").format(new java.util.Date(java.lang.Long.valueOf(valueOf + "000").longValue()));
            java.lang.String m29738x6b690bde = m29738x6b690bde(context);
            if (android.text.TextUtils.isEmpty(m29738x6b690bde)) {
                return null;
            }
            return new java.io.File(m29738x6b690bde, java.lang.String.format("TXUGC_%s".concat(java.lang.String.valueOf(str)), format)).getAbsolutePath();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "create file path failed.", e17);
            return null;
        }
    }

    /* renamed from: getDiskFileDir */
    private static java.lang.String m29738x6b690bde(android.content.Context context) {
        if (context == null) {
            return null;
        }
        if (!"mounted".equals(android.os.Environment.getExternalStorageState()) && android.os.Environment.isExternalStorageRemovable()) {
            return context.getFilesDir().getPath();
        }
        java.io.File externalFilesDir = context.getExternalFilesDir(android.os.Environment.DIRECTORY_MOVIES);
        return externalFilesDir != null ? externalFilesDir.getPath() : null;
    }

    /* renamed from: getMapKeys */
    public static java.lang.String[] m29739x6fa8753a(java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String[] strArr = new java.lang.String[map.size()];
        java.util.Iterator<java.lang.String> it = map.keySet().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            strArr[i17] = it.next();
            i17++;
        }
        return strArr;
    }

    /* renamed from: getMapValues */
    public static java.lang.String[] m29740x39e72ae8(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String[] strArr) {
        java.lang.String[] strArr2 = new java.lang.String[map.size()];
        int length = strArr.length;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            strArr2[i18] = map.get(strArr[i17]);
            i17++;
            i18++;
        }
        return strArr2;
    }

    /* renamed from: nativeCallExperimentalAPI */
    private static native void m29741x63f4483d(long j17, java.lang.String str);

    /* renamed from: nativeCreate */
    private static native long m29742x73c02ff3(java.lang.ref.WeakReference<com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3796x213fa554> weakReference);

    /* renamed from: nativeDestroy */
    private static native void m29743x23caefe3(long j17);

    /* renamed from: nativeEnableAudioVolumeEvaluation */
    private static native void m29744x5eaeb192(long j17, int i17);

    /* renamed from: nativeEnableCustomAudioProcess */
    private static native void m29745x7a9f81e4(long j17, boolean z17);

    /* renamed from: nativeEnableCustomRenderI420 */
    private static native void m29746xb7cfd20a(long j17, boolean z17);

    /* renamed from: nativeEnableCustomRenderTexture */
    private static native void m29747xfec897da(long j17, boolean z17, java.lang.Object obj);

    /* renamed from: nativeEnableHardwareDecode */
    private static native void m29748x15617910(long j17, boolean z17);

    /* renamed from: nativeGetCurrentRenderPts */
    private static native long m29749xea1a25df(long j17);

    /* renamed from: nativeIsPlaying */
    private static native boolean m29750xa669114d(long j17);

    /* renamed from: nativePause */
    private static native void m29751x67845c1f(long j17);

    /* renamed from: nativeResume */
    private static native void m29752x8ca85724(long j17);

    /* renamed from: nativeSetAudioRoute */
    private static native void m29753x1b911f3e(long j17, int i17);

    /* renamed from: nativeSetConfig */
    private static native void m29754xedeed3ed(long j17, float f17, float f18, float f19, int i17, int i18, int i19, boolean z17, boolean z18, boolean z19, java.lang.String str, java.util.Map map);

    /* renamed from: nativeSetMute */
    private static native void m29755x3d44d184(long j17, boolean z17);

    /* renamed from: nativeSetPlayerView */
    private static native void m29756x3cddf451(long j17, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3 c3826xc46e8cd3);

    /* renamed from: nativeSetRenderMode */
    private static native void m29757x71a3784(long j17, int i17);

    /* renamed from: nativeSetRenderRotation */
    private static native void m29758x1b1c34df(long j17, int i17);

    /* renamed from: nativeSetVolume */
    private static native void m29759xe5a37c5(long j17, int i17);

    /* renamed from: nativeShowDebugView */
    private static native void m29760x71823244(long j17, boolean z17);

    /* renamed from: nativeSnapshot */
    private static native void m29761x28ed82fb(long j17);

    /* renamed from: nativeStartPlay */
    private static native int m29762x6776bc5f(long j17, java.lang.String str, int i17);

    /* renamed from: nativeStartRecord */
    private static native void m29763x67c0febc(long j17, int i17, java.lang.String str);

    /* renamed from: nativeStopPlay */
    private static native void m29764x7e26e38d(long j17, boolean z17);

    /* renamed from: nativeStopRecord */
    private static native void m29765x9304126a(long j17);

    /* renamed from: nativeSwitchStream */
    private static native int m29766xa1eff58b(long j17, java.lang.String str);

    /* renamed from: weakToStrongReference */
    public static com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3796x213fa554 m29767x259965e1(java.lang.ref.WeakReference<com.p314xaae8f345.p373xbe494963.p393x32b0ec.C3796x213fa554> weakReference) {
        return weakReference.get();
    }

    /* renamed from: addVideoRawData */
    public boolean m29768xadb43e38(byte[] bArr) {
        return false;
    }

    @Override // com.p314xaae8f345.p2926x359365.a
    /* renamed from: callExperimentalAPI */
    public void mo29769xd33a8dd4(java.lang.String str) {
        m29741x63f4483d(this.f14815x10009f0, str);
    }

    @Override // com.p314xaae8f345.p2926x359365.a
    /* renamed from: enableAudioVolumeEvaluation */
    public void mo29770xe3d7029(int i17) {
        m29744x5eaeb192(this.f14815x10009f0, i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.a
    /* renamed from: enableHardwareDecode */
    public boolean mo29771x8ee3e659(boolean z17) {
        m29748x15617910(this.f14815x10009f0, z17);
        return true;
    }

    /* renamed from: finalize */
    public void m29772xd764dc1e() {
        m29743x23caefe3(this.f14815x10009f0);
    }

    @Override // com.p314xaae8f345.p2926x359365.a
    /* renamed from: getCurrentRenderPts */
    public long mo29773x59606b76() {
        return m29749xea1a25df(this.f14815x10009f0);
    }

    @Override // com.p314xaae8f345.p2926x359365.a
    /* renamed from: isPlaying */
    public boolean mo29774xc00617a4() {
        return m29750xa669114d(this.f14815x10009f0);
    }

    /* renamed from: onAudioInfoChanged */
    public void m29775xb9e6b46f(int i17, int i18, int i19) {
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXAudioRawDataListener iTXAudioRawDataListener = this.f14811xbe5bd01d;
        if (iTXAudioRawDataListener != null) {
            iTXAudioRawDataListener.mo94540xb9e6b46f(i17, i18, i19);
        }
    }

    /* renamed from: onAudioVolumeEvaluationNotify */
    public void m29776x4d82ef6(int i17) {
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener = this.f14812xfaaa553;
        if (iTXAudioVolumeEvaluationListener != null) {
            iTXAudioVolumeEvaluationListener.mo94542x4d82ef6(i17);
        }
    }

    /* renamed from: onNetStatus */
    public void m29777x3bee38d0(android.os.Bundle bundle) {
        com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 interfaceC25479x1853e9c1 = this.f14814x753a6c41;
        if (interfaceC25479x1853e9c1 != null) {
            interfaceC25479x1853e9c1.mo15382x3bee38d0(bundle);
        }
    }

    /* renamed from: onPcmDataAvailable */
    public void m29778xe5629f84(byte[] bArr, long j17) {
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXAudioRawDataListener iTXAudioRawDataListener = this.f14811xbe5bd01d;
        if (iTXAudioRawDataListener != null) {
            iTXAudioRawDataListener.mo94541xe5629f84(bArr, j17);
        }
    }

    /* renamed from: onPlayEvent */
    public void m29779x8cd414a7(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 interfaceC25479x1853e9c1 = this.f14814x753a6c41;
        if (interfaceC25479x1853e9c1 != null) {
            interfaceC25479x1853e9c1.mo15376x8cd414a7(i17, bundle);
        }
    }

    /* renamed from: onRecordComplete */
    public void m29780xf9aec869(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.ugc.C26824x75ddfa40.ITXVideoRecordListener iTXVideoRecordListener = this.f14818xd124afd3;
        if (iTXVideoRecordListener != null) {
            com.p314xaae8f345.ugc.C26824x75ddfa40.TXRecordResult tXRecordResult = new com.p314xaae8f345.ugc.C26824x75ddfa40.TXRecordResult();
            if (i17 == 0) {
                tXRecordResult.f57619x4162a22e = 0;
            } else {
                tXRecordResult.f57619x4162a22e = -1;
            }
            tXRecordResult.f57618x5ccb5b30 = str;
            tXRecordResult.f57620x4f713740 = str2;
            tXRecordResult.f57617x75fe787c = str3;
            iTXVideoRecordListener.m105974xf9aec869(tXRecordResult);
        }
    }

    /* renamed from: onRecordEvent */
    public void m29781x69a7a96a(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.ugc.C26824x75ddfa40.ITXVideoRecordListener iTXVideoRecordListener = this.f14818xd124afd3;
        if (iTXVideoRecordListener != null) {
            iTXVideoRecordListener.m105975x69a7a96a(i17, bundle);
        }
    }

    /* renamed from: onRecordProgress */
    public void m29782xe1be595d(long j17) {
        com.p314xaae8f345.ugc.C26824x75ddfa40.ITXVideoRecordListener iTXVideoRecordListener = this.f14818xd124afd3;
        if (iTXVideoRecordListener != null) {
            iTXVideoRecordListener.m105976xe1be595d(j17);
        }
    }

    /* renamed from: onRenderVideoFrame */
    public void m29783x3cf387e7(int i17, int i18, java.lang.Object obj, int i19, int i27, int i28, int i29, long j17, byte[] bArr, java.nio.ByteBuffer byteBuffer) {
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener = this.f14819x73f67018;
        if (iTXLivePlayVideoRenderListener != null) {
            com.p314xaae8f345.p2926x359365.C25485x5a0a6891.TXLiteAVTexture tXLiteAVTexture = new com.p314xaae8f345.p2926x359365.C25485x5a0a6891.TXLiteAVTexture();
            tXLiteAVTexture.f46518xc35d0396 = i19;
            tXLiteAVTexture.f46519x6be2dc6 = i27;
            tXLiteAVTexture.f46517xb7389127 = i28;
            tXLiteAVTexture.f46516x77710645 = obj;
            iTXLivePlayVideoRenderListener.mo94543x3cf387e7(tXLiteAVTexture);
        }
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXVideoRawDataListener iTXVideoRawDataListener = this.f14817xd7fe58d8;
        if (iTXVideoRawDataListener != null) {
            iTXVideoRawDataListener.m94545xf6b9a8f3(bArr, i27, i28, (int) j17);
        }
    }

    @Override // com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.b
    /* renamed from: onShowLog */
    public void mo29784xcade1428(boolean z17) {
        mo29803xcdf6351b(z17);
    }

    /* renamed from: onSnapshot */
    public void m29785xb614f8c3(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXSnapshotListener iTXSnapshotListener = this.f14816x65e9c525;
        if (iTXSnapshotListener != null) {
            iTXSnapshotListener.mo94544xb614f8c3(bitmap);
        }
    }

    @Override // com.p314xaae8f345.p2926x359365.a
    /* renamed from: pause */
    public void mo29786x65825f6() {
        m29751x67845c1f(this.f14815x10009f0);
    }

    @Override // com.p314xaae8f345.p2926x359365.a
    /* renamed from: resume */
    public void mo29787xc84dc82d() {
        m29752x8ca85724(this.f14815x10009f0);
    }

    @Override // com.p314xaae8f345.p2926x359365.a
    /* renamed from: setAudioRawDataListener */
    public void mo29788x7d94ff92(com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXAudioRawDataListener iTXAudioRawDataListener) {
        this.f14811xbe5bd01d = iTXAudioRawDataListener;
        m29745x7a9f81e4(this.f14815x10009f0, iTXAudioRawDataListener != null);
    }

    @Override // com.p314xaae8f345.p2926x359365.a
    /* renamed from: setAudioRoute */
    public void mo29789x78052215(int i17) {
        m29753x1b911f3e(this.f14815x10009f0, i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.a
    /* renamed from: setAudioVolumeEvaluationListener */
    public void mo29790x81e7097e(com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.f14812xfaaa553 = iTXAudioVolumeEvaluationListener;
    }

    @Override // com.p314xaae8f345.p2926x359365.a
    /* renamed from: setConfig */
    public void mo29791x78bda44(com.p314xaae8f345.p2926x359365.C25484xcc963946 c25484xcc963946) {
        if (c25484xcc963946 == null) {
            return;
        }
        m29754xedeed3ed(this.f14815x10009f0, c25484xcc963946.m94481xde6e56b9(), c25484xcc963946.m94486xb0f7fbe3(), c25484xcc963946.m94487x96d4835(), c25484xcc963946.m94489x368bd883(), c25484xcc963946.m94482xb931e71b(), c25484xcc963946.m94483x8e6b0339(), c25484xcc963946.m94490xded78b67(), c25484xcc963946.m94492xfce41ffa(), c25484xcc963946.m94493xa049cdbc(), c25484xcc963946.m94484x7fcfecc3(), c25484xcc963946.m94485x6d34ab50());
    }

    @Override // com.p314xaae8f345.p2926x359365.a
    /* renamed from: setMute */
    public void mo29792x764d819b(boolean z17) {
        m29755x3d44d184(this.f14815x10009f0, z17);
    }

    @Override // com.p314xaae8f345.p2926x359365.a
    /* renamed from: setPlayListener */
    public void mo29793xbdb2cd8a(com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 interfaceC25479x1853e9c1) {
        this.f14814x753a6c41 = interfaceC25479x1853e9c1;
    }

    @Override // com.p314xaae8f345.p2926x359365.a
    /* renamed from: setPlayerView */
    public void mo29794x9951f728(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null) {
            com.p314xaae8f345.p373xbe494963.p393x32b0ec.a.a(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, new java.lang.ref.WeakReference(this));
            mo29803xcdf6351b(com.p314xaae8f345.p373xbe494963.p393x32b0ec.a.a(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf));
        }
        m29756x3cddf451(this.f14815x10009f0, scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null ? new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) : null);
    }

    @Override // com.p314xaae8f345.p2926x359365.a
    /* renamed from: setRenderMode */
    public void mo29795x638e3a5b(int i17) {
        m29757x71a3784(this.f14815x10009f0, i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.a
    /* renamed from: setRenderRotation */
    public void mo29796x4594f436(int i17) {
        m29758x1b1c34df(this.f14815x10009f0, i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.a
    /* renamed from: setSurface */
    public void mo29797x42c875eb(android.view.Surface surface) {
        m29756x3cddf451(this.f14815x10009f0, surface != null ? new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.C3826xc46e8cd3(surface) : null);
    }

    @Override // com.p314xaae8f345.p2926x359365.a
    /* renamed from: setSurfaceSize */
    public void mo29798x1c9cdc8c(int i17, int i18) {
    }

    @Override // com.p314xaae8f345.p2926x359365.a
    /* renamed from: setVideoRawDataListener */
    public void mo29799x9737884d(com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXVideoRawDataListener iTXVideoRawDataListener) {
        synchronized (this) {
            if (this.f14819x73f67018 != null) {
                this.f14819x73f67018 = null;
                this.f14813x9509133d = null;
                m29747xfec897da(this.f14815x10009f0, false, null);
            }
            this.f14817xd7fe58d8 = iTXVideoRawDataListener;
            m29746xb7cfd20a(this.f14815x10009f0, iTXVideoRawDataListener != null);
        }
    }

    @Override // com.p314xaae8f345.p2926x359365.a
    /* renamed from: setVideoRecordListener */
    public void mo29800x8cfd3dbe(com.p314xaae8f345.ugc.C26824x75ddfa40.ITXVideoRecordListener iTXVideoRecordListener) {
        this.f14818xd124afd3 = iTXVideoRecordListener;
    }

    @Override // com.p314xaae8f345.p2926x359365.a
    /* renamed from: setVideoRenderListener */
    public int mo29801x2fcefe03(com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener, java.lang.Object obj) {
        synchronized (this) {
            if (this.f14817xd7fe58d8 != null) {
                this.f14817xd7fe58d8 = null;
                m29746xb7cfd20a(this.f14815x10009f0, false);
            }
            this.f14819x73f67018 = iTXLivePlayVideoRenderListener;
            if (iTXLivePlayVideoRenderListener == null) {
                obj = null;
            }
            this.f14813x9509133d = obj;
            m29747xfec897da(this.f14815x10009f0, iTXLivePlayVideoRenderListener != null, obj);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.p2926x359365.a
    /* renamed from: setVolume */
    public void mo29802x27f73e1c(int i17) {
        m29759xe5a37c5(this.f14815x10009f0, i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.a
    /* renamed from: showDebugView */
    public void mo29803xcdf6351b(boolean z17) {
        m29760x71823244(this.f14815x10009f0, z17);
    }

    @Override // com.p314xaae8f345.p2926x359365.a
    /* renamed from: snapshot */
    public void mo29804x10fad5c4(com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXSnapshotListener iTXSnapshotListener) {
        this.f14816x65e9c525 = iTXSnapshotListener;
        m29761x28ed82fb(this.f14815x10009f0);
    }

    @Override // com.p314xaae8f345.p2926x359365.a
    /* renamed from: startLivePlay */
    public int mo29805x5c1200c2(java.lang.String str, int i17) {
        return m29762x6776bc5f(this.f14815x10009f0, str, i17);
    }

    @Override // com.p314xaae8f345.p2926x359365.a
    /* renamed from: startRecord */
    public int mo29806x8e35cb53(int i17) {
        java.lang.String m29737xd6665331 = m29737xd6665331(com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035(), ".mp4");
        if (android.text.TextUtils.isEmpty(m29737xd6665331)) {
            return -1;
        }
        m29763x67c0febc(this.f14815x10009f0, i17, m29737xd6665331);
        return 0;
    }

    @Override // com.p314xaae8f345.p2926x359365.a
    /* renamed from: stopPlay */
    public int mo29807x66343656(boolean z17) {
        m29764x7e26e38d(this.f14815x10009f0, z17);
        return 0;
    }

    @Override // com.p314xaae8f345.p2926x359365.a
    /* renamed from: stopRecord */
    public int mo29808xad07d6f3() {
        m29765x9304126a(this.f14815x10009f0);
        return 0;
    }

    @Override // com.p314xaae8f345.p2926x359365.a
    /* renamed from: switchStream */
    public int mo29809x4a14bbd4(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            return m29766xa1eff58b(this.f14815x10009f0, str);
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "Invalid params.");
        return -1;
    }
}
