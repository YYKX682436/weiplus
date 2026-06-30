package ee4;

/* loaded from: classes4.dex */
public final class e1 extends ee4.t {

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.v4 f333233n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f333234o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u4 f333235p;

    /* renamed from: q, reason: collision with root package name */
    public final ud4.d f333236q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(ce4.b pcContext) {
        super(pcContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pcContext, "pcContext");
        this.f333235p = new ee4.d1(this);
        this.f333236q = new ee4.c1(this);
    }

    @Override // ce4.a
    public java.lang.String d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
        return "SnsPublish.PicPreviewViewPc";
    }

    @Override // ce4.a
    public boolean h(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
        if (!super.h(bundle)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
            return false;
        }
        this.f333234o = c().getIntent().getBooleanExtra("KBlockAdd", false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
        return true;
    }

    @Override // ce4.a
    public void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
        super.i();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.v4 v4Var = this.f333233n;
        if (v4Var != null) {
            ((ud4.t) v4Var).c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
    }

    public final void p() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("changePreview", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.v4 v4Var = this.f333233n;
        if (v4Var != null) {
            ((ud4.t) v4Var).e(new java.util.ArrayList(m().v().e()), 9);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.v4 v4Var2 = this.f333233n;
        ud4.k kVar = v4Var2 instanceof ud4.k ? (ud4.k) v4Var2 : null;
        if (kVar != null) {
            kVar.d(m().v().f());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changePreview", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
    }
}
