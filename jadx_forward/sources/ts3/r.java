package ts3;

/* loaded from: classes9.dex */
public class r implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui.ActivityC16956x7944e152 f503230d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui.ActivityC16956x7944e152 activityC16956x7944e152) {
        this.f503230d = activityC16956x7944e152;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int groupId = menuItem.getGroupId();
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui.ActivityC16956x7944e152 activityC16956x7944e152 = this.f503230d;
        if (itemId == 0) {
            if (activityC16956x7944e152.f236593h == 20) {
                java.util.ArrayList arrayList = (java.util.ArrayList) ss3.d0.Di().z0(((ts3.d0) activityC16956x7944e152.f236592g).getItem(groupId), activityC16956x7944e152.f236593h);
                if (arrayList.size() > 0) {
                    c01.ta taVar = (c01.ta) arrayList.get(0);
                    ot0.q qVar = new ot0.q();
                    qVar.f430187f = taVar.f();
                    qVar.f430191g = taVar.d();
                    qVar.f430195h = "view";
                    qVar.f430199i = 5;
                    qVar.f430207k = taVar.h();
                    java.lang.String u17 = ot0.q.u(qVar, null, null);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("Retr_Msg_content", u17);
                    intent.putExtra("Retr_Msg_Type", 2);
                    intent.putExtra("Retr_Msg_thumb_path", tv.a.b(taVar.c()));
                    intent.putExtra("Retr_Msg_Id", 7377812);
                    java.lang.String a17 = c01.n2.a("" + taVar.f119016p);
                    intent.putExtra("reportSessionId", a17);
                    c01.l2 c17 = c01.n2.d().c(a17, true);
                    c17.i("prePublishId", "msg_" + taVar.f119016p);
                    c17.i("preUsername", "newsapp");
                    c17.i("preChatName", "newsapp");
                    c17.i("preMsgIndex", 0);
                    c17.i("sendAppMsgScene", 1);
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.v(intent, activityC16956x7944e152);
                    return;
                }
                return;
            }
            return;
        }
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            java.lang.String item = ((ts3.d0) activityC16956x7944e152.f236592g).getItem(groupId);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item)) {
                int i18 = activityC16956x7944e152.f236593h;
                ss3.d0.Bi(ss3.d0.Di().z0(item, i18), i18);
                c01.ua Di = ss3.d0.Di();
                int i19 = activityC16956x7944e152.f236593h;
                Di.getClass();
                java.lang.String str = "reserved3 = " + d95.b0.O(item);
                Di.s0(str);
                if (Di.f119043d.A(Di.L0(i19), "delete from " + Di.L0(i19) + " where " + str)) {
                    Di.W0(i19);
                    Di.m145262xf35bbb4();
                }
            }
            activityC16956x7944e152.U6();
            return;
        }
        if (activityC16956x7944e152.f236593h == 20) {
            java.lang.String item2 = ((ts3.d0) activityC16956x7944e152.f236592g).getItem(groupId);
            java.util.ArrayList arrayList2 = (java.util.ArrayList) ss3.d0.Di().z0(item2, activityC16956x7944e152.f236593h);
            if (arrayList2.isEmpty()) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReaderAppUI", "fav functionId %s, index %d, size %d", item2, java.lang.Integer.valueOf(activityC16956x7944e152.f236598p), java.lang.Integer.valueOf(arrayList2.size()));
            if (activityC16956x7944e152.f236598p >= arrayList2.size()) {
                activityC16956x7944e152.f236598p = 0;
            }
            c01.ta taVar2 = (c01.ta) arrayList2.get(activityC16956x7944e152.f236598p);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
            java.lang.String a18 = c01.n2.a("" + taVar2.f119016p);
            c01.l2 c18 = c01.n2.d().c(a18, true);
            c18.i("prePublishId", "msg_" + taVar2.f119016p);
            c18.i("preUsername", "newsapp");
            c18.i("preChatName", "newsapp");
            c18.i("preMsgIndex", 0);
            c18.i("sendAppMsgScene", 1);
            am.c4 c4Var = c5303xc75d2f73.f135623g;
            c4Var.f87855h = a18;
            ss3.q.a(c5303xc75d2f73, taVar2, activityC16956x7944e152.f236598p);
            c4Var.f87860m = 7;
            c4Var.f87856i = activityC16956x7944e152;
            c5303xc75d2f73.e();
        }
    }
}
