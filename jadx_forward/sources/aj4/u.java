package aj4;

/* loaded from: classes10.dex */
public final class u extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f86906d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f86907e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aj4.v f86908f;

    /* renamed from: g, reason: collision with root package name */
    public int f86909g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(aj4.v vVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f86908f = vVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f86907e = obj;
        this.f86909g |= Integer.MIN_VALUE;
        return aj4.v.a(this.f86908f, null, this);
    }
}
