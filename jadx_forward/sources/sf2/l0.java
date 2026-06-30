package sf2;

/* loaded from: classes10.dex */
public final class l0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f488724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf2.e1 f488725e;

    /* renamed from: f, reason: collision with root package name */
    public int f488726f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(sf2.e1 e1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f488725e = e1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f488724d = obj;
        this.f488726f |= Integer.MIN_VALUE;
        return this.f488725e.c7(null, this);
    }
}
