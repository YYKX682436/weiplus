package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes12.dex */
public class i implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f179590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8 f179591b;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8 activityC13272x96cd1be8, com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4) {
        this.f179591b = activityC13272x96cd1be8;
        this.f179590a = c21053xdbf1e5f4;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.ri0 ri0Var;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8 activityC13272x96cd1be8 = this.f179591b;
        if (i18 == -434) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji onSceneEnd error over size.");
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_SYNC_CUSTOM_EMOJI_BATCH_DOWNLOAD_BOOLEAN, java.lang.Boolean.TRUE);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(activityC13272x96cd1be8.f179201g);
            java.lang.String mo42933xb5885648 = activityC13272x96cd1be8.f179204m.mo42933xb5885648();
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = activityC13272x96cd1be8.f179204m;
            g0Var.d(10431, valueOf, mo42933xb5885648, c21053xdbf1e5f4.f68657xb76d85ab, c21053xdbf1e5f4.f68663x861009b5, 1, 1, java.lang.Integer.valueOf(activityC13272x96cd1be8.f179204m.f68679x22618426), activityC13272x96cd1be8.f179202h, activityC13272x96cd1be8.f179204m.f68641x3342accf, activityC13272x96cd1be8.f179203i, activityC13272x96cd1be8.V6(), "");
            if (activityC13272x96cd1be8.G) {
                activityC13272x96cd1be8.I++;
                activityC13272x96cd1be8.W6();
            } else {
                activityC13272x96cd1be8.R6();
                activityC13272x96cd1be8.Z6(null);
            }
        } else if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji onSceneEnd ok.");
            r45.bd bdVar = (r45.bd) fVar.f152151d;
            if (bdVar != null && (linkedList2 = bdVar.f452205e) != null && linkedList2.size() > 0) {
                java.util.Iterator it = linkedList2.iterator();
                while (it.hasNext()) {
                    ri0Var = (r45.ri0) it.next();
                    if (this.f179590a.mo42933xb5885648().equals(ri0Var.f466419d)) {
                        break;
                    }
                }
            }
            ri0Var = null;
            if (bdVar == null || (linkedList = bdVar.f452204d) == null || linkedList.size() <= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8.O6(activityC13272x96cd1be8, null, ri0Var, "", "");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "upload size is %d", java.lang.Integer.valueOf(linkedList.size()));
                int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8.L;
                activityC13272x96cd1be8.U6(ri0Var);
            }
        } else if (i18 == -2049) {
            activityC13272x96cd1be8.Q6(activityC13272x96cd1be8.f179207p.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bul));
        } else {
            java.lang.String str = fVar.f152150c;
            int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8.L;
            activityC13272x96cd1be8.Q6(str);
        }
        return null;
    }
}
