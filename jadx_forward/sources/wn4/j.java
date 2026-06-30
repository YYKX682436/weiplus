package wn4;

/* loaded from: classes11.dex */
public final class j implements x73.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb f529082a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f529083b;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb, java.lang.String str) {
        this.f529082a = c16114x800e8cdb;
        this.f529083b = str;
    }

    @Override // x73.i
    public final void a(x73.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.hp.p1778xc02f49a5.IntentServiceC16110x65c2df15.f223931e = null;
        int i17 = aVar.f533971e;
        c83.e.d(this.f529082a, i17);
        c83.e.u();
        c83.e.e();
        wn4.x xVar = wn4.x.f529104a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "HdiffApk merge finish, maunal retCode = " + i17);
        if (!aVar.f533970d) {
            wn4.x.f529104a.j();
            jx3.f.INSTANCE.mo68477x336bdfd8(1429L, 18L, 1L, false);
            return;
        }
        wn4.x xVar2 = wn4.x.f529104a;
        java.lang.String newApkMd5 = this.f529083b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newApkMd5, "$newApkMd5");
        if (!xVar2.c(newApkMd5)) {
            xVar2.j();
            jx3.f.INSTANCE.mo68477x336bdfd8(1429L, 19L, 1L, false);
            return;
        }
        w73.f.k(114);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 114L, 1L, false);
        ((ku5.t0) ku5.t0.f394148d).B(wn4.i.f529081d);
    }
}
