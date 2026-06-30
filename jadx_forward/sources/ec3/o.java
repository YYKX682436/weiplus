package ec3;

/* loaded from: classes.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f332602d;

    public o(ec3.g1 g1Var) {
        this.f332602d = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View mo144222x4ff8c0f0 = this.f332602d.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ueg);
        if (mo144222x4ff8c0f0 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo144222x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyNewPrepareUIRecommendUIC$doHidePlaceOrder$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyNewPrepareUIRecommendUIC$doHidePlaceOrder$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
