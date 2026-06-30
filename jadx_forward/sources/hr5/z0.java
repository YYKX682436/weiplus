package hr5;

/* loaded from: classes11.dex */
public final class z0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public float f366036d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f366037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f366038f;

    /* renamed from: g, reason: collision with root package name */
    public int f366039g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(hr5.a1 a1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f366038f = a1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f366037e = obj;
        this.f366039g |= Integer.MIN_VALUE;
        return this.f366038f.h(0L, false, null, this);
    }
}
