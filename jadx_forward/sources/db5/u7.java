package db5;

/* loaded from: classes15.dex */
public class u7 implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e f310061d;

    public u7(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e) {
        this.f310061d = c21520x5bb48e5e;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = this.f310061d;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener = c21520x5bb48e5e.M;
        if (onPageChangeListener != null) {
            onPageChangeListener.mo8331xcb2941fe(i17);
        }
        if (i17 == 0) {
            c21520x5bb48e5e.P = 0.0f;
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
        int i19;
        db5.f0 f0Var;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = this.f310061d;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener = c21520x5bb48e5e.M;
        if (onPageChangeListener != null) {
            onPageChangeListener.mo8332xf210c75a(i17, f17, i18);
        }
        c21520x5bb48e5e.P = f17;
        if (i18 != 0 || (i19 = c21520x5bb48e5e.f279144g) == -1) {
            return;
        }
        db5.p8 p8Var = (db5.p8) c21520x5bb48e5e.m80829xf939df19();
        if (p8Var == null || ((f0Var = p8Var.c(i19, true)) == null && (f0Var = p8Var.f(i19, true)) == null)) {
            f0Var = null;
        }
        if (f0Var != null) {
            f0Var.i();
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = this.f310061d;
        c21520x5bb48e5e.f279144g = c21520x5bb48e5e.f279143f;
        c21520x5bb48e5e.f279143f = i17;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener = c21520x5bb48e5e.M;
        if (onPageChangeListener != null) {
            onPageChangeListener.mo8333x510f45c9(i17);
        }
        db5.f0 m79159xba51a58f = c21520x5bb48e5e.m79159xba51a58f();
        if (m79159xba51a58f != null && (m79159xba51a58f instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f)) {
            c21520x5bb48e5e.p();
        } else {
            c21520x5bb48e5e.f279142e = null;
        }
    }
}
