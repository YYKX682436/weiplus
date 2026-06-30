package m41;

/* loaded from: classes8.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f404971d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f404972e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m41.d f404973f;

    /* renamed from: g, reason: collision with root package name */
    public int f404974g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(m41.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f404973f = dVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f404972e = obj;
        this.f404974g |= Integer.MIN_VALUE;
        return this.f404973f.d(this);
    }
}
