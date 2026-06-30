package du0;

/* loaded from: classes5.dex */
public final class m1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f324917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.o f324918e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ du0.p1 f324919f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(ex0.o oVar, du0.p1 p1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f324918e = oVar;
        this.f324919f = p1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new du0.m1(this.f324918e, this.f324919f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((du0.m1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        rv0.n1 n1Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f324917d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f324917d = 1;
            if (this.f324918e.G(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        du0.p1 p1Var = this.f324919f;
        rv0.n1 n1Var2 = (rv0.n1) ((jz5.n) p1Var.f324949s).mo141623x754a37bb();
        if ((n1Var2 != null && n1Var2.X6()) && (n1Var = (rv0.n1) ((jz5.n) p1Var.f324949s).mo141623x754a37bb()) != null) {
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817.i(n1Var.r7(), false, 1, null);
        }
        return jz5.f0.f384359a;
    }
}
