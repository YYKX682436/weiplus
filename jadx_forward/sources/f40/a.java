package f40;

/* loaded from: classes12.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f340947d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f340948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f40.b f340949f;

    /* renamed from: g, reason: collision with root package name */
    public int f340950g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f40.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f340949f = bVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f340948e = obj;
        this.f340950g |= Integer.MIN_VALUE;
        return this.f340949f.T6(null, this);
    }
}
