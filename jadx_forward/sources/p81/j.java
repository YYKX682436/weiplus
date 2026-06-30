package p81;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final t81.c f434256a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f434257b;

    /* renamed from: c, reason: collision with root package name */
    public final int f434258c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f434259d;

    public j(t81.c record, yz5.l onComplete) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(record, "record");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onComplete, "onComplete");
        this.f434256a = record;
        this.f434257b = onComplete;
        this.f434258c = record.f67709x44eeb14;
        this.f434259d = record.f67710x17fc513d > 0;
    }

    public static final void b(p81.j jVar, boolean z17) {
        java.lang.String str;
        boolean z18 = jVar.f434259d;
        r81.f.INSTANCE.b(jVar.f434258c, z17 ? z18 ? 52 : 47 : z18 ? 53 : 48);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7038x3b71cfb4 c7038x3b71cfb4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7038x3b71cfb4();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j jVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j.class);
        t81.c cVar = jVar.f434256a;
        if (jVar2 == null || (str = jVar2.D0(cVar.f67698x28d45f97)) == null) {
            str = "";
        }
        c7038x3b71cfb4.f143543d = c7038x3b71cfb4.b("Username", str, true);
        c7038x3b71cfb4.f143544e = c7038x3b71cfb4.b("Appid", cVar.f67698x28d45f97, true);
        c7038x3b71cfb4.f143545f = cVar.f67716x8987ca93;
        c7038x3b71cfb4.f143546g = 0L;
        c7038x3b71cfb4.f143547h = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.u.c();
        c7038x3b71cfb4.f143548i = z17 ? 1L : 0L;
        c7038x3b71cfb4.f143549j = cVar.f67710x17fc513d;
        c7038x3b71cfb4.f143550k = cVar.f67699x427bdb56;
        c7038x3b71cfb4.f143551l = cVar.f67709x44eeb14;
        c7038x3b71cfb4.f143552m = cVar.f67707xa1ecfcdb;
        c7038x3b71cfb4.f143553n = c7038x3b71cfb4.b("PackageKey", cVar.f67706xbae6789e, true);
        c7038x3b71cfb4.k();
    }

    public final void a(int i17, java.lang.String str) {
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.m96098xd5ad2104(i17, "MicroMsg.AppBrand.PreDownload.ActionGetNormalPkg", "appId:" + this.f434256a.f67698x28d45f97 + ", packageKey:" + this.f434256a.f67706xbae6789e + ", packageType:" + this.f434256a.f67707xa1ecfcdb + ", version:" + this.f434256a.f67716x8987ca93 + ", " + str, new java.lang.Object[0]);
        if (14 == this.f434256a.f67713x29cbf907) {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (z65.c.a()) {
                ((ku5.t0) ku5.t0.f394148d).B(new p81.f(str));
            }
        }
    }

    public final void c() {
        k91.v5 k17;
        k91.j5 u07;
        r81.f.INSTANCE.b(this.f434258c, this.f434259d ? 51 : 46);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.s5.f166673a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r5 r5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r5.f166636b;
        k91.m4 ij6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij();
        boolean z17 = false;
        t81.c cVar = this.f434256a;
        if (ij6 != null && (k17 = ij6.k1(cVar.f67698x28d45f97, "appInfo")) != null && (u07 = k17.u0()) != null && u07.b()) {
            z17 = true;
        }
        boolean z18 = !r5Var.a(z17);
        k91.a3 a3Var = (k91.a3) i95.n0.c(k91.a3.class);
        if (a3Var != null) {
            java.lang.String field_appId = cVar.f67698x28d45f97;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_appId, "field_appId");
            java.lang.String field_packageKey = cVar.f67706xbae6789e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_packageKey, "field_packageKey");
            k91.u0 u0Var = (k91.u0) a3Var;
            k91.r0 Bi = u0Var.Bi(field_appId);
            java.util.Map map = Bi.f387290a;
            java.lang.Object obj = map.get(field_packageKey);
            if (obj == null) {
                obj = new k91.m0(false, 0.0f, null, 7, null);
                map.put(field_packageKey, obj);
            }
            k91.x0[] x0VarArr = k91.x0.f387348d;
            java.util.Map map2 = ((k91.m0) obj).f387207c;
            if (map2.get(1) == null) {
                map2.put(1, new k91.q0(false, 0L, 3, null));
            }
            u0Var.Ri(field_appId, Bi);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j6 j6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x6.f166945a;
        java.lang.String field_appId2 = cVar.f67698x28d45f97;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_appId2, "field_appId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 o6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6(field_appId2, cVar.f67706xbae6789e, cVar.f67707xa1ecfcdb, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v6(cVar.f67716x8987ca93, 0L, 2, null), z18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l6 l6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l6(cVar.f67713x29cbf907, cVar.f67704xd9764fbf, cVar.f67702xd5d148d3);
        r45.y50 y50Var = new r45.y50();
        y50Var.f472332f = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j6.a(j6Var, o6Var, new p81.h(this), new p81.i(this), null, null, y50Var, l6Var, new p81.g(a3Var, this), null, null, gd1.w.f69815x366c91de, null);
    }
}
