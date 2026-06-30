package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public class p0 extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.r0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15592x3f0b3363 f219672e;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15592x3f0b3363 activityC15592x3f0b3363) {
        this.f219672e = activityC15592x3f0b3363;
    }

    @Override // e75.a
    /* renamed from: onChanged */
    public void mo2231x7bb163d5(java.lang.Object obj) {
        q01.g gVar = (q01.g) obj;
        int i17 = gVar.f440813b;
        tg3.r1 r1Var = (tg3.r1) gVar.f440816e;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15592x3f0b3363 activityC15592x3f0b3363 = this.f219672e;
        int i18 = gVar.f440814c;
        if (i17 == 4 && i18 == -4) {
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15592x3f0b3363.W1;
            activityC15592x3f0b3363.getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.h0(activityC15592x3f0b3363));
            db5.e1.o(activityC15592x3f0b3363, com.p314xaae8f345.mm.R.C30867xcad56011.icr, 0, true, null);
            return;
        }
        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15592x3f0b3363.W1;
        activityC15592x3f0b3363.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.h0(activityC15592x3f0b3363));
        if (i17 != 0 || i18 != 0) {
            if (i18 == -24) {
                tm.a b17 = tm.a.b(gVar.f440815d);
                if (b17 != null) {
                    db5.e1.G(activityC15592x3f0b3363, b17.f501932b, b17.f501934d, true, null);
                }
            } else if (i18 == -4) {
                android.widget.Toast.makeText(activityC15592x3f0b3363, activityC15592x3f0b3363.getString(com.p314xaae8f345.mm.R.C30867xcad56011.icn), 0).show();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTS.FTSMainUI", java.lang.String.format("Search contact failed: %d, %d.", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
            return;
        }
        r45.iw5 H = r1Var.H();
        if (H.D > 0) {
            java.util.LinkedList linkedList = H.E;
            if (linkedList.isEmpty()) {
                db5.e1.o(activityC15592x3f0b3363, com.p314xaae8f345.mm.R.C30867xcad56011.icr, 0, true, null);
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            ((c01.j0) ((qk.o6) i95.n0.c(qk.o6.class))).wi(intent, (r45.gw5) linkedList.getFirst(), activityC15592x3f0b3363.T1);
            j45.l.j(activityC15592x3f0b3363, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
            return;
        }
        java.lang.String g17 = x51.j1.g(H.f458889d);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (g17 == null) {
            g17 = "";
        }
        if (g17.length() > 0) {
            int i28 = H.K;
            if (2 == i28) {
                activityC15592x3f0b3363.T1 = 15;
            } else if (1 == i28) {
                activityC15592x3f0b3363.T1 = 1;
            }
            android.content.Intent intent2 = new android.content.Intent();
            ((c01.j0) ((qk.o6) i95.n0.c(qk.o6.class))).Ai(intent2, H, activityC15592x3f0b3363.T1);
            if (activityC15592x3f0b3363.T1 == 15) {
                intent2.putExtra("Contact_Search_Mobile", this.f219698d.trim());
            }
            intent2.putExtra("Contact_Scene", activityC15592x3f0b3363.T1);
            intent2.putExtra("add_more_friend_search_scene", 2);
            j45.l.j(activityC15592x3f0b3363, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent2, null);
        }
    }
}
