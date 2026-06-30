package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes9.dex */
public class k extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.m f295457a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.m mVar, long j17, long j18) {
        super(j17, j18);
        this.f295457a = mVar;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.l lVar = this.f295457a.f295469c;
        if (lVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.k) lVar;
            android.widget.Button button = kVar.f234190a;
            button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi);
            button.setEnabled(true);
            kVar.f234191b.f234011i = null;
        }
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.l lVar = this.f295457a.f295469c;
        if (lVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.k) lVar;
            kVar.getClass();
            int round = (int) java.lang.Math.round(j17 / 1000.0d);
            android.widget.Button button = kVar.f234190a;
            if (round == 0) {
                button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi);
            } else {
                button.setText(java.lang.String.format("%s(%ss)", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi), java.lang.Integer.valueOf(round)));
            }
        }
    }
}
