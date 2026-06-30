package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac;

/* loaded from: classes7.dex */
public final class u implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f162528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f162529b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f162530c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.v f162531d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.v vVar) {
        this.f162528a = o6Var;
        this.f162529b = c0Var;
        this.f162530c = i17;
        this.f162531d = vVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        gk1.c cVar = gk1.g.f353996f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = this.f162528a.u0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u07, "getInitConfig(...)");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(u07.f158811d);
        sb6.append('_');
        sb6.append(u07.f158814g);
        sb6.append('_');
        sb6.append(u07.L);
        sb6.append('_');
        sb6.append(com.p314xaae8f345.mm.ui.bk.C() ? "dark" : "normal");
        sb6.append('_');
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append(".png");
        java.lang.String sb7 = sb6.toString();
        java.lang.String appId = u07.f158811d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId, "appId");
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(cVar.b(appId), sb7);
        com.p314xaae8f345.mm.vfs.r6 s17 = r6Var.s();
        if (s17 != null) {
            s17.J();
        }
        java.lang.String m82469x9616526c = r6Var.m82469x9616526c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m82469x9616526c, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f162529b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f162528a;
        int i17 = this.f162530c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.v vVar = this.f162531d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, m82469x9616526c, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiSaveRuntimeSnapshot", "saveBitmap ok, appId=" + c0Var.mo48798x74292566() + ", path=" + m82469x9616526c);
        gk1.b bVar = new gk1.b();
        bVar.f69057x28d45f97 = o6Var.f156336n;
        bVar.f69061x94d24c6d = o6Var.f156338p.f158814g;
        bVar.f69058x119cf7dc = o6Var.d2();
        bVar.f69059xf1a1cde8 = com.p314xaae8f345.mm.ui.bk.C();
        bVar.f69060xead0d2ac = m82469x9616526c;
        uk0.a.b(bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.s.f162523d, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.t(c0Var, i17, vVar, m82469x9616526c));
        return jz5.f0.f384359a;
    }
}
