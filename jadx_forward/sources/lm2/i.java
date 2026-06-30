package lm2;

/* loaded from: classes4.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f400935d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f400936e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lm2.n f400937f;

    /* renamed from: g, reason: collision with root package name */
    public int f400938g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(lm2.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f400937f = nVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f400936e = obj;
        this.f400938g |= Integer.MIN_VALUE;
        return this.f400937f.a(null, 0L, null, this);
    }
}
