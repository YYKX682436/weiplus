package hz0;

/* loaded from: classes4.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f367806d;

    /* renamed from: e, reason: collision with root package name */
    public int f367807e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f367808f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367809g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 f367810h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 f367811i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367812m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367813n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367814o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f367815p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p3325xe03a0797.p3326xc267989b.q qVar, java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 c4069xbe747ef4, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f367808f = qVar;
        this.f367809g = str;
        this.f367810h = c4069xbe747ef4;
        this.f367811i = c4129xdee64553;
        this.f367812m = str2;
        this.f367813n = str3;
        this.f367814o = str4;
        this.f367815p = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hz0.l(this.f367808f, this.f367809g, this.f367810h, this.f367811i, this.f367812m, this.f367813n, this.f367814o, this.f367815p, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hz0.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object o17;
        com.p314xaae8f345.p457x3304c6.p464xb32913b4.c cVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f367807e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        boolean z17 = true;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            az0.i5 i5Var = az0.i5.f97090a;
            this.f367807e = 1;
            o17 = i5Var.o(this);
            if (o17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (com.p314xaae8f345.p457x3304c6.p464xb32913b4.c) this.f367806d;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                hz0.m mVar = hz0.m.f367816a;
                java.lang.String str = cVar.f129543a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "value(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TemplateBackgroundWorkManager", "enqueueWork >> workTagId: ".concat(str));
                a5.c0 c0Var = new a5.c0(com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.C11020xf79d3099.class);
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("KEY_EXPORT_BACKGROUND_WORK_TAG_ID", str);
                a5.m mVar2 = new a5.m(hashMap);
                a5.m.d(mVar2);
                c0Var.f82963c.f379301e = mVar2;
                ((java.util.HashSet) c0Var.f82964d).add(str);
                a5.t0 a17 = c0Var.a();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "build(...)");
                b5.w.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).a((a5.d0) a17);
                i95.m c17 = i95.n0.c(g65.a.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                java.lang.String str2 = cVar.f129543a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "value(...)");
                g65.a.hg((g65.a) c17, 34, 10, str2, 0, 0, 0, 0L, 0L, 0L, 0L, 0, null, null, null, null, 32760, null);
                return f0Var;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            o17 = obj;
        }
        com.p314xaae8f345.p457x3304c6.p464xb32913b4.C4041xf31b2ebc c4041xf31b2ebc = (com.p314xaae8f345.p457x3304c6.p464xb32913b4.C4041xf31b2ebc) o17;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f367808f;
        if (c4041xf31b2ebc != null) {
            hz0.m mVar3 = hz0.m.f367816a;
            try {
                b5.w.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            } catch (java.lang.IllegalStateException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TemplateBackgroundWorkManager", "checkWorkManagerInit is error " + e17.getMessage());
                z17 = false;
            }
            if (z17) {
                com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553.f16110x95b7fc88;
                java.lang.String str3 = this.f367809g;
                if (android.text.TextUtils.isEmpty(str3)) {
                    throw new java.lang.IllegalArgumentException("input clipbundle id should not be null");
                }
                com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 c4069xbe747ef4 = this.f367810h;
                if (c4069xbe747ef4 == null) {
                    throw new java.lang.IllegalArgumentException("export settings should not be null");
                }
                com.p314xaae8f345.p457x3304c6.p464xb32913b4.c d17 = c4041xf31b2ebc.d(new com.p314xaae8f345.p457x3304c6.p464xb32913b4.C4043x2a1119e(str3, this.f367811i, c4069xbe747ef4));
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                java.lang.String str4 = d17.f129543a;
                ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(str4));
                dm.ib ibVar = new dm.ib();
                ibVar.f67036xcf7ab2c4 = str4;
                ibVar.f67037xdb9e6ea3 = 4001;
                ibVar.f67035xdb968d56 = -1;
                ibVar.f67027xae81df62 = this.f367812m;
                ibVar.f67026xa8a162e7 = this.f367813n;
                ibVar.f67020x43038dae = str3;
                ibVar.f67021x3882660c = this.f367814o;
                ibVar.f67023xca7c3d7 = java.lang.System.currentTimeMillis();
                ibVar.f67025x5b8aa02d = 2;
                ibVar.f67024xebaf647 = this.f367815p;
                this.f367806d = d17;
                this.f367807e = 2;
                java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new iz0.c(ibVar, null), this);
                if (g17 != pz5.a.f440719d) {
                    g17 = f0Var;
                }
                if (g17 == aVar) {
                    return aVar;
                }
                cVar = d17;
                hz0.m mVar4 = hz0.m.f367816a;
                java.lang.String str5 = cVar.f129543a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "value(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TemplateBackgroundWorkManager", "enqueueWork >> workTagId: ".concat(str5));
                a5.c0 c0Var2 = new a5.c0(com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.C11020xf79d3099.class);
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("KEY_EXPORT_BACKGROUND_WORK_TAG_ID", str5);
                a5.m mVar22 = new a5.m(hashMap2);
                a5.m.d(mVar22);
                c0Var2.f82963c.f379301e = mVar22;
                ((java.util.HashSet) c0Var2.f82964d).add(str5);
                a5.t0 a172 = c0Var2.a();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a172, "build(...)");
                b5.w.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).a((a5.d0) a172);
                i95.m c172 = i95.n0.c(g65.a.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c172, "getService(...)");
                java.lang.String str22 = cVar.f129543a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str22, "value(...)");
                g65.a.hg((g65.a) c172, 34, 10, str22, 0, 0, 0, 0L, 0L, 0L, 0L, 0, null, null, null, null, 32760, null);
                return f0Var;
            }
        }
        hz0.m mVar5 = hz0.m.f367816a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TemplateBackgroundWorkManager", "dealBackgroundWork: init failed");
        ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
        return f0Var;
    }
}
