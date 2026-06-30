package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes10.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16293xe2a3baf2 f226374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4401x15ff5647 f226375e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f226376f;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16293xe2a3baf2 c16293xe2a3baf2, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4401x15ff5647 c4401x15ff5647, java.util.List list) {
        this.f226374d = c16293xe2a3baf2;
        this.f226375e = c4401x15ff5647;
        this.f226376f = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int m37174xd84262ca;
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16293xe2a3baf2 c16293xe2a3baf2 = this.f226374d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c16293xe2a3baf2.getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int t17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).t();
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4401x15ff5647 c4401x15ff5647 = this.f226375e;
        if (t17 < c4401x15ff5647.m37174xd84262ca() || c4401x15ff5647.m37174xd84262ca() <= 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = this.f226374d.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            m37174xd84262ca = (((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager2).x() > c4401x15ff5647.m37174xd84262ca() || c4401x15ff5647.m37174xd84262ca() >= this.f226376f.size() + (-1)) ? c4401x15ff5647.m37174xd84262ca() : c4401x15ff5647.m37174xd84262ca() + 1;
        } else {
            m37174xd84262ca = c4401x15ff5647.m37174xd84262ca() - 1;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(m37174xd84262ca));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c16293xe2a3baf2, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/impl/CustomIndoorPicker$bind$1$onIndoorLevelActivated$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        c16293xe2a3baf2.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c16293xe2a3baf2, "com/tencent/mm/plugin/location/ui/impl/CustomIndoorPicker$bind$1$onIndoorLevelActivated$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
