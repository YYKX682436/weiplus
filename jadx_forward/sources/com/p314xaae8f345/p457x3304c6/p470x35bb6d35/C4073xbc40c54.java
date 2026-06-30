package com.p314xaae8f345.p457x3304c6.p470x35bb6d35;

/* renamed from: com.tencent.maas.instamovie.MJMoviePlayer */
/* loaded from: classes5.dex */
public class C4073xbc40c54 {

    /* renamed from: PLAYER_STATE_ERROR */
    public static final int f15946x16a0d43c = -1;

    /* renamed from: PLAYER_STATE_INITIAL */
    public static final int f15947xbe059878 = 0;

    /* renamed from: PLAYER_STATE_PLAYING */
    public static final int f15948x2c791162 = 5;

    /* renamed from: PLAYER_STATE_PREPARED */
    public static final int f15949xa65f7969 = 2;

    /* renamed from: PLAYER_STATE_PREPAREING */
    public static final int f15950x8c66dfa7 = 1;

    /* renamed from: PLAYER_STATE_STARTED */
    public static final int f15951xd8cf81b5 = 4;

    /* renamed from: PLAYER_STATE_STARTING */
    public static final int f15952x4120c56c = 3;

    /* renamed from: PLAYER_STATE_STOPPING */
    public static final int f15953x58e69da0 = 6;

    /* renamed from: PLAYER_STATE_TEARDOWNING */
    public static final int f15954x591c292 = 7;
    private static final java.lang.String TAG = "MJMoviePlayer";

    /* renamed from: dsViewProxy */
    private io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa f15955xff2f42fa;

    /* renamed from: mCallbackManager */
    private final com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 f15956xe8c0cf7b;

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f15957x39e86013;

    /* renamed from: com.tencent.maas.instamovie.MJMoviePlayer$OnComplete */
    /* loaded from: classes5.dex */
    public interface OnComplete {
        /* renamed from: onComplete */
        void mo9354x815f5438(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b);
    }

    /* renamed from: com.tencent.maas.instamovie.MJMoviePlayer$OnMediaTimeChange */
    /* loaded from: classes5.dex */
    public interface OnMediaTimeChange {
        /* renamed from: onMediaTimeChange */
        void mo33254x51a35402(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, long j17);
    }

    /* renamed from: com.tencent.maas.instamovie.MJMoviePlayer$OnPlaybackDidFinish */
    /* loaded from: classes5.dex */
    public interface OnPlaybackDidFinish {
        /* renamed from: onFinished */
        void mo33255x7cf2e371();
    }

    /* renamed from: com.tencent.maas.instamovie.MJMoviePlayer$OnTaskProgress */
    /* loaded from: classes5.dex */
    public interface OnTaskProgress {
        /* renamed from: onTaskProgress */
        void mo9359xda309251(float f17, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4090xe7a30da3 c4090xe7a30da3);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.tencent.maas.instamovie.MJMoviePlayer$PlayerState */
    /* loaded from: classes6.dex */
    public @interface PlayerState {
    }

    public C4073xbc40c54(android.os.Handler handler) {
        com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671 = new com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671(handler.getLooper());
        this.f15956xe8c0cf7b = c4099x76754671;
        this.f15957x39e86013 = m33220xfce9a72c(handler, c4099x76754671);
    }

    /* renamed from: initHybrid */
    private native com.p166x1da19ac6.jni.C1545xd48843e6 m33220xfce9a72c(android.os.Handler handler, com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671);

    /* renamed from: nativeConnectToView */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33221x61149273(java.lang.Object obj);

    /* renamed from: nativeDisconnectFromView */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33222xa78516a2();

    /* renamed from: nativeGetCurrentPlaybackTime */
    private native com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33223xe2905962();

    /* renamed from: nativeGetCurrentState */
    private native int m33224xa85883f7();

    /* renamed from: nativeGetPlaybackDuration */
    private native com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33225x7cb45eae();

    /* renamed from: nativeSetIsAudioMuted */
    private native void m33226x64843c6a(boolean z17);

    /* renamed from: nativeSetOnPlaybackDidFinishFunc */
    private native void m33227x5922bb91(int i17);

    /* renamed from: nativeSetOnPlaybackMediaTimeDidChangeFunc */
    private native void m33228xd56ffdc7(int i17);

    /* renamed from: nativeShutdownPlayback */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33229x8b0510c8(int i17);

    /* renamed from: nativeSkimTo */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33230x8ead100e(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, long j17, boolean z17, boolean z18);

    /* renamed from: nativeStartMovieCreationUsingProject */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33231x70cf1979(java.lang.String str, int i17, int i18);

    /* renamed from: nativeStartPlaying */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33232x326c8b23(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, int i17, boolean z17, int i18);

    /* renamed from: nativeStartupPlayback */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33233xe25106a1(int i17);

