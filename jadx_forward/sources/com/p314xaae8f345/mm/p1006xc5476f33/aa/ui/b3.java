package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class b3 implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f154111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154112e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 f154113f;

    public b3(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907, java.util.ArrayList arrayList, java.lang.String str) {
        this.f154113f = activityC11351x975a7907;
        this.f154111d = arrayList;
        this.f154112e = str;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907 = this.f154113f;
        android.app.Dialog dialog = activityC11351x975a7907.A1;
        if (dialog != null && dialog.isShowing()) {
            activityC11351x975a7907.A1.dismiss();
        }
        activityC11351x975a7907.B1 = false;
        java.util.ArrayList arrayList = this.f154111d;
        arrayList.clear();
        int i17 = vVar.f432691c;
        java.lang.String str = this.f154112e;
        p13.u uVar = vVar.f432689a;
        if (i17 == -3 || i17 == -2 || i17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "onSearchError: errorCode=%d | originQuery=%s", java.lang.Integer.valueOf(i17), uVar.f432674c);
            if (!uVar.f432674c.equals(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "Native Search: Not Same Query");
                return;
            }
        } else if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "search result %d", java.lang.Integer.valueOf(vVar.f432693e.size()));
            if (str == null || !str.equals(uVar.f432674c)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "Native Search: Not Same query origin:%s current:%s", uVar.f432674c, str);
                return;
            }
            java.util.List list = vVar.f432693e;
            if (list != null && list.size() > 0) {
                for (p13.y yVar : vVar.f432693e) {
                    java.lang.String str2 = yVar.f432720e;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? false : com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907.q7(h61.o.i(str2))) {
                        arrayList.add(yVar.f432720e);
                    }
                }
            }
        }
        activityC11351x975a7907.o7(arrayList);
    }
}
