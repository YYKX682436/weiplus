package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes5.dex */
public class m1 implements al5.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19078xd7766fa3 f260951d;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19078xd7766fa3 activityC19078xd7766fa3) {
        this.f260951d = activityC19078xd7766fa3;
    }

    @Override // al5.e0
    public void J2(boolean z17, int i17) {
        android.animation.ObjectAnimator ofFloat;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19078xd7766fa3 activityC19078xd7766fa3 = this.f260951d;
        boolean z18 = activityC19078xd7766fa3.f260790r;
        if (!activityC19078xd7766fa3.f260790r && z17) {
            int height = ((android.view.WindowManager) activityC19078xd7766fa3.getSystemService("window")).getDefaultDisplay().getHeight();
            int b17 = i65.a.b(activityC19078xd7766fa3.mo55332x76847179(), 96);
            int b18 = i65.a.b(activityC19078xd7766fa3.mo55332x76847179(), 40);
            int b19 = i65.a.b(activityC19078xd7766fa3.mo55332x76847179(), 32);
            int b27 = i65.a.b(activityC19078xd7766fa3.mo55332x76847179(), 40);
            int j17 = (((height - com.p314xaae8f345.mm.ui.bl.j(activityC19078xd7766fa3.mo55332x76847179())) - com.p314xaae8f345.mm.ui.bl.c(activityC19078xd7766fa3.mo55332x76847179())) - o25.n1.a(activityC19078xd7766fa3.mo55332x76847179())) - activityC19078xd7766fa3.f260780e.getBottom();
            if (((j17 - b27) - i17) - b18 > b19) {
                activityC19078xd7766fa3.f260789q = i17 - (b17 - b18);
            } else {
                activityC19078xd7766fa3.f260789q = ((j17 - b19) - b27) - b17;
            }
        }
        if (activityC19078xd7766fa3.f260790r != z17) {
            activityC19078xd7766fa3.f260790r = z17;
            if (z17) {
                android.widget.Button button = activityC19078xd7766fa3.f260781f;
                ofFloat = android.animation.ObjectAnimator.ofFloat(button, "translationY", button.getTranslationY(), activityC19078xd7766fa3.f260781f.getTranslationY() - activityC19078xd7766fa3.f260789q);
            } else {
                android.widget.Button button2 = activityC19078xd7766fa3.f260781f;
                ofFloat = android.animation.ObjectAnimator.ofFloat(button2, "translationY", button2.getTranslationY(), activityC19078xd7766fa3.f260781f.getTranslationY() + activityC19078xd7766fa3.f260789q);
            }
            ofFloat.setDuration(175L);
            ofFloat.setInterpolator(new y3.b());
            ofFloat.start();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayRealnameInputAddressUI", "onInputPanelChange() isKeyboardShow:%s keyboardHeight:%s moveHeight:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(activityC19078xd7766fa3.f260789q));
    }
}
