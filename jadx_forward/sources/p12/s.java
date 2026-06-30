package p12;

/* loaded from: classes10.dex */
public final class s extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f432578d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f432579e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p12.w f432580f;

    /* renamed from: g, reason: collision with root package name */
    public int f432581g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p12.w wVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f432580f = wVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f432579e = obj;
        this.f432581g |= Integer.MIN_VALUE;
        return p12.w.g(this.f432580f, null, this);
    }
}
