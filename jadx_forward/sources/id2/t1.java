package id2;

/* loaded from: classes3.dex */
public final class t1 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f372334a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 f372335b;

    public t1(id2.v1 v1Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var) {
        this.f372334a = v1Var;
        this.f372335b = c0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0
    /* renamed from: onResult */
    public final void mo26363x57429edc(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3;
        id2.v1 v1Var = this.f372334a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v1Var.f372367d, "[OnResultListener] hasSetResult:" + z17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = this.f372335b;
        c0Var.B = null;
        c0Var.f293792t = null;
        c0Var.d();
        android.view.View view = (android.view.View) ((jz5.n) v1Var.f372377q).mo141623x754a37bb();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$showChooseTargetLevelDialog$2", "onResult", "(ZLjava/lang/Object;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$showChooseTargetLevelDialog$2", "onResult", "(ZLjava/lang/Object;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View S6 = v1Var.S6();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(S6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$showChooseTargetLevelDialog$2", "onResult", "(ZLjava/lang/Object;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        S6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(S6, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$showChooseTargetLevelDialog$2", "onResult", "(ZLjava/lang/Object;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (z17) {
            java.lang.Integer num = (java.lang.Integer) v1Var.U6().get(obj);
            int intValue = num != null ? num.intValue() : 0;
            java.util.Iterator it = v1Var.I.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                } else {
                    obj3 = it.next();
                    if (((r45.s64) obj3).m75939xb282bd08(0) == intValue) {
                        break;
                    }
                }
            }
            r45.s64 s64Var = (r45.s64) obj3;
            if ((s64Var != null ? s64Var.m75942xfb822ef2(1) : com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) - v1Var.F > v1Var.f372366J) {
                db5.t7.m(v1Var.m158354x19263085(), v1Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dif, ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).Zi(v1Var.f372366J)));
            } else {
                zl2.r4.f555483a.T2(3);
                v1Var.L = intValue;
                v1Var.W6(null);
                id2.v1.R6(v1Var, "showChooseTargetLevelDialog");
            }
        }
        v1Var.W6(null);
    }
}
