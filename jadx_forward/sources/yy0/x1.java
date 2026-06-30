package yy0;

/* loaded from: classes5.dex */
public final class x1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yy0.m7 f549934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f549935e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f549936f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f549937g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(yy0.m7 m7Var, int i17, int i18, int i19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549934d = m7Var;
        this.f549935e = i17;
        this.f549936f = i18;
        this.f549937g = i19;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yy0.x1(this.f549934d, this.f549935e, this.f549936f, this.f549937g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yy0.x1 x1Var = (yy0.x1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        x1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f549934d.f549758d, "markMCWillStartTemplateCreating: assetCount=" + this.f549935e + ", imageCount=" + this.f549936f + ", videoCount=" + this.f549937g);
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4082xa6fd740c c4082xa6fd740c = this.f549934d.f549761g;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (c4082xa6fd740c != null) {
            c4082xa6fd740c.D(this.f549935e, this.f549936f, this.f549937g);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f549934d.f549758d, "mjPublisherSessionMetrics is null. Please call initMetrics() first.");
        }
        return f0Var2;
    }
}
