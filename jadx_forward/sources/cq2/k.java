package cq2;

/* loaded from: classes2.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f302938d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f302939e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f302940f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f302941g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ys5.e f302942h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f302943i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ws5.h f302944m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f302945n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f302946o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f302947p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(boolean z17, java.lang.String str, ys5.e eVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, ws5.h hVar, float f17, boolean z18, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f302940f = z17;
        this.f302941g = str;
        this.f302942h = eVar;
        this.f302943i = f0Var;
        this.f302944m = hVar;
        this.f302945n = f17;
        this.f302946o = z18;
        this.f302947p = c0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        cq2.k kVar = new cq2.k(this.f302940f, this.f302941g, this.f302942h, this.f302943i, this.f302944m, this.f302945n, this.f302946o, this.f302947p, interfaceC29045xdcb5ca57);
        kVar.f302939e = obj;
        return kVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((cq2.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        r45.wo1 wo1Var;
        r45.dk2 dk2Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f302938d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var2 = (p3325xe03a0797.p3326xc267989b.y0) this.f302939e;
            cq2.j jVar = new cq2.j(this.f302942h, this.f302940f, this.f302943i, this.f302944m, this.f302945n, this.f302946o, this.f302947p);
            oz5.l f93115e = y0Var2.getF93115e();
            int i18 = p3325xe03a0797.p3326xc267989b.r2.O0;
            aq2.m mVar = new aq2.m(jVar, (p3325xe03a0797.p3326xc267989b.r2) f93115e.get(p3325xe03a0797.p3326xc267989b.q2.f392104d), null);
            this.f302939e = y0Var2;
            this.f302938d = 1;
            java.lang.Object h17 = ay1.l.h(mVar, this);
            if (h17 == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
            obj = h17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f302939e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        boolean z17 = this.f302940f;
        if (z17) {
            boolean z18 = fVar != null && fVar.f152149b == 0;
            java.lang.String str = this.f302941g;
            if (z18) {
                if (fVar != null && fVar.f152148a == 0) {
                    r45.dk2 dk2Var2 = fVar != null ? (r45.dk2) fVar.f152151d : null;
                    if (!(dk2Var2 instanceof r45.dk2)) {
                        dk2Var2 = null;
                    }
                    if (dk2Var2 != null) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update preload config, currentPreloadKey: ");
                        sb6.append(str);
                        sb6.append(' ');
                        r45.wo1 wo1Var2 = (r45.wo1) dk2Var2.m75936x14adae67(14);
                        sb6.append(wo1Var2 != null ? cq2.q.f302961a.g(wo1Var2) : null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewSquarePreloadUtil", sb6.toString());
                        r45.wo1 wo1Var3 = (r45.wo1) dk2Var2.m75936x14adae67(14);
                        if (wo1Var3 != null && wo1Var3.m75933x41a8a7f2(0)) {
                            cq2.q qVar = cq2.q.f302961a;
                            cq2.q.f302962b.put(str, wo1Var3);
                        }
                    }
                    if (fVar != null && (dk2Var = (r45.dk2) fVar.f152151d) != null) {
                        pm0.v.X(new cq2.i(dk2Var));
                    }
                }
            }
            cq2.q qVar2 = cq2.q.f302961a;
            cq2.q.f302974n++;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("update preload config, currentPreloadKey: ");
            sb7.append(str);
            sb7.append(" error: ");
            sb7.append(fVar != null ? new java.lang.Integer(fVar.f152149b) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewSquarePreloadUtil", sb7.toString());
            java.lang.Integer num = fVar != null ? new java.lang.Integer(fVar.f152149b) : null;
            if (num != null && num.intValue() == -5902) {
                cq2.q.f302964d.put(str, new java.lang.Long(java.lang.System.currentTimeMillis()));
                r45.dk2 dk2Var3 = (r45.dk2) fVar.f152151d;
                if (dk2Var3 != null && (wo1Var = (r45.wo1) dk2Var3.m75936x14adae67(14)) != null && wo1Var.m75933x41a8a7f2(0)) {
                    cq2.q.f302962b.put(str, wo1Var);
                }
                cq2.q.f302965e = android.os.SystemClock.elapsedRealtime();
            }
            if (fVar != null) {
                pm0.v.X(new cq2.i(dk2Var));
            }
        }
        cq2.q.f302969i = "";
        cq2.q.f302971k = null;
        if (z17 && !p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
            cq2.q.f302961a.b("PreloadCancel");
        }
        return jz5.f0.f384359a;
    }
}
