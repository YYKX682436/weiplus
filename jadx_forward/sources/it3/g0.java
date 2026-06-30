package it3;

/* loaded from: classes10.dex */
public final class g0 implements ju3.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16987xd1ab3de1 f376096a;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16987xd1ab3de1 activityC16987xd1ab3de1) {
        this.f376096a = activityC16987xd1ab3de1;
    }

    @Override // ju3.y
    public void a(byte[] data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
    }

    @Override // ju3.y
    public void b(android.util.Size previewSize) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewSize, "previewSize");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraTestActivity", "onFirstFrameReady " + previewSize + ',');
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new it3.f0(this.f376096a, null), 3, null);
    }
}
