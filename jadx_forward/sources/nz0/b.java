package nz0;

/* loaded from: classes5.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f423023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nz0.d f423024e;

    /* renamed from: f, reason: collision with root package name */
    public int f423025f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(nz0.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f423024e = dVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f423023d = obj;
        this.f423025f |= Integer.MIN_VALUE;
        return this.f423024e.b(this);
    }
}
