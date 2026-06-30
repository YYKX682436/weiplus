package hj3;

/* loaded from: classes14.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f363165d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f363166e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hj3.m f363167f;

    /* renamed from: g, reason: collision with root package name */
    public int f363168g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(hj3.m mVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f363167f = mVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f363166e = obj;
        this.f363168g |= Integer.MIN_VALUE;
        return this.f363167f.a(this);
    }
}
