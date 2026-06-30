package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f266232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f266233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 f266234f;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 activityC19366xa1004627, int i17, android.view.View view) {
        this.f266234f = activityC19366xa1004627;
        this.f266232d = i17;
        this.f266233e = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = 0;
        android.view.View view = this.f266233e;
        int i18 = this.f266232d;
        int measuredWidth = (i18 == 0 || i18 == 4) ? view.getMeasuredWidth() : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 activityC19366xa1004627 = this.f266234f;
        if (activityC19366xa1004627.J4.m74104x4910e751() != null && activityC19366xa1004627.J4.m74104x4910e751().getVisibility() == 0) {
            i17 = 0 + activityC19366xa1004627.J4.m74104x4910e751().getWidth();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "setCancelTextViewCallback, width = %s, commonRightBtnWidth = %s.", java.lang.Integer.valueOf(view.getWidth()), java.lang.Integer.valueOf(i17));
        android.view.View view2 = activityC19366xa1004627.G4;
        if (view2 != null) {
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams.rightMargin = i17 + measuredWidth;
            layoutParams.leftMargin = java.lang.Math.max(activityC19366xa1004627.O4.getRight() - ((int) activityC19366xa1004627.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz)), (int) activityC19366xa1004627.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
            layoutParams.width = -1;
            activityC19366xa1004627.G4.setLayoutParams(layoutParams);
        }
        android.view.View view3 = activityC19366xa1004627.H4;
        if (view3 != null) {
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams2.rightMargin = measuredWidth;
            layoutParams2.leftMargin = activityC19366xa1004627.O4.getRight() - ((int) activityC19366xa1004627.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz));
            layoutParams2.width = -1;
            activityC19366xa1004627.H4.setLayoutParams(layoutParams2);
        }
    }
}
