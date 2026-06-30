package wn4;

/* loaded from: classes11.dex */
public final class n implements xv.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb f529089a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f529090b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f529091c;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb, long j17, com.p314xaae8f345.mm.vfs.r6 r6Var) {
        this.f529089a = c16114x800e8cdb;
        this.f529090b = j17;
        this.f529091c = r6Var;
    }

    @Override // xv.m0
    public void a(int i17) {
        if (i17 == 0) {
            new b83.e(lp0.a.f401782c, this.f529089a.f223952r).d(java.lang.System.currentTimeMillis() - this.f529090b);
            wn4.x xVar = wn4.x.f529104a;
            java.lang.String o17 = this.f529091c.o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
            xVar.a(o17, this.f529089a);
        } else {
            wn4.x xVar2 = wn4.x.f529104a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Updater.ManualUpdaterProcessor", "TCPFile Fail:" + i17);
        }
        wn4.x xVar3 = wn4.x.f529104a;
        ((ku5.t0) ku5.t0.f394148d).g(wn4.h.f529080d);
    }
}
