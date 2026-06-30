package o1;

/* loaded from: classes14.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f423548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o1.e f423549e;

    /* renamed from: f, reason: collision with root package name */
    public int f423550f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o1.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f423549e = eVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f423548d = obj;
        this.f423550f |= Integer.MIN_VALUE;
        return this.f423549e.a(0L, 0L, this);
    }
}
