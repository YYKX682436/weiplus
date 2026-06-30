package wn4;

/* loaded from: classes11.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb f529084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f529085e;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb, com.p314xaae8f345.mm.vfs.r6 r6Var) {
        this.f529084d = c16114x800e8cdb;
        this.f529085e = r6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb = this.f529084d;
        c16114x800e8cdb.f223956v = false;
        c83.e.b(c16114x800e8cdb);
        ((x73.g) x73.c.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f533974a).a(this.f529085e.o(), c16114x800e8cdb, false);
        java.lang.String str = c16114x800e8cdb.f223949o;
        wn4.x xVar = wn4.x.f529104a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "newApkMd5 = %s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.hp.p1778xc02f49a5.IntentServiceC16110x65c2df15.f223931e = new wn4.j(c16114x800e8cdb, str);
    }
}
