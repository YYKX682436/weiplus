package h03;

/* loaded from: classes2.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f359411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f359412e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f359413f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f359414g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f359415h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f359416i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.app.Activity activity, byte[] bArr, double d17, java.lang.String str, java.lang.String str2, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f359411d = activity;
        this.f359412e = bArr;
        this.f359413f = d17;
        this.f359414g = str;
        this.f359415h = str2;
        this.f359416i = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new h03.f(this.f359411d, this.f359412e, this.f359413f, this.f359414g, this.f359415h, this.f359416i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        h03.f fVar = (h03.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        fVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        android.app.Activity activity = this.f359411d;
        if (activity != null) {
            o40.e eVar = (o40.e) i95.n0.c(o40.e.class);
            ((wy2.g) eVar).Bi(activity, this.f359412e, kz5.c1.l(new jz5.l("startTime", new java.lang.Float((float) this.f359413f)), new jz5.l("finder_context_id", this.f359414g), new jz5.l("finder_tab_context_id", this.f359415h), new jz5.l("comment_scene", new java.lang.Integer((int) this.f359416i))));
        }
        return jz5.f0.f384359a;
    }
}
