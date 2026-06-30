package im2;

/* loaded from: classes3.dex */
public final class s5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f374059d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f374060e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f374061f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ im2.h6 f374062g;

    /* renamed from: h, reason: collision with root package name */
    public int f374063h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(im2.h6 h6Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f374062g = h6Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f374061f = obj;
        this.f374063h |= Integer.MIN_VALUE;
        return im2.h6.h(this.f374062g, this);
    }
}
