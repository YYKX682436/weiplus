package ee4;

/* loaded from: classes4.dex */
public final class g1 extends ee4.t {

    /* renamed from: n, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f333243n;

    /* renamed from: o, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f333244o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(ce4.b pcContext) {
        super(pcContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pcContext, "pcContext");
    }

    @Override // ce4.a
    public java.lang.String d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicScopePc");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicScopePc");
        return "SnsPublish.MultiPicScopePc";
    }

    @Override // ce4.a
    public void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicScopePc");
        super.i();
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f333243n;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
        }
        this.f333243n = null;
        p3325xe03a0797.p3326xc267989b.y0 y0Var2 = this.f333244o;
        if (y0Var2 != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var2, null);
        }
        this.f333244o = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicScopePc");
    }

    public final p3325xe03a0797.p3326xc267989b.y0 p() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getIoScope", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicScopePc");
        if (this.f333244o == null) {
            this.f333244o = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f333244o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(y0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getIoScope", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicScopePc");
        return y0Var;
    }

    public final p3325xe03a0797.p3326xc267989b.y0 q() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMainScope", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicScopePc");
        if (this.f333243n == null) {
            this.f333243n = p3325xe03a0797.p3326xc267989b.z0.b();
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f333243n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(y0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMainScope", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicScopePc");
        return y0Var;
    }
}
