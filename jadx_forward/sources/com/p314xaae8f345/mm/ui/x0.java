package com.p314xaae8f345.mm.ui;

/* loaded from: classes9.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.zs3 f294069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.y0 f294070e;

    public x0(com.p314xaae8f345.mm.ui.y0 y0Var, r45.zs3 zs3Var) {
        this.f294070e = y0Var;
        this.f294069d = zs3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.zs3 zs3Var = this.f294069d;
        java.util.LinkedList linkedList = zs3Var.f473881e;
        if (linkedList == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNotifySettingsUI", "getNotifyMsgInfo, configList is null");
            return;
        }
        com.p314xaae8f345.mm.ui.y0 y0Var = this.f294070e;
        com.p314xaae8f345.mm.ui.ActivityC21346x5cfbe046 activityC21346x5cfbe046 = y0Var.f294102d;
        int i17 = com.p314xaae8f345.mm.ui.ActivityC21346x5cfbe046.f278112m;
        activityC21346x5cfbe046.getClass();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6 f6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class);
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.le7 le7Var = (r45.le7) it.next();
            com.p314xaae8f345.mm.ui.a1 a1Var = new com.p314xaae8f345.mm.ui.a1(null);
            java.lang.String str = le7Var.f460931d;
            k91.v5 Ai = ((k91.g4) f6Var).Ai(str);
            if (Ai == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandNotifySettingsUI", "can't find local record, appId:%s", str);
            } else {
                a1Var.f278645a = Ai.f68924xdec927b;
                a1Var.f278647c = Ai.f68913x21f9b213;
                a1Var.f278646b = Ai.f68910xea1bd3d4;
                a1Var.f278648d = le7Var.f460932e == 0;
                linkedList2.add(a1Var);
            }
        }
        java.util.LinkedList linkedList3 = activityC21346x5cfbe046.f278114e.f289941e;
        linkedList3.clear();
        if (!linkedList2.isEmpty()) {
            linkedList3.addAll(linkedList2);
        }
        activityC21346x5cfbe046.f278114e.notifyDataSetChanged();
        com.p314xaae8f345.mm.ui.ActivityC21346x5cfbe046.T6(y0Var.f294102d, zs3Var.f473881e);
    }
}
