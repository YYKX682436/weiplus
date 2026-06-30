package gt4;

/* loaded from: classes5.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577 f356985d;

    public i2(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577 c19151x10374577) {
        this.f356985d = c19151x10374577;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577 c19151x10374577 = this.f356985d;
        try {
            if (c19151x10374577.f262268g.getVisibility() != 0 || c19151x10374577.f262266e.getRight() <= 0 || c19151x10374577.f262268g.getLeft() <= 0 || c19151x10374577.f262266e.getRight() < c19151x10374577.f262268g.getLeft() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(c19151x10374577.f262266e.getText())) {
                return;
            }
            float textSize = c19151x10374577.f262266e.getTextSize();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "nameTv size exceed, nameTv.getRight(): %s, button.getLeft(): %s", java.lang.Integer.valueOf(c19151x10374577.f262266e.getRight()), java.lang.Integer.valueOf(c19151x10374577.f262268g.getLeft()));
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setTextSize(textSize);
            java.lang.String charSequence = c19151x10374577.f262266e.getText().toString();
            float left = c19151x10374577.f262268g.getLeft() - c19151x10374577.f262266e.getLeft();
            int i17 = 1;
            while (paint.measureText(charSequence.substring(0, (charSequence.length() - i17) - 1)) > left && i17 <= charSequence.length() - 1) {
                i17++;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "nameTv, exceed len, final search count: %s, text.length: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(charSequence.length()));
            java.lang.String substring = charSequence.substring(0, (charSequence.length() - i17) - 1);
            if (charSequence.length() > 9 && substring.length() < 9) {
                substring = charSequence.substring(0, 9);
            }
            c19151x10374577.f262266e.setText(substring);
            c19151x10374577.f262266e.append("...");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletSuccPageAwardWidget", e17, "calc nameTv len error: %s", e17.getMessage());
        }
    }
}
