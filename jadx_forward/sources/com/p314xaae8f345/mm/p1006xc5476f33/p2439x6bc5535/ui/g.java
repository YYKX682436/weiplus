package com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui;

/* loaded from: classes3.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19503x99c967c5 f269541e;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19503x99c967c5 activityC19503x99c967c5, java.lang.String str) {
        this.f269541e = activityC19503x99c967c5;
        this.f269540d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19503x99c967c5 activityC19503x99c967c5 = this.f269541e;
        if (activityC19503x99c967c5.f269511x != null) {
            int i17 = activityC19503x99c967c5.f269508u;
            int i18 = 0;
            if (i17 == 0) {
                activityC19503x99c967c5.f269512y.setVisibility(8);
            } else if (i17 == 1) {
                activityC19503x99c967c5.f269512y.setText(activityC19503x99c967c5.f269509v);
                activityC19503x99c967c5.f269512y.setVisibility(0);
            } else if (i17 == 2) {
                activityC19503x99c967c5.f269512y.setVisibility(8);
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MULTI_DEVICE_NOT_KICK_OUT_SHOWN_BOOLEAN_SYNC;
                if (!c17.o(u3Var, false)) {
                    android.view.View findViewById = activityC19503x99c967c5.findViewById(com.p314xaae8f345.mm.R.id.mz9);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI", "updateTipsArea", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI", "updateTipsArea", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
                }
            }
            java.lang.String str = this.f269540d;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                activityC19503x99c967c5.f269511x.setVisibility(8);
            } else {
                activityC19503x99c967c5.f269511x.setVisibility(0);
                activityC19503x99c967c5.f269511x.setText(str);
            }
            if (activityC19503x99c967c5.f269512y.getVisibility() == 0 || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                int b17 = i65.a.b(activityC19503x99c967c5, 292) - activityC19503x99c967c5.B.getMeasuredHeight();
                if (activityC19503x99c967c5.f269510w.getVisibility() == 0) {
                    b17 = (b17 - i65.a.b(activityC19503x99c967c5, 28)) - activityC19503x99c967c5.f269510w.getMeasuredHeight();
                }
                if (activityC19503x99c967c5.B.getVisibility() == 0) {
                    b17 = (b17 - i65.a.b(activityC19503x99c967c5, 4)) - activityC19503x99c967c5.B.getMeasuredHeight();
                }
                if (activityC19503x99c967c5.f269513z.getVisibility() == 0) {
                    b17 = (b17 - i65.a.b(activityC19503x99c967c5, 4)) - activityC19503x99c967c5.f269513z.getMeasuredHeight();
                }
                if (activityC19503x99c967c5.f269512y.getVisibility() == 0) {
                    b17 -= i65.a.b(activityC19503x99c967c5, 12);
                }
                if (activityC19503x99c967c5.f269511x.getVisibility() == 0) {
                    b17 -= i65.a.b(activityC19503x99c967c5, 12);
                }
                if (activityC19503x99c967c5.Y6(b17, 14, str) || activityC19503x99c967c5.Y6(b17, 13, str) || activityC19503x99c967c5.Y6(b17, 12, str)) {
                    return;
                }
                float b18 = i65.a.b(activityC19503x99c967c5, 12);
                activityC19503x99c967c5.f269512y.setTextSize(0, b18);
                activityC19503x99c967c5.f269511x.setTextSize(0, b18);
                int b19 = b17 / i65.a.b(activityC19503x99c967c5, 12);
                int measuredWidth = activityC19503x99c967c5.f269511x.getMeasuredWidth();
                if (activityC19503x99c967c5.f269511x.getVisibility() == 0) {
                    int measureText = (int) activityC19503x99c967c5.f269511x.getPaint().measureText(str);
                    if (measuredWidth > 0) {
                        i18 = 0 + (measureText / measuredWidth);
                        if (measureText % measuredWidth > 0) {
                            i18++;
                        }
                    }
                }
                if (b19 > i18) {
                    activityC19503x99c967c5.f269512y.setMaxLines(b19 - i18);
                } else {
                    activityC19503x99c967c5.f269511x.setMaxLines(b19 - 1);
                    activityC19503x99c967c5.f269512y.setMaxLines(1);
                }
            }
        }
    }
}
