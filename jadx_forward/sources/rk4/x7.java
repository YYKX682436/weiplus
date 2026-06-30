package rk4;

/* loaded from: classes11.dex */
public final class x7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f478614d;

    /* renamed from: e, reason: collision with root package name */
    public int f478615e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rk4.k8 f478616f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f478617g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f478618h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f478619i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f478620m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(rk4.k8 k8Var, int i17, java.lang.Integer num, java.lang.String str, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f478616f = k8Var;
        this.f478617g = i17;
        this.f478618h = num;
        this.f478619i = str;
        this.f478620m = context;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rk4.x7(this.f478616f, this.f478617g, this.f478618h, this.f478619i, this.f478620m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.x7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00c2 A[RETURN] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.x7.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
