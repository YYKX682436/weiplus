package so2;

/* loaded from: classes8.dex */
public final class t5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f492147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.w5 f492148e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.k5 f492149f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(so2.w5 w5Var, so2.k5 k5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f492148e = w5Var;
        this.f492149f = k5Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new so2.t5(this.f492148e, this.f492149f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((so2.t5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f492147d;
        so2.w5 w5Var = this.f492148e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f492147d = 1;
            w5Var.getClass();
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            rVar.m(new so2.l5(rVar));
            w5Var.f492226e = new so2.m5(rVar);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.s0.f361623e.q("", w5Var.f492226e, w5Var.f492225d);
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        so2.s5 s5Var = new so2.s5(this.f492149f, (jz5.l) obj, null);
        p3325xe03a0797.p3326xc267989b.l.c(w5Var.m158345xefc66565(), oz5.m.f431862d, p3325xe03a0797.p3326xc267989b.a1.DEFAULT, s5Var);
        return jz5.f0.f384359a;
    }
}
