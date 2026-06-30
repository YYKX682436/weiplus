package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class v6 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e f217745d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final boolean O6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e c15307x329a684e = this.f217745d;
        if (!(c15307x329a684e != null && c15307x329a684e.q())) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e c15307x329a684e2 = this.f217745d;
        if (c15307x329a684e2 == null) {
            return true;
        }
        c15307x329a684e2.u();
        return true;
    }

    public final void P6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.vc vcVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e.D;
        android.app.Activity m80379x76847179 = m80379x76847179();
        android.view.Window window = m158354x19263085().getWindow();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(window, "getWindow(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.vc.a(vcVar, m80379x76847179, window, 3, false, false, 24, null);
        this.f217745d = a17;
        a17.m62154x4319d701(null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        return O6();
    }
}
