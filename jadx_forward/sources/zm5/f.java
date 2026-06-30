package zm5;

/* loaded from: classes3.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f555734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zm5.g f555735e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555736f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555737g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(zm5.g gVar, java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f555735e = gVar;
        this.f555736f = str;
        this.f555737g = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zm5.f(this.f555735e, this.f555736f, this.f555737g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zm5.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f555734d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            zm5.g gVar = this.f555735e;
            ((fn5.d) ((jz5.n) gVar.f555754g).mo141623x754a37bb()).getClass();
            java.lang.String imagePath = this.f555736f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imagePath, "imagePath");
            java.lang.String keyword = this.f555737g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyword, "keyword");
            p3325xe03a0797.p3326xc267989b.p3328x30012e.m2 m2Var = new p3325xe03a0797.p3326xc267989b.p3328x30012e.m2(new fn5.c(imagePath, keyword, null));
            zm5.e eVar = new zm5.e(imagePath, keyword, gVar);
            this.f555734d = 1;
            if (m2Var.a(eVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
