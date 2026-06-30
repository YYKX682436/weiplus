package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes10.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.l f259763d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.l lVar) {
        super(2);
        this.f259763d = lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.a m73828xacb01afb = this.f259763d.m73828xacb01afb();
        if (m73828xacb01afb != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19007xc161a489 activityC19007xc161a489 = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19007xc161a489) m73828xacb01afb;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletKnowLqtFullScreenVideoUIUI", "onProgressChange, currentMs: " + longValue + ", totalMs: " + longValue2);
            int i17 = (int) ((((double) longValue) / ((double) longValue2)) * ((double) 100));
            android.widget.TextView textView = activityC19007xc161a489.f259457h;
            if (textView != null) {
                textView.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r(activityC19007xc161a489.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcw), longValue));
            }
            android.widget.SeekBar seekBar = activityC19007xc161a489.f259455f;
            if (seekBar != null) {
                seekBar.setProgress(i17);
            }
        }
        return jz5.f0.f384359a;
    }
}
