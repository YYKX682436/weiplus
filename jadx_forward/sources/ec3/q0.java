package ec3;

/* loaded from: classes.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f332613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f332614e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f332615f;

    public q0(ec3.g1 g1Var, int i17, int i18) {
        this.f332613d = g1Var;
        this.f332614e = i17;
        this.f332615f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup.LayoutParams layoutParams;
        ec3.g1 g1Var = this.f332613d;
        android.view.View mo144222x4ff8c0f0 = g1Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ueg);
        if (mo144222x4ff8c0f0 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo144222x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyNewPrepareUIRecommendUIC$onKeyboardHeightChanged$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyNewPrepareUIRecommendUIC$onKeyboardHeightChanged$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View mo144222x4ff8c0f02 = g1Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ueg);
        if (mo144222x4ff8c0f02 != null && (layoutParams = mo144222x4ff8c0f02.getLayoutParams()) != null) {
            layoutParams.height = this.f332614e;
        }
        android.view.View mo144222x4ff8c0f03 = g1Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ueg);
        if (mo144222x4ff8c0f03 != null) {
            mo144222x4ff8c0f03.postDelayed(new ec3.p0(g1Var, this.f332615f), 50L);
        }
    }
}
