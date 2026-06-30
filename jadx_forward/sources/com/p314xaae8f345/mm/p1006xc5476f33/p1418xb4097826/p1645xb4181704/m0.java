package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class m0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f211836n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(int i17, int i18, android.content.Context context) {
        super(context);
        this.f211836n = i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1, p012xc85e97e9.p103xe821e364.p104xd1075a44.g3
    public void e(android.view.View targetView, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state, p012xc85e97e9.p103xe821e364.p104xd1075a44.e3 action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetView, "targetView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        targetView.toString();
        state.m8168x9616526c();
        super.e(targetView, state, action);
        int h17 = h(targetView, m());
        int i17 = i(targetView, 1);
        if (k((int) java.lang.Math.sqrt((h17 * h17) + (i17 * i17))) > 0) {
            action.b(-h17, (-i17) + 0, this.f211836n, new android.view.animation.LinearInterpolator());
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public int l(int i17) {
        return this.f211836n;
    }
}
