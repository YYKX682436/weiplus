package cw2;

/* loaded from: classes2.dex */
public final class l8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f305379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305380e;

    public l8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f, java.lang.String str) {
        this.f305379d = c15196x85976f5f;
        this.f305380e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView m61463x4eb0f6e5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305379d;
        cw2.da videoView = c15196x85976f5f.getVideoView();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.a(videoView != null ? java.lang.Float.valueOf(videoView.m122867x742757a8()) : null, 1.0f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c15196x85976f5f.m61471xe56ce956(), "dismissThumb return for alpha == 1.");
            return;
        }
        yz5.p thumbShowCallback = c15196x85976f5f.getThumbShowCallback();
        if (thumbShowCallback != null) {
            thumbShowCallback.mo149xb9724478(java.lang.Boolean.FALSE, c15196x85976f5f.getPlayInfo());
        }
        cw2.da videoView2 = c15196x85976f5f.getVideoView();
        if (videoView2 != null) {
            videoView2.m122872x52b5721c(1.0f);
        }
        m61463x4eb0f6e5 = c15196x85976f5f.m61463x4eb0f6e5();
        m61463x4eb0f6e5.setVisibility(8);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15196x85976f5f.m61471xe56ce956(), "[dismissThumb] " + this.f305380e + ' ' + c15196x85976f5f.d0());
    }
}
