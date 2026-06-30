package wh5;

/* loaded from: classes4.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f527568d;

    /* renamed from: e, reason: collision with root package name */
    public int f527569e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f527570f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f527571g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f527572h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f527573i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ wh5.v f527574m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f527575n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f527576o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String str, java.lang.String str2, long j17, long j18, wh5.v vVar, boolean z17, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f527570f = str;
        this.f527571g = str2;
        this.f527572h = j17;
        this.f527573i = j18;
        this.f527574m = vVar;
        this.f527575n = z17;
        this.f527576o = context;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wh5.d(this.f527570f, this.f527571g, this.f527572h, this.f527573i, this.f527574m, this.f527575n, this.f527576o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wh5.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        bs.b wi6;
        java.lang.String str;
        java.lang.Object a17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f527569e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.String str2 = this.f527570f;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(str2)) {
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                str2 = m11.b1.Di().P0(str2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "exportToJpgAndGetFullPath(...)");
            }
            java.lang.String str3 = str2;
            bs.b wi7 = ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).wi("check_file");
            if (wi7 == null || (wi6 = ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).wi("check_permission")) == null) {
                return f0Var;
            }
            java.lang.String a18 = q75.c.a("jpg");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("C2CLiveExporter", "exportPath: " + a18 + " destCoverPath: " + str3);
            qk.r7 r7Var = (qk.r7) i95.n0.c(qk.r7.class);
            wi6.b(wi7);
            java.lang.String str4 = this.f527571g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a18);
            str = a18;
            aq.t0 t0Var = new aq.t0(str4, str3, a18, this.f527572h, null, 16, null);
            this.f527568d = str;
            this.f527569e = 1;
            ((hs.v) r7Var).getClass();
            a17 = qp.b.f447207a.a(wi6, t0Var, this);
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.String str5 = (java.lang.String) this.f527568d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            str = str5;
            a17 = obj;
        }
        aq.s0 s0Var = (aq.s0) a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("C2CLiveExporter", "cost " + (java.lang.System.currentTimeMillis() - this.f527573i) + ", result: " + s0Var.f94493a + " code:" + s0Var.f94494b);
        wh5.v vVar = this.f527574m;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.Q(str, null, vVar.f527629a);
        x51.x0.f533642a.a(com.p314xaae8f345.mm.vfs.w6.p(str), c01.ia.v(vVar.f527629a.G));
        if (!this.f527575n) {
            return f0Var;
        }
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        wh5.c cVar = new wh5.c(s0Var, this.f527576o, null);
        this.f527568d = null;
        this.f527569e = 2;
        return p3325xe03a0797.p3326xc267989b.l.g(g3Var, cVar, this) == aVar ? aVar : f0Var;
    }
}
