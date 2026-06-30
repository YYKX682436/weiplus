package m12;

/* loaded from: classes10.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f404357d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f404358e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f404359f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f404360g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m12.i f404361h;

    /* renamed from: i, reason: collision with root package name */
    public int f404362i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(m12.i iVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f404361h = iVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f404360g = obj;
        this.f404362i |= Integer.MIN_VALUE;
        return this.f404361h.c(this);
    }
}
