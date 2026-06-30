package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes5.dex */
public class u9 extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3 f262191a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3 activityC19125x69c29dd3, long j17, long j18) {
        super(j17, j18);
        this.f262191a = activityC19125x69c29dd3;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3 activityC19125x69c29dd3 = this.f262191a;
        activityC19125x69c29dd3.f261645f.setClickable(true);
        activityC19125x69c29dd3.f261645f.setEnabled(true);
        activityC19125x69c29dd3.f261645f.setText(activityC19125x69c29dd3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0y));
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3 activityC19125x69c29dd3 = this.f262191a;
        activityC19125x69c29dd3.f261645f.setText(activityC19125x69c29dd3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0y) + "(" + (j17 / 1000) + ")");
    }
}
