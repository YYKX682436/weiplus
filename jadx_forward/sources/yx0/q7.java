package yx0;

/* loaded from: classes5.dex */
public final class q7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f549116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f549117e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f549118f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f549119g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f549120h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.g f549121i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f549122m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f549123n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r45.to0 f549124o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r45.xy6 f549125p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ r45.b70 f549126q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r45.mi0 f549127r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f549128s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ bs0.h f549129t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ java.util.List f549130u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(yx0.b8 b8Var, java.lang.String str, long j17, int i17, long j18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, boolean z17, boolean z18, r45.to0 to0Var, r45.xy6 xy6Var, r45.b70 b70Var, r45.mi0 mi0Var, int i18, bs0.h hVar, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549116d = b8Var;
        this.f549117e = str;
        this.f549118f = j17;
        this.f549119g = i17;
        this.f549120h = j18;
        this.f549121i = gVar;
        this.f549122m = z17;
        this.f549123n = z18;
        this.f549124o = to0Var;
        this.f549125p = xy6Var;
        this.f549126q = b70Var;
        this.f549127r = mi0Var;
        this.f549128s = i18;
        this.f549129t = hVar;
        this.f549130u = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.q7(this.f549116d, this.f549117e, this.f549118f, this.f549119g, this.f549120h, this.f549121i, this.f549122m, this.f549123n, this.f549124o, this.f549125p, this.f549126q, this.f549127r, this.f549128s, this.f549129t, this.f549130u, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.q7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        yx0.p7 p7Var;
        jz5.f0 f0Var;
        pp0.p0 p0Var;
        rx0.h hVar;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        int ordinal = this.f549116d.f548725s.ordinal();
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        switch (ordinal) {
            case 0:
            case 3:
            case 4:
            case 5:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShootComposingCorePlugin", "switchTemplate >> but state is " + this.f549116d.f548725s);
                yz5.l lVar = this.f549116d.f548723q;
                if (lVar != null) {
                    java.lang.String str = this.f549117e;
                    lVar.mo146xb9724478(str != null ? str : "kEmptyTemplateId");
                }
                return f0Var2;
            case 1:
                p3325xe03a0797.p3326xc267989b.l.f(null, new yx0.h7(this.f549116d, null), 1, null);
                break;
            case 6:
                yz5.l lVar2 = this.f549116d.f548723q;
                if (lVar2 != null) {
                    java.lang.String str2 = this.f549117e;
                    if (str2 == null) {
                        str2 = "kEmptyTemplateId";
                    }
                    lVar2.mo146xb9724478(str2);
                }
                p3325xe03a0797.p3326xc267989b.l.f(null, new yx0.j7(this.f549116d, null), 1, null);
                break;
            case 7:
                p3325xe03a0797.p3326xc267989b.l.f(null, new yx0.i7(this.f549116d, null), 1, null);
                break;
            case 8:
                p3325xe03a0797.p3326xc267989b.l.f(null, new yx0.k7(this.f549116d, null), 1, null);
                break;
            case 9:
                p3325xe03a0797.p3326xc267989b.l.f(null, new yx0.l7(this.f549116d, null), 1, null);
                break;
            case 10:
                p3325xe03a0797.p3326xc267989b.l.f(null, new yx0.m7(this.f549116d, null), 1, null);
                break;
            case 11:
                p3325xe03a0797.p3326xc267989b.l.f(null, new yx0.n7(this.f549116d, null), 1, null);
                break;
        }
        pp0.p0 p0Var2 = this.f549116d.K;
        if (p0Var2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "switchTemplate >> but setup is error");
            yz5.l lVar3 = this.f549116d.f548723q;
            if (lVar3 != null) {
                java.lang.String str3 = this.f549117e;
                lVar3.mo146xb9724478(str3 != null ? str3 : "kEmptyTemplateId");
            }
            return f0Var2;
        }
        this.f549116d.q0(yx0.v.f549232m);
        int i17 = p3325xe03a0797.p3326xc267989b.r0.N0;
        yx0.p7 p7Var2 = new yx0.p7(p3325xe03a0797.p3326xc267989b.q0.f392100d);
        yx0.b8 b8Var = this.f549116d;
        java.lang.String str4 = this.f549117e;
        if (str4 != null) {
            f0Var = f0Var2;
            p7Var = p7Var2;
            p0Var = p0Var2;
            hVar = new rx0.f(str4, this.f549118f, this.f549119g, this.f549120h, this.f549121i, this.f549122m, this.f549123n, this.f549124o, this.f549125p, this.f549126q, this.f549127r);
        } else {
            p7Var = p7Var2;
            f0Var = f0Var2;
            p0Var = p0Var2;
            hVar = rx0.e.f482448a;
        }
        b8Var.S = hVar;
        yx0.b8 b8Var2 = this.f549116d;
        b8Var2.f548727u = p3325xe03a0797.p3326xc267989b.l.d(b8Var2.L, p7Var, null, new yx0.o7(b8Var2, p0Var, this.f549117e, this.f549118f, this.f549119g, this.f549120h, this.f549121i, this.f549128s, this.f549129t, this.f549122m, this.f549123n, this.f549130u, null), 2, null);
        return f0Var;
    }
}
