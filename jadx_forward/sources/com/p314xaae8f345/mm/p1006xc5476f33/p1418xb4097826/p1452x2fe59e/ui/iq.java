package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes10.dex */
public final class iq implements lo.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14125xe2977688 f191698a;

    public iq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14125xe2977688 activityC14125xe2977688) {
        this.f191698a = activityC14125xe2977688;
    }

    @Override // lo.j
    public void a(int i17, java.lang.String str, java.util.ArrayList arrayList) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resultCode:");
        sb6.append(i17);
        sb6.append(" filePaths:");
        sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSelectLocalFileUI", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14125xe2977688 activityC14125xe2977688 = this.f191698a;
        if (i17 != -1) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5723x5d13c579 c5723x5d13c579 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5723x5d13c579();
            am.kk kkVar = c5723x5d13c579.f136046g;
            kkVar.f88693a = "";
            kkVar.f88695c = true;
            c5723x5d13c579.e();
            activityC14125xe2977688.finish();
            return;
        }
        if (arrayList == null || arrayList.size() <= 0) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14125xe2977688.f191161p;
            activityC14125xe2977688.Y6(-100);
            return;
        }
        java.lang.String str2 = ((com.p314xaae8f345.mm.p659xbe8cc686.p660xaf3f3382.C10396xb34a007d) arrayList.get(0)).f146295e;
        if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.hq(activityC14125xe2977688, str2));
            return;
        }
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14125xe2977688.f191161p;
        activityC14125xe2977688.Y6(-201);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSelectLocalFileUI", "chooseFromChat fail, file not exixt");
    }
}
