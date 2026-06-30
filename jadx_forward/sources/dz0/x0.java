package dz0;

/* loaded from: classes5.dex */
public final class x0 implements com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.SnapshotAndExportClipBundleCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f326590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326591b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f326592c;

    public x0(p3325xe03a0797.p3326xc267989b.q qVar, java.lang.String str, long j17) {
        this.f326590a = qVar;
        this.f326591b = str;
        this.f326592c = j17;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.SnapshotAndExportClipBundleCallback
    /* renamed from: onError */
    public void mo33486xaf8aa769(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f326590a.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new az0.p7(c4093x6b88526b))));
        az0.rc.i(this.f326591b, this.f326592c, c4093x6b88526b, false, 0, 24, null);
    }

    @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.SnapshotAndExportClipBundleCallback
    /* renamed from: onSuccess */
    public void mo33487xe05b4124(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.ClipBundleInfo clipBundleInfo) {
        r45.bm0 bm0Var;
        if (clipBundleInfo != null) {
            bm0Var = new r45.bm0();
            bm0Var.f452398d = clipBundleInfo.m33469xee060703();
            bm0Var.f452399e = clipBundleInfo.m33470x84a3840d();
            bm0Var.f452400f = clipBundleInfo.f15988x75fe787c;
            bm0Var.f452401g = clipBundleInfo.f15989x6ff47bc3;
        } else {
            bm0Var = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("snapshotAndExportClipBundle onSuccess: ");
        sb6.append(bm0Var != null ? az0.rc.j(az0.rc.c(bm0Var), 0) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasSdkUIC", sb6.toString());
        this.f326590a.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(bm0Var));
        az0.rc.i(this.f326591b, this.f326592c, null, false, 0, 28, null);
    }
}
