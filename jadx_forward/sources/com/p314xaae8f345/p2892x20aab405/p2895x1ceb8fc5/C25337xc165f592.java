package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u0006\u0010\u0003\u001a\u00020\u0002J,\u0010\t\u001a\u00020\u00022$\u0010\b\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0004J&\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0007J \u0010\u0010\u001a\u00020\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u000fJ\u0016\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R4\u0010\u001b\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR*\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/tencent/qqmusic/mediaplayer/PlayStuckMonitor;", "", "Ljz5/f0;", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "Lkotlin/Function4;", "", "", "", "callback", "setOnPlayStuckListener", "decodeTime", "playTime", "continuous", "underrunCount", "onPlayStuck", "Lkotlin/Function2;", "setAudioTrackFlushListener", "writeCount", "bufferSize", "onAudioTrackFlush", "Landroid/os/HandlerThread;", "mHandlerThread", "Landroid/os/HandlerThread;", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "mHandlerForFlush", "mCallback", "Lyz5/r;", "mAudioTrackFlushCallback", "Lyz5/p;", "mEnable", "Z", "<init>", "()V", "player_qqmusic_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.tencent.qqmusic.mediaplayer.PlayStuckMonitor */
/* loaded from: classes16.dex */
public final class C25337xc165f592 {

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25337xc165f592 f45623x4fbc8495 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25337xc165f592();
    private static yz5.p mAudioTrackFlushCallback;
    private static yz5.r mCallback;
    private static boolean mEnable;
    private static android.os.Handler mHandler;
    private static android.os.Handler mHandlerForFlush;
    private static android.os.HandlerThread mHandlerThread;

    static {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("AudioTrackFlushMonitor");
        handlerThread.start();
        mHandlerForFlush = new android.os.Handler(handlerThread.getLooper());
    }

    private C25337xc165f592() {
    }

    /* renamed from: access$getMCallback$p */
    public static final /* synthetic */ yz5.r m93821xd0eaae28(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25337xc165f592 c25337xc165f592) {
        yz5.r rVar = mCallback;
        if (rVar != null) {
            return rVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCallback");
        throw null;
    }

    /* renamed from: init */
    public final void m93823x316510() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("PlayStuckMonitor");
        mHandlerThread = handlerThread;
        handlerThread.start();
        android.os.HandlerThread handlerThread2 = mHandlerThread;
        if (handlerThread2 != null) {
            mHandler = new android.os.Handler(handlerThread2.getLooper());
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHandlerThread");
            throw null;
        }
    }

    /* renamed from: onAudioTrackFlush */
    public final void m93824x8e2de510(final int i17, final int i18) {
        android.os.Handler handler;
        final yz5.p pVar = mAudioTrackFlushCallback;
        if (pVar == null || (handler = mHandlerForFlush) == null) {
            return;
        }
        handler.post(new java.lang.Runnable() { // from class: com.tencent.qqmusic.mediaplayer.PlayStuckMonitor$onAudioTrackFlush$$inlined$apply$lambda$1
            @Override // java.lang.Runnable
            public final void run() {
                yz5.p.this.mo149xb9724478(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            }
        });
    }

    /* renamed from: onPlayStuck */
    public final void m93825x8d98afa9(final long j17, final long j18, final boolean z17, final int i17) {
        if (mEnable) {
            android.os.Handler handler = mHandler;
            if (handler != null) {
                handler.post(new java.lang.Runnable() { // from class: com.tencent.qqmusic.mediaplayer.PlayStuckMonitor$onPlayStuck$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25337xc165f592.m93821xd0eaae28(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25337xc165f592.f45623x4fbc8495).C(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
                    }
                });
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHandler");
                throw null;
            }
        }
    }

    /* renamed from: setAudioTrackFlushListener */
    public final void m93826x739dac01(yz5.p callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(callback, "callback");
        mAudioTrackFlushCallback = callback;
    }

    /* renamed from: setOnPlayStuckListener */
    public final void m93827x1932bbbb(yz5.r callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(callback, "callback");
        mCallback = callback;
        mEnable = true;
    }
}
