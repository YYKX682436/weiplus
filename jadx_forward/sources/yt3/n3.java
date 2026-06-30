package yt3;

/* loaded from: classes10.dex */
public final class n3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt3.r3 f547082a;

    public n3(yt3.r3 r3Var) {
        this.f547082a = r3Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.i0
    public void a(int i17) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_BOOLEAN", true);
        bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_SCROLL_BOOLEAN", true);
        bundle.putInt("PARAM_PREPARE_CAMERA_ZOOM_FACTOR_INT", i17);
        this.f547082a.f547160e.w(ju3.c0.f383406e, bundle);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.i0
    public void b(int i17) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_BOOLEAN", false);
        bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_SCROLL_BOOLEAN", true);
        bundle.putInt("PARAM_PREPARE_CAMERA_ZOOM_FACTOR_INT", i17);
        this.f547082a.f547160e.w(ju3.c0.f383406e, bundle);
    }
}
