package st2;

/* loaded from: classes3.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f493937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f493938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f493939f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, st2.h1 h1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f493938e = abstractActivityC21394xb3d2c0cf;
        this.f493939f = h1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new st2.o0(this.f493938e, this.f493939f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((st2.o0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        st2.h1 h1Var;
        java.lang.Object g17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f493937d;
        st2.h1 h1Var2 = this.f493939f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            dk2.q4 q4Var = dk2.q4.f315471a;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f493938e;
            gk2.e eVar = h1Var2.f493868f;
            boolean w17 = h1Var2.w();
            boolean z17 = ((mm2.f6) h1Var2.f493868f.a(mm2.f6.class)).f410566g;
            long m75942xfb822ef2 = ((mm2.e1) h1Var2.f493868f.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
            long j17 = ((mm2.e1) h1Var2.f493868f.a(mm2.e1.class)).f410516m;
            java.lang.String str = ((mm2.e1) h1Var2.f493868f.a(mm2.e1.class)).f410517n;
            java.lang.String str2 = ((mm2.c1) h1Var2.f493868f.a(mm2.c1.class)).f410385o;
            byte[] bArr = ((mm2.e1) h1Var2.f493868f.a(mm2.e1.class)).f410518o;
            java.lang.String str3 = ((mm2.c1) h1Var2.f493868f.a(mm2.c1.class)).P3;
            java.lang.String str4 = ((mm2.c1) h1Var2.f493868f.a(mm2.c1.class)).f410377m5;
            this.f493937d = 1;
            h1Var = h1Var2;
            g17 = q4Var.g(abstractActivityC21394xb3d2c0cf, eVar, w17, z17, m75942xfb822ef2, j17, str, str2, bArr, str3, null, 3, str4, (r37 & 8192) != 0 ? java.lang.Boolean.TRUE : null, this);
            if (g17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            h1Var = h1Var2;
        }
        h1Var.R();
        return jz5.f0.f384359a;
    }
}
