package nu0;

/* loaded from: classes5.dex */
public final class a1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f421393d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f421394e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nu0.b1 f421395f;

    /* renamed from: g, reason: collision with root package name */
    public int f421396g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(nu0.b1 b1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f421395f = b1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f421394e = obj;
        this.f421396g |= Integer.MIN_VALUE;
        return this.f421395f.r7(false, this);
    }
}
