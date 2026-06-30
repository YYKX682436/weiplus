package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public final class p6 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 f272094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f272095e;

    public p6(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 c8Var, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f272094d = c8Var;
        this.f272095e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 c8Var = this.f272094d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = c8Var.f271753b;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 m75443xe6828c7b = c19666xfd6e2f33.m75443xe6828c7b();
        if (m75443xe6828c7b != null) {
            m75443xe6828c7b.m75359x30a01e54(null);
        }
        c8Var.f271752a = false;
        android.view.View i17 = c8Var.i();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(i17, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "closeFullScreenEdt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        i17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(i17, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper", "closeFullScreenEdt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        fl5.i iVar = c8Var.f271754c;
        iVar.getSizeAnimController().a(false);
        java.lang.Object mo141623x754a37bb = ((jz5.n) c8Var.f271768q).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        c8Var.r((android.widget.LinearLayout) mo141623x754a37bb);
        iVar.l().post(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c7(c8Var));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 m75443xe6828c7b2 = c19666xfd6e2f33.m75443xe6828c7b();
        if (m75443xe6828c7b2 != null) {
            m75443xe6828c7b2.f(false);
        }
        c19666xfd6e2f33.R1();
        c8Var.b(true);
        c8Var.t();
        this.f272095e.setListener(null);
        c8Var.h().setTranslationY(0.0f);
        c8Var.h().setTranslationX(0.0f);
    }
}
