package com.p314xaae8f345.mm.ui;

/* loaded from: classes5.dex */
public class ti implements zy2.za {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 f291436a;

    public ti(com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 activityC21437xf483c2) {
        this.f291436a = activityC21437xf483c2;
    }

    public void a(java.util.List list) {
        r45.vi2 vi2Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SingleChatInfoUI", "sessionInfos size :" + list.size());
        boolean isEmpty = list.isEmpty();
        com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 activityC21437xf483c2 = this.f291436a;
        if (!isEmpty) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                vi2Var = (r45.vi2) it.next();
                if (vi2Var.m75945x2fec8307(1).equals(activityC21437xf483c2.f278610n)) {
                    break;
                }
            }
        }
        vi2Var = null;
        if (vi2Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SingleChatInfoUI", "sessionId: " + vi2Var.m75945x2fec8307(1) + ", sessionReject: " + vi2Var.m75939xb282bd08(2));
            boolean z17 = vi2Var.m75939xb282bd08(2) == 1;
            boolean z18 = com.p314xaae8f345.mm.ui.ActivityC21437xf483c2.f278602x;
            activityC21437xf483c2.a7(z17);
        }
        activityC21437xf483c2.f278615s = null;
    }
}
