package vr0;

/* loaded from: classes14.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f521011d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f521012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vr0.z f521013f;

    /* renamed from: g, reason: collision with root package name */
    public int f521014g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(vr0.z zVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f521013f = zVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f521012e = obj;
        this.f521014g |= Integer.MIN_VALUE;
        return this.f521013f.w(null, this);
    }
}
