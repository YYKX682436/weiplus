package f40;

/* loaded from: classes12.dex */
public final class t extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f340993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f40.v f340994e;

    /* renamed from: f, reason: collision with root package name */
    public int f340995f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(f40.v vVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f340994e = vVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f340993d = obj;
        this.f340995f |= Integer.MIN_VALUE;
        return f40.v.T6(this.f340994e, null, null, this);
    }
}
