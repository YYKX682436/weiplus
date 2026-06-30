package ik4;

/* loaded from: classes4.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f373483d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f373484e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f373485f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f373486g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ik4.p f373487h;

    /* renamed from: i, reason: collision with root package name */
    public int f373488i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ik4.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f373487h = pVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f373486g = obj;
        this.f373488i |= Integer.MIN_VALUE;
        return this.f373487h.g(false, null, false, this);
    }
}
