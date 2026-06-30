package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class b3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.j3 f205083d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.j3 j3Var) {
        super(0);
        this.f205083d = j3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.j3 j3Var = this.f205083d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileDraftUIC", "onFetchEnd : " + j3Var.O6().m56388xcaeb60d0().size());
        if (j3Var.O6().f189117h == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f6.f189391f) {
            j3Var.Q6();
        } else {
            android.view.View f294968x = j3Var.P6().getF294968x();
            if (f294968x != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(f294968x, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f294968x.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(f294968x, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById = f294968x.findViewById(com.p314xaae8f345.mm.R.id.ili);
                if (findViewById != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById2 = f294968x.findViewById(com.p314xaae8f345.mm.R.id.ilg);
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
