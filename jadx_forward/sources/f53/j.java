package f53;

/* loaded from: classes5.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f341192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.C15901xbfc4864 f341193e;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.C15901xbfc4864 c15901xbfc4864, java.util.List list) {
        this.f341193e = c15901xbfc4864;
        this.f341192d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List list = this.f341192d;
        int size = list.size();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.C15901xbfc4864 c15901xbfc4864 = this.f341193e;
        if (size > 0) {
            android.view.View findViewById = c15901xbfc4864.getRootView().findViewById(com.p314xaae8f345.mm.R.id.giq);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = c15901xbfc4864.getRootView().findViewById(com.p314xaae8f345.mm.R.id.f564813a61);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View findViewById3 = c15901xbfc4864.getRootView().findViewById(com.p314xaae8f345.mm.R.id.giq);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById4 = c15901xbfc4864.getRootView().findViewById(com.p314xaae8f345.mm.R.id.f564813a61);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        f53.m mVar = c15901xbfc4864.f221508h2;
        mVar.f341207d = list.size();
        java.util.LinkedList linkedList = (java.util.LinkedList) mVar.f341208e;
        linkedList.clear();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            linkedList.addAll(list);
        }
        mVar.m8146xced61ae5();
    }
}
