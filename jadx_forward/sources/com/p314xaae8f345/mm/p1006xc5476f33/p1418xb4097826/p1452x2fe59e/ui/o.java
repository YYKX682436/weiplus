package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class o implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13932x386ad3e f191889d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13932x386ad3e activityC13932x386ad3e) {
        this.f191889d = activityC13932x386ad3e;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13932x386ad3e.L;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[clickMoreMenu] itemId=");
        sb6.append(menuItem.getItemId());
        sb6.append(" getRelatedScene=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13932x386ad3e activityC13932x386ad3e = this.f191889d;
        sb6.append(activityC13932x386ad3e.m7());
        sb6.append(" streamCard=");
        sb6.append(activityC13932x386ad3e.o7() != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AlbumTimelineUI", sb6.toString());
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7 n7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a;
        if (itemId == activityC13932x386ad3e.f190737J) {
            if (activityC13932x386ad3e.m7() == 10 || activityC13932x386ad3e.m7() == 11) {
                r45.ww2 o76 = activityC13932x386ad3e.o7();
                if (o76 != null) {
                    r45.qt2 k76 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13932x386ad3e.k7(activityC13932x386ad3e);
                    zy2.f fVar = new zy2.f();
                    fVar.f558915b = n7Var.g(o76);
                    n7Var.o(activityC13932x386ad3e, fVar, k76);
                    return;
                }
                return;
            }
            if (activityC13932x386ad3e.m7() == 14) {
                zy2.f fVar2 = new zy2.f();
                byte[] byteArrayExtra = activityC13932x386ad3e.getIntent().getByteArrayExtra("FINDER_SHARE_ALBUM");
                if (byteArrayExtra != null) {
                    fVar2.f558915b.mo11468x92b714fd(byteArrayExtra);
                }
                n7Var.o(activityC13932x386ad3e, fVar2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13932x386ad3e.k7(activityC13932x386ad3e));
                return;
            }
            return;
        }
        if (menuItem.getItemId() == activityC13932x386ad3e.K) {
            if (activityC13932x386ad3e.m7() == 10 || activityC13932x386ad3e.m7() == 11) {
                ((ee0.t4) ((fe0.n4) i95.n0.c(fe0.n4.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createSnsFinderShareAlbum", "com.tencent.mm.feature.sns.SnsShareObjectService");
                m21.f fVar3 = new m21.f();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSnsFinderShareAlbum", "com.tencent.mm.feature.sns.SnsShareObjectService");
                r45.ww2 o77 = activityC13932x386ad3e.o7();
                if (o77 != null) {
                    fVar3.f404519a = n7Var.g(o77);
                }
                n7Var.p(activityC13932x386ad3e, fVar3, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13932x386ad3e.k7(activityC13932x386ad3e));
                return;
            }
            if (activityC13932x386ad3e.m7() == 14) {
                ((ee0.t4) ((fe0.n4) i95.n0.c(fe0.n4.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createSnsFinderShareAlbum", "com.tencent.mm.feature.sns.SnsShareObjectService");
                m21.f fVar4 = new m21.f();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSnsFinderShareAlbum", "com.tencent.mm.feature.sns.SnsShareObjectService");
                byte[] byteArrayExtra2 = activityC13932x386ad3e.getIntent().getByteArrayExtra("FINDER_SHARE_ALBUM");
                if (byteArrayExtra2 != null) {
                    fVar4.f404519a.mo11468x92b714fd(byteArrayExtra2);
                }
                n7Var.p(activityC13932x386ad3e, fVar4, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13932x386ad3e.k7(activityC13932x386ad3e));
            }
        }
    }
}
