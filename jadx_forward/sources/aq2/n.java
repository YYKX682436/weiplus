package aq2;

/* loaded from: classes2.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f94686d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f94687e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aq2.o f94688f;

    /* renamed from: g, reason: collision with root package name */
    public int f94689g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(aq2.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f94688f = oVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f94687e = obj;
        this.f94689g |= Integer.MIN_VALUE;
        return this.f94688f.b(this);
    }
}
