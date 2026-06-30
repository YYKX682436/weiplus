package rv0;

/* loaded from: classes5.dex */
public final class j3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f481593d;

    /* renamed from: e, reason: collision with root package name */
    public int f481594e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481595f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e f481596g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ rv0.f f481597h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(rv0.n1 n1Var, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e c4188xeef5596e, rv0.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f481595f = n1Var;
        this.f481596g = c4188xeef5596e;
        this.f481597h = fVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rv0.j3(this.f481595f, this.f481596g, this.f481597h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.j3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        rv0.f fVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f481594e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gx0.kh q76 = this.f481595f.q7();
            com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = this.f481596g.f130065a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c3971x241f78, "getSegmentID(...)");
            ex0.o m76 = q76.m7(c3971x241f78);
            if (m76 != null) {
                rv0.f fVar2 = this.f481597h;
                this.f481593d = fVar2;
                this.f481594e = 1;
                obj = m76.G(this);
                if (obj == aVar) {
                    return aVar;
                }
                fVar = fVar2;
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fVar = (rv0.f) this.f481593d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        float[] fArr = (float[]) obj;
        if (fArr != null) {
            fVar.getClass();
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10964x1eb31dbf c10964x1eb31dbf = fVar.L;
            if (c10964x1eb31dbf == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wave");
                throw null;
            }
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553 = fVar.M;
            if (c4129xdee64553 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presentationTimeRange");
                throw null;
            }
            long m33987xd22e7c2d = (long) c4129xdee64553.m34005x51e8b0a().m33987xd22e7c2d();
            long m33987xd22e7c2d2 = (long) fVar.N.m33987xd22e7c2d();
            if (m33987xd22e7c2d > 0) {
                c10964x1eb31dbf.f150947m = fArr;
                c10964x1eb31dbf.f150949o = 50;
                c10964x1eb31dbf.f150943f = m33987xd22e7c2d;
                c10964x1eb31dbf.f150944g = m33987xd22e7c2d;
                c10964x1eb31dbf.f150945h = ((fArr.length * 1.0f) / 50) * 1000;
                c10964x1eb31dbf.f150946i = m33987xd22e7c2d2;
                if (c10964x1eb31dbf.f150951q > 0) {
                    c10964x1eb31dbf.a(c10964x1eb31dbf.b());
                }
                c10964x1eb31dbf.postInvalidate();
            }
        }
        return jz5.f0.f384359a;
    }
}
