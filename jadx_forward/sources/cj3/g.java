package cj3;

/* loaded from: classes14.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f123422d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f123423e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cj3.i f123424f;

    /* renamed from: g, reason: collision with root package name */
    public int f123425g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(cj3.i iVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f123424f = iVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f123423e = obj;
        this.f123425g |= Integer.MIN_VALUE;
        return this.f123424f.a(this);
    }
}
