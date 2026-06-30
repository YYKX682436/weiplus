package id2;

/* loaded from: classes.dex */
public final class n3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f372217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f372218e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f372219f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f372220g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f372221h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f372222i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f372223m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f372224n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f372225o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ km2.b f372226p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ yz5.l f372227q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(id2.u3 u3Var, java.lang.String str, android.content.Context context, long j17, long j18, boolean z17, boolean z18, boolean z19, km2.b bVar, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f372218e = u3Var;
        this.f372219f = str;
        this.f372220g = context;
        this.f372221h = j17;
        this.f372222i = j18;
        this.f372223m = z17;
        this.f372224n = z18;
        this.f372225o = z19;
        this.f372226p = bVar;
        this.f372227q = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new id2.n3(this.f372218e, this.f372219f, this.f372220g, this.f372221h, this.f372222i, this.f372223m, this.f372224n, this.f372225o, this.f372226p, this.f372227q, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((id2.n3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object P6;
        java.lang.Object j17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f372217d;
        id2.u3 u3Var = this.f372218e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f372217d = 1;
            P6 = id2.u3.P6(u3Var, this.f372219f, this);
            if (P6 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                j17 = obj;
                ((java.lang.Boolean) j17).booleanValue();
                id2.u3 u3Var2 = this.f372218e;
                android.content.Context context = this.f372220g;
                long j18 = this.f372221h;
                long j19 = this.f372222i;
                boolean z17 = this.f372223m;
                boolean z18 = this.f372224n;
                boolean z19 = this.f372225o;
                id2.u3.Q6(u3Var2, context, j18, j19, z17, z18, z19, false, new id2.m3(u3Var2, context, j18, j19, this.f372226p, z17, z18, z19, this.f372227q));
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            P6 = obj;
        }
        r45.lw1 lw1Var = (r45.lw1) P6;
        if (lw1Var != null) {
            long j27 = this.f372221h;
            long j28 = this.f372222i;
            this.f372217d = 2;
            u3Var.getClass();
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            v65.n nVar = new v65.n(rVar);
            pq5.g l17 = new ek2.r1(j27, j28, 8, ek2.r1.f335057u.d(lw1Var)).l();
            l17.K(new id2.j2(nVar, this.f372220g, false, u3Var));
            android.app.Activity m80379x76847179 = u3Var.m80379x76847179();
            l17.f(m80379x76847179 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m80379x76847179 : null);
            j17 = rVar.j();
            if (j17 == aVar) {
                return aVar;
            }
            ((java.lang.Boolean) j17).booleanValue();
        }
        id2.u3 u3Var22 = this.f372218e;
        android.content.Context context2 = this.f372220g;
        long j182 = this.f372221h;
        long j192 = this.f372222i;
        boolean z172 = this.f372223m;
        boolean z182 = this.f372224n;
        boolean z192 = this.f372225o;
        id2.u3.Q6(u3Var22, context2, j182, j192, z172, z182, z192, false, new id2.m3(u3Var22, context2, j182, j192, this.f372226p, z172, z182, z192, this.f372227q));
        return jz5.f0.f384359a;
    }
}
