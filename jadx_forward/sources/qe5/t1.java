package qe5;

/* loaded from: classes12.dex */
public final class t1 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.uic.p2675x2ff57c.C21859x7e56223 f443727a;

    public t1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.uic.p2675x2ff57c.C21859x7e56223 c21859x7e56223) {
        this.f443727a = c21859x7e56223;
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
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.uic.p2675x2ff57c.C21859x7e56223 c21859x7e56223 = this.f443727a;
        c21859x7e56223.f284284h = true;
        kd5.e Y6 = c21859x7e56223.Y6();
        if (Y6 != null) {
            Y6.L = c21859x7e56223.f284284h;
        }
    }
}
