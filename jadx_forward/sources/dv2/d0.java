package dv2;

/* loaded from: classes2.dex */
public final class d0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zy2.f9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e f325363d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e c15307x329a684e = this.f325363d;
        boolean z17 = false;
        if (c15307x329a684e != null && c15307x329a684e.q()) {
            z17 = true;
        }
        if (!z17) {
            return super.mo2274xbdc3c5dc();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e c15307x329a684e2 = this.f325363d;
        if (c15307x329a684e2 != null) {
            c15307x329a684e2.u();
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        int indexOfChild;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.vc vcVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e.D;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e c15307x329a684e = this.f325363d;
        if (c15307x329a684e == null) {
            android.app.Activity m80379x76847179 = m80379x76847179();
            android.app.Activity m80379x768471792 = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m80379x768471792, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            android.view.Window window = ((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) m80379x768471792).getWindow();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(window, "getWindow(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.vc.a(vcVar, m80379x76847179, window, 2, true, false, 16, null);
            this.f325363d = a17;
            a17.m82804xbcf4cbbe(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e c15307x329a684e2 = this.f325363d;
            if (c15307x329a684e2 == null) {
                return;
            }
            c15307x329a684e2.m82802x7ea6418d(com.p314xaae8f345.mm.R.C30859x5a72f63.f77911xe61cad92);
            return;
        }
        android.app.Activity m80379x768471793 = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m80379x768471793, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        android.view.Window window2 = ((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) m80379x768471793).getWindow();
        if (window2 != null) {
            android.view.View decorView = window2.getDecorView();
            android.widget.FrameLayout frameLayout = decorView instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) decorView : null;
            if (frameLayout == null || (indexOfChild = frameLayout.indexOfChild(c15307x329a684e)) <= 0 || indexOfChild == frameLayout.getChildCount() - 1) {
                return;
            }
            frameLayout.removeView(c15307x329a684e);
            frameLayout.addView(c15307x329a684e);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e c15307x329a684e = this.f325363d;
        if (c15307x329a684e != null) {
            c15307x329a684e.u();
        }
        this.f325363d = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }
}
