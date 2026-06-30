package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class p3 {

    /* renamed from: a, reason: collision with root package name */
    public final zy2.fa f187301a;

    public p3(zy2.fa redDotManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotManager, "redDotManager");
        this.f187301a = redDotManager;
    }

    public final boolean a() {
        boolean z17;
        boolean z18;
        android.view.View h17;
        android.app.Activity activity;
        android.widget.ListView listView;
        java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
        android.view.View view = null;
        android.widget.ListAdapter adapter = (k17 == null || (activity = (android.app.Activity) k17.get()) == null || (listView = (android.widget.ListView) activity.findViewById(android.R.id.list)) == null) ? null : listView.getAdapter();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = adapter instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) adapter : null;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h18 = h0Var != null ? h0Var.h("find_friends_by_finder") : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056 c16742x4f474056 = h18 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056) h18 : null;
        if (c16742x4f474056 != null && (h17 = c16742x4f474056.h()) != null) {
            view = h17.findViewById(android.R.id.widget_frame);
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        if (view != null && view.isShown()) {
            if (view != null && view.getGlobalVisibleRect(rect)) {
                if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
                    z17 = true;
                } else {
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    z17 = false;
                }
                if (z17 || z65.c.a()) {
                    z18 = true;
                } else {
                    kb2.b bVar = kb2.b.f387758a;
                    z18 = false;
                }
                if (z18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("findEntranceVisible", "visibleRect=" + rect);
                }
                if (rect.width() > 0 && rect.height() > 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
