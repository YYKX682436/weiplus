package yx0;

/* loaded from: classes5.dex */
public final class i3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f548909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548910e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f548911f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(yx0.b8 b8Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548910e = b8Var;
        this.f548911f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.i3(this.f548910e, this.f548911f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.i3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Boolean bool;
        pp0.p0 p0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f548909d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (this.f548910e.f548725s != yx0.v.f549228f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "clearMusic >> but state is " + this.f548910e.f548725s);
                return null;
            }
            pp0.p0 p0Var2 = this.f548910e.K;
            if (p0Var2 == null) {
                bool = null;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE) && (p0Var = this.f548910e.K) != null) {
                    return p0Var.P(this.f548911f);
                }
            }
            java.lang.String str = this.f548911f;
            yx0.h3 h3Var = yx0.h3.f548891a;
            this.f548909d = 1;
            obj = p0Var2.D(str, h3Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        bool = (java.lang.Boolean) obj;
        return !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE) ? null : null;
    }
}
