package aw2;

/* loaded from: classes10.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.c0 f14801d;

    public v(aw2.c0 c0Var) {
        this.f14801d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aw2.c0 c0Var = this.f14801d;
        c0Var.d().setVisibility(8);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        android.view.View decorView = c0Var.f14724d.getWindow().getDecorView();
        kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
        ((android.widget.FrameLayout) decorView).addView(c0Var.d(), layoutParams);
        com.tencent.mm.plugin.finder.view.FinderHighLightTopicEditView d17 = c0Var.d();
        aw2.t tVar = new aw2.t(c0Var);
        aw2.u uVar = new aw2.u(c0Var);
        d17.getClass();
        d17.f131131i = tVar;
        d17.f131132m = uVar;
    }
}
