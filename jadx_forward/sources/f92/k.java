package f92;

/* loaded from: classes10.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f341787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f92.t f341788e;

    /* renamed from: f, reason: collision with root package name */
    public int f341789f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f92.t tVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f341788e = tVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f341787d = obj;
        this.f341789f |= Integer.MIN_VALUE;
        java.lang.Object c47 = this.f341788e.c4(null, this);
        return c47 == pz5.a.f440719d ? c47 : p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(c47);
    }
}
