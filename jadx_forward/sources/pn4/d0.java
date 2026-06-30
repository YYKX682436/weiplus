package pn4;

/* loaded from: classes14.dex */
public final class d0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public int f438600d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f438601e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pn4.e0 f438602f;

    /* renamed from: g, reason: collision with root package name */
    public int f438603g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(pn4.e0 e0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f438602f = e0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f438601e = obj;
        this.f438603g |= Integer.MIN_VALUE;
        return this.f438602f.c(null, 0, 0, this);
    }
}
