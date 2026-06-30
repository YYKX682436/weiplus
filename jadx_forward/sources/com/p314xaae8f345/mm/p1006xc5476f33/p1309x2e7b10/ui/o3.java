package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class o3 extends lu1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365 f176633a;

    public o3(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365 activityC13057x768a6365) {
        this.f176633a = activityC13057x768a6365;
    }

    @Override // lu1.p, lu1.q
    public void a() {
        wt1.f0 Ui = xt1.t0.Ui();
        java.util.List list = Ui.f530800b;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        if (arrayList.size() != 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.addAll(list);
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                xt1.k kVar = (xt1.k) arrayList2.get(i17);
                if (kVar != null) {
                    arrayList.remove(kVar);
                    Ui.c(kVar);
                }
            }
            arrayList2.clear();
        }
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365.f176426n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365 activityC13057x768a6365 = this.f176633a;
        activityC13057x768a6365.T6();
        activityC13057x768a6365.f176428e.f();
    }
}
