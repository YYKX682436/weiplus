package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1635x8725aced;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/shortcuts/FinderShortcutReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.shortcuts.FinderShortcutReceiver */
/* loaded from: classes8.dex */
public final class C14987xccb3e0bb extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        android.content.Context context2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderShortcutReceiver", "onReceive: " + intent);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v1 v1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v1.f184144a;
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v1.f184146c;
        if (weakReference == null || (context2 = (android.app.Activity) weakReference.get()) == null) {
            i95.m c17 = i95.n0.c(zy2.c9.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            java.util.Set enterFinderActivity = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) ((zy2.c9) c17)).f207666s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(enterFinderActivity, "enterFinderActivity");
            context2 = (android.app.Activity) kz5.n0.j0(enterFinderActivity);
        }
        if (context2 == null) {
            context2 = v1Var.b();
        }
        i95.m c18 = i95.n0.c(au2.q.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        ((au2.q) c18).Ai(context2);
        i95.m c19 = i95.n0.c(au2.q.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
        java.lang.Long l17 = ((au2.q) c19).f95622g;
        if (l17 != null) {
            java.util.Map a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a.a(context2, kz5.b1.e(new jz5.l("click_timestamp", java.lang.Long.valueOf(l17.longValue()))));
            i95.m c27 = i95.n0.c(dy1.r.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
            ((cy1.a) ((dy1.r) c27)).yj("finder_quick_add_suc", null, a17, 1, true);
        }
    }
}
