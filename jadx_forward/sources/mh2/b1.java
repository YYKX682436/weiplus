package mh2;

/* loaded from: classes3.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f407834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mh2.f1 f407835e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mh2.p0 f407836f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(mh2.f1 f1Var, mh2.p0 p0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f407835e = f1Var;
        this.f407836f = p0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mh2.b1(this.f407835e, this.f407836f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mh2.b1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f407834d;
        mh2.f1 f1Var = this.f407835e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f407834d = 1;
            obj = mh2.f1.f(f1Var, this.f407836f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (obj != null) {
            if (obj instanceof org.p3363xbe4143f1.C29690xfae77312) {
                ym5.l2 l2Var = ym5.l2.f544957a;
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = f1Var.f407867i;
                ym5.j2[] j2VarArr = ym5.j2.f544925d;
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = f1Var.f407867i;
                c22789xd23e9a9b2.o(false);
                c22789xd23e9a9b2.mo82568x3e3ac3e8((org.p3363xbe4143f1.C29690xfae77312) obj);
            } else if (obj instanceof com.p314xaae8f345.mm.rfx.C20942x379cf5ee) {
                ym5.l2 l2Var2 = ym5.l2.f544957a;
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b3 = f1Var.f407867i;
                ym5.j2[] j2VarArr2 = ym5.j2.f544925d;
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b4 = f1Var.f407867i;
                c22789xd23e9a9b4.o(true);
                c22789xd23e9a9b4.mo82566x3e3ac3e8((com.p314xaae8f345.mm.rfx.C20942x379cf5ee) obj);
            }
            f1Var.f407867i.m82582x3ae760af(0.0d);
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b5 = f1Var.f407867i;
            c22789xd23e9a9b5.m82583xcde73672(1);
            mh2.r0 r0Var = f1Var.C;
            c22789xd23e9a9b5.i(r0Var);
            c22789xd23e9a9b5.a(r0Var);
            c22789xd23e9a9b5.g();
        }
        return jz5.f0.f384359a;
    }
}
