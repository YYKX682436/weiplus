package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class bd extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f193544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f193545e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f193546f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f193547g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad f193548h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd(long j17, long j18, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f193545e = j17;
        this.f193546f = j18;
        this.f193547g = str;
        this.f193548h = adVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bd(this.f193545e, this.f193546f, this.f193547g, this.f193548h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bd) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f193544d;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            return obj;
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.String str = this.f193547g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar = this.f193548h;
        int i18 = adVar.A;
        this.f193544d = 1;
        oz5.n nVar = new oz5.n(pz5.f.b(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChargePayPluginEx", "pay, giftId:null price:" + i18 + ",comboId:" + str + ",liveId:" + this.f193545e + ",objectId:" + this.f193546f);
        android.content.Context context = adVar.f446856d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        gk2.e buContext = adVar.S0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ed edVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ed(nVar, adVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.A(fe1.l.f69742x366c91de, 70);
        java.lang.String e17 = xy2.c.e(context);
        java.lang.String m17 = zl2.q4.f555466a.m();
        g0Var.d(22129, 1, m17, "", 1, 1, 0, "");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        pq5.g l17 = new ek2.i2(((mm2.e1) buContext.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) buContext.a(mm2.e1.class)).f410516m, null, 1, e17, i18, m17, str, "", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).V6(), ((mm2.e1) buContext.a(mm2.e1.class)).f410526w, 1, null, ((mm2.e1) buContext.a(mm2.e1.class)).f410518o, null, kz5.p0.f395529d, null, null, new dk2.f4(i18, edVar, m17, context, 7, null, 1, str)).l();
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            l17.f((im5.b) context);
        }
        java.lang.Object a17 = nVar.a();
        return a17 == aVar ? aVar : a17;
    }
}
