package id2;

/* loaded from: classes.dex */
public final class j5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f372172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.p5 f372173e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f372174f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(id2.p5 p5Var, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f372173e = p5Var;
        this.f372174f = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new id2.j5(this.f372173e, this.f372174f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((id2.j5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f372172d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            id2.p5 p5Var = this.f372173e;
            r45.hu1 hu1Var = p5Var.f372281i;
            ek2.m3 m3Var = new ek2.m3(2, 0L, 0L, "", hu1Var != null ? hu1Var.m75934xbce7f2f(3) : null);
            id2.i5 i5Var = new id2.i5(this.f372174f, p5Var);
            this.f372172d = 1;
            if (xg2.g.c(m3Var, i5Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
