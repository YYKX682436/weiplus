package aq5;

/* loaded from: classes5.dex */
public final class v extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f94838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aq5.y f94839e;

    /* renamed from: f, reason: collision with root package name */
    public int f94840f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(aq5.y yVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f94839e = yVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f94838d = obj;
        this.f94840f |= Integer.MIN_VALUE;
        return this.f94839e.f(0, null, this);
    }
}
