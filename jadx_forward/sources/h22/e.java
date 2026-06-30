package h22;

/* loaded from: classes10.dex */
public final class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.y1 {

    /* renamed from: f, reason: collision with root package name */
    public boolean f359825f;

    /* renamed from: g, reason: collision with root package name */
    public int f359826g = -1;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 f359827h;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 f359828i;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.y1, p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public int[] c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, android.view.View targetView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetView, "targetView");
        int[] iArr = new int[2];
        if (layoutManager.getF180019n()) {
            if (this.f359827h == null) {
                this.f359827h = new p012xc85e97e9.p103xe821e364.p104xd1075a44.u1(layoutManager);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var = this.f359827h;
            iArr[0] = w1Var == null ? 0 : w1Var.e(targetView) - this.f359826g;
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.getF204840r()) {
            if (this.f359828i == null) {
                this.f359828i = new p012xc85e97e9.p103xe821e364.p104xd1075a44.v1(layoutManager);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var2 = this.f359828i;
            iArr[1] = w1Var2 != null ? w1Var2.e(targetView) - this.f359826g : 0;
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.y1, p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public int g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, int i17, int i18) {
        int m8032xa86cd69f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        if (layoutManager.m8020x7e414b06() == 0) {
            return -1;
        }
        if (this.f359827h == null) {
            this.f359827h = new p012xc85e97e9.p103xe821e364.p104xd1075a44.u1(layoutManager);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var = this.f359827h;
        if (w1Var == null) {
            return -1;
        }
        int m8008x3d79f549 = layoutManager.m8008x3d79f549();
        int i19 = 0;
        android.view.View view = null;
        if (m8008x3d79f549 != 0) {
            int i27 = Integer.MAX_VALUE;
            for (int i28 = 0; i28 < m8008x3d79f549; i28++) {
                android.view.View m8007x6a486239 = layoutManager.m8007x6a486239(i28);
                int e17 = w1Var.e(m8007x6a486239);
                if (e17 < i27) {
                    view = m8007x6a486239;
                    i27 = e17;
                }
            }
        }
        if (view == null || (m8032xa86cd69f = layoutManager.m8032xa86cd69f(view)) == -1) {
            return -1;
        }
        if (!(!layoutManager.getF180019n() ? i18 <= 0 : i17 <= 0)) {
            i19 = m8032xa86cd69f;
        } else if (m8032xa86cd69f != layoutManager.m8020x7e414b06() - 1) {
            i19 = m8032xa86cd69f + 1;
        } else if (!this.f359825f) {
            i19 = layoutManager.m8020x7e414b06() - 1;
        }
        android.view.View f17 = f(layoutManager);
        if (f17 != null) {
            layoutManager.m8032xa86cd69f(f17);
        }
        return i19;
    }
}
