package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes5.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19107x609745b7 f262128d;

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19107x609745b7 activityC19107x609745b7) {
        this.f262128d = activityC19107x609745b7;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19107x609745b7 activityC19107x609745b7 = this.f262128d;
        if (activityC19107x609745b7.f261424z.getVisibility() != 0 || activityC19107x609745b7.f261421w.getRight() < activityC19107x609745b7.f261424z.getLeft() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(activityC19107x609745b7.f261421w.getText())) {
            return;
        }
        float textSize = activityC19107x609745b7.f261421w.getTextSize();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBindCardResultUI", "tinyAppDescTv size exceed, tinyAppDescTv.getRight(): %s, tinyAppButton.getLeft(): %s", java.lang.Integer.valueOf(activityC19107x609745b7.f261421w.getRight()), java.lang.Integer.valueOf(activityC19107x609745b7.f261424z.getLeft()));
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(textSize);
        java.lang.String charSequence = activityC19107x609745b7.f261421w.getText().toString();
        float measureText = paint.measureText(charSequence) - (activityC19107x609745b7.f261421w.getRight() - activityC19107x609745b7.f261424z.getLeft());
        int i17 = 1;
        while (paint.measureText(charSequence.substring(0, (charSequence.length() - i17) - 1)) > measureText && i17 <= charSequence.length() - 1) {
            i17++;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBindCardResultUI", "tinyAppDescTv, exceed len, final search count: %s, text.length: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(charSequence.length()));
        activityC19107x609745b7.f261421w.setText(charSequence.substring(0, (charSequence.length() - i17) - 1));
        activityC19107x609745b7.f261421w.append("...");
    }
}
