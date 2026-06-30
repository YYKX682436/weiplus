package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class z30 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f202052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c40 f202053e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f202054f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z30(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c40 c40Var, p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f202052d = hVar;
        this.f202053e = c40Var;
        this.f202054f = y0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z30(this.f202052d, interfaceC29045xdcb5ca57, this.f202053e, this.f202054f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z30 z30Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z30) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        z30Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.l71 l71Var = (r45.l71) ((xg2.i) this.f202052d).f535926b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c40 c40Var = this.f202053e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c40Var.A(), "requestMicStats success,curRetryTime = " + c40Var.f199493p);
        c40Var.f199493p = 0;
        r45.ob obVar = (r45.ob) l71Var.m75936x14adae67(39);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (obVar != null) {
            dk2.qf qfVar = c40Var.f199489i;
            qfVar.getClass();
            qfVar.f315512p = obVar.m75942xfb822ef2(0);
            qfVar.f315513q = obVar.m75942xfb822ef2(1);
            qfVar.f315514r = obVar.m75942xfb822ef2(2);
            qfVar.f315515s = obVar.m75942xfb822ef2(3);
            qfVar.f315516t = obVar.m75933x41a8a7f2(4);
            qfVar.f315517u = obVar.m75933x41a8a7f2(5);
            qfVar.f315518v = obVar.m75942xfb822ef2(6);
            c40Var.K();
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c40Var.A(), "audience_mic_stats is null");
            c40Var.I();
        }
        return f0Var2;
    }
}
