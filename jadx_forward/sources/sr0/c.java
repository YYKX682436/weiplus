package sr0;

/* loaded from: classes14.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr0.f f492949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f492950e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f492951f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f492952g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f492953h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(sr0.f fVar, int i17, int i18, int i19, android.graphics.Bitmap bitmap, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f492949d = fVar;
        this.f492950e = i17;
        this.f492951f = i18;
        this.f492952g = i19;
        this.f492953h = bitmap;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sr0.c(this.f492949d, this.f492950e, this.f492951f, this.f492952g, this.f492953h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sr0.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        return this.f492949d.y(this.f492950e, this.f492951f, this.f492952g, this.f492953h, false);
    }
}
