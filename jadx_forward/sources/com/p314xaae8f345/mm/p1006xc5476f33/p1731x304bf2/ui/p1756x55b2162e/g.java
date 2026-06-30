package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes8.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.h f222803d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.h hVar) {
        this.f222803d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view;
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC15995xdf941836 activityC15995xdf941836 = this.f222803d.f222806d;
        int i17 = activityC15995xdf941836.f222636s;
        int i18 = activityC15995xdf941836.f222638u;
        int i19 = activityC15995xdf941836.f222637t;
        boolean z17 = activityC15995xdf941836.f222639v;
        activityC15995xdf941836.getClass();
        rk0.c.c("MicroMsg.ChatRoomTabUI", "get chat unread count: %d,  notifyUnreadCount:%d, hasChatRoomUnreadMsg:%b", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17));
        oa.i k17 = activityC15995xdf941836.f222631n.m64774x76883ff5().k(0);
        if (k17 != null && (view2 = k17.f425316f) != null) {
            android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.nvo);
            android.view.View findViewById = k17.f425316f.findViewById(com.p314xaae8f345.mm.R.id.nvn);
            if (i17 > 0) {
                if (k17.a()) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().X1(1);
                    if (i19 > 0) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/chat_tab/ChatRoomTabUI", "resetUnreadMsg", "(IIIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/plugin/game/ui/chat_tab/ChatRoomTabUI", "resetUnreadMsg", "(IIIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        textView.setVisibility(8);
                        activityC15995xdf941836.f222633p.m0();
                    } else {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/chat_tab/ChatRoomTabUI", "resetUnreadMsg", "(IIIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/plugin/game/ui/chat_tab/ChatRoomTabUI", "resetUnreadMsg", "(IIIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        textView.setVisibility(8);
                    }
                } else {
                    textView.setText(java.lang.String.valueOf(i17));
                    textView.setVisibility(0);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/game/ui/chat_tab/ChatRoomTabUI", "resetUnreadMsg", "(IIIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/game/ui/chat_tab/ChatRoomTabUI", "resetUnreadMsg", "(IIIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (i19 > 0) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/game/ui/chat_tab/ChatRoomTabUI", "resetUnreadMsg", "(IIIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/game/ui/chat_tab/ChatRoomTabUI", "resetUnreadMsg", "(IIIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setVisibility(8);
                activityC15995xdf941836.f222633p.m0();
            } else {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById, arrayList5.toArray(), "com/tencent/mm/plugin/game/ui/chat_tab/ChatRoomTabUI", "resetUnreadMsg", "(IIIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/game/ui/chat_tab/ChatRoomTabUI", "resetUnreadMsg", "(IIIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setVisibility(8);
            }
        }
        oa.i k18 = activityC15995xdf941836.f222631n.m64774x76883ff5().k(1);
        if (k18 == null || (view = k18.f425316f) == null) {
            return;
        }
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.nvo);
        android.view.View findViewById2 = k18.f425316f.findViewById(com.p314xaae8f345.mm.R.id.nvn);
        if (i18 > 0) {
            if (i18 > 99) {
                textView2.setText("99+");
            } else {
                textView2.setText(java.lang.String.valueOf(i18));
            }
            textView2.setVisibility(0);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById2, arrayList6.toArray(), "com/tencent/mm/plugin/game/ui/chat_tab/ChatRoomTabUI", "resetUnreadMsg", "(IIIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/game/ui/chat_tab/ChatRoomTabUI", "resetUnreadMsg", "(IIIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (z17) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(findViewById2, arrayList7.toArray(), "com/tencent/mm/plugin/game/ui/chat_tab/ChatRoomTabUI", "resetUnreadMsg", "(IIIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/game/ui/chat_tab/ChatRoomTabUI", "resetUnreadMsg", "(IIIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setVisibility(8);
            return;
        }
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal8 = zj0.c.f554818a;
        arrayList8.add(8);
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(findViewById2, arrayList8.toArray(), "com/tencent/mm/plugin/game/ui/chat_tab/ChatRoomTabUI", "resetUnreadMsg", "(IIIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/game/ui/chat_tab/ChatRoomTabUI", "resetUnreadMsg", "(IIIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView2.setVisibility(8);
    }
}
