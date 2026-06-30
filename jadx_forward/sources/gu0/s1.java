package gu0;

/* loaded from: classes5.dex */
public final class s1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f357338d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f357339e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357340f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f357341g;

    /* renamed from: h, reason: collision with root package name */
    public int f357342h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(gu0.k2 k2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f357341g = k2Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f357340f = obj;
        this.f357342h |= Integer.MIN_VALUE;
        return gu0.k2.k(this.f357341g, this);
    }
}
