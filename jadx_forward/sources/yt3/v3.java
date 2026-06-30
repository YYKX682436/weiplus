package yt3;

/* loaded from: classes10.dex */
public final class v3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt3.w3 f547234a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f547235b;

    public v3(yt3.w3 w3Var, ju3.d0 d0Var) {
        this.f547234a = w3Var;
        this.f547235b = d0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.u
    public void a() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_BOOLEAN", true);
        bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_SCROLL_BOOLEAN", false);
        bundle.putInt("PARAM_PREPARE_CAMERA_ZOOM_FACTOR_INT", 1);
        this.f547235b.w(ju3.c0.f383406e, bundle);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.u
    public void b() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_BOOLEAN", false);
        bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_SCROLL_BOOLEAN", false);
        bundle.putInt("PARAM_PREPARE_CAMERA_ZOOM_FACTOR_INT", 1);
        this.f547235b.w(ju3.c0.f383406e, bundle);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.u
    public void c(float f17, float f18) {
        android.os.Bundle bundle = new android.os.Bundle();
        yt3.w3 w3Var = this.f547234a;
        bundle.putInt("PARAM_WIDTH_INT", w3Var.f547243f.getWidth());
        bundle.putInt("PARAM_HEIGHT_INT", w3Var.f547243f.getHeight());
        bundle.putFloat("PARAM_POINT_X", f17);
        bundle.putFloat("PARAM_POINT_Y", f18);
        this.f547235b.w(ju3.c0.f383412h, bundle);
        w3Var.f547242e.a(f17, f18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.u
    public void d() {
        yt3.w3 w3Var = this.f547234a;
        long j17 = w3Var.f547244g;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (android.os.SystemClock.elapsedRealtime() - j17 < 1000) {
            return;
        }
        w3Var.f547244g = android.os.SystemClock.elapsedRealtime();
        ju3.d0.k(this.f547235b, ju3.c0.f383408f, null, 2, null);
    }
}
