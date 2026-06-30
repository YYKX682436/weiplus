package a03;

/* loaded from: classes11.dex */
public final class t extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f81985d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f81986e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f81987f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a03.h0 f81988g;

    /* renamed from: h, reason: collision with root package name */
    public int f81989h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(a03.h0 h0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f81988g = h0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f81987f = obj;
        this.f81989h |= Integer.MIN_VALUE;
        return a03.h0.Zi(this.f81988g, this);
    }
}
