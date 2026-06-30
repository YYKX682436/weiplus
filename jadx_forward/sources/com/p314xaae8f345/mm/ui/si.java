package com.p314xaae8f345.mm.ui;

/* loaded from: classes9.dex */
public class si implements bi4.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 f291393a;

    public si(com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 activityC21437xf483c2) {
        this.f291393a = activityC21437xf483c2;
    }

    @Override // bi4.v0
    public void a(boolean z17, java.util.List list) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(z17);
        objArr[1] = list != null ? java.lang.Integer.valueOf(list.size()) : "null";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SingleChatInfoUI", "tsessionInfos result:%s size:%s", objArr);
        com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 activityC21437xf483c2 = this.f291393a;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                pj4.j jVar = (pj4.j) it.next();
                if (jVar != null && jVar.f436658d == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SingleChatInfoUI", "rspInfo" + jVar.f436658d + ",block:" + jVar.f436671t);
                    boolean z18 = jVar.f436671t;
                    boolean z19 = com.p314xaae8f345.mm.ui.ActivityC21437xf483c2.f278602x;
                    activityC21437xf483c2.a7(z18);
                    break;
                }
            }
        }
        activityC21437xf483c2.f278617u = null;
    }
}
