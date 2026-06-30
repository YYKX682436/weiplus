package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class j5 implements w82.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 f182732a;

    public j5(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 activityC13570xd6b9f257) {
        this.f182732a = activityC13570xd6b9f257;
    }

    public void a(java.util.List list, java.util.List list2, java.util.List list3, boolean z17) {
        boolean isEmpty = list2.isEmpty();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 activityC13570xd6b9f257 = this.f182732a;
        if (isEmpty && list3.isEmpty()) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257.N;
            if (activityC13570xd6b9f257.d7()) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257.U6(activityC13570xd6b9f257, true);
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257.V6(activityC13570xd6b9f257, list2, list3);
                return;
            }
        }
        activityC13570xd6b9f257.f181943x = list2;
        activityC13570xd6b9f257.f181944y = list3;
        activityC13570xd6b9f257.f181942w = list;
        java.util.Set set = activityC13570xd6b9f257.f181934o.f182033g;
        ((java.util.HashSet) set).clear();
        if (list3 != null) {
            set.addAll(list3);
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257.Y6(activityC13570xd6b9f257);
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257.V6(activityC13570xd6b9f257, list2, list3);
        } else {
            activityC13570xd6b9f257.f181933n.f(list, list2, list3);
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257.W6(activityC13570xd6b9f257, true);
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257.V6(activityC13570xd6b9f257, list2, list3);
        }
    }
}
