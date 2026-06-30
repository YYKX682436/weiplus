package dn2;

/* loaded from: classes3.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f323502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn2.s0 f323503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f323504f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f323505g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 f323506h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.pj1 f323507i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(dn2.s0 s0Var, android.widget.TextView textView, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var, r45.pj1 pj1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f323503e = s0Var;
        this.f323504f = textView;
        this.f323505g = j17;
        this.f323506h = k0Var;
        this.f323507i = pj1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dn2.r0(this.f323503e, this.f323504f, this.f323505g, this.f323506h, this.f323507i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dn2.r0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f323502d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            dn2.s0 s0Var = this.f323503e;
            android.widget.TextView textView = this.f323504f;
            long j17 = this.f323505g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = this.f323506h;
            java.lang.String m75945x2fec8307 = this.f323507i.m75945x2fec8307(7);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            this.f323502d = 1;
            obj = dn2.s0.e(s0Var, textView, j17, k0Var, m75945x2fec8307, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
