package fo5;

/* loaded from: classes14.dex */
public final class s extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f346642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f346643e;

    /* renamed from: f, reason: collision with root package name */
    public int f346644f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(fo5.r0 r0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f346643e = r0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f346642d = obj;
        this.f346644f |= Integer.MIN_VALUE;
        return this.f346643e.d(null, this);
    }
}
