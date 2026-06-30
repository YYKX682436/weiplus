package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb;

/* renamed from: com.tencent.qqmusic.mediaplayer.upstream.DummyUriLoader */
/* loaded from: classes13.dex */
public class C25436xdaecc4f7 implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25452xb767407f {
    private final android.net.Uri uri;

    public C25436xdaecc4f7() {
        this(null);
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25452xb767407f
    /* renamed from: cancelLoading */
    public void mo94305x62eeed62() {
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25452xb767407f
    /* renamed from: isLoading */
    public boolean mo94306xf18228b2() {
        return false;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25452xb767407f
    /* renamed from: startLoading */
    public void mo94307xc0d627a(int i17, java.util.concurrent.TimeUnit timeUnit, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25452xb767407f.Callback callback) {
        android.net.Uri uri = this.uri;
        if (uri == null) {
            callback.mo94301xe05b3f63(null);
        } else {
            callback.mo94301xe05b3f63(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25448x2f83e3ed(uri, null));
        }
    }

    public C25436xdaecc4f7(android.net.Uri uri) {
        this.uri = uri;
    }
}
