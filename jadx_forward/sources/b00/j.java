package b00;

/* loaded from: classes9.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f98223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b00.r f98224e;

    /* renamed from: f, reason: collision with root package name */
    public int f98225f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b00.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f98224e = rVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f98223d = obj;
        this.f98225f |= Integer.MIN_VALUE;
        return this.f98224e.mj(null, null, this);
    }
}
