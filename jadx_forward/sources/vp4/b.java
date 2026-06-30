package vp4;

/* loaded from: classes4.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f520523d;

    /* renamed from: e, reason: collision with root package name */
    public int f520524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f520525f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f520526g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f520527h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f520528i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f520529m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ vp4.j f520530n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ st3.r f520531o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f520532p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f520533q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r45.h70 f520534r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624, int i17, int i18, java.lang.String str2, vp4.j jVar, st3.r rVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, r45.h70 h70Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f520525f = str;
        this.f520526g = c16993xacc19624;
        this.f520527h = i17;
        this.f520528i = i18;
        this.f520529m = str2;
        this.f520530n = jVar;
        this.f520531o = rVar;
        this.f520532p = h0Var;
        this.f520533q = h0Var2;
        this.f520534r = h70Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vp4.b(this.f520525f, this.f520526g, this.f520527h, this.f520528i, this.f520529m, this.f520530n, this.f520531o, this.f520532p, this.f520533q, this.f520534r, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vp4.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int i17;
        pz5.a aVar = pz5.a.f440719d;
        int i18 = this.f520524e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        int i19 = this.f520527h;
        java.lang.String workTagId = this.f520525f;
        if (i18 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoBackgroundRemuxChain", "dealBackgroundWork >> workTagId: " + workTagId + ", confirmEditTimeStamp: " + currentTimeMillis);
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = this.f520526g;
            android.os.Bundle bundle = c16993xacc19624.M;
            int i27 = bundle != null ? bundle.getInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", 0) : 0;
            dm.q0 q0Var = new dm.q0();
            q0Var.f68034xcf7ab2c4 = workTagId;
            q0Var.f68035xdb9e6ea3 = 4001;
            q0Var.f68033xdb968d56 = -1;
            q0Var.f68026x8cb5fc08 = c16993xacc19624.A;
            q0Var.f68019xae81df62 = c16993xacc19624.B;
            q0Var.f68017xa8a162e7 = c16993xacc19624.C;
            java.lang.String str = this.f520529m;
            if (str == null) {
                str = "";
            }
            q0Var.f68016x8aa77264 = str;
            ct0.b bVar = this.f520530n.f520570c;
            q0Var.f68010xdff75492 = bVar != null ? bVar.f303739c : false;
            st3.r rVar = this.f520531o;
            q0Var.f68011x651deb60 = rVar.f494115j;
            q0Var.f68014x600bb092 = c16993xacc19624.f237220y;
            q0Var.f68013xd84b7d96 = c16993xacc19624.f237221z;
            q0Var.f68000x58699be3 = i19;
            q0Var.f68027x3b56087e = rVar.f494111f;
            q0Var.f68006x87aed351 = rVar.f494107b;
            q0Var.f68007x36c1fe5c = rVar.f494106a;
            q0Var.f68008x7b9ff765 = rVar.f494108c;
            q0Var.f68004x89a5c636 = rVar.f494110e;
            q0Var.f68005xb932ff10 = rVar.f494118m;
            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = c16993xacc19624.f237209n;
            q0Var.f68031xbf7bbcd = c11120x15dce88d.f152735r;
            q0Var.f68032x1a4f4dc1 = c11120x15dce88d.f152734q;
            q0Var.f68001x3f4822c8 = (byte[]) this.f520532p.f391656d;
            q0Var.f68030xbe236004 = (byte[]) this.f520533q.f391656d;
            q0Var.f68003xca7c3d7 = currentTimeMillis;
            q0Var.f68012x5b8aa02d = 2;
            q0Var.f68029x52df5673 = i27;
            q0Var.f68009xebaf647 = (int) this.f520534r.f457432f;
            this.f520523d = i27;
            this.f520524e = 1;
            java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new zp4.d(q0Var, null), this);
            if (g17 != aVar) {
                g17 = f0Var;
            }
            if (g17 == aVar) {
                return aVar;
            }
            i17 = i27;
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i17 = this.f520523d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        aq4.a aVar2 = aq4.a.f94734a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workTagId, "workTagId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxBackgroundManager", "enqueueWork >> workTagId: ".concat(workTagId));
        a5.c0 c0Var = new a5.c0(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.p2340x67608bd.p2341x37c711.C18825x1657575c.class);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("KEY_EXPORT_TARGET_VIDEO_BITRATE", java.lang.Integer.valueOf(i19));
        hashMap.put("KEY_EXPORT_BACKGROUND_WORK_TAG_ID", workTagId);
        hashMap.put("KEY_EXPORT_ABA_FLAG", java.lang.Integer.valueOf(this.f520528i));
        hashMap.put("KEY_EXPORT_TEC_SCENE", java.lang.Integer.valueOf(i17));
        a5.m mVar = new a5.m(hashMap);
        a5.m.d(mVar);
        c0Var.f82963c.f379301e = mVar;
        ((java.util.HashSet) c0Var.f82964d).add(workTagId);
        a5.t0 a17 = c0Var.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "build(...)");
        b5.w.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).a((a5.d0) a17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FakeVideoTecReporter", "reportWorkEnqueue >> workTagId: ".concat(workTagId));
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6893x57fb842b c6893x57fb842b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6893x57fb842b();
        c6893x57fb842b.f142084d = 10;
        c6893x57fb842b.p(workTagId);
        c6893x57fb842b.k();
        return f0Var;
    }
}
