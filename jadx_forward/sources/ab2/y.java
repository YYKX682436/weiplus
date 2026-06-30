package ab2;

/* loaded from: classes2.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13680xb1b3046c f84332d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13680xb1b3046c c13680xb1b3046c) {
        super(1);
        this.f84332d = c13680xb1b3046c;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13680xb1b3046c c13680xb1b3046c = this.f84332d;
        if (intValue == -2) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13680xb1b3046c.M;
            android.view.View K0 = c13680xb1b3046c.K0();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(K0, arrayList.toArray(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$scrollToPositionAfterJustWatched$1", "invoke", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            K0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(K0, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$scrollToPositionAfterJustWatched$1", "invoke", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View L0 = c13680xb1b3046c.L0();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(L0, arrayList2.toArray(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$scrollToPositionAfterJustWatched$1", "invoke", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            L0.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(L0, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$scrollToPositionAfterJustWatched$1", "invoke", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (c13680xb1b3046c.L) {
            c13680xb1b3046c.G0(false);
            c13680xb1b3046c.f184294J = true;
            ab2.g gVar = c13680xb1b3046c.A;
            if (gVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56022x4905e9fa = gVar.m56022x4905e9fa();
            m56022x4905e9fa.postDelayed(new ab2.x(m56022x4905e9fa, intValue, (int) m56022x4905e9fa.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561182bo)), 200L);
        }
        return jz5.f0.f384359a;
    }
}
