package zv0;

/* loaded from: classes5.dex */
public final class t extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f557758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zv0.y f557759e;

    /* renamed from: f, reason: collision with root package name */
    public int f557760f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(zv0.y yVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f557759e = yVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f557758d = obj;
        this.f557760f |= Integer.MIN_VALUE;
        return this.f557759e.b(0, this);
    }
}
