package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui;

/* loaded from: classes5.dex */
public class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17121x70367c94 f238265d;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17121x70367c94 activityC17121x70367c94) {
        this.f238265d = activityC17121x70367c94;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17121x70367c94 activityC17121x70367c94 = this.f238265d;
        int measuredWidth = activityC17121x70367c94.f238165x.getMeasuredWidth();
        java.lang.String string = activityC17121x70367c94.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574083gx5, activityC17121x70367c94.f238149f);
        java.lang.String string2 = activityC17121x70367c94.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gxe, activityC17121x70367c94.f238150g);
        if (measuredWidth != 0) {
            float measureText = activityC17121x70367c94.f238167y.getPaint().measureText(string);
            float measureText2 = activityC17121x70367c94.f238168z.getPaint().measureText(string2) + i65.a.b(activityC17121x70367c94, 17);
            float f17 = measuredWidth;
            if (measureText + measureText2 > f17) {
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) activityC17121x70367c94.f238167y.getLayoutParams();
                layoutParams.width = (int) (f17 - measureText2);
                activityC17121x70367c94.f238167y.setLayoutParams(layoutParams);
            }
        }
        activityC17121x70367c94.f238167y.setText(string);
        activityC17121x70367c94.f238168z.setText(string2);
    }
}
