package hj3;

/* loaded from: classes14.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f363169d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f363170e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hj3.m f363171f;

    /* renamed from: g, reason: collision with root package name */
    public int f363172g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(hj3.m mVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f363171f = mVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f363170e = obj;
        this.f363172g |= Integer.MIN_VALUE;
        return this.f363171f.b(this);
    }
}
