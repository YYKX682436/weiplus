package uc4;

/* loaded from: classes4.dex */
public class t0 extends uc4.m0 {

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f507987g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f507988h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f507987g = jz5.h.b(new uc4.r0(this));
        this.f507988h = "";
    }

    @Override // uc4.g
    public void a(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick");
        super.a(view);
        xc4.p c17 = c();
        this.f507988h = c17 != null ? c17.a1() : "";
        if (view != null) {
            view.setTag(n());
        }
        o(view);
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Di(12076, "ClickMusicFeedCount", this.f507988h);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick");
        zy1.e.f558858a.e(12076, "ClickImageFeedCount", this.f507988h);
    }

    @Override // uc4.g
    public android.view.View.OnCreateContextMenuListener d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLinkMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1 h1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1) ((jz5.n) this.f507987g).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLinkMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick");
        return h1Var;
    }

    @Override // uc4.g
    public void k(android.view.View view, boolean z17, boolean z18, boolean z19) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("register", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick");
        super.k(view, z17, z18, z19);
        if (view != null && (c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.bpo)) != null) {
            c22699x3dcdb352.setOnClickListener(new uc4.s0(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("register", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick");
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2 n() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildTag", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick");
        xc4.p c17 = c();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 h17 = c17 != null ? c17.h1() : null;
        xc4.p c18 = c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2 i2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2(h17, c18 != null ? c18.W0() : "");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildTag", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick");
        return i2Var;
    }

    public void o(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMusicItemClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.h(view);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMusicItemClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick");
    }
}
