package iy;

/* loaded from: classes14.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ky.a f377219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f377220e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f377221f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f.r f377222g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f377223h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ky.a aVar, android.content.Context context, yz5.a aVar2, f.r rVar, yz5.a aVar3, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f377219d = aVar;
        this.f377220e = context;
        this.f377221f = aVar2;
        this.f377222g = rVar;
        this.f377223h = aVar3;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new iy.g(this.f377219d, this.f377220e, this.f377221f, this.f377222g, this.f377223h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        iy.g gVar = (iy.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        gVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        if (this.f377219d.a() != ky.m0.f394925d) {
            ly.a aVar2 = ly.a.f403699a;
            android.content.Context context = this.f377220e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            if (b3.l.m9698x3fed0563(context, "android.permission.RECORD_AUDIO") == 0) {
                ly.a.a(aVar2, this.f377220e, 0L, 200, 2, null);
                this.f377221f.mo152xb9724478();
            } else {
                this.f377222g.a("android.permission.RECORD_AUDIO", null);
            }
        } else {
            this.f377223h.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
