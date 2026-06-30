package h4;

/* loaded from: classes14.dex */
public final class c0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f360164d;

    /* renamed from: e, reason: collision with root package name */
    public int f360165e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h4.d0 f360166f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f360167g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(h4.d0 d0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f360166f = d0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f360164d = obj;
        this.f360165e |= Integer.MIN_VALUE;
        return this.f360166f.mo771x2f8fd3(null, this);
    }
}
