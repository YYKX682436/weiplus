package hr3;

/* loaded from: classes3.dex */
public final class rd extends wm3.a implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f365483d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f365484e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f365483d = jz5.h.b(new hr3.nd(this));
        jz5.h.b(new hr3.qd(this));
        this.f365484e = jz5.h.b(new hr3.od(activity, this));
    }

    public final com.p314xaae8f345.mm.ui.p2740x696c9db.f5 T6() {
        return (com.p314xaae8f345.mm.ui.p2740x696c9db.f5) ((jz5.n) this.f365484e).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        T6().f291933e = null;
        T6().d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiPictureKeyboardUIC", "onDestroy, keyboardHeightProvider close");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 T6 = T6();
        if (T6 != null) {
            T6.d();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiPictureKeyboardUIC", "onPause, keyboardHeightProvider close");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 T6 = T6();
        if (T6 != null) {
            T6.f();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiPictureKeyboardUIC", "onResume, keyboardHeightProvider start");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onWindowFocusChanged */
    public void mo14961xa4ec7b0b(boolean z17) {
        super.mo14961xa4ec7b0b(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiPictureKeyboardUIC", "onWindowFocusChanged, hasFocus:" + z17);
        if (z17) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.f5 T6 = T6();
            if (T6 != null) {
                T6.f();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiPictureKeyboardUIC", "onWindowFocusChanged, keyboardHeightProvider start");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiPictureKeyboardUIC", "onKeyboardHeightChanged, height:" + i17 + ", isResized:" + z17);
        android.view.ViewGroup.LayoutParams layoutParams = ((android.widget.LinearLayout) ((jz5.n) this.f365483d).mo141623x754a37bb()).getLayoutParams();
        if (layoutParams != null) {
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(layoutParams.height, i17);
            ofInt.addUpdateListener(new hr3.pd(layoutParams, this));
            ofInt.setDuration(175L);
            ofInt.start();
        }
    }
}
