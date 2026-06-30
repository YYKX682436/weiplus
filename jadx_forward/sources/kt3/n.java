package kt3;

/* loaded from: classes10.dex */
public final class n extends bi3.g implements di3.o, ei3.k, com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.h {

    /* renamed from: d, reason: collision with root package name */
    public kt3.l f393540d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f393541e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d f393542f;

    /* renamed from: i, reason: collision with root package name */
    public float f393545i;

    /* renamed from: m, reason: collision with root package name */
    public int f393546m;

    /* renamed from: p, reason: collision with root package name */
    public float[] f393549p;

    /* renamed from: q, reason: collision with root package name */
    public android.util.Size f393550q;

    /* renamed from: g, reason: collision with root package name */
    public long f393543g = -1;

    /* renamed from: h, reason: collision with root package name */
    public float f393544h = -1.0f;

    /* renamed from: n, reason: collision with root package name */
    public boolean f393547n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f393548o = true;

    @Override // di3.o
    public boolean a(byte[] bArr) {
        kt3.l lVar = this.f393540d;
        if (lVar != null) {
            return lVar.y(bArr);
        }
        return false;
    }

    public void b(float f17, float f18) {
        if (this.f393548o) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putFloat("PARAM_POINT_X", f17);
            bundle.putFloat("PARAM_POINT_Y", f18);
            kt3.l lVar = this.f393540d;
            if (lVar != null) {
                lVar.w(ju3.c0.f383412h, bundle);
            }
        }
    }

    public void c() {
        if (this.f393547n) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_BOOLEAN", false);
            bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_SCROLL_BOOLEAN", false);
            bundle.putInt("PARAM_PREPARE_CAMERA_ZOOM_FACTOR_INT", 1);
            kt3.l lVar = this.f393540d;
            if (lVar != null) {
                lVar.w(ju3.c0.f383406e, bundle);
            }
        }
    }

    public void d() {
        if (this.f393547n) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_BOOLEAN", true);
            bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_SCROLL_BOOLEAN", false);
            bundle.putInt("PARAM_PREPARE_CAMERA_ZOOM_FACTOR_INT", 1);
            kt3.l lVar = this.f393540d;
            if (lVar != null) {
                lVar.w(ju3.c0.f383406e, bundle);
            }
        }
    }

    @Override // ei3.k
    public void j(int i17) {
        kt3.l lVar = this.f393540d;
        if (lVar != null) {
            lVar.mo9066x6761d4f();
        }
    }
}
