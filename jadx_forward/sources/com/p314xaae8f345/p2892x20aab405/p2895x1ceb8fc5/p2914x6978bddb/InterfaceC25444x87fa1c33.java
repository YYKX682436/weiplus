package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb;

/* renamed from: com.tencent.qqmusic.mediaplayer.upstream.Loader */
/* loaded from: classes13.dex */
public interface InterfaceC25444x87fa1c33 {

    /* renamed from: com.tencent.qqmusic.mediaplayer.upstream.Loader$Factory */
    /* loaded from: classes13.dex */
    public interface Factory {
        /* renamed from: createLoader */
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33 mo94269x4f4a102f(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25444x87fa1c33.Listener listener);
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.upstream.Loader$Listener */
    /* loaded from: classes13.dex */
    public interface Listener {
        /* renamed from: onLoadCancelled */
        void mo94278x938e8b6c(boolean z17);

        /* renamed from: onLoadCompleted */
        void mo94279x23875866();

        /* renamed from: onLoadError */
        void mo94280x4f8e79a3(java.io.IOException iOException);

        /* renamed from: onLoadProgress */
        void mo94281x861c30b2(long j17, long j18);
    }

    /* renamed from: cancelLoading */
    void mo94293x62eeed62();

    /* renamed from: getUpstreamSize */
    long mo94294xc1fa3ef2();

    /* renamed from: isLoading */
    boolean mo94295xf18228b2();

    /* renamed from: prepare */
    void mo94296xed060d07();

    /* renamed from: shutdown */
    void mo94297xf5e80656();

    /* renamed from: startLoading */
    void mo94298xc0d627a(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25430x3e1324d c25430x3e1324d);
}
