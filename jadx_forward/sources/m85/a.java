package m85;

/* loaded from: classes4.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f406358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m85.b f406359e;

    /* renamed from: f, reason: collision with root package name */
    public int f406360f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m85.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f406359e = bVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f406358d = obj;
        this.f406360f |= Integer.MIN_VALUE;
        return this.f406359e.k(0L, 0, this);
    }
}
