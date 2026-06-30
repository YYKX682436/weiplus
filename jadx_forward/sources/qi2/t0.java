package qi2;

/* loaded from: classes3.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f445158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg2.h f445159e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qi2.w0 f445160f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, qi2.w0 w0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f445159e = hVar;
        this.f445160f = w0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qi2.t0(this.f445159e, interfaceC29045xdcb5ca57, this.f445160f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qi2.t0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f445158d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.f71 f71Var = (r45.f71) ((xg2.i) this.f445159e).f535926b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftSelectPanelWidget", "indicator_parameter_list origin size: " + f71Var.m75941xfb821914(1).size());
            int size = f71Var.m75941xfb821914(1).size();
            qi2.w0 w0Var = this.f445160f;
            if (size > 0) {
                java.util.LinkedList<com.p314xaae8f345.mm.p2495xc50a8b8b.g> m75941xfb821914 = f71Var.m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getIndicator_parameter_list(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar : m75941xfb821914) {
                    r45.km1 km1Var = new r45.km1();
                    try {
                        km1Var.mo11468x92b714fd(gVar.f273689a);
                    } catch (java.io.IOException unused) {
                    }
                    ce2.i e17 = dk2.u7.f315714a.e(km1Var.m75945x2fec8307(0));
                    vi2.f fVar = e17 != null ? new vi2.f(e17) : null;
                    if (fVar != null) {
                        arrayList.add(fVar);
                    }
                }
                java.util.List F0 = kz5.n0.F0(arrayList, new qi2.u0());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftSelectPanelWidget", "indicator_parameter_list after size: " + F0.size());
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
                qi2.q0 q0Var = new qi2.q0(w0Var, F0, null);
                this.f445158d = 1;
                if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, q0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.g3 g3Var2 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
                qi2.r0 r0Var = new qi2.r0(w0Var, null);
                this.f445158d = 2;
                if (p3325xe03a0797.p3326xc267989b.l.g(g3Var2, r0Var, this) == aVar) {
                    return aVar;
                }
            }
        } else if (i17 == 1) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
