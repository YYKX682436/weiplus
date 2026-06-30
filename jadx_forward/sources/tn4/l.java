package tn4;

/* loaded from: classes11.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn4.m f502367d;

    public l(tn4.m mVar) {
        this.f502367d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.PluginUpdater", "checkMMDiffBoostInstall, have tinker update.");
        tn4.m mVar = this.f502367d;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.n1.d(mVar.f502369e, mVar.f502368d.f462202e, null, false);
        w73.f.k(mVar.f502368d.f462214t == 4 ? 129 : 130);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, mVar.f502368d.f462214t != 4 ? 130 : 129, 1L, false);
    }
}
