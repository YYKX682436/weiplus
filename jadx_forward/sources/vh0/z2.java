package vh0;

/* loaded from: classes11.dex */
public final class z2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f518540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh0.f3 f518541e;

    /* renamed from: f, reason: collision with root package name */
    public int f518542f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(vh0.f3 f3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f518541e = f3Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f518540d = obj;
        this.f518542f |= Integer.MIN_VALUE;
        return vh0.f3.Di(this.f518541e, null, 0, this);
    }
}
