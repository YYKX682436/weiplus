package vz0;

/* loaded from: classes14.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f523148d;

    /* renamed from: e, reason: collision with root package name */
    public int f523149e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vz0.p f523150f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(vz0.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f523150f = pVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f523148d = obj;
        this.f523149e |= Integer.MIN_VALUE;
        return this.f523150f.mo771x2f8fd3(null, this);
    }
}
