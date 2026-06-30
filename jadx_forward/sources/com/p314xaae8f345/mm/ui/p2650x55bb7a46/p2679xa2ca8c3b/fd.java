package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public class fd implements cn0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f285491a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 f285492b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yb5.d f285493c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285494d;

    public fd(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.hd hdVar, long j17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, java.lang.String str) {
        this.f285491a = j17;
        this.f285492b = g0Var;
        this.f285493c = dVar;
        this.f285494d = str;
    }

    @Override // cn0.a
    public void a(long j17, int i17) {
        if (this.f285491a == j17) {
            yb5.d dVar = this.f285493c;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var = this.f285492b;
            if (i17 == 1) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.kd kdVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.kd) g0Var;
                kdVar.f285858c.setText(dVar.g().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574416i43));
                android.view.View view = kdVar.f285859d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = kdVar.f285860e;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            com.p314xaae8f345.mm.ui.p2731xc84c5534.m0 m0Var = com.p314xaae8f345.mm.ui.p2731xc84c5534.m0.f291231a;
            java.lang.String chatName = this.f285494d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatName, "chatName");
            java.util.HashSet hashSet = com.p314xaae8f345.mm.ui.p2731xc84c5534.m0.f291232b;
            if (!hashSet.contains(java.lang.Long.valueOf(j17))) {
                hashSet.add(java.lang.Long.valueOf(j17));
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6638x4349a8d9 c6638x4349a8d9 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6638x4349a8d9();
                c6638x4349a8d9.f139911d = c6638x4349a8d9.b("ChatName", chatName, true);
                c6638x4349a8d9.f139913f = 1L;
                c6638x4349a8d9.f139914g = java.lang.System.currentTimeMillis();
                c6638x4349a8d9.f139915h = c6638x4349a8d9.b("LiveIDList", java.lang.String.valueOf(j17), true);
                boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_chat_room_live_card_flashing, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveExptConfig", "ChatRoomCardFlashingSwitch: " + fj6);
                c6638x4349a8d9.f139912e = fj6 ? 1L : 2L;
                c6638x4349a8d9.k();
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.kd kdVar2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.kd) g0Var;
            kdVar2.f285858c.setText(dVar.g().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574417i44));
            boolean fj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_chat_room_live_card_flashing, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveExptConfig", "ChatRoomCardFlashingSwitch: " + fj7);
            if (fj7) {
                android.view.View view3 = kdVar2.f285859d;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = kdVar2.f285860e;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            android.view.View view5 = kdVar2.f285859d;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = kdVar2.f285860e;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgShareLive$ChattingItemAppMsgShareLiveFrom$1", "onLiveStatusCallback", "(JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
