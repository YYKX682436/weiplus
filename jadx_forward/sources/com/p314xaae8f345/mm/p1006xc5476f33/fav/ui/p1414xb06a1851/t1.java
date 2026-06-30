package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes12.dex */
public class t1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.u1 f182330d;

    public t1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.u1 u1Var) {
        this.f182330d = u1Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        r45.bq0 bq0Var;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.u1 u1Var = this.f182330d;
        if (itemId == 0) {
            o72.r2 r2Var = u1Var.f182336d.f182185n;
            if (r2Var == null || r2Var.f67640x5ab01132 == null) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13593xd0ed46ce activityC13593xd0ed46ce = u1Var.f182336d;
            intent.putExtra("key_value", activityC13593xd0ed46ce.f182185n.f67640x5ab01132.f452507s);
            intent.putExtra("key_max_count", com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13593xd0ed46ce.f182183r);
            intent.putExtra("key_show_confirm", true);
            intent.putExtra("key_fav_item_id", activityC13593xd0ed46ce.f182185n.f67643xc8a07680);
            o72.x1.M0(activityC13593xd0ed46ce, ".ui.FavTextEditUI", intent, 1, null);
            activityC13593xd0ed46ce.f182133g.f425022n++;
            return;
        }
        if (itemId == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13593xd0ed46ce activityC13593xd0ed46ce2 = u1Var.f182336d;
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.b4.b(activityC13593xd0ed46ce2, activityC13593xd0ed46ce2.f182187p, activityC13593xd0ed46ce2.f182133g);
            u1Var.f182336d.U6(5);
            return;
        }
        if (itemId != 2) {
            if (itemId != 3) {
                if (itemId != 4) {
                    return;
                }
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = u1Var.f182336d.mo55332x76847179();
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13593xd0ed46ce activityC13593xd0ed46ce3 = u1Var.f182336d;
                db5.e1.u(mo55332x76847179, activityC13593xd0ed46ce3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571902t2), "", new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.s1(this), null);
                activityC13593xd0ed46ce3.U6(6);
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_fav_scene", 2);
            intent2.putExtra("key_fav_item_id", u1Var.f182336d.f182185n.f67645x88be67a1);
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13593xd0ed46ce activityC13593xd0ed46ce4 = u1Var.f182336d;
            o72.x1.L0(activityC13593xd0ed46ce4.mo55332x76847179(), ".ui.FavTagEditUI", intent2, null);
            activityC13593xd0ed46ce4.f182133g.f425023o++;
            activityC13593xd0ed46ce4.U6(7);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13593xd0ed46ce activityC13593xd0ed46ce5 = u1Var.f182336d;
        o72.r2 r2Var2 = activityC13593xd0ed46ce5.f182185n;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13593xd0ed46ce activityC13593xd0ed46ce6 = u1Var.f182336d;
        if (r2Var2 != null && (bq0Var = r2Var2.f67640x5ab01132) != null) {
            activityC13593xd0ed46ce5.f182133g.f425020l++;
            java.lang.String str = bq0Var.f452507s;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = o72.x1.f425048a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavApiLogic", "shareTextToFriend content null");
            } else {
                android.content.Intent intent3 = new android.content.Intent();
                if (str != null) {
                    com.p314xaae8f345.mm.p2610xe8058ca2.C21014xc800ae97 c21014xc800ae97 = new com.p314xaae8f345.mm.p2610xe8058ca2.C21014xc800ae97(str);
                    intent3.putExtra("content_type_forward_to_wework", 1);
                    intent3.putExtra("Select_Data_Send_To_WeWork", c21014xc800ae97);
                }
                intent3.putExtra("Retr_Msg_content", str);
                intent3.putExtra("Retr_Msg_Type", 4);
                intent3.putExtra("mutil_select_is_ret", true);
                j45.l.u(activityC13593xd0ed46ce5, ".ui.transmit.MsgRetransmitUI", intent3, null);
            }
            activityC13593xd0ed46ce6.X6(activityC13593xd0ed46ce6.f182185n.f67645x88be67a1, 1, 0);
        }
        activityC13593xd0ed46ce6.U6(3);
    }
}
