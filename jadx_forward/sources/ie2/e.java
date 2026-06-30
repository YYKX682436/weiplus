package ie2;

/* loaded from: classes13.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a f372518d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c14179xd6e3454a) {
        this.f372518d = c14179xd6e3454a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String m56776xb5886c64;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c14179xd6e3454a = this.f372518d;
        m56776xb5886c64 = c14179xd6e3454a.m56776xb5886c64();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56776xb5886c64, "target scene enter");
        c14179xd6e3454a.f193043i = 2;
        ie2.h sceneStateListener = c14179xd6e3454a.getSceneStateListener();
        if (sceneStateListener != null) {
            sceneStateListener.s(c14179xd6e3454a.f193041g);
        }
    }
}
