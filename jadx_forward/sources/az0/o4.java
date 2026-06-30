package az0;

/* loaded from: classes5.dex */
public final class o4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f97301d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97302e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az0.i5 f97303f;

    /* renamed from: g, reason: collision with root package name */
    public int f97304g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(az0.i5 i5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f97303f = i5Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f97302e = obj;
        this.f97304g |= Integer.MIN_VALUE;
        return az0.i5.c(this.f97303f, this);
    }
}
