package jt1;

/* loaded from: classes12.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f383139d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f383140e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f383141f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jt1.e f383142g;

    /* renamed from: h, reason: collision with root package name */
    public int f383143h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(jt1.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f383142g = eVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f383141f = obj;
        this.f383143h |= Integer.MIN_VALUE;
        return this.f383142g.i(null, this);
    }
}
