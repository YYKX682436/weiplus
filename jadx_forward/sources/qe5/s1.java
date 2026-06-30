package qe5;

/* loaded from: classes12.dex */
public final class s1 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.uic.p2675x2ff57c.C21859x7e56223 f443723a;

    public s1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.uic.p2675x2ff57c.C21859x7e56223 c21859x7e56223) {
        this.f443723a = c21859x7e56223;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.FilePreviewUIC", "Start liteApp preview failed");
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.FilePreviewUIC", "Start liteApp preview success");
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = this.f443723a.P6();
        if (P6 != null) {
            P6.finish();
        }
    }
}
