package du3;

/* loaded from: classes10.dex */
public final class s3 implements qk.p7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f325237a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ du3.t3 f325238b;

    public s3(yz5.l lVar, du3.t3 t3Var) {
        this.f325237a = lVar;
        this.f325238b = t3Var;
    }

    @Override // qk.p7
    public void a(android.graphics.Bitmap bitmap, boolean z17) {
        int min;
        du3.t3 t3Var = this.f325238b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = t3Var.f325257n;
        int i17 = c16993xacc19624 != null ? c16993xacc19624.f237204f : 1920;
        if (bitmap != null && i17 > 0 && (min = java.lang.Math.min(bitmap.getWidth(), bitmap.getHeight())) > i17) {
            float f17 = (i17 * 1.0f) / min;
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.F0(bitmap, f17, f17, true);
        }
        android.graphics.Bitmap.CompressFormat compressFormat = android.graphics.Bitmap.CompressFormat.JPEG;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196242 = t3Var.f325257n;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, compressFormat, c16993xacc196242 != null ? c16993xacc196242.E : null, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196243 = t3Var.f325257n;
        java.lang.String str = c16993xacc196243 != null ? c16993xacc196243.E : null;
        if (str == null) {
            str = "";
        }
        this.f325237a.mo146xb9724478(str);
    }

    @Override // qk.p7
    /* renamed from: onError */
    public void mo9160xaf8aa769(java.lang.Exception exc) {
        this.f325237a.mo146xb9724478("");
    }
}
