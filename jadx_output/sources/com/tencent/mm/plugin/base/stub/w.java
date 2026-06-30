package com.tencent.mm.plugin.base.stub;

/* loaded from: classes7.dex */
public class w implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f93804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f93805e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f93806f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f93807g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f93808h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f93809i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f93810m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.database.MatrixCursor f93811n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f93812o;

    public w(int i17, java.lang.String str, int i18, java.lang.String str2, java.lang.String str3, int i19, boolean z17, android.database.MatrixCursor matrixCursor, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f93804d = i17;
        this.f93805e = str;
        this.f93806f = i18;
        this.f93807g = str2;
        this.f93808h = str3;
        this.f93809i = i19;
        this.f93810m = z17;
        this.f93811n = matrixCursor;
        this.f93812o = countDownLatch;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        int i19 = this.f93804d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "doMiniProgramTranslateLink, %d, %d, %s, cgiType=%d", valueOf, valueOf2, str, java.lang.Integer.valueOf(i19));
        if (i17 != 0 || i18 != 0) {
            com.tencent.mm.plugin.base.stub.e0.b(false, i19);
            return 0;
        }
        com.tencent.mm.plugin.base.stub.e0.b(true, i19);
        java.lang.String str2 = ((r45.zp6) oVar.f70711b.f70700a).f392284f;
        android.net.Uri parse = android.net.Uri.parse(str2);
        parse.getQueryParameter("appid");
        java.lang.String queryParameter = parse.getQueryParameter("userName");
        java.lang.String queryParameter2 = parse.getQueryParameter(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
        long E1 = com.tencent.mm.sdk.platformtools.t8.E1(parse.getQueryParameter("validTime"));
        java.lang.String str3 = this.f93805e;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(java.lang.String.format("%s_%d_%s_%s_%d", str3, java.lang.Integer.valueOf(this.f93806f), this.f93807g, this.f93808h, java.lang.Integer.valueOf(this.f93809i)));
            com.tencent.mm.plugin.base.stub.l lVar = new com.tencent.mm.plugin.base.stub.l();
            lVar.f93769b = java.lang.System.currentTimeMillis();
            lVar.f93768a = str2;
            if (E1 > 0) {
                lVar.f93770c = E1 * 1000;
            }
            ((java.util.HashMap) com.tencent.mm.plugin.base.stub.e0.f93731a).put(a17, lVar);
        }
        if (i19 != 1) {
            return 0;
        }
        ((rg1.h) ((sg1.f) i95.n0.c(sg1.f.class))).getClass();
        new rg1.n(queryParameter, queryParameter2).l();
        if (this.f93810m) {
            km5.q Bi = ((rg1.h) ((sg1.f) i95.n0.c(sg1.f.class))).Bi(queryParameter, queryParameter2, com.tencent.mm.plugin.appbrand.service.x6.f88830u);
            android.database.MatrixCursor matrixCursor = this.f93811n;
            java.util.concurrent.CountDownLatch countDownLatch = this.f93812o;
            ((km5.q) Bi.a(new com.tencent.mm.plugin.base.stub.z(matrixCursor, countDownLatch))).s(new com.tencent.mm.plugin.base.stub.y(countDownLatch));
        } else {
            ((rg1.h) ((sg1.f) i95.n0.c(sg1.f.class))).Di(queryParameter, new com.tencent.mm.plugin.base.stub.v(this));
        }
        return 0;
    }
}
