package ch2;

/* loaded from: classes10.dex */
public final class y1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f123027d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f123028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f123029f;

    /* renamed from: g, reason: collision with root package name */
    public int f123030g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(ch2.o2 o2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f123029f = o2Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f123028e = obj;
        this.f123030g |= Integer.MIN_VALUE;
        return this.f123029f.D7(null, null, this);
    }
}
