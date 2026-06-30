package gc0;

/* loaded from: classes5.dex */
public final class w0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f351865d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f351866e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f351867f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f351868g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f351869h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ gc0.y0 f351870i;

    /* renamed from: m, reason: collision with root package name */
    public int f351871m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(gc0.y0 y0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f351870i = y0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f351869h = obj;
        this.f351871m |= Integer.MIN_VALUE;
        return this.f351870i.b(null, false, false, this);
    }
}
