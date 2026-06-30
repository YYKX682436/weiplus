package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public final class s5 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 {
    public final jz5.g C;
    public final jz5.g D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 chatFooter, fl5.i oriEdt) {
        super(chatFooter, oriEdt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatFooter, "chatFooter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oriEdt, "oriEdt");
        this.C = jz5.h.b(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.r5(this));
        this.D = jz5.h.b(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.q5(this, chatFooter));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8
    public void b(boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95;
        android.app.Activity f17 = f();
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = f17 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) f17 : null;
        if (activityC21401x6ce6f73f == null || (m78735x28280f95 = activityC21401x6ce6f73f.m78735x28280f95()) == null) {
            return;
        }
        m78735x28280f95.m81450x8e764904(z17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8
    public android.view.View d() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.D).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8
    public android.app.Activity f() {
        android.app.Activity m75433x19263085 = this.f271753b.m75433x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75433x19263085, "getActivity(...)");
        return m75433x19263085;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8
    public android.view.View i() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.C).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }
}
