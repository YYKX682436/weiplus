package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class i5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f182695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f182696e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f182697f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.j5 f182698g;

    public i5(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.j5 j5Var, java.util.List list, java.util.List list2, java.util.List list3) {
        this.f182698g = j5Var;
        this.f182695d = list;
        this.f182696e = list2;
        this.f182697f = list3;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List list = this.f182695d;
        boolean isEmpty = list.isEmpty();
        java.util.List list2 = this.f182696e;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.j5 j5Var = this.f182698g;
        if (isEmpty && list2.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 activityC13570xd6b9f257 = j5Var.f182732a;
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257.N;
            if (activityC13570xd6b9f257.d7()) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 activityC13570xd6b9f2572 = j5Var.f182732a;
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257.U6(activityC13570xd6b9f2572, false);
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257.V6(activityC13570xd6b9f2572, list, list2);
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257.V6(j5Var.f182732a, list, list2);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 activityC13570xd6b9f2573 = j5Var.f182732a;
        activityC13570xd6b9f2573.f181943x = list;
        activityC13570xd6b9f2573.f181944y = list2;
        java.util.List list3 = this.f182697f;
        activityC13570xd6b9f2573.f181942w = list3;
        java.util.Set set = activityC13570xd6b9f2573.f181934o.f182033g;
        ((java.util.HashSet) set).clear();
        if (list2 != null) {
            set.addAll(list2);
        }
        activityC13570xd6b9f2573.f181933n.f(list3, list, list2);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257.W6(activityC13570xd6b9f2573, false);
    }
}
