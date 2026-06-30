package vd0;

/* loaded from: classes8.dex */
public final class r1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f517027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vd0.v1 f517028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f517029f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wd0.h2 f517030g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(vd0.v1 v1Var, p3325xe03a0797.p3326xc267989b.y0 y0Var, wd0.h2 h2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f517028e = v1Var;
        this.f517029f = y0Var;
        this.f517030g = h2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vd0.r1(this.f517028e, this.f517029f, this.f517030g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vd0.r1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f517027d;
        p3325xe03a0797.p3326xc267989b.y0 lifecycleScope = this.f517029f;
        vd0.v1 v1Var = this.f517028e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.f1 Bi = v1Var.Bi(lifecycleScope, false);
            this.f517027d = 1;
            obj = ((p3325xe03a0797.p3326xc267989b.g1) Bi).k(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10686xf24fb830 c10686xf24fb830 = (com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10686xf24fb830) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SettingFingerprintService", "[fingerprint login] initSoter getAllParam onResult errCode: " + c10686xf24fb830.f149353g + ", askInfo: " + c10686xf24fb830.f149350d);
        int i18 = c10686xf24fb830.f149353g;
        jz5.f0 f0Var = jz5.f0.f384359a;
        wd0.h2 h2Var = this.f517030g;
        if (i18 != 0) {
            wd0.d1[] d1VarArr = wd0.d1.f526235d;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.t6) h2Var).a(3, "");
            return f0Var;
        }
        vd0.q1 q1Var = new vd0.q1(h2Var);
        v1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleScope, "lifecycleScope");
        p3325xe03a0797.p3326xc267989b.l.d(lifecycleScope, null, null, new vd0.p1(q1Var, null), 3, null);
        return f0Var;
    }
}
