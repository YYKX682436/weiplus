package tb1;

/* loaded from: classes7.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f498457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tb1.s f498458e;

    public q(tb1.s sVar, java.lang.String str) {
        this.f498458e = sVar;
        this.f498457d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        try {
            str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t7.e(this.f498457d);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandCameraView", "stopRecord, remux failed, callback with origin videoexp = %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            str = null;
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            ik1.h0.b(new tb1.p(this, str));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "compressed file not exist");
            this.f498458e.i(-1, "compressed file not exist", null, null);
        }
    }
}
