package s72;

/* loaded from: classes10.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f485583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s72.j0 f485584e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f485585f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f485586g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f485587h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(s72.j0 j0Var, int i17, int i18, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f485584e = j0Var;
        this.f485585f = i17;
        this.f485586g = i18;
        this.f485587h = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new s72.h0(this.f485584e, this.f485585f, this.f485586g, this.f485587h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((s72.h0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f485583d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f485583d = 1;
            if (this.f485584e.g7(this.f485585f, this.f485586g, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f485587h.mo152xb9724478();
        return jz5.f0.f384359a;
    }
}
