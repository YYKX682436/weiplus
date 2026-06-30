package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 f92279d;

    public t(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 c1059xa8272988) {
        this.f92279d = c1059xa8272988;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 c1059xa8272988 = this.f92279d;
        c1059xa8272988.removeCallbacks(this);
        android.view.MotionEvent motionEvent = c1059xa8272988.E1;
        if (motionEvent != null) {
            boolean z17 = false;
            boolean z18 = motionEvent.getToolType(0) == 3;
            int actionMasked = motionEvent.getActionMasked();
            if (!z18 ? actionMasked != 1 : !(actionMasked == 10 || actionMasked == 1)) {
                z17 = true;
            }
            if (z17) {
                int i17 = 7;
                if (actionMasked != 7 && actionMasked != 9) {
                    i17 = 2;
                }
                p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 c1059xa82729882 = this.f92279d;
                c1059xa82729882.v(motionEvent, i17, c1059xa82729882.F1, false);
            }
        }
    }
}
