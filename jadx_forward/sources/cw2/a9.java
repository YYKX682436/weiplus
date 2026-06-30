package cw2;

/* loaded from: classes2.dex */
public final class a9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f305105d;

    public a9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f) {
        this.f305105d = c15196x85976f5f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView m61463x4eb0f6e5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305105d;
        cw2.da videoView = c15196x85976f5f.getVideoView();
        if ((videoView != null ? videoView.m122867x742757a8() : 0.0f) == 0.0f) {
            return;
        }
        yz5.p thumbShowCallback = c15196x85976f5f.getThumbShowCallback();
        if (thumbShowCallback != null) {
            thumbShowCallback.mo149xb9724478(java.lang.Boolean.TRUE, c15196x85976f5f.getPlayInfo());
        }
        cw2.da videoView2 = c15196x85976f5f.getVideoView();
        if (videoView2 != null) {
            videoView2.m122872x52b5721c(0.0f);
        }
        m61463x4eb0f6e5 = c15196x85976f5f.m61463x4eb0f6e5();
        m61463x4eb0f6e5.setVisibility(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15196x85976f5f.m61471xe56ce956(), "[showThumb] " + c15196x85976f5f.d0());
    }
}
