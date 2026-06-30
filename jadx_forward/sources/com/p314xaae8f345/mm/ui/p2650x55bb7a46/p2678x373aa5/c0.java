package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes13.dex */
public final class c0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21895xf6c09a87 f284415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f284416e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorSet f284417f;

    public c0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21895xf6c09a87 c21895xf6c09a87, yz5.a aVar, android.animation.AnimatorSet animatorSet) {
        this.f284415d = c21895xf6c09a87;
        this.f284416e = aVar;
        this.f284417f = animatorSet;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21895xf6c09a87 c21895xf6c09a87 = this.f284415d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c21895xf6c09a87.f284357d, "onAnimationCancel");
        c21895xf6c09a87.f284361h = false;
        c21895xf6c09a87.f284362i = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21895xf6c09a87 c21895xf6c09a87 = this.f284415d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c21895xf6c09a87.f284357d, "onAnimationEnd");
        c21895xf6c09a87.f284368r.clear();
        c21895xf6c09a87.f284369s.clear();
        c21895xf6c09a87.f284361h = false;
        c21895xf6c09a87.f284362i = true;
        yz5.a aVar = this.f284416e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21895xf6c09a87 c21895xf6c09a87 = this.f284415d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c21895xf6c09a87.f284357d, "onAnimationStart");
        java.util.Iterator it = ((java.util.ArrayList) c21895xf6c09a87.f284369s).iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) it.next();
            android.graphics.PorterDuff.Mode tintMode = android.graphics.PorterDuff.Mode.DST;
            c21895xf6c09a87.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tintMode, "tintMode");
            android.graphics.drawable.Drawable background = view.getBackground();
            if (background != null) {
                background.setTintMode(tintMode);
            }
        }
        c21895xf6c09a87.f284361h = true;
        c21895xf6c09a87.f284362i = false;
        c21895xf6c09a87.postDelayed(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.b0(c21895xf6c09a87, this.f284416e), this.f284417f.getDuration() + 100);
    }
}