    /* renamed from: nativeStopPlaying */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33234x6f8bed35(int i17);

    /* renamed from: nativeTeardown */
    private native com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33235xb4cc133b(int i17);

    /* renamed from: GetCurrentPlaybackTime */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33236x3475448b() {
        return m33223xe2905962();
    }

    /* renamed from: changeMuteState */
    public void m33237x34df1c28(boolean z17) {
        m33226x64843c6a(z17);
    }

    /* renamed from: getCurrentState */
    public int m33238xb7d72d0e() {
        switch (m33224xa85883f7()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return -1;
        }
    }

    /* renamed from: getPlaybackDuration */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33239xebfaa445() {
        return m33225x7cb45eae();
    }

    /* renamed from: notifySurfaceChanged */
    public void m33240xa36f50f0(int i17, int i18, int i19) {
        io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa abstractC28530xd96ac6fa = this.f15955xff2f42fa;
        if (abstractC28530xd96ac6fa == null || !(abstractC28530xd96ac6fa instanceof io.p3277xa1c40a32.p3283xc97dd6cb.C28527x82dcc08e)) {
            io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136901x5c4d208(TAG, "current surface is not DSProxySurface");
            throw new java.lang.IllegalStateException("current surface is not DSProxySurface");
        }
        ((io.p3277xa1c40a32.p3283xc97dd6cb.C28527x82dcc08e) abstractC28530xd96ac6fa).mo136918xa36f50f0(i17, i18, i19);
    }

    /* renamed from: openWithClipBundle */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 m33241x635bfa42(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnTaskProgress onTaskProgress, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete onComplete) {
        int[] m33786xf8cd0e2f = this.f15956xe8c0cf7b.m33786xf8cd0e2f(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.TaskProgressCallback(this, onTaskProgress, false), new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.CompleteCallback(this, onComplete));
        return m33231x70cf1979(str, m33786xf8cd0e2f[0], m33786xf8cd0e2f[1]);
    }

    /* renamed from: release */
    public void m33242x41012807() {
        this.f15956xe8c0cf7b.m33787x78c5c1e2();
        this.f15956xe8c0cf7b.m33788xcb04b739();
        this.f15957x39e86013.m16727xc85fe246();
    }

    /* renamed from: setOnPlaybackDidFinishCallback */
    public void m33243xc340b09b(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnPlaybackDidFinish onPlaybackDidFinish) {
        m33227x5922bb91(onPlaybackDidFinish != null ? this.f15956xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.OnPlaybackDidFinishCallback(this, onPlaybackDidFinish, false)) : -1);
    }

