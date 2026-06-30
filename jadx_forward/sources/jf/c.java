package jf;

/* loaded from: classes7.dex */
public final class c implements nh1.b {
    @Override // nh1.b
    public void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b pageView = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) v5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageView, "pageView");
        f06.v[] vVarArr = gf.m0.f352658b;
        f06.v vVar = vVarArr[1];
        nf.r rVar = gf.m0.f352660d;
        gf.m0 m0Var = gf.m0.f352657a;
        boolean[] zArr = {((java.lang.Boolean) rVar.b(m0Var, vVar)).booleanValue(), ((java.lang.Boolean) gf.m0.f352661e.b(m0Var, vVarArr[2])).booleanValue()};
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        builder.setTitle(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mdc));
        builder.setMultiChoiceItems(new java.lang.String[]{"showPerformanceOverlay", "checkerboardRasterCacheImages"}, zArr, new jf.a(zArr));
        builder.setPositiveButton("OK", new jf.b(zArr));
        builder.setNegativeButton("Cancel", (android.content.DialogInterface.OnClickListener) null);
        builder.create().show();
    }

    @Override // nh1.b
    public java.lang.String b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b pageView = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) v5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageView, "pageView");
        return "Debug Skyline";
    }

    @Override // nh1.b
    public boolean c(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b pageView = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) v5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageView, "pageView");
        gf.n2 n2Var = (gf.n2) pageView.mo32091x9a3f0ba2().p0(gf.n2.class, false);
        boolean z17 = n2Var != null ? n2Var.f352678h : false;
        if (!z65.c.a()) {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.a(pageView.mo32091x9a3f0ba2().f156338p.f158814g)) {
                return false;
            }
        }
        return z17;
    }
}
