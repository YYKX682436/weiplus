package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes5.dex */
public final class m8 {

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.i8 f232834c = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.i8(null);

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f232835a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f232836b = new java.util.HashMap();

    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.m8 a(android.view.View view) {
        this.f232835a = view;
        this.f232836b.clear();
        return this;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.m8 b(java.util.Set ids) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ids, "ids");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VisibleRecord", "gone: ");
        java.util.Iterator it = ids.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            android.view.View view = this.f232835a;
            android.view.View findViewById = view != null ? view.findViewById(intValue) : null;
            if (findViewById != null) {
                int visibility = findViewById.getVisibility();
                boolean z17 = visibility != 8;
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.j8 j8Var = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.j8(intValue, visibility, findViewById.getAlpha(), 8, 0.0f, z17);
                this.f232836b.put(java.lang.Integer.valueOf(intValue), j8Var);
                if (z17) {
                    findViewById.animate().cancel();
                    findViewById.animate().alpha(0.0f).setDuration(150L).withEndAction(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.k8(findViewById, j8Var)).start();
                }
            }
        }
        return this;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.m8 c(java.util.Set ids) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ids, "ids");
        java.util.Iterator it = ids.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            android.view.View view = this.f232835a;
            android.view.View findViewById = view != null ? view.findViewById(intValue) : null;
            if (findViewById != null) {
                int visibility = findViewById.getVisibility();
                boolean z17 = visibility != 0;
                this.f232836b.put(java.lang.Integer.valueOf(intValue), new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.j8(intValue, visibility, findViewById.getAlpha(), 0, 1.0f, z17));
                if (z17) {
                    findViewById.animate().cancel();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/VisibleRecord", "visible", "(Ljava/util/Set;)Lcom/tencent/mm/plugin/mv/ui/uic/VisibleRecord;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/mv/ui/uic/VisibleRecord", "visible", "(Ljava/util/Set;)Lcom/tencent/mm/plugin/mv/ui/uic/VisibleRecord;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.animate().alpha(1.0f).setDuration(150L).start();
                }
            }
        }
        return this;
    }
}
