package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes5.dex */
public class g6 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266286m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var, com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc, android.view.View.OnTouchListener onTouchListener, java.lang.String str) {
        super(c23001x9d3a0bdc, onTouchListener);
        this.f266286m = str;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y, com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.i, android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean onTouch = super.onTouch(view, motionEvent);
        if (onTouch) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMNeatTouchListener", "terry h5 apply click");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16337, this.f266286m, 1, 1);
        }
        return onTouch;
    }
}
