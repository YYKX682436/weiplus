package ai1;

/* loaded from: classes8.dex */
public final class m implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 f86628a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zh1.a1 f86629b;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 c12476xea20f622, zh1.a1 a1Var) {
        this.f86628a = c12476xea20f622;
        this.f86629b = a1Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchOpenMaterialsByCgi#onCgiBack, errType: ");
        sb6.append(i17);
        sb6.append(", errCode: ");
        sb6.append(i18);
        sb6.append(", errMsg: ");
        sb6.append(str);
        sb6.append(", material_type: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 c12476xea20f622 = this.f86628a;
        sb6.append(c12476xea20f622.f167802d);
        sb6.append(", material_suffix: ");
        java.lang.String str2 = c12476xea20f622.f167803e;
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WeChatOpenMaterialDataSource", sb6.toString());
        zh1.a1 a1Var = this.f86629b;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.WeChatOpenMaterialDataSource", "fetchOpenMaterialsByCgi#onCgiBack, cgi back not ok");
            pm0.v.X(new ai1.l(a1Var, c12476xea20f622));
            return;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        if (!(fVar instanceof r45.ji3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.WeChatOpenMaterialDataSource", "fetchOpenMaterialsByCgi#onCgiBack, responseProtoBuf is not GetMaterialRecommWxaCardResponse");
            pm0.v.X(new ai1.k(a1Var, c12476xea20f622));
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetMaterialRecommWxaCardResponse");
        r45.ji3 ji3Var = (r45.ji3) fVar;
        java.lang.String str3 = ji3Var.f459370f;
        if (!(str3 == null || str3.length() == 0)) {
            c12476xea20f622.f167802d = ji3Var.f459370f;
        }
        if (a1Var != null) {
            ai1.p pVar = ai1.p.f86635b;
            pm0.v.X(new ai1.n(this.f86629b, ji3Var, java.lang.System.currentTimeMillis(), this.f86628a));
        }
        if (str2.length() == 0) {
            str2 = c12476xea20f622.f167802d;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "ifEmpty(...)");
        if (str2.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.OpenMaterialDataCache", "set, not need");
            return;
        }
        java.lang.String concat = "OpenMaterialsRsp###".concat(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.OpenMaterialDataCache", "set, cacheKey: " + concat);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0 q0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = q0Var.a();
        if (a17 != null) {
            byte[] mo14344x5f01b1f6 = ji3Var.mo14344x5f01b1f6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
            a17.putString(concat, new java.lang.String(mo14344x5f01b1f6, r26.c.f450400c));
        }
        java.lang.String concat2 = "OpenMaterialsRspTime###_".concat(str2);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a18 = q0Var.a();
        if (a18 != null) {
            a18.putLong(concat2, java.lang.System.currentTimeMillis());
        }
    }
}
