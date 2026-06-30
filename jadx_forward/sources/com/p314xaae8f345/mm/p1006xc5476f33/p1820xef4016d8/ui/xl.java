package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class xl implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f229229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d f229230b;

    public xl(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d, java.lang.String str) {
        this.f229230b = activityC16390x60cac25d;
        this.f229229a = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "do confirm errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d = this.f229230b;
        android.app.Dialog dialog = activityC16390x60cac25d.B;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (fVar.f152148a != 0 || fVar.f152149b != 0) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.K(activityC16390x60cac25d.mo55332x76847179(), fVar.f152150c);
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "retcode: %s", java.lang.Integer.valueOf(((r45.g80) fVar.f152151d).f456510d));
        r45.g80 g80Var = (r45.g80) fVar.f152151d;
        if (g80Var.f456510d != 0) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g80Var.f456511e)) {
                return null;
            }
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.M(activityC16390x60cac25d.mo55332x76847179(), ((r45.g80) fVar.f152151d).f456511e);
            return null;
        }
        java.util.List list = activityC16390x60cac25d.f228065t;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        java.util.Iterator it = arrayList.iterator();
        boolean z17 = false;
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zm zmVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zm) it.next();
            if (zmVar.f229326b.f471033f.equals(this.f229229a)) {
                arrayList.remove(zmVar);
                break;
            }
            i17++;
        }
        if (((java.util.ArrayList) list).isEmpty()) {
            android.view.View view = activityC16390x60cac25d.f228064s;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$17", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$17", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = activityC16390x60cac25d.f228053h;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$17", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$17", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = activityC16390x60cac25d.f228058o;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$17", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$17", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "doDeleteShowSource: %s", java.lang.Integer.valueOf(i17));
        if (i17 <= 0) {
            return null;
        }
        if (i17 != ((java.util.ArrayList) list).size()) {
            activityC16390x60cac25d.f228057n.m8155x27702c4(i17);
            activityC16390x60cac25d.f228063r.m8155x27702c4(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zm zmVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zm) ((java.util.ArrayList) list).get(i17);
            r45.wv3 wv3Var = zmVar2.f229326b;
            if (wv3Var.f471036i != 1 && wv3Var.f471040p != 1 && !activityC16390x60cac25d.f7(wv3Var.f471033f)) {
                z17 = true;
            }
            zmVar2.f229325a = z17;
            if (z17) {
                activityC16390x60cac25d.f228067v = i17;
            } else {
                activityC16390x60cac25d.f228067v = -1;
            }
            activityC16390x60cac25d.m7(i17, z17);
            activityC16390x60cac25d.q7();
            return null;
        }
        activityC16390x60cac25d.f228057n.m8155x27702c4(i17);
        activityC16390x60cac25d.f228063r.m8155x27702c4(i17);
        activityC16390x60cac25d.f228067v = -1;
        if (((java.util.ArrayList) list).size() == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16364x2d32e7b c16364x2d32e7b = activityC16390x60cac25d.f228054i;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(c16364x2d32e7b, arrayList5.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$17", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "Undefined", "scrollToPosition", "(I)V");
            c16364x2d32e7b.a1(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(c16364x2d32e7b, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$17", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "Undefined", "scrollToPosition", "(I)V");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zm) ((java.util.ArrayList) list).get(0)).f229325a = true;
            activityC16390x60cac25d.f228067v = 0;
            activityC16390x60cac25d.m7(0, true);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16364x2d32e7b c16364x2d32e7b2 = activityC16390x60cac25d.f228054i;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList6.add(java.lang.Integer.valueOf(i17 - 1));
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(c16364x2d32e7b2, arrayList6.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$17", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "Undefined", "scrollToPosition", "(I)V");
            c16364x2d32e7b2.a1(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(c16364x2d32e7b2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$17", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "Undefined", "scrollToPosition", "(I)V");
        }
        activityC16390x60cac25d.f228054i.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.wl(this), 100L);
        return null;
    }
}
