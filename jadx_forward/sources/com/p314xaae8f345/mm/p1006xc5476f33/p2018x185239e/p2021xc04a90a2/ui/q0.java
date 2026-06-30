package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui;

/* loaded from: classes9.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17119xa7d39434 f238241d;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17119xa7d39434 activityC17119xa7d39434) {
        this.f238241d = activityC17119xa7d39434;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17119xa7d39434 activityC17119xa7d39434 = this.f238241d;
        int measuredWidth = activityC17119xa7d39434.f238127g.getMeasuredWidth();
        java.lang.String string = activityC17119xa7d39434.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gxa, activityC17119xa7d39434.f238142y);
        java.lang.String string2 = activityC17119xa7d39434.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gxb, activityC17119xa7d39434.f238143z);
        if (measuredWidth != 0) {
            float measureText = activityC17119xa7d39434.f238128h.getPaint().measureText(string);
            float measureText2 = activityC17119xa7d39434.f238129i.getPaint().measureText(string2);
            float f17 = measuredWidth;
            if (measureText + measureText2 > f17) {
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) activityC17119xa7d39434.f238128h.getLayoutParams();
                layoutParams.width = (int) (f17 - measureText2);
                activityC17119xa7d39434.f238128h.setLayoutParams(layoutParams);
            }
        }
        activityC17119xa7d39434.f238128h.setText(string);
        activityC17119xa7d39434.f238129i.setText(string2);
    }
}
