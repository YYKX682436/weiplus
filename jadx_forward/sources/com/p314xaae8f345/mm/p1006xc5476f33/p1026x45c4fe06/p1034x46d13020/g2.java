package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public class g2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.i3 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k f157976m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(r45.i77 i77Var, com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k kVar) {
        super(i77Var);
        this.f157976m = kVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.i77 i77Var;
        r45.xr3 xr3Var = (r45.xr3) fVar;
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNewTipsUpdate", "acc not Ready");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNewTipsUpdate", "onCgiBack, errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (xr3Var == null || (i77Var = xr3Var.f471890d) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNewTipsUpdate", "null == resp || null == resp.msg_info");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNewTipsUpdate", "extInfo:%s, update_interval_time:%d", i77Var.f458336g, java.lang.Integer.valueOf(xr3Var.f471891e));
        r45.i77 i77Var2 = xr3Var.f471890d;
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.h2.f157990d + 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.h2.f157990d = i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNewTipsUpdate", "updateRate:%d", java.lang.Integer.valueOf(i19));
        java.lang.String str2 = i77Var2.f458336g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k kVar = this.f157976m;
        kVar.f67136x26b3182a = str2;
        r45.h77 h77Var = i77Var2.f458335f;
        if (h77Var != null) {
            java.lang.String str3 = h77Var.f457459e;
            kVar.f67150x29dd02d3 = str3;
            java.lang.String str4 = h77Var.f457460f;
            kVar.f67137xf1cc564e = str4;
            int i27 = h77Var.f457458d;
            kVar.f67146x991217c = i27;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNewTipsUpdate", "title:%s, icon_url:%s, show_type:%d", str3, str4, java.lang.Integer.valueOf(i27));
        }
        long j17 = xr3Var.f471891e * 1000;
        if (j17 >= 60000) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.h2.f157989c = j17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNewTipsUpdate", "updateNewTips uniqueId:%s", kVar.f67151xc35ee71);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().getClass();
        vn3.b Bi = rn3.i.Bi();
        Bi.getClass();
        Bi.mo11261xce0038c9(kVar.f72763xa3c65b86, kVar);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().n(43);
    }
}
