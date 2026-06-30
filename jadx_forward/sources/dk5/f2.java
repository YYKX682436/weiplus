package dk5;

/* loaded from: classes9.dex */
public class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk5.h2 f316150e;

    public f2(java.lang.String str, dk5.h2 h2Var) {
        this.f316149d = str;
        this.f316150e = h2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f316149d;
        long k17 = com.p314xaae8f345.mm.vfs.w6.k(str);
        dk5.h2 h2Var = this.f316150e;
        if (k17 > 1048576) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.MusicVideoShareUtil", "img size is too large");
            if (h2Var != null) {
                h2Var.a(null, true);
                return;
            }
            return;
        }
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(str, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.MusicVideoShareUtil", "handleCDNUpload imgPath: %s", i17);
        dn.m mVar = new dn.m();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String b17 = com.p314xaae8f345.mm.p947xba6de98f.i2.b("musicvideoimage", currentTimeMillis, c01.z1.g().d1(), java.lang.String.valueOf(currentTimeMillis));
        mVar.f323318d = "task_AiScanImagetUploadTask";
        mVar.f69601xaca5bdda = b17;
        mVar.f69595x6d25b0d9 = i17;
        mVar.f69580x454032b6 = 202;
        mVar.f69592xf1ebe47b = 20304;
        mVar.f69609xd84b8349 = 2;
        mVar.f69606xccdbf540 = false;
        mVar.f69605xa1af661e = true;
        mVar.f69597x853bb235 = false;
        mVar.f69584x89a4c0cf = 2;
        mVar.f323320f = new dk5.g2(h2Var);
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.MusicVideoShareUtil", "hy: cdntra addSendTask failed. clientid:%s", b17);
    }
}
