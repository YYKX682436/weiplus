package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class w4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 f239543d;

    public w4(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 activityC17133x39d21883) {
        this.f239543d = activityC17133x39d21883;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 activityC17133x39d21883 = this.f239543d;
        int i18 = activityC17133x39d21883.f238901q2;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (i18 == com.p314xaae8f345.mm.R.id.lv7) {
            str = activityC17133x39d21883.f238914y.getText().toString().trim();
        } else {
            if (i18 == com.p314xaae8f345.mm.R.id.lua) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(activityC17133x39d21883.f238917z.getText().toString().trim() + " ");
                java.lang.String trim = activityC17133x39d21883.B.getText().toString().trim();
                if (trim.endsWith(activityC17133x39d21883.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hz9))) {
                    sb6.append(trim.substring(0, trim.length() - 4));
                } else {
                    sb6.append(trim);
                }
                str = sb6.toString();
            } else {
                if (i18 == com.p314xaae8f345.mm.R.id.lv6) {
                    str = activityC17133x39d21883.V.getText().toString().trim();
                } else {
                    if (i18 == com.p314xaae8f345.mm.R.id.lub) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        sb7.append(activityC17133x39d21883.W.getText().toString().trim() + " ");
                        java.lang.String trim2 = activityC17133x39d21883.Y.getText().toString().trim();
                        if (trim2.endsWith(activityC17133x39d21883.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hz9))) {
                            sb7.append(trim2.substring(0, trim2.length() - 4));
                        } else {
                            sb7.append(trim2);
                        }
                        str = sb7.toString();
                    } else {
                        str = "";
                    }
                }
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, null, str, null);
        db5.e1.T(activityC17133x39d21883, activityC17133x39d21883.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st));
    }
}
