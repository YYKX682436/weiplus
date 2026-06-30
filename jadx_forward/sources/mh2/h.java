package mh2;

/* loaded from: classes10.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407891d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f407892e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f407893f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407894g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mh2.k f407895h;

    /* renamed from: i, reason: collision with root package name */
    public int f407896i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(mh2.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f407895h = kVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f407894g = obj;
        this.f407896i |= Integer.MIN_VALUE;
        return mh2.k.a(this.f407895h, null, this);
    }
}
