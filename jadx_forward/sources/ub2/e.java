package ub2;

/* loaded from: classes10.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f507576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ub2.k f507577e;

    /* renamed from: f, reason: collision with root package name */
    public int f507578f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ub2.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f507577e = kVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f507576d = obj;
        this.f507578f |= Integer.MIN_VALUE;
        return this.f507577e.c(this);
    }
}
