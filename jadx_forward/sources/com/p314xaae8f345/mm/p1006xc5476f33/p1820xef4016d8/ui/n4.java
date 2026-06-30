package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class n4 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f228751a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16367x1189c620 f228752b;

    public n4(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16367x1189c620 activityC16367x1189c620, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        this.f228752b = activityC16367x1189c620;
        this.f228751a = u3Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d
    public /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d
    public void b(java.lang.Object obj, int i17, int i18) {
        java.util.ArrayList arrayList;
        r45.co3 co3Var = (r45.co3) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16367x1189c620 activityC16367x1189c620 = this.f228752b;
        if (activityC16367x1189c620.isFinishing() || activityC16367x1189c620.isDestroyed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "activity has destroyed");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f228751a;
        if (u3Var != null && u3Var.isShowing()) {
            u3Var.dismiss();
        }
        activityC16367x1189c620.f227666t.N(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "do get show source net callback");
        if (i17 != 0 || i18 != 0 || co3Var == null) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.K(activityC16367x1189c620.mo55332x76847179(), "");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "retcode: %s", java.lang.Integer.valueOf(co3Var.f453236d));
        if (co3Var.f453236d != 0) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.L(co3Var.f453237e);
            return;
        }
        activityC16367x1189c620.f227672z = co3Var.f453240h == 1;
        activityC16367x1189c620.A = co3Var.f453239g;
        java.util.List list = activityC16367x1189c620.f227670x;
        java.util.LinkedList linkedList = co3Var.f453242m;
        ((java.util.ArrayList) list).addAll(linkedList);
        java.util.Iterator it = co3Var.f453238f.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = activityC16367x1189c620.f227669w;
            if (!hasNext) {
                break;
            }
            r45.wv3 wv3Var = (r45.wv3) it.next();
            if (wv3Var.f471036i == 1 || wv3Var.f471040p == 1 || linkedList.contains(wv3Var.f471033f)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.i5 i5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.i5(activityC16367x1189c620);
                i5Var.f228548d = wv3Var;
                arrayList.add(i5Var);
                activityC16367x1189c620.f227668v.m8146xced61ae5();
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(co3Var.f453246q)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.u5 u5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.u5(activityC16367x1189c620);
        u5Var.f229020d = co3Var.f453246q;
        arrayList.add(u5Var);
    }
}
