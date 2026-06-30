package sf2;

/* loaded from: classes10.dex */
public final class m0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f488732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf2.e1 f488733e;

    /* renamed from: f, reason: collision with root package name */
    public int f488734f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(sf2.e1 e1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f488733e = e1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f488732d = obj;
        this.f488734f |= Integer.MIN_VALUE;
        return this.f488733e.d7(null, this);
    }
}
