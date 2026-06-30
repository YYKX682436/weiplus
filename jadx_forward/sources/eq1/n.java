package eq1;

/* loaded from: classes.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f337366d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f337367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eq1.u f337368f;

    /* renamed from: g, reason: collision with root package name */
    public int f337369g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(eq1.u uVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f337368f = uVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f337367e = obj;
        this.f337369g |= Integer.MIN_VALUE;
        java.lang.Object b17 = this.f337368f.b(false, this);
        return b17 == pz5.a.f440719d ? b17 : p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(b17);
    }
}
