package bp4;

/* loaded from: classes10.dex */
public final class i implements kp4.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bp4.n f23192a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f23193b;

    public i(bp4.n nVar, ju3.d0 d0Var) {
        this.f23192a = nVar;
        this.f23193b = d0Var;
    }

    @Override // kp4.c0
    public void a(int i17, boolean z17, long j17, long j18) {
        bp4.n nVar = this.f23192a;
        android.view.View view = (android.view.View) ((jz5.n) nVar.f23280p).getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/CompositionEditPlugin$onCropCallback$1", "onTapUp", "(IZJJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/CompositionEditPlugin$onCropCallback$1", "onTapUp", "(IZJJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ju3.c0 c0Var = ju3.c0.f301882i2;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("EDIT_COMPOSITION_TRACK_INDEX", i17);
        bundle.putBoolean("EDIT_COMPOSITION_LEFT", z17);
        bundle.putLong("EDIT_VLOG_TRACK_CROP_START", j17);
        bundle.putLong("EDIT_VLOG_TRAKC_CROP_END", j18);
        this.f23193b.w(c0Var, bundle);
        nVar.E();
    }

    @Override // kp4.c0
    public void b(int i17, boolean z17, long j17, long j18) {
        bp4.n nVar = this.f23192a;
        android.view.View view = (android.view.View) ((jz5.n) nVar.f23280p).getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/CompositionEditPlugin$onCropCallback$1", "onTapDown", "(IZJJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/CompositionEditPlugin$onCropCallback$1", "onTapDown", "(IZJJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        bp4.c0 c0Var = nVar.f23286v;
        if (c0Var != null) {
            c0Var.pause();
        }
        ju3.c0 c0Var2 = ju3.c0.f301880h2;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("EDIT_COMPOSITION_TRACK_INDEX", i17);
        bundle.putBoolean("EDIT_COMPOSITION_LEFT", z17);
        bundle.putLong("EDIT_VLOG_TRACK_CROP_START", j17);
        bundle.putLong("EDIT_VLOG_TRAKC_CROP_END", j18);
        this.f23193b.w(c0Var2, bundle);
    }

    @Override // kp4.c0
    public void c(int i17, boolean z17, long j17, long j18) {
        this.f23192a.E();
    }

    @Override // kp4.c0
    public void pause() {
        bp4.c0 c0Var = this.f23192a.f23286v;
        if (c0Var != null) {
            c0Var.pause();
        }
    }

    @Override // kp4.c0
    public void seekTo(long j17) {
        bp4.c0 c0Var = this.f23192a.f23286v;
        if (c0Var != null) {
            bp4.c0.m(c0Var, j17, null, 2, null);
        }
    }
}
