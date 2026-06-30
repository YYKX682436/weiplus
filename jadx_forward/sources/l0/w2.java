package l0;

/* loaded from: classes14.dex */
public final class w2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f396114d;

    /* renamed from: e, reason: collision with root package name */
    public int f396115e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0.x2 f396116f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(l0.x2 x2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f396116f = x2Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f396114d = obj;
        this.f396115e |= Integer.MIN_VALUE;
        return this.f396116f.mo771x2f8fd3(null, this);
    }
}
