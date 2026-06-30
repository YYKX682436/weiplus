package f93;

/* loaded from: classes3.dex */
public final class k5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f341906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f93.p5 f341907e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(f93.p5 p5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f341907e = p5Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new f93.k5(this.f341907e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((f93.k5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f341906d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c93.b a17 = c93.a.a();
            f93.p5 p5Var = this.f341907e;
            p5Var.f341962u.append((java.lang.CharSequence) com.p314xaae8f345.mm.p2614xca6eae71.x1.Di().Ri(((b93.b) a17).g(p5Var.f341960s), true));
            java.util.List j17 = ((b93.b) c93.a.a()).j(p5Var.f341960s);
            if (j17 != null) {
                java.util.Iterator it = j17.iterator();
                while (it.hasNext()) {
                    p5Var.A.add(((com.p314xaae8f345.mm.p2621x8fb0427b.k4) ((com.p314xaae8f345.mm.p2621x8fb0427b.e8) ((jz5.n) p5Var.f341967z).mo141623x754a37bb())).n((java.lang.String) it.next(), true));
                }
            }
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            f93.j5 j5Var = new f93.j5(p5Var, null);
            this.f341906d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, j5Var, this) == aVar) {
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
