package uj3;

/* loaded from: classes14.dex */
public final class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.y0 f509915d;

    public x0(uj3.y0 y0Var) {
        this.f509915d = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbIndexUI$applyTouchEvent$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        uj3.y0 y0Var = this.f509915d;
        if (y0Var.f509924h == y0Var.f509925i - 1) {
            yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbIndexUI$applyTouchEvent$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenProjectReportHelper", "markClickIconFlipPage");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1538L, 13L, 1L);
        y0Var.f509924h++;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(y0Var.f509924h + 1);
        sb6.append('/');
        sb6.append(y0Var.f509925i);
        y0Var.e(sb6.toString());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("thumb_flip_target_position", y0Var.f509924h);
        y0Var.f509917a.f(uj3.a.f509733n, bundle);
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbIndexUI$applyTouchEvent$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
