package n0;

/* loaded from: classes11.dex */
public final class y4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f415326d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f415327e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ oz5.l f415328f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.j f415329g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(oz5.l lVar, p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f415328f = lVar;
        this.f415329g = jVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        n0.y4 y4Var = new n0.y4(this.f415328f, this.f415329g, interfaceC29045xdcb5ca57);
        y4Var.f415327e = obj;
        return y4Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((n0.y4) mo148xaf65a0fc((n0.f3) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f415326d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            n0.f3 f3Var = (n0.f3) this.f415327e;
            oz5.m mVar = oz5.m.f431862d;
            oz5.l lVar = this.f415328f;
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lVar, mVar);
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar = this.f415329g;
            if (b17) {
                n0.v4 v4Var = new n0.v4(f3Var);
                this.f415326d = 1;
                if (jVar.a(v4Var, this) == aVar) {
                    return aVar;
                }
            } else {
                n0.x4 x4Var = new n0.x4(jVar, f3Var, null);
                this.f415326d = 2;
                if (p3325xe03a0797.p3326xc267989b.l.g(lVar, x4Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1 && i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
