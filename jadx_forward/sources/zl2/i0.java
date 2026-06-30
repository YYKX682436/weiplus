package zl2;

/* loaded from: classes.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f555343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.zc4 f555344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f555345f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.zc4 f555346g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v65.n f555347h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(r45.zc4 zc4Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, r45.zc4 zc4Var2, v65.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f555344e = zc4Var;
        this.f555345f = activityC0065xcd7aa112;
        this.f555346g = zc4Var2;
        this.f555347h = nVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zl2.i0(this.f555344e, this.f555345f, this.f555346g, this.f555347h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zl2.i0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f555343d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.zc4 zc4Var = this.f555344e;
            int m75939xb282bd08 = zc4Var.m75939xb282bd08(18);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f555345f;
            if (m75939xb282bd08 == 1) {
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                this.f555343d = 1;
                ((c61.l7) b6Var).getClass();
                java.lang.Object w17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a.w(activityC0065xcd7aa112, zc4Var, this);
                if (w17 != aVar) {
                    w17 = f0Var;
                }
                if (w17 == aVar) {
                    return aVar;
                }
            } else {
                s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
                this.f555343d = 2;
                if (((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).nj(activityC0065xcd7aa112, this.f555346g, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1 && i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f555347h.a("");
        return f0Var;
    }
}
