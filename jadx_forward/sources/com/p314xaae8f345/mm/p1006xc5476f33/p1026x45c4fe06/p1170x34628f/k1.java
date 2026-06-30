package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19777x35cb352a f168342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.rd5 f168344f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168345g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.z1 f168346h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.fe0 f168347i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.l1 f168348m;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.l1 l1Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19777x35cb352a c19777x35cb352a, java.lang.String str, r45.rd5 rd5Var, java.lang.String str2, r45.z1 z1Var, r45.fe0 fe0Var) {
        this.f168348m = l1Var;
        this.f168342d = c19777x35cb352a;
        this.f168343e = str;
        this.f168344f = rd5Var;
        this.f168345g = str2;
        this.f168346h = z1Var;
        this.f168347i = fe0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.l1 l1Var = this.f168348m;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19777x35cb352a c19777x35cb352a = this.f168342d;
        if (c19777x35cb352a != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMenuHeaderDataHelper", "queryProfile, onGetTradeComment");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o1 o1Var = l1Var.f168378c;
            o1Var.f168475c = c19777x35cb352a;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p0) l1Var.f168377b).b(c19777x35cb352a, true, o1Var.f168476d);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMenuHeaderDataHelper", "queryProfile, onGetScore");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o1 o1Var2 = l1Var.f168378c;
            java.lang.String str = this.f168343e;
            o1Var2.f168474b = str;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p0) l1Var.f168377b).a(str);
        }
        r45.rd5 rd5Var = this.f168344f;
        if (rd5Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMenuHeaderDataHelper", "queryProfile, onGetKoubeiInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p0 p0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p0) l1Var.f168377b;
            p0Var.getClass();
            p0Var.f168516e.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n0(p0Var, rd5Var));
        }
        java.lang.String str2 = this.f168345g;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            l1Var.f168378c.f168477e = str2;
            android.widget.TextView textView = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p0) l1Var.f168377b).f168515d;
            textView.setText(str2);
            textView.setVisibility(0);
        }
        r45.z1 z1Var = this.f168346h;
        if (z1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p0 p0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p0) l1Var.f168377b;
            p0Var2.getClass();
            p0Var2.f168516e.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o0(p0Var2, z1Var));
        }
        r45.fe0 fe0Var = this.f168347i;
        if (fe0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMenuHeaderDataHelper", "finalDeveloperServiceInfo is null");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p0) l1Var.f168377b).f168513b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 N2 = o6Var.N2();
        if (N2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandMenuHeader", "onDeveloperService pageViewWC is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 H1 = N2.H1(40);
        boolean a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.kf.a(o6Var);
        boolean z18 = fe0Var == null || !fe0Var.f455783d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMenuHeader", "onDeveloperService hide:%b， isSinglePageMode:%b", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(a17));
        if (!z18 && !a17) {
            z17 = false;
        }
        if (H1 == null) {
            if (z17) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMenuHeader", "doAddMenuInfo developer service menu");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.l1.a(N2.G1(), 40, false, false);
            return;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMenuHeader", "removeMenuItem developer service menu");
            java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0> G1 = N2.G1();
            if (G1 == null || G1.isEmpty()) {
                return;
            }
            for (int i17 = 0; i17 < G1.size(); i17++) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 u0Var = G1.get(i17);
                if (u0Var != null && u0Var.f167526a == H1.f167526a) {
                    G1.remove(i17);
                    return;
                }
            }
        }
    }
}
