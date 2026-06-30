package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29;

/* loaded from: classes7.dex */
public final class r0 {
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.r0 A = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.r0(true);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f169604a;

    /* renamed from: e, reason: collision with root package name */
    public int f169608e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f169609f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f169610g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f169611h;

    /* renamed from: i, reason: collision with root package name */
    public ze.n f169612i;

    /* renamed from: j, reason: collision with root package name */
    public int f169613j;

    /* renamed from: k, reason: collision with root package name */
    public int f169614k;

    /* renamed from: l, reason: collision with root package name */
    public int f169615l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f169616m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f169617n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f169618o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f169619p;

    /* renamed from: q, reason: collision with root package name */
    public int f169620q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f169621r;

    /* renamed from: s, reason: collision with root package name */
    public long f169622s;

    /* renamed from: t, reason: collision with root package name */
    public int f169623t;

    /* renamed from: u, reason: collision with root package name */
    public int f169624u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f169625v;

    /* renamed from: w, reason: collision with root package name */
    public int f169626w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f169627x;

    /* renamed from: y, reason: collision with root package name */
    public int f169628y;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f169605b = "";

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f169606c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f169607d = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f169629z = true;

    public r0(boolean z17) {
        this.f169604a = z17;
    }

    public void a(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar, boolean z17) {
        this.f169620q = z17 ? 1 : 7;
        java.lang.String str = (java.lang.String) this.f169606c.pollFirst();
        this.f169621r = str;
        this.f169619p = str;
        if (!z17) {
            this.f169621r = this.f169605b;
        }
        b(bVar);
    }

    public final void b(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.s s37 = bVar.s3();
        if (s37 == null) {
            return;
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052 E0 = bVar.t3().E0();
        if (E0 != null) {
            this.f169613j = E0.f387385r.f33456x1c82a56c;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 x17 = bVar.x();
        if (x17 != null) {
            this.f169623t = x17.i();
        }
        this.f169622s = java.lang.System.currentTimeMillis();
        java.lang.String m151234xb5887639 = ((of1.w1) s37).m151234xb5887639();
        if (m151234xb5887639 == null) {
            m151234xb5887639 = "";
        }
        this.f169617n = fp.s0.a(m151234xb5887639);
        this.f169616m = bVar.X1();
        this.f169627x = bVar.Y1();
        this.f169618o = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.q2.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        this.f169626w = this.f169629z ? 1 : 0;
        this.f169629z = false;
        ze.n t37 = bVar.t3();
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 u07 = t37 == null ? null : t37.u0();
        if (u07 != null) {
            this.f169628y = u07.f128817z;
        } else {
            int b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.w0.b(this.f169611h, -1);
            this.f169628y = b17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Report.kv_14992", "prepareCommonFields null = initConfig! apptype:%s", java.lang.Integer.valueOf(b17));
        }
        this.f169628y += 1000;
        if (this.f169604a) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Report.kv_14992", "report " + m52426x9616526c());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.q0 q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.q0(this, new java.lang.Object[]{java.lang.Integer.valueOf(this.f169608e), this.f169609f, this.f169610g, this.f169611h, java.lang.Integer.valueOf(this.f169613j), java.lang.Integer.valueOf(this.f169614k), java.lang.Integer.valueOf(this.f169615l), this.f169616m, this.f169617n, this.f169618o, this.f169619p, java.lang.Integer.valueOf(this.f169620q), this.f169621r, java.lang.Long.valueOf(this.f169622s), java.lang.Integer.valueOf(this.f169623t), java.lang.Integer.valueOf(this.f169624u), this.f169625v, java.lang.Integer.valueOf(this.f169626w), this.f169627x, java.lang.Integer.valueOf(this.f169628y)});
        if (this.f169607d) {
            q0Var.run();
        } else {
            java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s0.f172083a;
            ik1.h0.a().m77784x795fa299(q0Var);
        }
    }

    /* renamed from: toString */
    public java.lang.String m52426x9616526c() {
        return "kv_14992{scene=" + this.f169608e + ", sceneNote='" + this.f169609f + "', sessionId='" + this.f169610g + "', appId='" + this.f169611h + "', appVersion=" + this.f169613j + ", appState=" + this.f169614k + ", usedState=" + this.f169615l + ", pagePath='" + this.f169616m + "', currentUrl='" + this.f169617n + "', networkType='" + this.f169618o + "', referPagePath='" + this.f169619p + "', targetAction=" + this.f169620q + ", targetPagePath='" + this.f169621r + "', clickTimestamp=" + this.f169622s + ", publicLibVersion=" + this.f169623t + ", preScene=" + this.f169624u + ", preSceneNote='" + this.f169625v + "', isEntrance=" + this.f169626w + ", apptype=" + this.f169628y + '}';
    }
}
