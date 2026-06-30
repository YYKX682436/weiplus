package aq5;

/* loaded from: classes5.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f94778d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f94779e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aq5.o f94780f;

    /* renamed from: g, reason: collision with root package name */
    public int f94781g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(aq5.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f94780f = oVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f94779e = obj;
        this.f94781g |= Integer.MIN_VALUE;
        return aq5.o.c(this.f94780f, this);
    }
}
