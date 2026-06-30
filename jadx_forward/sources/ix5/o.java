package ix5;

/* loaded from: classes16.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f377194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ix5.h f377195e;

    /* renamed from: f, reason: collision with root package name */
    public int f377196f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ix5.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f377195e = hVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f377194d = obj;
        this.f377196f |= Integer.MIN_VALUE;
        return ix5.h.a(this.f377195e, null, this);
    }
}
