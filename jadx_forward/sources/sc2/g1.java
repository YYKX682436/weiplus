package sc2;

/* loaded from: classes2.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f487432d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f487433e;

    /* renamed from: f, reason: collision with root package name */
    public int f487434f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f487435g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487436h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487437i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f487438m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(sc2.h1 h1Var, in5.s0 s0Var, android.view.View view, xc2.p0 p0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f487435g = h1Var;
        this.f487436h = s0Var;
        this.f487437i = view;
        this.f487438m = p0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sc2.g1(this.f487435g, this.f487436h, this.f487437i, this.f487438m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sc2.g1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        long j17;
        sc2.g1 g1Var;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f487434f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            j17 = this.f487435g.C;
            android.content.Context context = this.f487436h.f374654e;
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = activity != null ? (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) activity.findViewById(com.p314xaae8f345.mm.R.id.m6e) : null;
            g1Var = this;
            c22801x87cbdc00 = c22801x87cbdc002;
        } else if (i17 == 1) {
            long j18 = this.f487432d;
            c22801x87cbdc00 = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) this.f487433e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g1Var = this;
            j17 = j18 - 100;
            g1Var.f487435g.C = j17;
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j17 = this.f487432d;
            c22801x87cbdc00 = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) this.f487433e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g1Var = this;
        }
        while (true) {
            jz5.f0 f0Var = jz5.f0.f384359a;
            in5.s0 s0Var = g1Var.f487436h;
            sc2.h1 h1Var = g1Var.f487435g;
            if (j17 <= 0) {
                android.view.ViewGroup viewGroup = h1Var.H;
                if (viewGroup != null) {
                    h1Var.K(viewGroup, 8);
                }
                h1Var.S(s0Var, g1Var.f487437i, g1Var.f487438m);
                h1Var.R(s0Var);
                return f0Var;
            }
            boolean z17 = false;
            if (c22801x87cbdc00 != null && c22801x87cbdc00.isRefreshing) {
                z17 = true;
            }
            if (z17) {
                h1Var.J(s0Var);
                return f0Var;
            }
            if (h1Var.D) {
                g1Var.f487433e = c22801x87cbdc00;
                g1Var.f487432d = j17;
                g1Var.f487434f = 2;
                if (p3325xe03a0797.p3326xc267989b.k1.b(100L, g1Var) == aVar) {
                    return aVar;
                }
            } else {
                g1Var.f487433e = c22801x87cbdc00;
                g1Var.f487432d = j17;
                g1Var.f487434f = 1;
                if (p3325xe03a0797.p3326xc267989b.k1.b(100L, g1Var) == aVar) {
                    return aVar;
                }
                j17 -= 100;
                g1Var.f487435g.C = j17;
            }
        }
    }
}
