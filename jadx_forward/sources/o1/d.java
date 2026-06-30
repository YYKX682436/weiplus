package o1;

/* loaded from: classes14.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f423551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o1.e f423552e;

    /* renamed from: f, reason: collision with root package name */
    public int f423553f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o1.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f423552e = eVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f423551d = obj;
        this.f423553f |= Integer.MIN_VALUE;
        return this.f423552e.c(0L, this);
    }
}
