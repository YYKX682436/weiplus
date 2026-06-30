package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class u2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 f233005d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68) {
        super(0);
        this.f233005d = c16668xffb9dd68;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        java.lang.Object obj = this.f233005d.f232516p;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        if (view != null && (animate = view.animate()) != null && (alpha = animate.alpha(1.0f)) != null) {
            alpha.start();
        }
        return jz5.f0.f384359a;
    }
}
