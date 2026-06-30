package com.tencent.mm.plugin.base.stub;

/* loaded from: classes9.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f93764a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f93765b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f93766c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.base.stub.j f93767d;

    public k(android.content.Context context, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.base.stub.j jVar) {
        this.f93764a = context;
        this.f93765b = str;
        this.f93766c = str2;
        this.f93767d = jVar;
    }

    public void a() {
        com.tencent.mm.plugin.base.stub.j jVar = this.f93767d;
        java.lang.String str = this.f93766c;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenIdChecker", "doCheck, openId is null");
            jVar.a(true);
            return;
        }
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        java.lang.String str2 = this.f93765b;
        com.tencent.mm.pluginsdk.model.app.m j17 = com.tencent.mm.pluginsdk.model.app.w.j(str2, false, false);
        if (j17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenIdChecker", "doCheck fail, local app is null, appId = " + str2);
            jVar.a(true);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(j17.field_openId)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenIdChecker", "doCheck fail, local openId is null, appId = " + str2);
            com.tencent.mm.pluginsdk.model.app.u5.Ui().b(str2);
            jVar.a(true);
            return;
        }
        if (str.equalsIgnoreCase(j17.field_openId)) {
            jVar.a(true);
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.OpenIdChecker", "doCheck fail, appId = " + str2 + ", openId = " + str + ", localOpenId = " + j17.field_openId);
        b();
    }

    public void b() {
        db5.e1.o(this.f93764a, com.tencent.mm.R.string.hfc, com.tencent.mm.R.string.f490573yv, false, new com.tencent.mm.plugin.base.stub.i(this));
    }
}
