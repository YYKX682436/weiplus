package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29;

/* loaded from: classes7.dex */
public final class k0 {

    /* renamed from: n, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.k0 f169544n = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.k0(true, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.y.f169653a);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f169545a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.y f169546b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f169547c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f169548d;

    /* renamed from: e, reason: collision with root package name */
    public int f169549e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f169550f;

    /* renamed from: g, reason: collision with root package name */
    public int f169551g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f169552h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f169553i;

    /* renamed from: j, reason: collision with root package name */
    public int f169554j;

    /* renamed from: k, reason: collision with root package name */
    public int f169555k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f169556l;

    /* renamed from: m, reason: collision with root package name */
    public int f169557m;

    public k0(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.y yVar) {
        this.f169545a = z17;
        this.f169546b = yVar;
    }

    public void a(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.w wVar;
        this.f169553i = bVar.Y1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.y yVar = this.f169546b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.v o17 = yVar.o(bVar);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        this.f169556l = (o17 == null || (wVar = o17.f169649d) == null) ? null : wVar.f169650a;
        this.f169557m = yVar.c(this.f169553i) ? 1 : 0;
        if (this.f169545a) {
            return;
        }
        java.lang.String str2 = this.f169553i;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if ((str2 == null ? "" : str2).length() > 1024) {
            str2 = str2.substring(0, 1024);
        }
        this.f169553i = str2;
        java.lang.String str3 = this.f169556l;
        if ((str3 == null ? "" : str3).length() > 1024) {
            str3 = str3.substring(0, 1024);
        }
        this.f169556l = str3;
        r45.uc7 uc7Var = new r45.uc7();
        uc7Var.f468764d = 1;
        uc7Var.f468765e = this.f169547c;
        uc7Var.f468766f = this.f169553i;
        uc7Var.f468767g = 0;
        uc7Var.f468768h = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        uc7Var.f468769i = 1;
        uc7Var.f468770m = "";
        uc7Var.f468771n = this.f169555k;
        uc7Var.f468772o = this.f169548d;
        uc7Var.f468773p = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.q2.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        uc7Var.f468774q = this.f169549e;
        uc7Var.f468775r = this.f169554j;
        uc7Var.f468776s = this.f169550f;
        uc7Var.f468777t = this.f169556l;
        uc7Var.f468778u = this.f169551g;
        uc7Var.f468779v = this.f169552h;
        uc7Var.f468780w = this.f169557m;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.d3) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.c3.f169356a.mo152xb9724478()).b(uc7Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Report.kv_14004", "report " + m52416x9616526c());
    }

    /* renamed from: toString */
    public java.lang.String m52416x9616526c() {
        return "kv_14004{appId='" + this.f169547c + "', sessionId='" + this.f169548d + "', scene=" + this.f169549e + ", sceneNote='" + this.f169550f + "', preScene=" + this.f169551g + ", preSceneNote='" + this.f169552h + "', pagePath='" + this.f169553i + "', usedState=" + this.f169554j + ", appState=" + this.f169555k + ", referPagePath='" + this.f169556l + "', isEntrance=" + this.f169557m + '}';
    }
}
