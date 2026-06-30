package sf2;

/* loaded from: classes10.dex */
public final class a1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f488560d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f488561e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f488562f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f488563g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f488564h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sf2.e1 f488565i;

    /* renamed from: m, reason: collision with root package name */
    public int f488566m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(sf2.e1 e1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f488565i = e1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f488564h = obj;
        this.f488566m |= Integer.MIN_VALUE;
        return this.f488565i.l7(false, null, null, this);
    }
}
