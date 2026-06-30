package jn3;

/* loaded from: classes8.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f382315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f382316e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f382317f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f382318g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f382319h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z17, int i17, int i18, int i19, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f382315d = z17;
        this.f382316e = i17;
        this.f382317f = i18;
        this.f382318g = i19;
        this.f382319h = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new jn3.i(this.f382315d, this.f382316e, this.f382317f, this.f382318g, this.f382319h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        jn3.i iVar = (jn3.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        iVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = this.f382315d;
        int i17 = this.f382318g;
        int i18 = this.f382317f;
        int i19 = this.f382316e;
        if (z17) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27379x973a84d7.m113806x9cf0d20b().m113809xc9f62e0e(i19, i18, i17);
        } else {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27379x973a84d7 m113806x9cf0d20b = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27379x973a84d7.m113806x9cf0d20b();
            java.lang.String str = this.f382319h;
            if (str == null) {
                str = "";
            }
            m113806x9cf0d20b.m113808xb0e85dc6(i19, i18, str, i17);
        }
        return jz5.f0.f384359a;
    }
}
