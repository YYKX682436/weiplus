package mx0;

/* loaded from: classes5.dex */
public final class z4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f414000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f414001e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f414001e = c10977x8e40eced;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.z4(this.f414001e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.z4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f414000d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f414001e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            yx0.b8 b8Var = c10977x8e40eced.f151090v;
            this.f414000d = 1;
            b8Var.getClass();
            ((yy0.k8) ((pp0.q0) i95.n0.c(pp0.q0.class))).getClass();
            az0.i5 i5Var = az0.i5.f97090a;
            az0.i5.f97106q = null;
            b8Var.h0(true);
            java.lang.Object C = ((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.l.d(b8Var.M, null, null, new yx0.v7(b8Var, null), 3, null)).C(this);
            if (C != aVar) {
                C = f0Var;
            }
            if (C == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        us2.u.f512081a.d();
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        mx0.y4 y4Var = new mx0.y4(c10977x8e40eced, null);
        this.f414000d = 2;
        return p3325xe03a0797.p3326xc267989b.l.g(g3Var, y4Var, this) == aVar ? aVar : f0Var;
    }
}
