package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class e4 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl5.i f280490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u53.u f280491e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f280492f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h4 f280493g;

    public e4(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h4 h4Var, fl5.i iVar, u53.u uVar, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f280493g = h4Var;
        this.f280490d = iVar;
        this.f280491e = uVar;
        this.f280492f = c19666xfd6e2f33;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        fl5.i iVar = this.f280490d;
        int i39 = iVar.i();
        if (i39 < 0) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h4 h4Var = this.f280493g;
        int b17 = i39 - i65.a.b(h4Var.f280113d.g(), 52);
        u53.u uVar = this.f280491e;
        java.lang.String format = (android.text.TextUtils.isEmpty(((y53.m) uVar).f67431x4b6e82d5) || ((y53.m) uVar).f67426x9f600742 != 1) ? null : java.lang.String.format(" (%s)", ((y53.m) uVar).f67431x4b6e82d5);
        java.lang.String P0 = ((y53.m) uVar).v0().P0();
        if (P0 == null) {
            P0 = "";
        }
        if (format != null) {
            P0 = P0.concat(format);
        }
        float desiredWidth = android.text.Layout.getDesiredWidth(P0 + " : ", iVar.mo81567x74f59ea8());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String P02 = ((y53.m) uVar).v0().P0();
        if (P02 == null || desiredWidth <= b17) {
            sb6.append(P02);
        } else {
            java.lang.String h17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.h(P02, format == null ? 20 : 12);
            if (java.lang.Character.isHighSurrogate(h17.charAt(h17.length() - 1))) {
                h17 = h17.substring(0, h17.length() - 1);
            }
            sb6.append(h17);
            sb6.append("...");
        }
        if (format != null) {
            sb6.append(format);
        }
        if (sb6.length() != 0) {
            sb6.append(" : ");
        }
        java.lang.String t17 = h4Var.f280113d.t();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.app.Activity g17 = h4Var.f280113d.g();
        ((ke0.e) xVar).getClass();
        this.f280492f.o1(t17, bool, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(g17, sb6), bool);
        iVar.removeOnLayoutChangeListener(this);
    }
}
