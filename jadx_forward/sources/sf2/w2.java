package sf2;

/* loaded from: classes10.dex */
public final class w2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f488873d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f488874e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf2.d3 f488875f;

    /* renamed from: g, reason: collision with root package name */
    public int f488876g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(sf2.d3 d3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f488875f = d3Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f488874e = obj;
        this.f488876g |= Integer.MIN_VALUE;
        return this.f488875f.r7(null, null, false, null, this);
    }
}
