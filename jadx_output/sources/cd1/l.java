package cd1;

/* loaded from: classes15.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cd1.m f40636d;

    public l(cd1.m mVar) {
        this.f40636d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        cd1.m mVar = this.f40636d;
        com.tencent.mars.xlog.Log.i("MicroMsg.HCEServiceMgr", "HCEService timer check, timeLimit: %d, hasCommandNotResponded: %b", java.lang.Integer.valueOf(mVar.f40637a.f40644c), java.lang.Boolean.valueOf(mVar.f40637a.f40646e));
        cd1.o oVar = mVar.f40637a;
        oVar.f40648g = true;
        cd1.o.a(oVar, cd1.o.f40639l, true, oVar.f40652k);
    }
}
