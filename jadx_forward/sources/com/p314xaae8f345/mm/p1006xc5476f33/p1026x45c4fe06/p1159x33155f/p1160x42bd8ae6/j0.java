package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6;

/* loaded from: classes7.dex */
public class j0 implements nh1.b {
    @Override // nh1.b
    public void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var;
        if (n7Var.mo32091x9a3f0ba2() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 mo32091x9a3f0ba2 = n7Var.mo32091x9a3f0ba2();
            java.lang.String str2 = lp0.b.D() + "appbrand/trace/";
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str2);
            java.lang.String str3 = a17.f294812f;
            if (str3 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
                if (!str3.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
            com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
            if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false)) {
                com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                if (m18.a()) {
                    m18.f294799a.r(m18.f294800b);
                }
            }
            java.util.Locale locale = java.util.Locale.ENGLISH;
            java.lang.String dumpFullPath = str2 + java.lang.String.format(locale, "HEAP_%s_%d.heapsnapshot", str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dumpFullPath, "dumpFullPath");
            mo32091x9a3f0ba2.C0().getF229341e().mo14660x738236e6("(function() {var profiler = NativeGlobal.Profiler;var snapshot = profiler.takeHeapSnapshot();return snapshot.serialize('" + dumpFullPath + "');})()", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.i0(this, context, dumpFullPath));
            if (mo32091x9a3f0ba2.q2() || n7Var.p2()) {
                return;
            }
            if (!z65.c.a()) {
                java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                return;
            }
            java.lang.String str5 = str2 + java.lang.String.format(locale, "WebView_HEAP_%s_%d.heapsnapshot", str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.GameHeapProfile", "WebViewDumpSnapshot to :%s suc:%b", str5, java.lang.Boolean.valueOf(n7Var.S3().mo120174x847491ac(new com.p314xaae8f345.mm.vfs.r6(str5).o(), null, 100000)));
        }
    }

    @Override // nh1.b
    public /* bridge */ /* synthetic */ java.lang.String b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str) {
        return "Take Heap Snapshot";
    }

    @Override // nh1.b
    public boolean c(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 c11813xf952a195 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) v5Var).b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195.class);
        if (c11813xf952a195.f387385r.f156932d == 1 || c11813xf952a195.f387385r.f156932d == 2 || z65.c.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            return true;
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.a(str).f167255o || z65.c.a();
    }
}
