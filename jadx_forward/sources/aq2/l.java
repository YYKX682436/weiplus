package aq2;

/* loaded from: classes2.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f94681d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f94682e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f94683f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ aq2.m f94684g;

    /* renamed from: h, reason: collision with root package name */
    public int f94685h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(aq2.m mVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f94684g = mVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f94683f = obj;
        this.f94685h |= Integer.MIN_VALUE;
        return this.f94684g.i(false, this);
    }
}
