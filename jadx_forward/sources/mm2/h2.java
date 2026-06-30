package mm2;

/* loaded from: classes3.dex */
public final class h2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f410639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.j2 f410640e;

    /* renamed from: f, reason: collision with root package name */
    public int f410641f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(mm2.j2 j2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f410640e = j2Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f410639d = obj;
        this.f410641f |= Integer.MIN_VALUE;
        return this.f410640e.V6(null, false, this);
    }
}
