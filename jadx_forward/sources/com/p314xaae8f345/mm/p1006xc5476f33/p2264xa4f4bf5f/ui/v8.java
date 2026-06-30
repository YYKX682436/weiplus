package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class v8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f255899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c f255900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f255901f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 f255902g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c activityC0053x3d3f670c, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f255900e = activityC0053x3d3f670c;
        this.f255901f = c16993xacc19624;
        this.f255902g = activityC18639xf6f98078;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.v8(this.f255900e, this.f255901f, this.f255902g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.v8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f255899d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            qc0.c1 c1Var = (qc0.c1) i95.n0.c(qc0.c1.class);
            this.f255899d = 1;
            obj = ((pc0.e2) c1Var).wi(this.f255900e, this.f255901f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        qc0.m1 m1Var = (qc0.m1) obj;
        if (m1Var.f442944b == -1 && m1Var.f442945c == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078 = this.f255902g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 c16994x3ba8255 = m1Var.f442948f;
            if (c16994x3ba8255 != null) {
                nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC18639xf6f98078.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                pj4.h2 h2Var = (pj4.h2) ((md0.e) eVar).Ui(mo55332x76847179, 8, pj4.h2.class);
                if (h2Var != null) {
                    java.lang.Object b17 = c16994x3ba8255.b("KEY_ORIGIN_MEDIA_DURATION_MS_LONG", new java.lang.Long(0L));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getReportValue(...)");
                    h2Var.f436623o = ((java.lang.Number) b17).longValue();
                    h2Var.f436628r = ((java.lang.Number) c16994x3ba8255.b("KEY_MEDIA_SOURCE_INT", new java.lang.Integer(0))).intValue() + 1;
                }
            }
            qc0.l1 a17 = m1Var.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.d8 d8Var = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078.f255099u2;
            activityC18639xf6f98078.getClass();
            if (a17 != null) {
                boolean b18 = a17.b();
                java.lang.String str = a17.f442930c;
                java.lang.String str2 = a17.f442929b;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusEditActivity", "[handleCaptureResult]isVideo:%s,thumbPath:%s,filePath:%s", java.lang.Boolean.valueOf(a17.b()), b18 ? str : str2, str2);
                activityC18639xf6f98078.V6();
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.g8 d76 = activityC18639xf6f98078.d7();
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC18639xf6f98078.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471792, "getContext(...)");
                d76.b();
                wi4.e.b(d76.f255432a);
                d76.f255437f = false;
                if (a17.b()) {
                    d76.f255435d = 2;
                    d76.f255433b = str2;
                    d76.f255434c = str;
                    d76.f255438g = a17.f442931d;
                } else {
                    d76.f255435d = 1;
                    d76.f255433b = str2;
                    d76.f255436e = true;
                }
                long k17 = com.p314xaae8f345.mm.vfs.w6.k(d76.f255433b);
                d76.f255441j = k17;
                d76.f255439h = k17;
                d76.f255440i = kk.k.e(d76.f255433b);
                d76.a(mo55332x768471792);
                activityC18639xf6f98078.t7(str2, a17.b() ? 2 : 1);
                activityC18639xf6f98078.Q7();
                activityC18639xf6f98078.V7();
                activityC18639xf6f98078.R7();
                ((yj4.d) pf5.z.f435481a.a(activityC18639xf6f98078).a(yj4.d.class)).f544228h = true;
            }
        }
        return jz5.f0.f384359a;
    }
}
