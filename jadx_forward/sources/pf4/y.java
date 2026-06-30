package pf4;

/* loaded from: classes4.dex */
public final class y extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18495x53f31c35 f435443d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18482x82fd8d8f f435444e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331 f435445f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f435446g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18496x8607485e f435447h;

    /* renamed from: i, reason: collision with root package name */
    public if4.f f435448i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18495x53f31c35 itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f435443d = itemView;
        this.f435444e = itemView.getCommentView();
        this.f435445f = itemView.getMsgView();
        this.f435446g = itemView.getThumbView();
        this.f435447h = itemView.getPostTipView();
    }

    public final void i() {
        if4.f fVar = this.f435448i;
        if (fVar == null) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var = new com.p314xaae8f345.mm.p2621x8fb0427b.s7("storysight");
        if4.h hVar = fVar.f372780e;
        s7Var.f276846b = hVar.f372788c;
        boolean a17 = hVar.a();
        android.widget.ImageView imageView = this.f435446g;
        if (a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryGalleryAdapter", "reBindBitmap FakeVideo");
            ((wo0.b) vo0.e.f520001b.i("")).c(imageView);
            return;
        }
        hf4.e eVar = new hf4.e(hVar.f372791f, fVar.f372782g, s7Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryGalleryAdapter", "reBindBitmap NormalVideo " + eVar.n());
        ef4.w.f334001t.m().a(eVar).c(imageView);
    }
}
