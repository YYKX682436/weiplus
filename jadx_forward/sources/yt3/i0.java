package yt3;

/* loaded from: classes10.dex */
public final class i0 implements qk.p7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f547022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yt3.p0 f547023b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f547024c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f547025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f547026e;

    public i0(long j17, yt3.p0 p0Var, java.util.ArrayList arrayList, boolean z17, yz5.l lVar) {
        this.f547022a = j17;
        this.f547023b = p0Var;
        this.f547024c = arrayList;
        this.f547025d = z17;
        this.f547026e = lVar;
    }

    @Override // qk.p7
    public void a(android.graphics.Bitmap bitmap, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("photoEditor onSuccess: ");
        sb6.append(bitmap);
        sb6.append(" isNever：");
        sb6.append(z17);
        sb6.append("  cost:");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j17 = this.f547022a;
        sb6.append(elapsedRealtime - j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditPhotoPluginLayout", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 128L, android.os.SystemClock.elapsedRealtime() - j17, false);
        if (bitmap == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 126L, 1L, false);
        }
        if (bitmap != null) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new yt3.h0(bitmap, this.f547023b, this.f547022a, this.f547024c, this.f547025d, this.f547026e, null), 2, null);
        }
    }

    @Override // qk.p7
    /* renamed from: onError */
    public void mo9160xaf8aa769(java.lang.Exception e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditPhotoPluginLayout", "photoEditor onError: %s", e17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 125L, 1L, false);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 128L, android.os.SystemClock.elapsedRealtime() - this.f547022a, false);
        nu3.i.f421751a.h();
        this.f547023b.f547122q = false;
    }
}
