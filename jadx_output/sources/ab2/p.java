package ab2;

/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment f2788d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment finderBizProfileFragment) {
        super(2);
        this.f2788d = finderBizProfileFragment;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment finderBizProfileFragment = this.f2788d;
        ab2.a aVar = finderBizProfileFragment.f102767z;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        if (!aVar.y(intValue)) {
            ab2.a aVar2 = finderBizProfileFragment.f102767z;
            if (aVar2 == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            if (!aVar2.y(intValue2)) {
                if (finderBizProfileFragment.J0().getVisibility() == 4 && !finderBizProfileFragment.f102761J) {
                    if (finderBizProfileFragment.H0().f102774m == 1) {
                        android.view.View J0 = finderBizProfileFragment.J0();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(J0, arrayList.toArray(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        J0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(J0, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View K0 = finderBizProfileFragment.K0();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(K0, arrayList2.toArray(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        K0.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(K0, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View L0 = finderBizProfileFragment.L0();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(L0, arrayList3.toArray(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        L0.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(L0, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(finderBizProfileFragment.J0().getWidth(), 0.0f, 0.0f, 0.0f);
                        translateAnimation.setDuration(300L);
                        finderBizProfileFragment.J0().startAnimation(translateAnimation);
                        finderBizProfileFragment.N0("channel_profile_recentviewed", 0, 2);
                    }
                }
                return jz5.f0.f302826a;
            }
        }
        finderBizProfileFragment.G0(false);
        return jz5.f0.f302826a;
    }
}
