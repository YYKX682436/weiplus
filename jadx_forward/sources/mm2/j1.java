package mm2;

/* loaded from: classes3.dex */
public final class j1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f410688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f410689e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm2.s1 f410690f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f410691g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.q12 f410692h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(java.lang.String str, mm2.s1 s1Var, java.lang.String str2, r45.q12 q12Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f410689e = str;
        this.f410690f = s1Var;
        this.f410691g = str2;
        this.f410692h = q12Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mm2.j1(this.f410689e, this.f410690f, this.f410691g, this.f410692h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm2.j1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object obj2;
        r45.s63 s63Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f410688d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            android.content.Context n17 = com.p314xaae8f345.mm.app.w.INSTANCE.n();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "getTopContext(...)");
            this.f410688d = 1;
            obj = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).Sj(n17, this.f410689e, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        r45.n73 n73Var = (r45.n73) obj;
        mm2.s1 s1Var = this.f410690f;
        java.lang.String str = s1Var.f410919f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[initGameModeFromCache] gameInfo = ");
        if (n73Var == null || (obj2 = pm0.b0.g(n73Var)) == null) {
            obj2 = "null";
        }
        sb6.append(obj2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (n73Var != null) {
            java.lang.String str2 = this.f410691g;
            if (str2 != null && (s63Var = (r45.s63) n73Var.m75936x14adae67(3)) != null) {
                s63Var.set(0, str2);
            }
            s1Var.U6(this.f410692h);
            ((mm2.o2) s1Var.m147920xbba4bfc0(mm2.o2.class)).N6(n73Var);
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) s1Var.m147920xbba4bfc0(mm2.g1.class)).f410604i).k(n73Var);
        }
        return jz5.f0.f384359a;
    }
}
