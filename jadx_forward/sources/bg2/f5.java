package bg2;

/* loaded from: classes2.dex */
public final class f5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f101616d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f101617e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f101618f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bg2.j5 f101619g;

    /* renamed from: h, reason: collision with root package name */
    public int f101620h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(bg2.j5 j5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f101619g = j5Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f101618f = obj;
        this.f101620h |= Integer.MIN_VALUE;
        return bg2.j5.Z6(this.f101619g, null, 0L, this);
    }
}
