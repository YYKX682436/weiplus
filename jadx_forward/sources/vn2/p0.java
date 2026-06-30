package vn2;

/* loaded from: classes2.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f519880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f519881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f519882f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f519883g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f519884h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f519885i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.p f519886m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.p f519887n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(android.content.Context context, long j17, java.lang.String str, boolean z17, r45.qt2 qt2Var, yz5.p pVar, yz5.p pVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f519881e = context;
        this.f519882f = j17;
        this.f519883g = str;
        this.f519884h = z17;
        this.f519885i = qt2Var;
        this.f519886m = pVar;
        this.f519887n = pVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vn2.p0(this.f519881e, this.f519882f, this.f519883g, this.f519884h, this.f519885i, this.f519886m, this.f519887n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vn2.p0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f519880d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            vn2.u0 u0Var = vn2.u0.f519920a;
            android.content.Context context = this.f519881e;
            long j17 = this.f519882f;
            java.lang.String str = this.f519883g;
            boolean z17 = this.f519884h;
            r45.qt2 qt2Var = this.f519885i;
            yz5.p pVar = this.f519886m;
            yz5.p pVar2 = this.f519887n;
            this.f519880d = 1;
            if (u0Var.o(context, j17, str, z17, qt2Var, pVar, pVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
