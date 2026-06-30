package ik4;

/* loaded from: classes4.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f373465d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f373466e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f373467f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f373468g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ik4.l f373469h;

    /* renamed from: i, reason: collision with root package name */
    public int f373470i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ik4.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f373469h = lVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f373468g = obj;
        this.f373470i |= Integer.MIN_VALUE;
        return this.f373469h.a(null, null, null, false, false, this);
    }
}
