package ab2;

/* loaded from: classes2.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13680xb1b3046c f84321d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13680xb1b3046c c13680xb1b3046c) {
        super(2);
        this.f84321d = c13680xb1b3046c;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13680xb1b3046c c13680xb1b3046c = this.f84321d;
        ab2.a aVar = c13680xb1b3046c.f184300z;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        if (!aVar.y(intValue)) {
            ab2.a aVar2 = c13680xb1b3046c.f184300z;
            if (aVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
            if (!aVar2.y(intValue2)) {
                if (c13680xb1b3046c.J0().getVisibility() == 4 && !c13680xb1b3046c.f184294J) {
                    if (c13680xb1b3046c.H0().f184307m == 1) {
                        android.view.View J0 = c13680xb1b3046c.J0();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(J0, arrayList.toArray(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        J0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(J0, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View K0 = c13680xb1b3046c.K0();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(K0, arrayList2.toArray(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        K0.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(K0, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View L0 = c13680xb1b3046c.L0();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(L0, arrayList3.toArray(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        L0.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(L0, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment", "btnShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(c13680xb1b3046c.J0().getWidth(), 0.0f, 0.0f, 0.0f);
                        translateAnimation.setDuration(300L);
                        c13680xb1b3046c.J0().startAnimation(translateAnimation);
                        c13680xb1b3046c.N0("channel_profile_recentviewed", 0, 2);
                    }
                }
                return jz5.f0.f384359a;
            }
        }
        c13680xb1b3046c.G0(false);
        return jz5.f0.f384359a;
    }
}
