package fw1;

/* loaded from: classes14.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f348605d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f348606e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fw1.h f348607f;

    /* renamed from: g, reason: collision with root package name */
    public int f348608g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(fw1.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f348607f = hVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f348606e = obj;
        this.f348608g |= Integer.MIN_VALUE;
        return this.f348607f.b(null, this);
    }
}
