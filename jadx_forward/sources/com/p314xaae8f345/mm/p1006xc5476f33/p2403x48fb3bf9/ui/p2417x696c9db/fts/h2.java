package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c f265962d;

    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c activityC19380x649e7d5c) {
        this.f265962d = activityC19380x649e7d5c;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c activityC19380x649e7d5c = this.f265962d;
        java.lang.String str = activityC19380x649e7d5c.B3;
        java.lang.String str2 = activityC19380x649e7d5c.f265837s5;
        int i17 = activityC19380x649e7d5c.Y3;
        java.lang.String str3 = (activityC19380x649e7d5c.J4.m80965xaaf4ce45() == null || activityC19380x649e7d5c.J4.m80965xaaf4ce45().getVisibility() != 0) ? "" : "1";
        android.widget.ImageView imageView = activityC19380x649e7d5c.O4;
        if (imageView != null && imageView.getVisibility() == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str3);
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) ? "" : "#");
            sb6.append("2");
            str3 = sb6.toString();
        }
        if (activityC19380x649e7d5c.J4.m80973xc3e0a140() != null && activityC19380x649e7d5c.J4.m80973xc3e0a140().getVisibility() == 0) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str3);
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) ? "" : "#");
            sb7.append("3");
            str3 = sb7.toString();
        }
        android.widget.TextView textView = activityC19380x649e7d5c.f265822d5;
        if (textView != null && textView.getVisibility() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "getFeatureInfo, show hide searchtitle.");
        } else if (activityC19380x649e7d5c.J4.m74102xf2c200a5() != null && activityC19380x649e7d5c.J4.m74102xf2c200a5().getVisibility() == 0 && activityC19380x649e7d5c.J4.m74101x3fa9db02() != null && activityC19380x649e7d5c.J4.m74101x3fa9db02().getVisibility() == 0) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str3);
            sb8.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) ? "" : "#");
            sb8.append(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01.f62845xa1e463a0);
            str3 = sb8.toString();
        }
        if (activityC19380x649e7d5c.J4.m74104x4910e751() != null && activityC19380x649e7d5c.J4.m74104x4910e751().getVisibility() == 0) {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(str3);
            sb9.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) ? "" : "#");
            sb9.append("2001");
            str3 = sb9.toString();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627.ha(str, str2, "", 2, i17, 1, str3, 0L, "");
    }
}
