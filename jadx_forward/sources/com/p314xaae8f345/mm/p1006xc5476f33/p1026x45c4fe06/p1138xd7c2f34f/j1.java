package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public class j1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.i3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f166214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f166215e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12333xba065a6f f166216f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f166217g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f166218h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.m1 f166219i;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.m1 m1Var, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12333xba065a6f c12333xba065a6f, int i17, java.lang.String str2) {
        this.f166219i = m1Var;
        this.f166214d = rVar;
        this.f166215e = str;
        this.f166216f = c12333xba065a6f;
        this.f166217g = i17;
        this.f166218h = str2;
    }

    public void C() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPrepareTask", "notifyAppRestartOnLaunchRequestedLatestVersion, username[%s] appId[%s]", this.f166218h, this.f166215e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o1 o1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o1.EVENT_NOTIFY_APP_RESTART_ON_LAUNCH_REQUESTED;
        this.f166219i.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906 c12334xbda92906 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906();
        c12334xbda92906.f165918d = o1Var;
        this.f166214d.a(c12334xbda92906);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.y4
    public void E(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906 c12334xbda92906 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906();
        c12334xbda92906.f165918d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o1.EVENT_DATA_TRANSFER_STATS;
        c12334xbda92906.f165924m = i17;
        this.f166214d.a(c12334xbda92906);
    }

    public void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPrepareTask", "notifyStartOtherAppOnMigrateRequested, username[%s] appId[%s] targetAppId[%s]", this.f166218h, this.f166215e, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906 c12334xbda92906 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906();
        c12334xbda92906.f165918d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o1.EVENT_NOTIFY_START_MIGRATE_TARGET_APP;
        c12334xbda92906.f165925n = str;
        this.f166214d.a(c12334xbda92906);
    }

    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPrepareTask", "onFallbackBackupWxaAttrsRequested, username[%s] appId[%s]", this.f166218h, this.f166215e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906 c12334xbda92906 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906();
        c12334xbda92906.f165918d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o1.EVENT_ON_LAUNCH_TIMEOUT_FALLBACK_BACKUP_WXAATTRS_RELOAD_REQUESTED;
        this.f166214d.a(c12334xbda92906);
    }
}
