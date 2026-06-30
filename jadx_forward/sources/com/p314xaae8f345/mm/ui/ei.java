package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class ei implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 f289935d;

    public ei(com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 activityC21437xf483c2) {
        this.f289935d = activityC21437xf483c2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 activityC21437xf483c2 = this.f289935d;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(activityC21437xf483c2.f278610n)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SingleChatInfoUI", "[+] onDeleteContact cancle: yuanbao username:%s", activityC21437xf483c2.f278610n);
            activityC21437xf483c2.W6("yuanbao_chat_delete_cancel", null);
        }
    }
}
