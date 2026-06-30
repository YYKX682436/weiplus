package kj3;

/* loaded from: classes14.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f389974d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f389975e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kj3.d f389976f;

    /* renamed from: g, reason: collision with root package name */
    public int f389977g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kj3.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f389976f = dVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f389975e = obj;
        this.f389977g |= Integer.MIN_VALUE;
        return this.f389976f.b(this);
    }
}
