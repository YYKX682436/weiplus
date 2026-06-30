package rc5;

/* loaded from: classes9.dex */
public final /* synthetic */ class o extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.l {
    public o(java.lang.Object obj) {
        super(1, obj, rc5.x.class, "dialogCanPullDown", "dialogCanPullDown(Landroid/view/MotionEvent;)Z", 0);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        android.view.MotionEvent p07 = (android.view.MotionEvent) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        rc5.x xVar = (rc5.x) this.f72685xcfcbe9ef;
        boolean z18 = false;
        if (xVar.y7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExpandableHalfScreenChattingUIC", "[+] dialogCanPullDown: pull down to dismiss was disabled.");
        } else {
            if (p07.getAction() == 0) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689 = xVar.W6().B;
                int rawX = (int) p07.getRawX();
                int rawY = (int) p07.getRawY();
                if (c21897x17252689 != null) {
                    int[] iArr = new int[2];
                    c21897x17252689.getLocationOnScreen(iArr);
                    int i17 = iArr[0];
                    int i18 = iArr[1];
                    int measuredWidth = c21897x17252689.getMeasuredWidth() + i17;
                    int measuredHeight = c21897x17252689.getMeasuredHeight() + i18;
                    if (i17 <= rawX && rawX <= measuredWidth) {
                        if (i18 <= rawY && rawY <= measuredHeight) {
                            z17 = true;
                            xVar.C = z17;
                        }
                    }
                }
                z17 = false;
                xVar.C = z17;
            }
            if (xVar.C) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea W6 = xVar.W6();
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x172526892 = W6.B;
                if (c21897x172526892 == null || c21897x172526892.getVisibility() != 0 || W6.B.m79870x9b948425() == 0 || (W6.B.E0() && W6.B.m79076x2e45158f())) {
                    z18 = true;
                }
            } else {
                z18 = xVar.U6(p07);
            }
        }
        return java.lang.Boolean.valueOf(z18);
    }
}
