package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public class a6 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19488x4bf6d262 f268637d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19488x4bf6d262 c19488x4bf6d262, android.content.Context context) {
        super(context);
        this.f268637d = c19488x4bf6d262;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19488x4bf6d262 c19488x4bf6d262 = this.f268637d;
        if (!c19488x4bf6d262.L && !c19488x4bf6d262.M) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 1 || action == 3) {
            c19488x4bf6d262.L = false;
            c19488x4bf6d262.M = false;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19488x4bf6d262 c19488x4bf6d262 = this.f268637d;
        if (this == c19488x4bf6d262.f268585J && c19488x4bf6d262.m74809xe50ac469() > 0) {
            c19488x4bf6d262.K0();
        } else {
            if (this != c19488x4bf6d262.K || c19488x4bf6d262.m74808xd3ae1da8() <= 0) {
                return;
            }
            c19488x4bf6d262.J0();
        }
    }
}
