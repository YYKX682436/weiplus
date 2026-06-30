package f12;

/* loaded from: classes4.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f340133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f340134e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f12.j0 f340135f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(long j17, f12.j0 j0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f340134e = j17;
        this.f340135f = j0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new f12.e0(this.f340134e, this.f340135f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((f12.e0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f340133d;
        f12.j0 j0Var2 = this.f340135f;
        try {
            try {
            } catch (b12.a e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SpringLuckyEggViewModel", "unable to accept money: " + e17.getMessage());
                j0Var2.f340155i.mo523x53d8522f(java.lang.Boolean.FALSE);
                j0Var = j0Var2.f340162s;
            }
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                long j17 = this.f340134e;
                java.lang.String str = j0Var2.f340153g;
                if (str == null) {
                    str = "";
                }
                c12.e eVar = new c12.e("", 1, j17, str);
                this.f340133d = 1;
                if (b12.d.a(eVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                    j0Var2.f340155i.mo523x53d8522f(java.lang.Boolean.FALSE);
                    j0Var = j0Var2.f340162s;
                    j0Var.mo523x53d8522f(java.lang.Boolean.TRUE);
                    return jz5.f0.f384359a;
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            long j18 = j0Var2.f340163t;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - j18;
            if (currentTimeMillis < 2000) {
                this.f340133d = 2;
                if (p3325xe03a0797.p3326xc267989b.k1.b(2000 - currentTimeMillis, this) == aVar) {
                    return aVar;
                }
            }
            j0Var2.f340155i.mo523x53d8522f(java.lang.Boolean.FALSE);
            j0Var = j0Var2.f340162s;
            j0Var.mo523x53d8522f(java.lang.Boolean.TRUE);
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            j0Var2.f340155i.mo523x53d8522f(java.lang.Boolean.FALSE);
            j0Var2.f340162s.mo523x53d8522f(java.lang.Boolean.TRUE);
            throw th6;
        }
    }
}
