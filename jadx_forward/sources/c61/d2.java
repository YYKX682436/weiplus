package c61;

/* loaded from: classes10.dex */
public final class d2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f120462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c61.p2 f120463e;

    /* renamed from: f, reason: collision with root package name */
    public int f120464f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(c61.p2 p2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f120463e = p2Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f120462d = obj;
        this.f120464f |= Integer.MIN_VALUE;
        return this.f120463e.Di(0L, this);
    }
}
