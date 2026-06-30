package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64262d;

    public k(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI) {
        this.f64262d = chatroomInfoUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = this.f64262d;
        if (chatroomInfoUI.F == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatroomInfoUI", "[updateRoomPref] member == null");
            return;
        }
        chatroomInfoUI.Q = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().D0(this.f64262d.A);
        qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
        java.lang.String str = this.f64262d.A;
        ((py.a) iVar).getClass();
        java.util.List m17 = c01.v1.m(str);
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        if (m17 != null) {
            linkedList.addAll(m17);
        }
        this.f64262d.C = linkedList.size();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        for (java.lang.String str2 : linkedList) {
            if (this.f64262d.F.G0(str2) || this.f64262d.F.L0(str2)) {
                linkedList2.add(str2);
            }
        }
        if (this.f64262d.C > r35.v1.L + 1) {
            java.util.LinkedList linkedList3 = new java.util.LinkedList(linkedList.subList(0, r35.v1.L + 1));
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                if (!linkedList3.contains(str3)) {
                    linkedList3.add(0, str3);
                }
            }
            linkedList = linkedList3;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.chatroom.ui.j(this, linkedList));
    }
}
