package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class p3 {

    /* renamed from: a, reason: collision with root package name */
    public final zy2.fa f105768a;

    public p3(zy2.fa redDotManager) {
        kotlin.jvm.internal.o.g(redDotManager, "redDotManager");
        this.f105768a = redDotManager;
    }

    public final boolean a() {
        boolean z17;
        boolean z18;
        android.view.View h17;
        android.app.Activity activity;
        android.widget.ListView listView;
        java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
        android.view.View view = null;
        android.widget.ListAdapter adapter = (k17 == null || (activity = (android.app.Activity) k17.get()) == null || (listView = (android.widget.ListView) activity.findViewById(android.R.id.list)) == null) ? null : listView.getAdapter();
        com.tencent.mm.ui.base.preference.h0 h0Var = adapter instanceof com.tencent.mm.ui.base.preference.h0 ? (com.tencent.mm.ui.base.preference.h0) adapter : null;
        com.tencent.mm.ui.base.preference.Preference h18 = h0Var != null ? h0Var.h("find_friends_by_finder") : null;
        com.tencent.mm.plugin.newtips.NormalIconNewTipPreference normalIconNewTipPreference = h18 instanceof com.tencent.mm.plugin.newtips.NormalIconNewTipPreference ? (com.tencent.mm.plugin.newtips.NormalIconNewTipPreference) h18 : null;
        if (normalIconNewTipPreference != null && (h17 = normalIconNewTipPreference.h()) != null) {
            view = h17.findViewById(android.R.id.widget_frame);
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        if (view != null && view.isShown()) {
            if (view != null && view.getGlobalVisibleRect(rect)) {
                if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                    z17 = true;
                } else {
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                    z17 = false;
                }
                if (z17 || z65.c.a()) {
                    z18 = true;
                } else {
                    kb2.b bVar = kb2.b.f306225a;
                    z18 = false;
                }
                if (z18) {
                    com.tencent.mars.xlog.Log.i("findEntranceVisible", "visibleRect=" + rect);
                }
                if (rect.width() > 0 && rect.height() > 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
