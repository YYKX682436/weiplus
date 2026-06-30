package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb;

/* renamed from: com.tencent.qqmusic.mediaplayer.upstream.UriLoader */
/* loaded from: classes13.dex */
public interface InterfaceC25452xb767407f {

    /* renamed from: com.tencent.qqmusic.mediaplayer.upstream.UriLoader$Callback */
    /* loaded from: classes13.dex */
    public interface Callback {
        /* renamed from: onCancelled */
        void mo94299x1a926632();

        /* renamed from: onFailed */
        void mo94300x428b6afc(java.lang.Throwable th6);

        /* renamed from: onSucceed */
        void mo94301xe05b3f63(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25448x2f83e3ed c25448x2f83e3ed);
    }

    /* renamed from: cancelLoading */
    void mo94305x62eeed62();

    /* renamed from: isLoading */
    boolean mo94306xf18228b2();

    /* renamed from: startLoading */
    void mo94307xc0d627a(int i17, java.util.concurrent.TimeUnit timeUnit, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25452xb767407f.Callback callback);
}
