package gf2;

/* loaded from: classes10.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f352792d;

    /* renamed from: e, reason: collision with root package name */
    public int f352793e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.c02 f352794f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 f352795g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f352796h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f352797i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(r45.c02 c02Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 c14195x2dafdb49, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, android.view.View view, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f352794f = c02Var;
        this.f352795g = c14195x2dafdb49;
        this.f352796h = c22789xd23e9a9b;
        this.f352797i = view;
    }

    public static final void a(com.p314xaae8f345.mm.rfx.C20940x143804f8 c20940x143804f8, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.rfx.C20946xbc52e31f[] m77364x7d62d1da;
        if (!(str2 != null) || (m77364x7d62d1da = c20940x143804f8.m77364x7d62d1da(str)) == null) {
            return;
        }
        for (com.p314xaae8f345.mm.rfx.C20946xbc52e31f c20946xbc52e31f : m77364x7d62d1da) {
            if (c20946xbc52e31f.m77470x9ccac82b() == 3 && (c20946xbc52e31f instanceof com.p314xaae8f345.mm.rfx.C20953xe84f4af2)) {
                ((com.p314xaae8f345.mm.rfx.C20953xe84f4af2) c20946xbc52e31f).m77538x765074af(str2);
            }
        }
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gf2.b(this.f352794f, this.f352795g, this.f352796h, this.f352797i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gf2.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String m75945x2fec8307;
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f352793e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.c02 c02Var = this.f352794f;
            java.lang.String m75945x2fec83072 = c02Var.m75945x2fec8307(6);
            if (m75945x2fec83072 == null || (m75945x2fec8307 = c02Var.m75945x2fec8307(7)) == null) {
                return f0Var;
            }
            this.f352792d = m75945x2fec83072;
            this.f352793e = 1;
            java.lang.Object b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49.b(this.f352795g, m75945x2fec83072, m75945x2fec8307, this);
            if (b17 == aVar) {
                return aVar;
            }
            str = m75945x2fec83072;
            obj = b17;
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.String str2 = (java.lang.String) this.f352792d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            str = str2;
        }
        java.lang.String str3 = (java.lang.String) obj;
        if (str3 == null) {
            return f0Var;
        }
        com.p314xaae8f345.mm.rfx.C20942x379cf5ee m77391x243906 = com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77391x243906(str3);
        com.p314xaae8f345.mm.rfx.C20942x379cf5ee m77391x2439062 = com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77391x243906(str3);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        gf2.a aVar2 = new gf2.a(this.f352794f, m77391x243906, this.f352796h, m77391x2439062, str, this.f352795g, this.f352797i, null);
        this.f352792d = null;
        this.f352793e = 2;
        return p3325xe03a0797.p3326xc267989b.l.g(g3Var, aVar2, this) == aVar ? aVar : f0Var;
    }
}