    /* renamed from: setOnPlaybackMediaTimeDidChange */
    public void m33244xd852eb7a(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnMediaTimeChange onMediaTimeChange) {
        m33228xd56ffdc7(onMediaTimeChange != null ? this.f15956xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.MediaTimeChangeCallback(this, onMediaTimeChange, false)) : -1);
    }

    /* renamed from: setRenderView */
    public void m33245x63923b5d(android.view.SurfaceView surfaceView) {
        if (!(surfaceView instanceof io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a)) {
            io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136901x5c4d208(TAG, "renderView must be SDK DSRenderView");
            throw new java.security.InvalidParameterException("renderView must be SDK DSRenderView");
        }
        if (this.f15955xff2f42fa != null) {
            io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136901x5c4d208(TAG, "Already a view connected!");
            throw new java.lang.IllegalStateException("Already a view connected!");
        }
        io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa m136921x4fd765e4 = ((io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a) surfaceView).m136921x4fd765e4();
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33221x61149273 = m33221x61149273(m136921x4fd765e4);
        if (m33221x61149273 == null) {
            this.f15955xff2f42fa = m136921x4fd765e4;
            return;
        }
        io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136901x5c4d208(TAG, "Fail to connect to RenderView, " + m33221x61149273.f16057x38eb0007);
        throw new java.lang.IllegalStateException("Fail to connect to RenderView, " + m33221x61149273.f16057x38eb0007);
    }

    /* renamed from: setSurface */
    public void m33246x42c875eb(android.view.Surface surface) {
        io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa abstractC28530xd96ac6fa = this.f15955xff2f42fa;
        if (abstractC28530xd96ac6fa != null && !(abstractC28530xd96ac6fa instanceof io.p3277xa1c40a32.p3283xc97dd6cb.C28527x82dcc08e)) {
            io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136901x5c4d208(TAG, "Already a non surface output connected");
            throw new java.lang.IllegalArgumentException("Already a non surface output connected");
        }
        if (surface == null && abstractC28530xd96ac6fa == null) {
            return;
        }
        if (abstractC28530xd96ac6fa != null) {
            io.p3277xa1c40a32.p3283xc97dd6cb.C28527x82dcc08e c28527x82dcc08e = (io.p3277xa1c40a32.p3283xc97dd6cb.C28527x82dcc08e) abstractC28530xd96ac6fa;
            if (surface == null) {
                c28527x82dcc08e.m136919x385f87a4(null);
                c28527x82dcc08e.m136941x26cc0ebf();
                io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136903x3164ae(TAG, "setSurface, surface destroyed");
                return;
            } else {
                if (c28527x82dcc08e.m136913xcf572877() != null) {
                    io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136901x5c4d208(TAG, "Already a surface connect, please setSurface(null) firstly");
                    throw new java.lang.IllegalStateException("Already a surface connect, please setSurface(null) firstly");
                }
                c28527x82dcc08e.m136919x385f87a4(surface);
                c28527x82dcc08e.m136940xb4b26d24(surface);
                io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136903x3164ae(TAG, "setSurface, surface changed: " + surface);
                return;
            }
        }
        io.p3277xa1c40a32.p3283xc97dd6cb.C28527x82dcc08e c28527x82dcc08e2 = new io.p3277xa1c40a32.p3283xc97dd6cb.C28527x82dcc08e(surface);
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33221x61149273 = m33221x61149273(c28527x82dcc08e2);
        if (m33221x61149273 == null) {
            this.f15955xff2f42fa = c28527x82dcc08e2;
            c28527x82dcc08e2.m136940xb4b26d24(surface);
            io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136903x3164ae(TAG, "nativeConnectToView, new surface created: " + surface);
            return;
        }
        io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136901x5c4d208(TAG, "Fail to connect to surface, " + m33221x61149273.f16057x38eb0007);
        throw new java.lang.IllegalStateException("Fail to connect to surface, " + m33221x61149273.f16057x38eb0007);
    }

    /* renamed from: setSurfaceHolder */
    public void m33247x5660d377(android.view.SurfaceHolder surfaceHolder) {
        io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa abstractC28530xd96ac6fa = this.f15955xff2f42fa;
        if (abstractC28530xd96ac6fa != null) {
            if (abstractC28530xd96ac6fa instanceof io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28528x732d57da) {
                return;
            }
            io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136901x5c4d208(TAG, "Already a non SurfaceHolder connected");
            throw new java.lang.IllegalArgumentException("Already a non SurfaceHolder connected");
        }
        if (surfaceHolder == null) {
            return;
        }
        io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28528x732d57da surfaceHolderCallbackC28528x732d57da = new io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28528x732d57da(surfaceHolder);
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33221x61149273 = m33221x61149273(surfaceHolderCallbackC28528x732d57da);
        if (m33221x61149273 == null) {
            this.f15955xff2f42fa = surfaceHolderCallbackC28528x732d57da;
            if (surfaceHolder.getSurface() != null) {
                this.f15955xff2f42fa.m136940xb4b26d24(surfaceHolder.getSurface());
                return;
            }
            return;
        }
        io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136901x5c4d208(TAG, "Fail to connect to surface, " + m33221x61149273.f16057x38eb0007);
        throw new java.lang.IllegalStateException("Fail to connect to surface, " + m33221x61149273.f16057x38eb0007);
    }

    /* renamed from: shutdownPlayback */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33248x6b5b8a91(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete onComplete) {
        return m33229x8b0510c8(onComplete != null ? this.f15956xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.CompleteCallback(this, onComplete)) : -1);
    }

    /* renamed from: skimTo */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33249xca528117(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, long j17, boolean z17, boolean z18) {
        return m33230x8ead100e(c4128x879fba0a, j17, z17, z18);
    }

    /* renamed from: startPlaying */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33250xda91516c(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, int i17, boolean z17, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete onComplete) {
        return m33232x326c8b23(c4129xdee64553, c4128x879fba0a, i17, z17, onComplete != null ? this.f15956xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.CompleteCallback(this, onComplete)) : -1);
    }

    /* renamed from: startupPlayback */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33251xf1cfafb8(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete onComplete) {
        return m33233xe25106a1(onComplete != null ? this.f15956xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.CompleteCallback(this, onComplete)) : -1);
    }

    /* renamed from: stopPlaying */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33252x9600b9cc(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete onComplete) {
        return m33234x6f8bed35(onComplete != null ? this.f15956xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.CompleteCallback(this, onComplete)) : -1);
    }

    /* renamed from: tearDown */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b m33253x9ccada24(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete onComplete) {
        if (this.f15955xff2f42fa != null) {
            io.p3277xa1c40a32.p3282x38e8d6d7.C28524x8cbdd8a7.m136903x3164ae(TAG, "nativeDisconnectFromView");
            m33222xa78516a2();
            this.f15955xff2f42fa = null;
        }
        return m33235xb4cc133b(onComplete != null ? this.f15956xe8c0cf7b.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4074xdd02fcb9.CompleteCallback(this, onComplete)) : -1);
    }
}
