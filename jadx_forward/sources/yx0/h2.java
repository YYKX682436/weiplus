package yx0;

/* loaded from: classes5.dex */
public final class h2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f548888d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f548889e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548890f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(yx0.b8 b8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548890f = b8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        yx0.h2 h2Var = new yx0.h2(this.f548890f, interfaceC29045xdcb5ca57);
        h2Var.f548889e = obj;
        return h2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.h2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f548888d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f548889e;
            pp0.q0 q0Var = (pp0.q0) i95.n0.c(pp0.q0.class);
            this.f548889e = y0Var;
            this.f548888d = 1;
            ((yy0.k8) q0Var).getClass();
            obj = az0.i5.f97090a.y("doCreateSafeCamSession", new az0.q3(null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pp0.p0 p0Var = (pp0.p0) this.f548889e;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return p0Var;
            }
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f548889e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        pp0.p0 p0Var2 = (pp0.p0) obj;
        if (p0Var2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShootComposingCorePlugin", "createImproveCamManager error");
            p3325xe03a0797.p3326xc267989b.z0.d(y0Var, "createImproveCamManager error", null, 2, null);
            return null;
        }
        this.f548890f.K = p0Var2;
        yx0.b8 b8Var = this.f548890f;
        pp0.p0 p0Var3 = b8Var.K;
        if (p0Var3 != null && (p0Var3 instanceof az0.xb)) {
            b8Var.f548710d.mo47334xea6ab3ba((bs0.j) p0Var3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "finished create createImproveCamManager");
        yx0.b8 b8Var2 = this.f548890f;
        this.f548889e = p0Var2;
        this.f548888d = 2;
        b8Var2.getClass();
        p3325xe03a0797.p3326xc267989b.p0 p0Var4 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new yx0.o4(b8Var2, p0Var2, null), this);
        if (g17 != aVar) {
            g17 = jz5.f0.f384359a;
        }
        return g17 == aVar ? aVar : p0Var2;
    }
}
