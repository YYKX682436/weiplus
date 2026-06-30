package dv2;

/* loaded from: classes8.dex */
public final class m1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f325431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f325432e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f325433f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ db2.c4 f325434g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dv2.o1 f325435h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8 f325436i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(long j17, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, db2.c4 c4Var, dv2.o1 o1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8 m8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f325432e = j17;
        this.f325433f = c0Var;
        this.f325434g = c4Var;
        this.f325435h = o1Var;
        this.f325436i = m8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dv2.m1(this.f325432e, this.f325433f, this.f325434g, this.f325435h, this.f325436i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dv2.m1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f325431d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f325431d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(this.f325432e, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[preCheckInner] endCheck:");
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f325433f;
        sb6.append(c0Var.f391645d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSafePreCheckUIC", sb6.toString());
        if (!c0Var.f391645d) {
            this.f325434g.j();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h9 h9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h9(true, false, null, 4, null);
            this.f325435h.f325455i = h9Var;
            this.f325436i.c(h9Var);
        }
        return jz5.f0.f384359a;
    }
}
