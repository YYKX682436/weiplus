package co5;

/* loaded from: classes11.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f125382d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f125383e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ co5.p f125384f;

    /* renamed from: g, reason: collision with root package name */
    public int f125385g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(co5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f125384f = pVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f125383e = obj;
        this.f125385g |= Integer.MIN_VALUE;
        return this.f125384f.Ai(null, this);
    }
}
