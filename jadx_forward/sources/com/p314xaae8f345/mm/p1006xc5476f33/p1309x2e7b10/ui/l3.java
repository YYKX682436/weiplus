package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class l3 implements com.p314xaae8f345.mm.ui.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365 f176598a;

    public l3(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365 activityC13057x768a6365) {
        this.f176598a = activityC13057x768a6365;
    }

    @Override // com.p314xaae8f345.mm.ui.y9
    public void a(java.lang.Object obj) {
    }

    @Override // com.p314xaae8f345.mm.ui.y9
    public void b(java.lang.Object obj) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365.f176426n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365 activityC13057x768a6365 = this.f176598a;
        activityC13057x768a6365.T6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s3 s3Var = activityC13057x768a6365.f176428e;
        if ((s3Var.f176690o >= s3Var.f176691p) && xt1.t0.Vi().f() == 0) {
            android.view.View view = activityC13057x768a6365.f176430g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI$5", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$5", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
