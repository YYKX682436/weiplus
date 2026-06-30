package sf2;

/* loaded from: classes10.dex */
public final class c3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f488615d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f488616e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f488617f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f488618g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f488619h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sf2.d3 f488620i;

    /* renamed from: m, reason: collision with root package name */
    public int f488621m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(sf2.d3 d3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f488620i = d3Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f488619h = obj;
        this.f488621m |= Integer.MIN_VALUE;
        return this.f488620i.u7(null, this);
    }
}
