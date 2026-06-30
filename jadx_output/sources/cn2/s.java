package cn2;

/* loaded from: classes3.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.bulletcommet.LightStartFrameLayout f43611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f43612e;

    public s(com.tencent.mm.plugin.finder.live.widget.bulletcommet.LightStartFrameLayout lightStartFrameLayout, android.graphics.Bitmap bitmap) {
        this.f43611d = lightStartFrameLayout;
        this.f43612e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.widget.bulletcommet.LightStartFrameLayout lightStartFrameLayout = this.f43611d;
        lightStartFrameLayout.getClass();
        android.graphics.Bitmap bitmap = this.f43612e;
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        cn2.j1 j1Var = lightStartFrameLayout.f117922e;
        if (j1Var == null) {
            j1Var = new cn2.j1(lightStartFrameLayout);
        }
        lightStartFrameLayout.f117922e = j1Var;
        com.tencent.mars.xlog.Log.i(j1Var.f43547b, "play!");
        j1Var.f43549d = bitmap;
        if (j1Var.f43548c) {
            return;
        }
        j1Var.f43548c = true;
        android.view.View view = j1Var.f43546a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/bulletcommet/LightStarProxy", com.tencent.tav.core.AssetExtension.SCENE_PLAY, "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/LightStarProxy", com.tencent.tav.core.AssetExtension.SCENE_PLAY, "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        j1Var.f43546a.post(new cn2.g1(j1Var));
    }
}
