package az0;

/* loaded from: classes16.dex */
public final class s8 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.s9 f97422e;

    /* renamed from: f, reason: collision with root package name */
    public int f97423f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(az0.s9 s9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f97422e = s9Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f97421d = obj;
        this.f97423f |= Integer.MIN_VALUE;
        return this.f97422e.m0(this);
    }
}
