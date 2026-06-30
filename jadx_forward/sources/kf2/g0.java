package kf2;

/* loaded from: classes.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f388765d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f388766e;

    /* renamed from: f, reason: collision with root package name */
    public int f388767f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f388768g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kf2.h0 f388769h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f388770i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f388771m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(java.lang.Object obj, kf2.h0 h0Var, long j17, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f388768g = obj;
        this.f388769h = h0Var;
        this.f388770i = j17;
        this.f388771m = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kf2.g0(this.f388768g, this.f388769h, this.f388770i, this.f388771m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((kf2.g0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Integer b17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f388767f;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            kf2.w wVar = kf2.x.f388843c;
            java.lang.Object obj2 = this.f388768g;
            java.lang.String c17 = wVar.c(obj2, "audience_username");
            if (c17 != null && (b17 = wVar.b(obj2, "op_type")) != null) {
                int intValue = b17.intValue();
                kf2.h0 h0Var = this.f388769h;
                long j17 = this.f388770i;
                int i18 = this.f388771m;
                this.f388765d = c17;
                this.f388766e = h0Var;
                this.f388767f = 1;
                p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
                rVar.k();
                h0Var.f388776d = new kf2.f0(h0Var, j17, i18, new v65.n(rVar));
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                hb2.y.f361647e.r(c17, intValue == 1, h0Var.f388776d);
                if (rVar.j() == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return f0Var;
    }
}
