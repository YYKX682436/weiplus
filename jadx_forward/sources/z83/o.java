package z83;

/* loaded from: classes5.dex */
public final class o extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16161xd3ca9321 f552281a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16161xd3ca9321 activityC16161xd3ca9321, long j17, long j18) {
        super(j17, j18);
        this.f552281a = activityC16161xd3ca9321;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16161xd3ca9321.f224686s;
        com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16161xd3ca9321 activityC16161xd3ca9321 = this.f552281a;
        activityC16161xd3ca9321.T6().f525548k.setEnabled(true);
        activityC16161xd3ca9321.T6().f525548k.setText(activityC16161xd3ca9321.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g8f));
        activityC16161xd3ca9321.T6().f525548k.setTextColor(activityC16161xd3ca9321.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560302gp));
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16161xd3ca9321.f224686s;
        com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16161xd3ca9321 activityC16161xd3ca9321 = this.f552281a;
        activityC16161xd3ca9321.T6().f525548k.setText(activityC16161xd3ca9321.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g8e, "" + (j17 / 1000)));
    }
}
