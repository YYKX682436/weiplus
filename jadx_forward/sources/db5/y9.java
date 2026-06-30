package db5;

/* loaded from: classes13.dex */
public final class y9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21536x74125e7f f310122d;

    public y9(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21536x74125e7f c21536x74125e7f) {
        this.f310122d = c21536x74125e7f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int height = com.p314xaae8f345.mm.ui.p2642x2e06d1.C21536x74125e7f.f279264o - this.f310122d.getHeight();
        if (height > 0) {
            int i17 = height / 2;
            com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.INSTANCE.m42556xb328de9a(this.f310122d, 0, i17, 0, i17, true);
        }
    }
}
