package cw2;

/* loaded from: classes2.dex */
public final class g3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15181x7c9d924c f305258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305259e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15181x7c9d924c c15181x7c9d924c, java.lang.String str) {
        super(0);
        this.f305258d = c15181x7c9d924c;
        this.f305259e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15181x7c9d924c c15181x7c9d924c = this.f305258d;
        cw2.da videoView = c15181x7c9d924c.getVideoView();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.a(videoView != null ? java.lang.Float.valueOf(videoView.m122867x742757a8()) : null, 1.0f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveCardMediaLayout", "return for alpha == 1.");
        } else {
            cw2.da videoView2 = c15181x7c9d924c.getVideoView();
            if (videoView2 != null) {
                videoView2.m122872x52b5721c(1.0f);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCardMediaLayout", "[showLive] " + this.f305259e + ' ' + c15181x7c9d924c.e());
        }
        return jz5.f0.f384359a;
    }
}
