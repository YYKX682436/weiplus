package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes11.dex */
public class s0 extends l75.s0 implements kv.j0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f152071f = {"CREATE TABLE IF NOT EXISTS img_flag ( username VARCHAR(40) PRIMARY KEY , imgflag int , lastupdatetime int , reserved1 text ,reserved2 text ,reserved3 int ,reserved4 int ,updateflag int default 0)", "alter table img_flag add updateflag int default 0;", "CREATE INDEX IF NOT EXISTS img_flag_small_url_index ON img_flag ( reserved2 )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f152072d;

    /* renamed from: e, reason: collision with root package name */
    public final kk.j f152073e = new jt0.j(800);

    public s0(l75.k0 k0Var) {
        this.f152072d = k0Var;
    }

    public boolean m0(java.util.List list) {
        boolean z17 = false;
        if (list != null && list.size() != 0) {
            java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
            l75.k0 k0Var = this.f152072d;
            long F = k0Var.F(valueOf);
            for (int i17 = 0; i17 < list.size(); i17++) {
                try {
                    y0((com.p314xaae8f345.mm.p943x351df9c2.r0) list.get(i17));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgFlagStorage", "" + e17.getMessage());
                }
            }
            z17 = true;
            k0Var.w(java.lang.Long.valueOf(F));
        }
        return z17;
    }

    public com.p314xaae8f345.mm.p943x351df9c2.r0 n0(java.lang.String str) {
        kk.j jVar = this.f152073e;
        com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = (com.p314xaae8f345.mm.p943x351df9c2.r0) ((lt0.f) jVar).i(str);
        if (r0Var != null && r0Var.e().equals(str)) {
            return r0Var;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select img_flag.username,img_flag.imgflag,img_flag.lastupdatetime,img_flag.reserved1,img_flag.reserved2,img_flag.reserved3,img_flag.reserved4,img_flag.updateflag from img_flag where img_flag.username=\"");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        sb6.append(str);
        sb6.append("\"");
        com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var2 = null;
        android.database.Cursor f17 = this.f152072d.f(sb6.toString(), null, 2);
        if (f17 == null) {
            return null;
        }
        if (f17.moveToFirst()) {
            r0Var2 = new com.p314xaae8f345.mm.p943x351df9c2.r0();
            r0Var2.a(f17);
        }
        f17.close();
        ((lt0.f) jVar).j(str, r0Var2);
        return r0Var2;
    }

    public final boolean s0(com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var) {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgFlagStorage", "username = %s, new smallImageUrl = %s, bigImageUrl = %s", r0Var.e(), r0Var.d(), r0Var.c());
        com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = n0(r0Var.e());
        kk.j jVar = this.f152073e;
        l75.k0 k0Var = this.f152072d;
        if (n07 == null) {
            ((lt0.f) jVar).j(r0Var.e(), r0Var);
            iz5.a.g(null, r0Var.e() != null);
            r0Var.f152064c = (int) (java.lang.System.currentTimeMillis() / 1000);
            r0Var.f();
            r0Var.f152070i = -1;
            z17 = ((int) k0Var.l("img_flag", dm.i4.f66875xa013b0d5, r0Var.b())) > -1;
            if (z17) {
                mo142179xf35bbb4(r0Var.e(), 2, r0Var.e());
            }
            return z17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgFlagStorage", "old, smallImageUrl = %s, bigImageUrl = %s", n07.d(), n07.c());
        if (java.util.Objects.equals(n07.d(), r0Var.d()) && java.util.Objects.equals(n07.c(), r0Var.c()) && java.util.Objects.equals(java.lang.Integer.valueOf(n07.f152063b), java.lang.Integer.valueOf(r0Var.f152063b))) {
            if (java.util.Objects.equals(java.lang.Boolean.valueOf(n07.f152067f != 0), java.lang.Boolean.valueOf(r0Var.f152067f != 0)) && java.util.Objects.equals(java.lang.Integer.valueOf(n07.f152069h), java.lang.Integer.valueOf(r0Var.f152069h)) && java.util.Objects.equals(java.lang.Integer.valueOf(n07.f152068g), java.lang.Integer.valueOf(r0Var.f152068g))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgFlagStorage", "not modify, do not need update, skip");
                return false;
            }
        }
        ((lt0.f) jVar).mo141381xc84af884(r0Var.e());
        ((hn1.s) ((kv.b0) i95.n0.c(kv.b0.class))).cj(r0Var.e(), null);
        iz5.a.g(null, r0Var.e() != null);
        r0Var.f152064c = (int) (java.lang.System.currentTimeMillis() / 1000);
        r0Var.f152070i |= 4;
        android.content.ContentValues b17 = r0Var.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(r0Var.e());
        z17 = k0Var.p("img_flag", b17, "username=?", new java.lang.String[]{sb6.toString()}) > 0;
        if (z17) {
            mo142179xf35bbb4(r0Var.e(), 3, r0Var.e());
        }
        return z17;
    }

    public void u0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        ((lt0.f) this.f152073e).mo141381xc84af884(str);
        this.f152072d.mo70514xb06685ab("img_flag", "username=?", new java.lang.String[]{"" + str});
    }

    public boolean y0(com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17;
        if (r0Var == null) {
            return false;
        }
        java.lang.String e17 = r0Var.e();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.E4(e17) && (n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(e17, true)) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.d1()) && !n17.d1().equals(e17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgFlagStorage", "recursive clear avatar cache username: %s, imgFlag.Username: %s", n17.d1(), e17);
            com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var2 = new com.p314xaae8f345.mm.p943x351df9c2.r0();
            r0Var2.f152062a = n17.d1();
            r0Var2.f152066e = r0Var.c();
            r0Var2.f152065d = r0Var.d();
            r0Var2.f152070i = r0Var.f152070i;
            r0Var2.f152063b = r0Var.f152063b;
            r0Var2.f152067f = r0Var.f152067f != 0 ? 1 : 0;
            s0(r0Var2);
        }
        return s0(r0Var);
    }
}
