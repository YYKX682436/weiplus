package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class dn implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mn f199666d;

    public dn(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mn mnVar) {
        this.f199666d = mnVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveLinkInviteAnchorWidget", "onEditorAction actionId:" + i17 + ", keyEvent:" + keyEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mn mnVar = this.f199666d;
        java.lang.String str = mnVar.f200633x;
        if (!(str.length() > 0)) {
            str = null;
        }
        if (str != null && (3 == i17 || (keyEvent != null && keyEvent.getKeyCode() == 66))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveLinkInviteAnchorWidget", "loadSearchData query:" + mnVar.f200633x);
            mnVar.f200624o.setVisibility(8);
            android.view.View view = mnVar.f200625p;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget", "loadSearchData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget", "loadSearchData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mnVar.f200632w.clear();
            mnVar.f200634y = 0;
            mnVar.f200635z = null;
            mnVar.A = zl2.q4.f555466a.m();
            java.lang.String str2 = mnVar.f200633x;
            if (!(str2 == null || str2.length() == 0)) {
                i95.m c17 = i95.n0.c(c61.yb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                java.lang.String query = mnVar.f200633x;
                int i18 = mnVar.f200634y;
                java.lang.String requestId = mnVar.A;
                com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = mnVar.f200635z;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
                gm0.j1.d().g(new db2.y5(query, i18, requestId, gVar, 11, null, null, null, null, null, false, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.mc.f34455x366c91de, null));
                gm0.j1.d().a(3820, mnVar);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.t0(mnVar.f200623n);
        }
        return true;
    }
}
