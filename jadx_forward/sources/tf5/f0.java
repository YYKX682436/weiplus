package tf5;

/* loaded from: classes11.dex */
public final class f0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f500508d;

    /* renamed from: e, reason: collision with root package name */
    public int f500509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tf5.g0 f500510f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(tf5.g0 g0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f500510f = g0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f500508d = obj;
        this.f500509e |= Integer.MIN_VALUE;
        return this.f500510f.mo771x2f8fd3(null, this);
    }
}
