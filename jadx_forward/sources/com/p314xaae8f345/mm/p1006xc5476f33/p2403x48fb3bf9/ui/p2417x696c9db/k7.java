package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class k7 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f267143a;

    public k7(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var) {
        this.f267143a = c6Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d1
    /* renamed from: onShow */
    public void mo14645xc39f557c() {
        db5.g4 g4Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.g3 g3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var = this.f267143a;
        if (!c6Var.D) {
            ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Ni(c6Var.E);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p7 p7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p7) c6Var.f265584h.get(45);
        if (p7Var == null) {
            return;
        }
        c6Var.f265584h.remove(45);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = c6Var.f265577J;
        if (k0Var != null && k0Var.i() && (g4Var = c6Var.L) != null) {
            int y17 = g4Var.y(7);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = c6Var.f265577J;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = k0Var2.G1;
            if (c1163xf1deaba4 != null && c1163xf1deaba4.getLayoutManager() != null && (g3Var = k0Var2.f293392f2) != null) {
                g3Var.f93582a = y17;
                k0Var2.G1.getLayoutManager().m8099x6305639d(k0Var2.f293392f2);
            }
        }
        c6Var.getClass();
        android.os.Bundle bundle = p7Var.f268285b;
        if (bundle != null && p7Var.f268284a == 45) {
            android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) bundle.getParcelable("show_browser_resolve_info");
            boolean z17 = bundle.getBoolean("show_browser_with_animation", false);
            if (resolveInfo != null) {
                hx4.x xVar = c6Var.f265582f;
                xVar.f367235c = null;
                xVar.f367234b = resolveInfo;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d c17 = c6Var.c();
                android.content.pm.ResolveInfo resolveInfo2 = xVar.f367234b;
                db5.g4 g4Var2 = c6Var.L;
                java.lang.String c18 = hx4.r.c(c17, resolveInfo2);
                java.lang.String format = java.lang.String.format(c17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5g), c18);
                android.graphics.drawable.Drawable drawable = xVar.f367235c;
                if (drawable != null) {
                    c6Var.i(g4Var2, format, drawable, null, false, z17);
                } else {
                    new hx4.w(c17, c18, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.l6(c6Var, g4Var2, format, false, z17)).execute(resolveInfo2);
                }
            }
        }
    }
}
