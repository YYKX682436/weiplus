package l45;

/* loaded from: classes10.dex */
public class f implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l45.n f397974a;

    public f(l45.n nVar) {
        this.f397974a = nVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        l45.n nVar = this.f397974a;
        android.view.View mo177318xd03217ea = nVar.f397993a.mo177318xd03217ea();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo177318xd03217ea, arrayList.toArray(), "com/tencent/mm/presenter/DrawingPresenter$5", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo177318xd03217ea.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(mo177318xd03217ea, "com/tencent/mm/presenter/DrawingPresenter$5", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        nVar.f397993a.mo177318xd03217ea().post(new java.lang.Runnable() { // from class: l45.f$$a
            @Override // java.lang.Runnable
            public final void run() {
                l45.n nVar2 = l45.f.this.f397974a;
                if (nVar2.f398016x.m() == dl.a.EMOJI_AND_TEXT) {
                    dl.y yVar = (dl.y) nVar2.f398016x;
                    android.view.View mo177318xd03217ea2 = nVar2.f397993a.mo177318xd03217ea();
                    yVar.f316688t.set(new android.graphics.Rect(mo177318xd03217ea2.getLeft() + 25, mo177318xd03217ea2.getTop() + 25, mo177318xd03217ea2.getLeft() + mo177318xd03217ea2.getWidth() + 25, mo177318xd03217ea2.getTop() + mo177318xd03217ea2.getHeight() + 25));
                }
            }
        });
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
