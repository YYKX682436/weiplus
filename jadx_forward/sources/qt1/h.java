package qt1;

/* loaded from: classes7.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f448061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qt1.i f448062e;

    /* renamed from: f, reason: collision with root package name */
    public int f448063f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(qt1.i iVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f448062e = iVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f448061d = obj;
        this.f448063f |= Integer.MIN_VALUE;
        return this.f448062e.e(this);
    }
}
