package kd2;

/* loaded from: classes10.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f388356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f388357e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kd2.p1 f388358f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f388359g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f388360h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f388361i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f388362m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea f388363n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f388364o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(android.app.Activity activity, kd2.p1 p1Var, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, boolean z18, boolean z19, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea eaVar, boolean z27, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f388357e = activity;
        this.f388358f = p1Var;
        this.f388359g = z17;
        this.f388360h = c0Var;
        this.f388361i = z18;
        this.f388362m = z19;
        this.f388363n = eaVar;
        this.f388364o = z27;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kd2.s0(this.f388357e, this.f388358f, this.f388359g, this.f388360h, this.f388361i, this.f388362m, this.f388363n, this.f388364o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((kd2.s0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object b17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f388356d;
        kd2.p1 p1Var = this.f388358f;
        boolean z17 = true;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                zl2.f fVar = zl2.f.f555286a;
                android.app.Activity activity = this.f388357e;
                java.lang.String string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gu_);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                java.lang.String a17 = n25.a.a();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getMessageChannelIdUse(...)");
                this.f388356d = 1;
                b17 = fVar.b(activity, 32, string, false, true, a17, 20000L, "finderfloatpermission", this);
                if (b17 == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                b17 = obj;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v0 v0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v0) b17;
            if (v0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t0) {
                kd2.p1 p1Var2 = this.f388358f;
                kd2.q0 q0Var = p1Var2.f388320x;
                if (q0Var != null) {
                    q0Var.f388350r = true;
                }
                p1Var2.I0(this.f388359g, this.f388360h.f391645d, this.f388361i, this.f388362m, this.f388363n, this.f388364o);
            } else {
                if (!(v0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.s0)) {
                    z17 = v0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r0;
                }
                if (z17) {
                    kd2.o0 o0Var = kd2.p1.N;
                    p1Var.S0();
                } else if (v0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoPassive", "ShowWarningAlert timeout");
                    kd2.o0 o0Var2 = kd2.p1.N;
                    p1Var.S0();
                }
            }
        } catch (java.lang.Throwable th6) {
            kd2.o0 o0Var3 = kd2.p1.N;
            p1Var.S0();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoPassive", "coroutine cancel throw: " + th6.getMessage(), th6);
        }
        return jz5.f0.f384359a;
    }
}
