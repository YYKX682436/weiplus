package az0;

/* loaded from: classes5.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f97625d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97626e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az0.a0 f97627f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(az0.a0 a0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f97627f = a0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        az0.z zVar = new az0.z(this.f97627f, interfaceC29045xdcb5ca57);
        zVar.f97626e = obj;
        return zVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.z) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f97625d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        az0.a0 a0Var = this.f97627f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f97626e;
            boolean z17 = a0Var.f96842a.m33238xb7d72d0e() == 0;
            java.lang.String str = a0Var.f96844c;
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "cur state is no need to stop");
                return f0Var;
            }
            p3325xe03a0797.p3326xc267989b.r2 r2Var = a0Var.f96846e;
            if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "tryStopPlayJob: cancel startPlay job");
                p3325xe03a0797.p3326xc267989b.r2 r2Var2 = a0Var.f96846e;
                if (r2Var2 != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
                }
            }
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54 c4073xbc40c54 = a0Var.f96842a;
            boolean z18 = c4073xbc40c54.m33238xb7d72d0e() == 5;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "stopPlay, curState=" + c4073xbc40c54.m33238xb7d72d0e());
            if (!z18) {
                return f0Var;
            }
            p3325xe03a0797.p3326xc267989b.f1 b17 = p3325xe03a0797.p3326xc267989b.l.b(y0Var, null, null, new az0.y(a0Var, null), 3, null);
            this.f97625d = 1;
            obj = ((p3325xe03a0797.p3326xc267989b.g1) b17).k(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return f0Var;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            p3325xe03a0797.p3326xc267989b.r2 d17 = p3325xe03a0797.p3326xc267989b.l.d(a0Var.f96843b, null, null, new az0.s(a0Var, null), 3, null);
            this.f97625d = 2;
            if (((p3325xe03a0797.p3326xc267989b.c3) d17).C(this) == aVar) {
                return aVar;
            }
        }
        return f0Var;
    }
}
