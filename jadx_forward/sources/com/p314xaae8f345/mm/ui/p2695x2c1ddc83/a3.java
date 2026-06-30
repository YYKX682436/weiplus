package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public final class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b3 f288964d;

    public a3(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b3 b3Var) {
        this.f288964d = b3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b3 b3Var = this.f288964d;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x2 x2Var = b3Var.f288997f;
        if (!((b3Var.f288993b == null && b3Var.f288995d == null) ? false : true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ConversationClickStatusController", "is not need dismissClickStatus");
            return;
        }
        android.animation.ValueAnimator valueAnimator = b3Var.f288992a;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ConversationClickStatusController", "[dismissClickStatus] animation is running! %s", b3Var.f288993b);
            return;
        }
        android.view.View view = b3Var.f288995d;
        if (view == null) {
            b3Var.f288993b = null;
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationClickStatusController", "[dismissClickStatus] %s username:%s", java.lang.Integer.valueOf(view.hashCode()), b3Var.f288993b);
        int color = view.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835);
        int color2 = view.getContext().getResources().getColor((x2Var == null || !x2Var.a()) ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c : com.p314xaae8f345.mm.R.C30859x5a72f63.f560849vw);
        b3Var.f288994c = new android.graphics.drawable.ColorDrawable(com.p314xaae8f345.mm.ui.uk.b(color, color2));
        jl1.a aVar = new jl1.a(com.p314xaae8f345.mm.ui.uk.b(color, color2), color2);
        view.setBackgroundColor(com.p314xaae8f345.mm.ui.uk.b(color, color2));
        android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofFloat("ratio", 0.0f, 1.0f));
        ofPropertyValuesHolder.addUpdateListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.y2(aVar, view, b3Var));
        ofPropertyValuesHolder.addListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.z2(x2Var, b3Var, view));
        ofPropertyValuesHolder.setDuration(60L);
        if (b3Var.f288994c != null) {
            b3Var.f288996e = b3Var.f288995d;
            ofPropertyValuesHolder.start();
            b3Var.f288992a = ofPropertyValuesHolder;
        }
    }
}
