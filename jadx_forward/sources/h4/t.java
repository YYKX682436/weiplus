package h4;

/* loaded from: classes14.dex */
public final class t extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f360228d;

    /* renamed from: e, reason: collision with root package name */
    public int f360229e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h4.u f360230f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f360231g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(h4.u uVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f360230f = uVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f360228d = obj;
        this.f360229e |= Integer.MIN_VALUE;
        return this.f360230f.mo771x2f8fd3(null, this);
    }
}
