package ff1;

/* loaded from: classes15.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f343135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 f343136e;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 abstractC12277x3bbbdb47, android.view.Surface surface) {
        this.f343136e = abstractC12277x3bbbdb47;
        this.f343135d = surface;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 abstractC12277x3bbbdb47 = this.f343136e;
        android.view.Surface surface = this.f343135d;
        if (surface != null) {
            try {
                if (surface.isValid()) {
                    java.lang.Object[] objArr = {java.lang.Integer.valueOf(surface.hashCode())};
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47.Q;
                    abstractC12277x3bbbdb47.e("release surface [%d]", objArr);
                    surface.release();
                }
            } catch (java.lang.Exception e17) {
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47.Q;
                abstractC12277x3bbbdb47.f(e17, "release Surface error", new java.lang.Object[0]);
            }
        }
    }
}
