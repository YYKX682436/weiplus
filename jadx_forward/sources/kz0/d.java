package kz0;

/* loaded from: classes14.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f395205d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f395206e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kz0.f f395207f;

    /* renamed from: g, reason: collision with root package name */
    public int f395208g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kz0.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f395207f = fVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f395206e = obj;
        this.f395208g |= Integer.MIN_VALUE;
        return this.f395207f.a(null, 0.0f, this);
    }
}
