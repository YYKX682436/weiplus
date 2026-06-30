package pe3;

/* loaded from: classes7.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f435172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pe3.f f435173e;

    /* renamed from: f, reason: collision with root package name */
    public int f435174f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(pe3.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f435173e = fVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f435172d = obj;
        this.f435174f |= Integer.MIN_VALUE;
        this.f435173e.P6(this);
        return pz5.a.f440719d;
    }
}
