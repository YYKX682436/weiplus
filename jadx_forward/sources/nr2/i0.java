package nr2;

/* loaded from: classes2.dex */
public final class i0 extends v92.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nr2.j0 f420742c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(nr2.j0 j0Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        super(activityC0065xcd7aa112);
        this.f420742c = j0Var;
    }

    @Override // v92.g
    public void e(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 bottomSheet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m mVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m();
        boolean z17 = !(this instanceof nr2.t);
        nr2.j0 j0Var = this.f420742c;
        if (z17) {
            bottomSheet.f293409p = new nr2.d0(mVar, j0Var, bottomSheet);
        }
        r45.ev2 P6 = nr2.j0.P6(j0Var);
        if (P6 != null) {
            bottomSheet.f293418w = new nr2.g0(mVar, j0Var, P6);
        }
        bottomSheet.f293419x = new nr2.h0(mVar, bottomSheet);
    }

    @Override // v92.g
    public void h() {
        nr2.j0 j0Var = this.f420742c;
        nr2.m mVar = j0Var.f420753d;
        long l17 = mVar != null ? mVar.l() : 0L;
        android.app.Activity context = j0Var.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String format = java.lang.String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d&id=%s", java.util.Arrays.copyOf(new java.lang.Object[]{85, pm0.v.u(l17)}, 2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", format);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // v92.g
    public int j() {
        return 0;
    }

    @Override // v92.g
    public void r() {
        nr2.j0 j0Var = this.f420742c;
        r45.ev2 P6 = nr2.j0.P6(j0Var);
        if (P6 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a.q(j0Var.m80379x76847179(), P6, (r16 & 4) != 0 ? false : true, (r16 & 8) != 0 ? false : false, (r16 & 16) != 0 ? null : null, (r16 & 32) != 0 ? null : null);
        }
    }

    @Override // v92.g
    public void t() {
        nr2.j0 j0Var = this.f420742c;
        r45.ev2 P6 = nr2.j0.P6(j0Var);
        if (P6 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a.s(j0Var.m80379x76847179(), P6, true);
        }
    }
}
