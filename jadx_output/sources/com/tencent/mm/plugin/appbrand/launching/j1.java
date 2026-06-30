package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class j1 implements com.tencent.mm.plugin.appbrand.launching.i3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f84681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84682e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareParams f84683f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f84684g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84685h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.m1 f84686i;

    public j1(com.tencent.mm.plugin.appbrand.launching.m1 m1Var, com.tencent.mm.ipcinvoker.r rVar, java.lang.String str, com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareParams appBrandPrepareTask$PrepareParams, int i17, java.lang.String str2) {
        this.f84686i = m1Var;
        this.f84681d = rVar;
        this.f84682e = str;
        this.f84683f = appBrandPrepareTask$PrepareParams;
        this.f84684g = i17;
        this.f84685h = str2;
    }

    public void C() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrepareTask", "notifyAppRestartOnLaunchRequestedLatestVersion, username[%s] appId[%s]", this.f84685h, this.f84682e);
        com.tencent.mm.plugin.appbrand.launching.o1 o1Var = com.tencent.mm.plugin.appbrand.launching.o1.EVENT_NOTIFY_APP_RESTART_ON_LAUNCH_REQUESTED;
        this.f84686i.getClass();
        com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult appBrandPrepareTask$PrepareResult = new com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult();
        appBrandPrepareTask$PrepareResult.f84385d = o1Var;
        this.f84681d.a(appBrandPrepareTask$PrepareResult);
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.y4
    public void E(int i17) {
        com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult appBrandPrepareTask$PrepareResult = new com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult();
        appBrandPrepareTask$PrepareResult.f84385d = com.tencent.mm.plugin.appbrand.launching.o1.EVENT_DATA_TRANSFER_STATS;
        appBrandPrepareTask$PrepareResult.f84391m = i17;
        this.f84681d.a(appBrandPrepareTask$PrepareResult);
    }

    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrepareTask", "notifyStartOtherAppOnMigrateRequested, username[%s] appId[%s] targetAppId[%s]", this.f84685h, this.f84682e, str);
        com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult appBrandPrepareTask$PrepareResult = new com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult();
        appBrandPrepareTask$PrepareResult.f84385d = com.tencent.mm.plugin.appbrand.launching.o1.EVENT_NOTIFY_START_MIGRATE_TARGET_APP;
        appBrandPrepareTask$PrepareResult.f84392n = str;
        this.f84681d.a(appBrandPrepareTask$PrepareResult);
    }

    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrepareTask", "onFallbackBackupWxaAttrsRequested, username[%s] appId[%s]", this.f84685h, this.f84682e);
        com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult appBrandPrepareTask$PrepareResult = new com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult();
        appBrandPrepareTask$PrepareResult.f84385d = com.tencent.mm.plugin.appbrand.launching.o1.EVENT_ON_LAUNCH_TIMEOUT_FALLBACK_BACKUP_WXAATTRS_RELOAD_REQUESTED;
        this.f84681d.a(appBrandPrepareTask$PrepareResult);
    }
}
