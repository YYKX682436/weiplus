package gl5;

/* loaded from: classes5.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gl5.d1 f354664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gl5.g0 f354665e;

    public z0(gl5.d1 d1Var, gl5.g0 g0Var) {
        this.f354664d = d1Var;
        this.f354665e = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        gl5.d1 d1Var = this.f354664d;
        d1Var.f354458b.l().getLocationOnScreen(iArr);
        int left = d1Var.c().getLeft();
        int top = d1Var.c().getTop();
        gl5.g0 g0Var = this.f354665e;
        int i17 = g0Var.f354532a + left;
        int i18 = g0Var.f354533b + top;
        int[] iArr2 = g0Var.f354534c;
        int i19 = iArr2[0] - iArr[0];
        int i27 = iArr2[1] - iArr[1];
        int intValue = ((java.lang.Number) ((jz5.n) d1Var.f354465i).mo141623x754a37bb()).intValue();
        int h17 = i65.a.h(d1Var.f354457a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        d1Var.d().setTranslationX(i19);
        d1Var.d().setTranslationY(i27);
        android.view.ViewPropertyAnimator translationY = d1Var.d().animate().translationX(0.0f).translationY(0.0f);
        translationY.setInterpolator(ta5.h.f498412a.a());
        translationY.setDuration(300L);
        translationY.start();
        android.view.View e17 = d1Var.e();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(e17, arrayList.toArray(), "com/tencent/mm/ui/widget/cedit/edit/FullScreenEditHelperHalfScreen", "animOpen", "(Lcom/tencent/mm/ui/widget/cedit/edit/FullScreenEditHelperHalfScreen$AnimViewParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        e17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(e17, "com/tencent/mm/ui/widget/cedit/edit/FullScreenEditHelperHalfScreen", "animOpen", "(Lcom/tencent/mm/ui/widget/cedit/edit/FullScreenEditHelperHalfScreen$AnimViewParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        translationY.setUpdateListener(new gl5.l0(d1Var, left, top, i17, i18, intValue, h17, 0.0f, 0.5f));
        translationY.setListener(new gl5.m0(translationY, d1Var));
    }
}
