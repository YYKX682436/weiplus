package m50;

/* loaded from: classes5.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f f405021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f405022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m50.x f405023f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f405024g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f fVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, m50.x xVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f405021d = fVar;
        this.f405022e = c0Var;
        this.f405023f = xVar;
        this.f405024g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new m50.m(this.f405021d, this.f405022e, this.f405023f, this.f405024g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((m50.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        c01.nb nbVar;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f405021d.a();
        boolean z17 = this.f405022e.f391645d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!z17) {
            m50.x xVar = this.f405023f;
            if (!xVar.m158354x19263085().isFinishing() && !xVar.m158354x19263085().isDestroyed()) {
                java.lang.String p76 = xVar.p7();
                java.lang.String plainTextValue = this.f405024g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plainTextValue, "plainTextValue");
                if (p76 != null) {
                    java.lang.String uuid = java.util.UUID.randomUUID().toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
                    p3325xe03a0797.p3326xc267989b.z a17 = p3325xe03a0797.p3326xc267989b.b0.a(null, 1, null);
                    p3325xe03a0797.p3326xc267989b.p2.a(a17, null, 1, null);
                    p3325xe03a0797.p3326xc267989b.z a18 = p3325xe03a0797.p3326xc267989b.b0.a(null, 1, null);
                    ((p3325xe03a0797.p3326xc267989b.a0) a18).U(p76);
                    nbVar = new c01.nb(uuid, a17, a18);
                } else {
                    nbVar = null;
                }
                p3325xe03a0797.p3326xc267989b.z a19 = p3325xe03a0797.p3326xc267989b.b0.a(null, 1, null);
                ((p3325xe03a0797.p3326xc267989b.a0) a19).U(plainTextValue);
                c01.ob obVar = new c01.ob(null, nbVar, a19);
                ct.j3 j3Var = (ct.j3) i95.n0.c(ct.j3.class);
                android.app.Activity uiCtx = xVar.m80379x76847179();
                java.util.List c17 = kz5.b0.c(obVar);
                m50.l lVar = new m50.l(xVar);
                qg5.z2 z2Var = (qg5.z2) j3Var;
                z2Var.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiCtx, "uiCtx");
                xj.m mVar = z2Var.f444810s;
                z2Var.f444810s = null;
                if (mVar == null) {
                    ((wj.j0) z2Var.Zi()).Vi(wj.t0.f528040J, 2000L, new qg5.v2(z2Var, uiCtx, c17, lVar));
                } else {
                    if (!jm0.g.class.isAssignableFrom(qg5.q4.class)) {
                        throw new java.lang.IllegalArgumentException(qg5.z2.class.getName().concat(" must extends FeatureServiceComponent"));
                    }
                    p012xc85e97e9.p093xedfae76a.c1 a27 = new p012xc85e97e9.p093xedfae76a.j1(z2Var.getViewModel(), new jm0.e(z2Var)).a(qg5.q4.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a27, "get(...)");
                    ((qg5.q4) ((jm0.g) a27)).X6(uiCtx, c17, mVar, lVar);
                }
            }
        }
        return f0Var;
    }
}
