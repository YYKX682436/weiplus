package z;

/* loaded from: classes14.dex */
public final class h2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f550218d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f550219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z.l2 f550220f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(z.l2 l2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f550220f = l2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        z.h2 h2Var = new z.h2(this.f550220f, interfaceC29045xdcb5ca57);
        h2Var.f550219e = obj;
        return h2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((z.h2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        z.g2 g2Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f550218d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f550219e;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f550219e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        do {
            g2Var = new z.g2(this.f550220f, z.z1.e(y0Var.getF93115e()));
            this.f550219e = y0Var;
            this.f550218d = 1;
        } while (n0.s2.b(g2Var, this) != aVar);
        return aVar;
    }
}
