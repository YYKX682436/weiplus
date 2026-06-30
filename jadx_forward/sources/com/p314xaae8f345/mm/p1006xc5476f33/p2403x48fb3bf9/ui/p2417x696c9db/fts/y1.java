package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c f266262d;

    public y1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c activityC19380x649e7d5c) {
        this.f266262d = activityC19380x649e7d5c;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c activityC19380x649e7d5c = this.f266262d;
        android.view.View view = activityC19380x649e7d5c.H4;
        if (view != null) {
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view.getLayoutParams();
            android.view.View m74101x3fa9db02 = activityC19380x649e7d5c.J4.m74101x3fa9db02();
            android.view.View m74102xf2c200a5 = activityC19380x649e7d5c.J4.m74102xf2c200a5();
            if (m74101x3fa9db02.getWidth() == 0 || m74102xf2c200a5.getWidth() == 0 || m74101x3fa9db02.getVisibility() != 0 || m74102xf2c200a5.getVisibility() != 0) {
                layoutParams.rightMargin = (int) activityC19380x649e7d5c.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
            } else {
                layoutParams.rightMargin = java.lang.Math.max(java.lang.Math.max((int) activityC19380x649e7d5c.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn), m74102xf2c200a5.getWidth()), m74101x3fa9db02.getWidth());
            }
            layoutParams.leftMargin = (int) activityC19380x649e7d5c.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
            activityC19380x649e7d5c.H4.setLayoutParams(layoutParams);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "searchInputBackground right Margin is 8A = %d, cancelTextView.getWidth() = %d,%d, CancelTextContainer() = %d,%d", java.lang.Integer.valueOf((int) activityC19380x649e7d5c.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn)), java.lang.Integer.valueOf(m74101x3fa9db02.getWidth()), java.lang.Integer.valueOf(m74101x3fa9db02.getVisibility()), java.lang.Integer.valueOf(m74102xf2c200a5.getWidth()), java.lang.Integer.valueOf(m74102xf2c200a5.getVisibility()));
        }
    }
}
