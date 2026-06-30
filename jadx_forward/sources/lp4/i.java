package lp4;

/* loaded from: classes10.dex */
public final class i implements kp4.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lp4.p f401892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f401893b;

    public i(lp4.p pVar, ju3.d0 d0Var) {
        this.f401892a = pVar;
        this.f401893b = d0Var;
    }

    @Override // kp4.c0
    public void a(int i17, boolean z17, long j17, long j18) {
        lp4.p pVar = this.f401892a;
        android.view.View view = (android.view.View) ((jz5.n) pVar.f401929q).mo141623x754a37bb();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorCompositionEditPlugin$onCropCallback$1", "onTapUp", "(IZJJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorCompositionEditPlugin$onCropCallback$1", "onTapUp", "(IZJJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ju3.c0 c0Var = ju3.c0.f383413h2;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("EDIT_COMPOSITION_TRACK_INDEX", i17);
        bundle.putBoolean("EDIT_COMPOSITION_LEFT", z17);
        bundle.putLong("EDIT_VLOG_TRACK_CROP_START", j17);
        bundle.putLong("EDIT_VLOG_TRAKC_CROP_END", j18);
        this.f401893b.w(c0Var, bundle);
        pVar.C();
    }

    @Override // kp4.c0
    public void b(int i17, boolean z17, long j17, long j18) {
        lp4.p pVar = this.f401892a;
        android.view.View view = (android.view.View) ((jz5.n) pVar.f401929q).mo141623x754a37bb();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorCompositionEditPlugin$onCropCallback$1", "onTapDown", "(IZJJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorCompositionEditPlugin$onCropCallback$1", "onTapDown", "(IZJJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        bp4.c0 c0Var = pVar.f401936x;
        if (c0Var != null) {
            c0Var.mo10983x65825f6();
        }
        ju3.c0 c0Var2 = ju3.c0.f383413h2;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("EDIT_COMPOSITION_TRACK_INDEX", i17);
        bundle.putBoolean("EDIT_COMPOSITION_LEFT", z17);
        bundle.putLong("EDIT_VLOG_TRACK_CROP_START", j17);
        bundle.putLong("EDIT_VLOG_TRAKC_CROP_END", j18);
        this.f401893b.w(c0Var2, bundle);
    }

    @Override // kp4.c0
    public void c(int i17, boolean z17, long j17, long j18) {
        this.f401892a.C();
    }

    @Override // kp4.c0
    /* renamed from: pause */
    public void mo10991x65825f6() {
        bp4.c0 c0Var = this.f401892a.f401936x;
        if (c0Var != null) {
            c0Var.mo10983x65825f6();
        }
    }

    @Override // kp4.c0
    /* renamed from: seekTo */
    public void mo10992xc9fc1b13(long j17) {
        bp4.c0 c0Var = this.f401892a.f401936x;
        if (c0Var != null) {
            bp4.c0.m(c0Var, j17, null, 2, null);
        }
    }
}
