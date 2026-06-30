package wp4;

/* loaded from: classes4.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f529978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f529979e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f529980f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f529981g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(int i17, java.lang.String str, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f529978d = i17;
        this.f529979e = str;
        this.f529980f = i18;
        this.f529981g = f0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wp4.v(this.f529978d, this.f529979e, this.f529980f, this.f529981g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        wp4.v vVar = (wp4.v) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        vVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        int i17 = this.f529981g.f391649d;
        java.lang.String workTagId = this.f529979e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workTagId, "workTagId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportUploadAction >> workTagId: ");
        sb6.append(workTagId);
        sb6.append(", action: ");
        int i18 = this.f529978d;
        sb6.append(i18);
        sb6.append(", lastWorkType: ");
        int i19 = this.f529980f;
        sb6.append(i19);
        sb6.append(", currentWorkType: ");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FakeVideoTecReporter", sb6.toString());
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6893x57fb842b c6893x57fb842b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6893x57fb842b();
        c6893x57fb842b.p(workTagId);
        c6893x57fb842b.f142084d = i18;
        c6893x57fb842b.f142087g = i19;
        c6893x57fb842b.f142088h = i17;
        c6893x57fb842b.k();
        return jz5.f0.f384359a;
    }
}
