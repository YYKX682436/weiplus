package sy;

/* loaded from: classes12.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f495333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sy.g f495334e;

    /* renamed from: f, reason: collision with root package name */
    public int f495335f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(sy.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f495334e = gVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f495333d = obj;
        this.f495335f |= Integer.MIN_VALUE;
        return this.f495334e.U6(null, 0L, this);
    }
}
