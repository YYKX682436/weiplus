package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes5.dex */
public class s6 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17135x4b12f675 f239468d;

    public s6(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17135x4b12f675 activityC17135x4b12f675) {
        this.f239468d = activityC17135x4b12f675;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17135x4b12f675 activityC17135x4b12f675 = this.f239468d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceF2fLargeMoneyUI", "click enter, mTotalAmt:%s", java.lang.Double.valueOf(activityC17135x4b12f675.f238957t));
            double d17 = activityC17135x4b12f675.f238957t;
            if (d17 <= 0.0d) {
                db5.t7.m123882x26a183b(activityC17135x4b12f675.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.kfm, 0).show();
                return true;
            }
            activityC17135x4b12f675.U6(d17);
        }
        return true;
    }
}
