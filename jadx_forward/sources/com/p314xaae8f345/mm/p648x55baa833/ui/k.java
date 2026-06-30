package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 f145795d;

    public k(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5) {
        this.f145795d = activityC10332x8a1129f5;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5 = this.f145795d;
        if (activityC10332x8a1129f5.F == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatroomInfoUI", "[updateRoomPref] member == null");
            return;
        }
        activityC10332x8a1129f5.Q = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().D0(this.f145795d.A);
        qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
        java.lang.String str = this.f145795d.A;
        ((py.a) iVar).getClass();
        java.util.List m17 = c01.v1.m(str);
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        if (m17 != null) {
            linkedList.addAll(m17);
        }
        this.f145795d.C = linkedList.size();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        for (java.lang.String str2 : linkedList) {
            if (this.f145795d.F.G0(str2) || this.f145795d.F.L0(str2)) {
                linkedList2.add(str2);
            }
        }
        if (this.f145795d.C > r35.v1.L + 1) {
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
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p648x55baa833.ui.j(this, linkedList));
    }
}
