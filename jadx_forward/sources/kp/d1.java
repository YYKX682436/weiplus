package kp;

/* loaded from: classes13.dex */
public final class d1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f392258d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f392259e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f392260f;

    /* renamed from: g, reason: collision with root package name */
    public int f392261g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(kp.i1 i1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f392260f = i1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f392259e = obj;
        this.f392261g |= Integer.MIN_VALUE;
        return this.f392260f.oj(null, null, this);
    }
}
