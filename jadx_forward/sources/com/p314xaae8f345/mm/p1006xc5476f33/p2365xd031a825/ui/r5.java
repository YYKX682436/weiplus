package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes5.dex */
public class r5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 f262133d;

    public r5(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 activityC19116x82bf90f1) {
        this.f262133d = activityC19116x82bf90f1;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 activityC19116x82bf90f1 = this.f262133d;
        try {
            if (activityC19116x82bf90f1.W.getVisibility() != 0 || activityC19116x82bf90f1.T.getRight() <= 0 || activityC19116x82bf90f1.W.getLeft() <= 0 || activityC19116x82bf90f1.T.getRight() < activityC19116x82bf90f1.W.getLeft() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(activityC19116x82bf90f1.T.getText())) {
                return;
            }
            float textSize = activityC19116x82bf90f1.T.getTextSize();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOrderInfoNewUI", "tinyAppDescTv size exceed, tinyAppDescTv.getRight(): %s, tinyAppButton.getLeft(): %s", java.lang.Integer.valueOf(activityC19116x82bf90f1.T.getRight()), java.lang.Integer.valueOf(activityC19116x82bf90f1.W.getLeft()));
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setTextSize(textSize);
            java.lang.String charSequence = activityC19116x82bf90f1.T.getText().toString();
            float left = activityC19116x82bf90f1.W.getLeft() - activityC19116x82bf90f1.T.getLeft();
            int i17 = 1;
            while (paint.measureText(charSequence.substring(0, (charSequence.length() - i17) - 1)) > left && i17 <= charSequence.length() - 1) {
                i17++;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOrderInfoNewUI", "tinyAppDescTv, exceed len, final search count: %s, text.length: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(charSequence.length()));
            java.lang.String substring = charSequence.substring(0, (charSequence.length() - i17) - 1);
            if (charSequence.length() > 9 && substring.length() < 9) {
                substring = charSequence.substring(0, 9);
            }
            activityC19116x82bf90f1.T.setText(substring);
            activityC19116x82bf90f1.T.append("...");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletOrderInfoNewUI", e17, "calc tinyapp name error: %s", e17.getMessage());
        }
    }
}
