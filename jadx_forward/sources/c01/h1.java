package c01;

/* loaded from: classes4.dex */
public final class h1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f118754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c01.k1 f118755e;

    /* renamed from: f, reason: collision with root package name */
    public int f118756f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(c01.k1 k1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f118755e = k1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f118754d = obj;
        this.f118756f |= Integer.MIN_VALUE;
        return this.f118755e.a(null, null, this);
    }
}
