package by1;

/* loaded from: classes2.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f117890d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f117891e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ by1.f f117892f;

    /* renamed from: g, reason: collision with root package name */
    public int f117893g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(by1.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f117892f = fVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f117891e = obj;
        this.f117893g |= Integer.MIN_VALUE;
        return by1.f.f(this.f117892f, this);
    }
}
