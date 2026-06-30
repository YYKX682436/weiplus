package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class a2 extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19081x5e445f1f f260866a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19081x5e445f1f activityC19081x5e445f1f, long j17, long j18) {
        super(j17, j18);
        this.f260866a = activityC19081x5e445f1f;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19081x5e445f1f activityC19081x5e445f1f = this.f260866a;
        activityC19081x5e445f1f.f260802f.setText(activityC19081x5e445f1f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l4c));
        activityC19081x5e445f1f.f260809p = false;
        if (!activityC19081x5e445f1f.f260800d.n() || activityC19081x5e445f1f.f260809p) {
            activityC19081x5e445f1f.f260802f.setEnabled(false);
        } else {
            activityC19081x5e445f1f.f260802f.setEnabled(true);
        }
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19081x5e445f1f activityC19081x5e445f1f = this.f260866a;
        android.widget.Button button = activityC19081x5e445f1f.f260802f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        long j18 = j17 / 1000;
        sb6.append(j18);
        sb6.append("s");
        button.setText(activityC19081x5e445f1f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l4b, sb6.toString()));
        activityC19081x5e445f1f.f260802f.setContentDescription(activityC19081x5e445f1f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l4d, j18 + ""));
    }
}
