package zk2;

/* loaded from: classes2.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f554960d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f554961e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zk2.b f554962f;

    /* renamed from: g, reason: collision with root package name */
    public int f554963g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(zk2.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f554962f = bVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f554961e = obj;
        this.f554963g |= Integer.MIN_VALUE;
        return this.f554962f.b(this);
    }
}
