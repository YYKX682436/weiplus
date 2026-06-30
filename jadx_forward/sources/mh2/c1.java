package mh2;

/* loaded from: classes10.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f407840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f407841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mh2.f1 f407842f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f407843g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(long j17, mh2.f1 f1Var, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f407841e = j17;
        this.f407842f = f1Var;
        this.f407843g = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mh2.c1(this.f407841e, this.f407842f, this.f407843g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mh2.c1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f407840d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f407840d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(this.f407841e, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        mh2.f1 f1Var = this.f407842f;
        f1Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("realStartPlay startTime: ");
        int i18 = this.f407843g;
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.f407863e, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.p1505xc84b4196.C14230x50345152 c14230x50345152 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.p1505xc84b4196.C14230x50345152) f1Var.f407864f;
        c14230x50345152.f193212n = i18;
        c14230x50345152.f193211m = java.lang.System.currentTimeMillis();
        if (c14230x50345152.f193210i) {
            ph2.e eVar = c14230x50345152.f193207f;
            if (eVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("drawerLooper");
                throw null;
            }
            eVar.c();
        }
        c14230x50345152.f193210i = false;
        return jz5.f0.f384359a;
    }
}
