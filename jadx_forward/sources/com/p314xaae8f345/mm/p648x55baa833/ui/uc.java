package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes12.dex */
public class uc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10370x551acb57 f146116d;

    public uc(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10370x551acb57 activityC10370x551acb57) {
        this.f146116d = activityC10370x551acb57;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10370x551acb57 activityC10370x551acb57 = this.f146116d;
        if (!activityC10370x551acb57.f145502v) {
            android.content.Intent intent = new android.content.Intent();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(activityC10370x551acb57.f145514q);
            intent.putExtra("Select_Contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ","));
            activityC10370x551acb57.setResult(-1, intent);
            activityC10370x551acb57.finish();
            return true;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(activityC10370x551acb57.f145512o);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.addAll(activityC10370x551acb57.f145514q);
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            java.util.Set set = c01.e2.f118650a;
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            java.lang.String w07 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.w0()) ? n17.w0() : z07 != null ? z07.z0(n17.d1()) : null;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w07)) {
                w07 = n17.w0();
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w07)) {
                w07 = n17.f2();
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w07)) {
                w07 = n17.d1();
            }
            sb6.append(w07);
            sb6.append("、");
        }
        if (sb6.length() > 0) {
            sb6.deleteCharAt(sb6.length() - 1);
        }
        db5.e1.u(activityC10370x551acb57, activityC10370x551acb57.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4d, sb6), "", new com.p314xaae8f345.mm.p648x55baa833.ui.sc(this), new com.p314xaae8f345.mm.p648x55baa833.ui.tc(this));
        return true;
    }
}
