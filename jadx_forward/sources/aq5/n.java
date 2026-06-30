package aq5;

/* loaded from: classes5.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f94790d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f94791e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aq5.o f94792f;

    /* renamed from: g, reason: collision with root package name */
    public int f94793g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(aq5.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f94792f = oVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f94791e = obj;
        this.f94793g |= Integer.MIN_VALUE;
        return this.f94792f.f(0, this);
    }
}
