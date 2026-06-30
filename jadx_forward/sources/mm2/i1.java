package mm2;

/* loaded from: classes3.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f410667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f410668e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm2.s1 f410669f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(java.lang.String str, mm2.s1 s1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f410668e = str;
        this.f410669f = s1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mm2.i1(this.f410668e, this.f410669f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm2.i1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f410667d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            android.content.Context n17 = com.p314xaae8f345.mm.app.w.INSTANCE.n();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "getTopContext(...)");
            java.lang.String appid = this.f410668e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appid, "$appid");
            this.f410667d = 1;
            obj = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).Sj(n17, appid, false, this);
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
        mm2.s1 s1Var = this.f410669f;
        java.lang.String str = s1Var.f410919f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[initGameModeFromCache] gameInfo = ");
        if (n73Var == null || (obj2 = pm0.b0.g(n73Var)) == null) {
            obj2 = "null";
        }
        sb6.append(obj2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (n73Var != null) {
            ((mm2.g1) s1Var.m147920xbba4bfc0(mm2.g1.class)).V6(n73Var);
        }
        return jz5.f0.f384359a;
    }
}
