package lt1;

/* loaded from: classes11.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f402713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lt1.d f402714e;

    /* renamed from: f, reason: collision with root package name */
    public int f402715f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(lt1.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f402714e = dVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f402713d = obj;
        this.f402715f |= Integer.MIN_VALUE;
        return this.f402714e.f(null, false, null, this);
    }
}
