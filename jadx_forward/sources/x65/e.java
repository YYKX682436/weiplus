package x65;

/* loaded from: classes12.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f533884d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f533885e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x65.l f533886f;

    /* renamed from: g, reason: collision with root package name */
    public int f533887g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(x65.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f533886f = lVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f533885e = obj;
        this.f533887g |= Integer.MIN_VALUE;
        return this.f533886f.h(null, this);
    }
}
