package wn4;

/* loaded from: classes11.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb f529087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f529088e;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb, java.lang.String str) {
        this.f529087d = c16114x800e8cdb;
        this.f529088e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c83.e.b(this.f529087d);
        try {
            try {
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(this.f529088e);
                java.lang.String l17 = c83.e.l(this.f529087d.f223949o);
                java.lang.String i17 = c83.e.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                java.lang.String o17 = r6Var.o();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                long c17 = c01.id.c();
                int b17 = w73.e.b(i17, o17, l17, this.f529087d.f223949o);
                long c18 = c01.id.c() - c17;
                wn4.x xVar = wn4.x.f529104a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "merge bs diff costTime:" + (c01.id.c() - c17) + ' ' + o17 + ' ' + l17 + " retCode:" + b17);
                ak0.z.b(new java.io.File(o17));
                if (b17 == 0) {
                    w73.f.l(206, b17, c18 / 1000, 2L, 1L);
                } else {
                    w73.f.l(205, b17, c18 / 1000, 2L, 1L);
                }
                if (b17 == 0) {
                    wn4.x xVar2 = wn4.x.f529104a;
                    java.lang.String newApkMd5 = this.f529087d.f223949o;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newApkMd5, "newApkMd5");
                    if (xVar2.c(newApkMd5)) {
                        ((ku5.t0) ku5.t0.f394148d).B(wn4.l.f529086d);
                    } else {
                        xVar2.j();
                        jx3.f.INSTANCE.mo68477x336bdfd8(1429L, 19L, 1L, false);
                    }
                } else {
                    wn4.x.f529104a.j();
                    jx3.f.INSTANCE.mo68477x336bdfd8(1429L, 18L, 1L, false);
                }
                c83.e.d(this.f529087d, b17);
            } catch (java.lang.Exception e17) {
                wn4.x xVar3 = wn4.x.f529104a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "onDownloadFinish e = %s", e17);
                c83.e.d(this.f529087d, -10002);
            }
            c83.e.u();
        } catch (java.lang.Throwable th6) {
            c83.e.d(this.f529087d, -101);
            c83.e.u();
            throw th6;
        }
    }
}
