package xt2;

/* loaded from: classes3.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f538289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.m f538290e;

    /* renamed from: f, reason: collision with root package name */
    public int f538291f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(xt2.m mVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f538290e = mVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f538289d = obj;
        this.f538291f |= Integer.MIN_VALUE;
        return this.f538290e.o(null, null, this);
    }
}
