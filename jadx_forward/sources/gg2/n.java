package gg2;

/* loaded from: classes2.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f353232d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f353233e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f353234f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gg2.q f353235g;

    /* renamed from: h, reason: collision with root package name */
    public int f353236h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(gg2.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f353235g = qVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f353234f = obj;
        this.f353236h |= Integer.MIN_VALUE;
        return this.f353235g.a(null, this);
    }
}
