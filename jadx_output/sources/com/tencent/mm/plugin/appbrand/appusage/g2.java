package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public class g2 extends com.tencent.mm.plugin.appbrand.appusage.i3 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.newtips.model.k f76443m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(r45.i77 i77Var, com.tencent.mm.plugin.newtips.model.k kVar) {
        super(i77Var);
        this.f76443m = kVar;
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.i77 i77Var;
        r45.xr3 xr3Var = (r45.xr3) fVar;
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNewTipsUpdate", "acc not Ready");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNewTipsUpdate", "onCgiBack, errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (xr3Var == null || (i77Var = xr3Var.f390357d) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNewTipsUpdate", "null == resp || null == resp.msg_info");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNewTipsUpdate", "extInfo:%s, update_interval_time:%d", i77Var.f376803g, java.lang.Integer.valueOf(xr3Var.f390358e));
        r45.i77 i77Var2 = xr3Var.f390357d;
        int i19 = com.tencent.mm.plugin.appbrand.appusage.h2.f76457d + 1;
        com.tencent.mm.plugin.appbrand.appusage.h2.f76457d = i19;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNewTipsUpdate", "updateRate:%d", java.lang.Integer.valueOf(i19));
        java.lang.String str2 = i77Var2.f376803g;
        com.tencent.mm.plugin.newtips.model.k kVar = this.f76443m;
        kVar.field_extInfo = str2;
        r45.h77 h77Var = i77Var2.f376802f;
        if (h77Var != null) {
            java.lang.String str3 = h77Var.f375926e;
            kVar.field_title = str3;
            java.lang.String str4 = h77Var.f375927f;
            kVar.field_icon_url = str4;
            int i27 = h77Var.f375925d;
            kVar.field_showType = i27;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNewTipsUpdate", "title:%s, icon_url:%s, show_type:%d", str3, str4, java.lang.Integer.valueOf(i27));
        }
        long j17 = xr3Var.f390358e * 1000;
        if (j17 >= 60000) {
            com.tencent.mm.plugin.appbrand.appusage.h2.f76456c = j17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNewTipsUpdate", "updateNewTips uniqueId:%s", kVar.field_uniqueId);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().getClass();
        vn3.b Bi = rn3.i.Bi();
        Bi.getClass();
        Bi.update(kVar.systemRowid, kVar);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().n(43);
    }
}
