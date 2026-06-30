package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class u30 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f201468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c40 f201469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f201470f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u30(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c40 c40Var, boolean z17) {
        super(2, interfaceC29045xdcb5ca57);
        this.f201468d = hVar;
        this.f201469e = c40Var;
        this.f201470f = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u30(this.f201468d, interfaceC29045xdcb5ca57, this.f201469e, this.f201470f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u30 u30Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u30) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        u30Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f201468d).f535914b;
        rm0.j jVar = aVar2.f535912a;
        java.lang.Integer num = jVar != null ? new java.lang.Integer(jVar.f478957e) : null;
        rm0.j jVar2 = aVar2.f535912a;
        java.lang.Integer num2 = jVar2 != null ? new java.lang.Integer(jVar2.f478958f) : null;
        java.lang.String str = jVar2 != null ? jVar2.f478959g : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c40 c40Var = this.f201469e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c40Var.A(), "requestMicReplayStatus failed,errorType:" + num + ",errorCode:" + num2 + ",errorMsg:" + str);
        boolean z17 = false;
        if (jVar2 != null && jVar2.f478958f == -200434) {
            z17 = true;
        }
        if (z17) {
            c40Var.J(dk2.na.f315344m);
            android.content.Context context = c40Var.f199914d;
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.f293309c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ov6);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f80097x8eab27b0);
            e4Var.c();
        } else if (this.f201470f) {
            c40Var.J(dk2.na.f315340f);
            android.content.Context context2 = c40Var.f199914d;
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context2);
            e4Var2.f293309c = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ov_);
            e4Var2.b(com.p314xaae8f345.mm.R.raw.f80097x8eab27b0);
            e4Var2.c();
        } else {
            c40Var.F(0L);
        }
        return jz5.f0.f384359a;
    }
}
