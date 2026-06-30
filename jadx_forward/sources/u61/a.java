package u61;

/* loaded from: classes4.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f506408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u61.b f506409e;

    /* renamed from: f, reason: collision with root package name */
    public int f506410f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(u61.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f506409e = bVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f506408d = obj;
        this.f506410f |= Integer.MIN_VALUE;
        return this.f506409e.a(null, null, this);
    }
}
