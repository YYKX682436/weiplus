package qf2;

/* loaded from: classes10.dex */
public final class o1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f444038d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f444039e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f444040f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f444041g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f444042h;

    /* renamed from: i, reason: collision with root package name */
    public int f444043i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(qf2.y1 y1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f444042h = y1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f444041g = obj;
        this.f444043i |= Integer.MIN_VALUE;
        return qf2.y1.b7(this.f444042h, null, 0, false, null, this);
    }
}
