package ff1;

/* loaded from: classes15.dex */
public class i implements ye1.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f343150a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 f343151b;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 abstractC12277x3bbbdb47, java.lang.Runnable runnable) {
        this.f343151b = abstractC12277x3bbbdb47;
        this.f343150a = runnable;
    }

    public void a() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47.Q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 abstractC12277x3bbbdb47 = this.f343151b;
        abstractC12277x3bbbdb47.e("onDataSourceSet#openVideo", new java.lang.Object[0]);
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        android.os.Looper myLooper = android.os.Looper.myLooper();
        java.lang.Runnable runnable = this.f343150a;
        if (mainLooper == myLooper) {
            runnable.run();
        } else {
            abstractC12277x3bbbdb47.post(runnable);
        }
    }
}
