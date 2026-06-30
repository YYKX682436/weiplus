package fu;

/* loaded from: classes5.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f348283d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f348284e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fu.d f348285f;

    /* renamed from: g, reason: collision with root package name */
    public int f348286g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(fu.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f348285f = dVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f348284e = obj;
        this.f348286g |= Integer.MIN_VALUE;
        return this.f348285f.A(this);
    }
}
