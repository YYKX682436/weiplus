package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public final class t2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13567x4039ba2d f182979d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13567x4039ba2d activityC13567x4039ba2d) {
        super(1);
        this.f182979d = activityC13567x4039ba2d;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13567x4039ba2d activityC13567x4039ba2d = this.f182979d;
        if (intValue == 4) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13567x4039ba2d.f181880o;
            activityC13567x4039ba2d.W6().O6(7, false);
        } else if (intValue == 6) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13567x4039ba2d.f181880o;
            activityC13567x4039ba2d.W6().O6(3, false);
        } else if (intValue == 8) {
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13567x4039ba2d.f181880o;
            activityC13567x4039ba2d.V6().P6();
            activityC13567x4039ba2d.W6().O6(3, false);
        } else if (intValue == 10) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderFilterUI", "[CONTEXT_OPERATE_DELETE_SUCCESS] removeItemsAndRefresh indexs = " + activityC13567x4039ba2d.f181885h);
            if (activityC13567x4039ba2d.f181885h != -1) {
                java.util.ArrayList arrayList = new java.util.ArrayList(1);
                arrayList.add(java.lang.Integer.valueOf(activityC13567x4039ba2d.f181885h));
                q40.g gVar = activityC13567x4039ba2d.f181883f;
                if (gVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mGlobalFavFragment");
                    throw null;
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15106x1388ca00) gVar).F0(arrayList);
                activityC13567x4039ba2d.W6().O6(6, false);
            }
        } else if (intValue == 13) {
            int i27 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13567x4039ba2d.f181880o;
            java.util.List R6 = activityC13567x4039ba2d.U6().R6();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderFilterUI", "[CONTEXT_OPERATE_BATCH_DELETE_SUCCESS] removeItemsAndRefresh indexs = " + R6);
            q40.g gVar2 = activityC13567x4039ba2d.f181883f;
            if (gVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mGlobalFavFragment");
                throw null;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15106x1388ca00) gVar2).F0(R6);
            activityC13567x4039ba2d.U6().O6();
            activityC13567x4039ba2d.V6().P6();
            activityC13567x4039ba2d.W6().O6(6, false);
        } else if (intValue == 15) {
            int i28 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13567x4039ba2d.f181880o;
            java.util.List R62 = activityC13567x4039ba2d.U6().R6();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[CONTEXT_OPERATE_MORE_STATE_ENTER] enterMultiSelectType selectIndexList size = ");
            java.util.ArrayList arrayList2 = (java.util.ArrayList) R62;
            sb6.append(arrayList2.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderFilterUI", sb6.toString());
            q40.g gVar3 = activityC13567x4039ba2d.f181883f;
            if (gVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mGlobalFavFragment");
                throw null;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15106x1388ca00) gVar3).z0(((java.lang.Number) arrayList2.get(0)).intValue());
        } else if (intValue == 16) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderFilterUI", "[CONTEXT_OPERATE_MORE_STATE_EXIT] exitMultiSelectType");
            q40.g gVar4 = activityC13567x4039ba2d.f181883f;
            if (gVar4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mGlobalFavFragment");
                throw null;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15106x1388ca00) gVar4).A0();
            activityC13567x4039ba2d.U6().O6();
        }
        return jz5.f0.f384359a;
    }
}
