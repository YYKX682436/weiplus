package h4;

/* loaded from: classes14.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f360168d;

    /* renamed from: e, reason: collision with root package name */
    public int f360169e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h4.i f360170f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f360171g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h4.i iVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f360170f = iVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f360168d = obj;
        this.f360169e |= Integer.MIN_VALUE;
        return this.f360170f.e(null, this);
    }
}
