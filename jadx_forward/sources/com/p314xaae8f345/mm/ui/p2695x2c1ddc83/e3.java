package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.res.Configuration f289177d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 f289178e;

    public e3(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226, android.content.res.Configuration configuration) {
        this.f289178e = viewOnTouchListenerC22366xcd5c2226;
        this.f289177d = configuration;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = this.f289178e;
        android.content.res.Resources resources = viewOnTouchListenerC22366xcd5c2226.getResources();
        if (com.p314xaae8f345.mm.ui.bk.A() && (resources instanceof j65.j)) {
            ((j65.j) viewOnTouchListenerC22366xcd5c2226.getResources()).i(this.f289177d);
            int i17 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226.f288843x0;
            viewOnTouchListenerC22366xcd5c2226.i(true);
            viewOnTouchListenerC22366xcd5c2226.g();
        }
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            int color = viewOnTouchListenerC22366xcd5c2226.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560394j7);
            int color2 = viewOnTouchListenerC22366xcd5c2226.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.by);
            int i18 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226.f288843x0;
            viewOnTouchListenerC22366xcd5c2226.z(1.0f, color, color2);
        } else {
            int color3 = viewOnTouchListenerC22366xcd5c2226.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07);
            int color4 = viewOnTouchListenerC22366xcd5c2226.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560132bx);
            int i19 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226.f288843x0;
            viewOnTouchListenerC22366xcd5c2226.z(1.0f, color3, color4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.r rVar = viewOnTouchListenerC22366xcd5c2226.f288851m;
        if (rVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z) rVar;
            zVar.U = zVar.f254295d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s sVar = viewOnTouchListenerC22366xcd5c2226.f288850i;
        if (sVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3) sVar).h();
        }
        viewOnTouchListenerC22366xcd5c2226.setSelection(1);
        int childCount = viewOnTouchListenerC22366xcd5c2226.getChildCount();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "resetListAlpha first: %d, last: %d", 1, java.lang.Integer.valueOf(childCount));
        for (int i27 = 1; i27 <= childCount; i27++) {
            android.view.View childAt = viewOnTouchListenerC22366xcd5c2226.getChildAt(i27);
            if (childAt != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/ui/conversation/ConversationListView", "resetListAlpha", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                childAt.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(childAt, "com/tencent/mm/ui/conversation/ConversationListView", "resetListAlpha", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
    }
}
