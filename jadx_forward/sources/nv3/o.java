package nv3;

/* loaded from: classes10.dex */
public final class o extends p012xc85e97e9.p103xe821e364.p104xd1075a44.y1 {

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 f422225f;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.y1, p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public int[] c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, android.view.View targetView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetView, "targetView");
        int[] iArr = new int[2];
        if (layoutManager.getF204840r()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var = this.f422225f;
            if (w1Var == null) {
                w1Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.v1(layoutManager);
                this.f422225f = w1Var;
            }
            iArr[1] = w1Var.e(targetView) - w1Var.k();
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.y1, p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public android.view.View f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        if (!(layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de)) {
            return super.f(layoutManager);
        }
        int t17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).t();
        if (t17 == -1) {
            return null;
        }
        return layoutManager.mo7935xa188593e(t17);
    }
}
