package ec3;

/* loaded from: classes.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f332607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f332608e;

    public p(boolean z17, ec3.g1 g1Var) {
        this.f332607d = z17;
        this.f332608e = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2 viewOnFocusChangeListenerC22901x93fec4d2;
        com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2 viewOnFocusChangeListenerC22901x93fec4d22;
        boolean z17 = this.f332607d;
        ec3.g1 g1Var = this.f332608e;
        if (!z17) {
            android.view.View mo144222x4ff8c0f0 = g1Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ueg);
            if (mo144222x4ff8c0f0 == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo144222x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyNewPrepareUIRecommendUIC$doHidePlaceOrder$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyNewPrepareUIRecommendUIC$doHidePlaceOrder$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = g1Var.m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x19263085 : null;
        if (activityC16373x8a110f13 != null && (viewOnFocusChangeListenerC22901x93fec4d22 = activityC16373x8a110f13.f227818x) != null) {
            viewOnFocusChangeListenerC22901x93fec4d22.scrollTo(0, 0);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = g1Var.m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f132 = m158354x192630852 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x192630852 : null;
        if (activityC16373x8a110f132 == null || (viewOnFocusChangeListenerC22901x93fec4d2 = activityC16373x8a110f132.f227818x) == null) {
            return;
        }
        viewOnFocusChangeListenerC22901x93fec4d2.postDelayed(new ec3.o(g1Var), 150L);
    }
}
