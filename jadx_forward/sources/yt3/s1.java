package yt3;

/* loaded from: classes5.dex */
public final class s1 implements qk.p7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f547195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yt3.b2 f547196b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f547197c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f547198d;

    public s1(long j17, yt3.b2 b2Var, boolean z17, yz5.l lVar) {
        this.f547195a = j17;
        this.f547196b = b2Var;
        this.f547197c = z17;
        this.f547198d = lVar;
    }

    @Override // qk.p7
    public void a(android.graphics.Bitmap bitmap, boolean z17) {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("photoEditor onSuccess: ");
        sb6.append(bitmap);
        sb6.append(" isNever：");
        sb6.append(z17);
        sb6.append("  cost:");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j17 = this.f547195a;
        sb6.append(elapsedRealtime - j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditPhotoPluginLayout", sb6.toString());
        boolean z19 = this.f547197c;
        yt3.b2 b2Var = this.f547196b;
        if (z19) {
            str = (java.lang.String) ((jz5.n) b2Var.f546892h).mo141623x754a37bb();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = b2Var.f546894m;
            str = c16993xacc19624 != null ? c16993xacc19624.E : null;
        }
        java.lang.String str2 = str;
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(985L, 128L, elapsedRealtime2, false);
        if (bitmap == null) {
            g0Var.mo68477x336bdfd8(985L, 126L, 1L, false);
        }
        if (bitmap != null) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new yt3.r1(bitmap, str2, this.f547195a, this.f547196b, this.f547198d, null), 2, null);
        }
    }

    @Override // qk.p7
    /* renamed from: onError */
    public void mo9160xaf8aa769(java.lang.Exception e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditPhotoPluginLayout", "photoEditor onError: %s", e17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 125L, 1L, false);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 128L, android.os.SystemClock.elapsedRealtime() - this.f547195a, false);
        this.f547196b.f546900s = false;
    }
}
