package g40;

/* loaded from: classes12.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f350203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g40.g f350204e;

    /* renamed from: f, reason: collision with root package name */
    public int f350205f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g40.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f350204e = gVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f350203d = obj;
        this.f350205f |= Integer.MIN_VALUE;
        return this.f350204e.i(null, this);
    }
}
