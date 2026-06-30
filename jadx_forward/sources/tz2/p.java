package tz2;

/* loaded from: classes14.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f504845d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f504846e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f504847f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tz2.q f504848g;

    /* renamed from: h, reason: collision with root package name */
    public int f504849h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(tz2.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f504848g = qVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f504847f = obj;
        this.f504849h |= Integer.MIN_VALUE;
        return tz2.q.b(this.f504848g, null, this);
    }
}
