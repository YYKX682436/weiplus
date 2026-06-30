package zl2;

/* loaded from: classes3.dex */
public final class p2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f555450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zl2.r4 f555451e;

    /* renamed from: f, reason: collision with root package name */
    public int f555452f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(zl2.r4 r4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f555451e = r4Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f555450d = obj;
        this.f555452f |= Integer.MIN_VALUE;
        return this.f555451e.s2(null, null, this);
    }
}
