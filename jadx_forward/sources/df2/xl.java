package df2;

/* loaded from: classes2.dex */
public final class xl extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f313319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f313320e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f313320e = c22789xd23e9a9b;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.xl(this.f313320e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.xl) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f313319d;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b pagView = this.f313320e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ym5.l2 l2Var = ym5.l2.f544957a;
            ym5.j2[] j2VarArr = ym5.j2.f544925d;
            pagView.o(ae2.in.f85221a.a(ym5.f6.f544867z1));
            pagView.m82583xcde73672(-1);
            vl2.s sVar = vl2.s.f519401a;
            vl2.h hVar = vl2.h.f519351J;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pagView, "$pagView");
            this.f313319d = 1;
            if (sVar.d(hVar, pagView, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        pagView.d();
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        df2.wl wlVar = new df2.wl(pagView, null);
        this.f313319d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, wlVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
