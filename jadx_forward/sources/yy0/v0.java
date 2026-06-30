package yy0;

/* loaded from: classes5.dex */
public final class v0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yy0.m7 f549899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f549900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f549901f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f549902g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f549903h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f549904i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f549905m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f549906n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f549907o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(yy0.m7 m7Var, java.lang.String str, int i17, int i18, boolean z17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549899d = m7Var;
        this.f549900e = str;
        this.f549901f = i17;
        this.f549902g = i18;
        this.f549903h = z17;
        this.f549904i = str2;
        this.f549905m = str3;
        this.f549906n = str4;
        this.f549907o = str5;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yy0.v0(this.f549899d, this.f549900e, this.f549901f, this.f549902g, this.f549903h, this.f549904i, this.f549905m, this.f549906n, this.f549907o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yy0.v0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        yy0.m7 m7Var = this.f549899d;
        yy0.q0 q0Var = m7Var.f549760f;
        yy0.q0 q0Var2 = yy0.q0.f549820d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (q0Var != q0Var2) {
            return f0Var;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initMetricsIfNotInitialized: entryType=");
        sb6.append(this.f549900e);
        sb6.append(", enterScene=");
        sb6.append(this.f549901f);
        sb6.append(", parentEnterScene=");
        sb6.append(this.f549902g);
        sb6.append(", shouldBeginShootComposing=");
        boolean z17 = this.f549903h;
        sb6.append(z17);
        sb6.append(", sourceFeedID=");
        sb6.append(this.f549904i);
        sb6.append(", sourceSongID=");
        sb6.append(this.f549905m);
        sb6.append(", followFeedTemplateID=");
        sb6.append(this.f549906n);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m7Var.f549758d, sb6.toString());
        java.lang.String str = this.f549900e;
        int i17 = this.f549901f;
        int i18 = this.f549902g;
        java.lang.String str2 = this.f549907o;
        java.lang.String str3 = this.f549904i;
        java.lang.String str4 = this.f549905m;
        java.lang.String str5 = this.f549906n;
        i95.m c17 = i95.n0.c(pp0.h0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        if (pp0.h0.Q2((pp0.h0) c17, false, 1, null)) {
            p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.u0(m7Var, str, i17, str3, str4, str5, str2, i18, null), 3, null);
        }
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.o2(m7Var, null), 3, null);
        if (z17) {
            p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.q2(m7Var, null), 3, null);
            i95.m c18 = i95.n0.c(w40.e.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            w40.e.eh((w40.e) c18, "SCMaasInit", "MJShootComposing", null, 0, 12, null);
            i95.m c19 = i95.n0.c(w40.e.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
            w40.e.eh((w40.e) c19, "SCFirstImpression", "MJShootComposing", null, 0, 12, null);
            i95.m c27 = i95.n0.c(w40.e.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
            w40.e.eh((w40.e) c27, "SCLoadFirstTemplate", "MJShootComposing", null, 0, 12, null);
            i95.m c28 = i95.n0.c(w40.e.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c28, "getService(...)");
            w40.e.eh((w40.e) c28, "SCLoadTemplateList", "MJShootComposing", null, 0, 12, null);
        } else {
            m7Var.ij();
        }
        i95.m c29 = i95.n0.c(pp0.m0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c29, "getService(...)");
        pp0.m0.n3((pp0.m0) c29, "mjtc_publisher", null, 2, null);
        return f0Var;
    }
}
