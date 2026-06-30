package df5;

/* loaded from: classes15.dex */
public final class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df5.u1 f313749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f313750e;

    public t1(df5.u1 u1Var, int i17) {
        this.f313749d = u1Var;
        this.f313750e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        df5.u1 u1Var = this.f313749d;
        u1Var.f313756d = null;
        if (this.f313750e != u1Var.f313755c) {
            int i17 = u1Var.f313755c;
            return;
        }
        android.widget.TextView textView = u1Var.f313758f;
        if (textView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WaitingDotsCtrl", "[WAITING_DOTS] onHoldComplete: currentTv is null, abort");
            return;
        }
        if (!textView.isAttachedToWindow()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WaitingDotsCtrl", "[WAITING_DOTS] onHoldComplete: tv not attached, stop");
            u1Var.c();
            return;
        }
        if (textView.getEditableText() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WaitingDotsCtrl", "[WAITING_DOTS] onHoldComplete: tv not editable, stop");
            u1Var.c();
            return;
        }
        int i18 = u1Var.f313760h;
        int i19 = (i18 + 1) % 4;
        int i27 = u1Var.f313755c;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(u1Var.f313754b);
        ofFloat.addUpdateListener(new df5.r1(i27, u1Var, i18, i19));
        ofFloat.addListener(new df5.s1(u1Var, i27, i19));
        u1Var.f313757e = ofFloat;
        ofFloat.start();
    }
}
