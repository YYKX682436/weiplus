package ix5;

/* loaded from: classes16.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f377176d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f377177e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ix5.h f377178f;

    /* renamed from: g, reason: collision with root package name */
    public int f377179g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ix5.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f377178f = hVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f377177e = obj;
        this.f377179g |= Integer.MIN_VALUE;
        return this.f377178f.b(null, null, null, this);
    }
}
