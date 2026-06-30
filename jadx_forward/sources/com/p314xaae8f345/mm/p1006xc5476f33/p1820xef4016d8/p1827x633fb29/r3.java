package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class r3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f227106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f227107b;

    public r3(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, android.content.Context context) {
        this.f227106a = u3Var;
        this.f227107b = context;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopePreview", "do confirm errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        if (fVar.f152148a != 0 || fVar.f152149b != 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f227106a;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            java.lang.String str = fVar.f152150c;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g);
            }
            db5.e1.y(this.f227107b, str, "", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gk9), new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.q3(this));
            return null;
        }
        java.util.Iterator it = ((r45.tm3) fVar.f152151d).f468103d.iterator();
        while (it.hasNext()) {
            r45.mm5 mm5Var = (r45.mm5) it.next();
            ot0.q v17 = ot0.q.v(mm5Var.f462197d);
            ot0.c cVar = (ot0.c) v17.y(ot0.c.class);
            r45.xv3 xv3Var = new r45.xv3();
            xv3Var.f472011e = cVar.f429945e;
            xv3Var.f472014h = cVar.f429946f;
            xv3Var.f472012f = cVar.f429949i;
            xv3Var.f472015i = cVar.f429950j;
            xv3Var.f472013g = cVar.f429951k;
            xv3Var.f472016m = cVar.f429952l;
            xv3Var.f472026w = cVar.f429963w;
            xv3Var.A = cVar.f429964x;
            xv3Var.f472027x = cVar.f429966z;
            xv3Var.B = cVar.A;
            xv3Var.D = cVar.B;
            xv3Var.f472028y = cVar.C;
            xv3Var.C = cVar.D;
            xv3Var.E = cVar.E;
            xv3Var.F = cVar.F;
            xv3Var.G = cVar.G;
            xv3Var.M = cVar.H;
            xv3Var.f472020q = cVar.f429957q;
            xv3Var.f472021r = cVar.f429958r;
            xv3Var.f472018o = cVar.f429955o;
            xv3Var.f472019p = cVar.f429956p;
            r45.nm5 nm5Var = mm5Var.f462200g;
            if (nm5Var != null) {
                nm5Var.G = cVar.f429953m;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.p3 p3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.p3(this, mm5Var, v17);
            java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
            gb3.j jVar = (gb3.j) i95.n0.c(gb3.j.class);
            java.lang.String str2 = xv3Var.f472011e;
            java.lang.String str3 = xv3Var.f472014h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s3 s3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s3(atomicInteger, p3Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2 w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2) jVar;
            w2Var.getClass();
            w2Var.ij(str2, str3, "", new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h2(w2Var, s3Var));
            gb3.j jVar2 = (gb3.j) i95.n0.c(gb3.j.class);
            java.lang.String str4 = xv3Var.f472012f;
            java.lang.String str5 = xv3Var.f472015i;
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.t3 t3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.t3(atomicInteger, p3Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2 w2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2) jVar2;
            w2Var2.getClass();
            w2Var2.ij(str4, str5, "", new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h2(w2Var2, t3Var));
            gb3.j jVar3 = (gb3.j) i95.n0.c(gb3.j.class);
            java.lang.String str6 = xv3Var.f472013g;
            java.lang.String str7 = xv3Var.f472016m;
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.u3 u3Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.u3(atomicInteger, p3Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2 w2Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2) jVar3;
            w2Var3.getClass();
            w2Var3.ij(str6, str7, "", new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h2(w2Var3, u3Var2));
            gb3.j jVar4 = (gb3.j) i95.n0.c(gb3.j.class);
            java.lang.String str8 = xv3Var.f472020q;
            java.lang.String str9 = xv3Var.f472021r;
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v3 v3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v3(atomicInteger, p3Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2 w2Var4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2) jVar4;
            w2Var4.getClass();
            w2Var4.ij(str8, str9, "", new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h2(w2Var4, v3Var));
            gb3.j jVar5 = (gb3.j) i95.n0.c(gb3.j.class);
            java.lang.String str10 = xv3Var.f472018o;
            java.lang.String str11 = xv3Var.f472019p;
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w3 w3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w3(atomicInteger, p3Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2 w2Var5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2) jVar5;
            w2Var5.getClass();
            w2Var5.ij(str10, str11, "", new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h2(w2Var5, w3Var));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2) ((gb3.j) i95.n0.c(gb3.j.class))).qj(nm5Var, true);
        }
        return null;
    }
}
