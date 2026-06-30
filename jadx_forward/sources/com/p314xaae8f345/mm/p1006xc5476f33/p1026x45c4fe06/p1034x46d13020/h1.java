package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes4.dex */
public final class h1 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f157985e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f1.f157963s, "AppBrandLocalUsageRecord")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f157986d;

    public h1(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f1.f157963s, "AppBrandLocalUsageRecord", dm.b0.f317314h);
        this.f157986d = k0Var;
    }

    public boolean y0(java.lang.String str, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.g1 g1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLocalUsageStorage", "addUsage, username %s, type %d, scene %s", str, java.lang.Integer.valueOf(i17), g1Var);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f1 f1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f1();
        f1Var.f65955xdec927b = str;
        f1Var.f65956x94d24c6d = i17;
        java.lang.String[] strArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f1.f157962r;
        if (super.get(f1Var, strArr)) {
            f1Var.f65954xa783a79b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            boolean m145258xce0038c9 = super.m145258xce0038c9(f1Var.f72763xa3c65b86, f1Var, false);
            if (m145258xce0038c9) {
                mo142179xf35bbb4("single", 3, null);
            }
            return m145258xce0038c9;
        }
        f1Var.f65954xa783a79b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        super.mo51731x24249762(f1Var, false);
        boolean z17 = super.get(f1Var, strArr);
        if (z17) {
            this.f157986d.A("AppBrandLocalUsageRecord", "delete from AppBrandLocalUsageRecord where rowid not in ( select rowid from AppBrandLocalUsageRecord order by updateTime desc  limit " + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b().f158757v + " offset 0)");
            mo142179xf35bbb4("single", 2, null);
        }
        return z17;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public boolean mo49766xb06685ab(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f1 f1Var, boolean z17, java.lang.String... strArr) {
        if (z17) {
            return super.mo49766xb06685ab(f1Var, z17, strArr);
        }
        if (!get(f1Var, strArr)) {
            return false;
        }
        super.mo49766xb06685ab(f1Var, z17, strArr);
        return !get(f1Var, strArr);
    }
}
