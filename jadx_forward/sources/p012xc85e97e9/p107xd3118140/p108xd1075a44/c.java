package p012xc85e97e9.p107xd3118140.p108xd1075a44;

/* loaded from: classes14.dex */
public class c extends p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960 f93885a;

    public c(p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960 c1168xfe0c8960) {
        this.f93885a = c1168xfe0c8960;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public int a(android.view.View view, int i17, int i18) {
        p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960 c1168xfe0c8960 = this.f93885a;
        p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.LayoutParams layoutParams = (p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.LayoutParams) c1168xfe0c8960.f93862m.getLayoutParams();
        if (c1168xfe0c8960.c()) {
            int width = c1168xfe0c8960.getWidth() - ((c1168xfe0c8960.getPaddingRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + c1168xfe0c8960.f93862m.getWidth());
            return java.lang.Math.max(java.lang.Math.min(i17, width), width - c1168xfe0c8960.f93865p);
        }
        int paddingLeft = c1168xfe0c8960.getPaddingLeft() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        return java.lang.Math.min(java.lang.Math.max(i17, paddingLeft), c1168xfe0c8960.f93865p + paddingLeft);
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public int b(android.view.View view, int i17, int i18) {
        return view.getTop();
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public int c(android.view.View view) {
        return this.f93885a.f93865p;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void e(int i17, int i18) {
        p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960 c1168xfe0c8960 = this.f93885a;
        c1168xfe0c8960.f93870u.c(c1168xfe0c8960.f93862m, i18);
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void g(android.view.View view, int i17) {
        this.f93885a.e();
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void h(int i17) {
        p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960 c1168xfe0c8960 = this.f93885a;
        if (c1168xfe0c8960.f93870u.f92653a == 0) {
            if (c1168xfe0c8960.f93863n != 0.0f) {
                android.view.View view = c1168xfe0c8960.f93862m;
                c1168xfe0c8960.sendAccessibilityEvent(32);
                c1168xfe0c8960.f93871v = true;
            } else {
                c1168xfe0c8960.g(c1168xfe0c8960.f93862m);
                android.view.View view2 = c1168xfe0c8960.f93862m;
                c1168xfe0c8960.sendAccessibilityEvent(32);
                c1168xfe0c8960.f93871v = false;
            }
        }
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void i(android.view.View view, int i17, int i18, int i19, int i27) {
        p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960 c1168xfe0c8960 = this.f93885a;
        if (c1168xfe0c8960.f93862m == null) {
            c1168xfe0c8960.f93863n = 0.0f;
        } else {
            boolean c17 = c1168xfe0c8960.c();
            p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.LayoutParams layoutParams = (p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.LayoutParams) c1168xfe0c8960.f93862m.getLayoutParams();
            int width = c1168xfe0c8960.f93862m.getWidth();
            if (c17) {
                i17 = (c1168xfe0c8960.getWidth() - i17) - width;
            }
            float paddingRight = (i17 - ((c17 ? c1168xfe0c8960.getPaddingRight() : c1168xfe0c8960.getPaddingLeft()) + (c17 ? ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin))) / c1168xfe0c8960.f93865p;
            c1168xfe0c8960.f93863n = paddingRight;
            if (c1168xfe0c8960.f93867r != 0) {
                c1168xfe0c8960.d(paddingRight);
            }
            if (layoutParams.f93878c) {
                c1168xfe0c8960.a(c1168xfe0c8960.f93862m, c1168xfe0c8960.f93863n, c1168xfe0c8960.f93856d);
            }
        }
        c1168xfe0c8960.invalidate();
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void j(android.view.View view, float f17, float f18) {
        int paddingLeft;
        p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.LayoutParams layoutParams = (p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.LayoutParams) view.getLayoutParams();
        p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960 c1168xfe0c8960 = this.f93885a;
        if (c1168xfe0c8960.c()) {
            int paddingRight = c1168xfe0c8960.getPaddingRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            if (f17 < 0.0f || (f17 == 0.0f && c1168xfe0c8960.f93863n > 0.5f)) {
                paddingRight += c1168xfe0c8960.f93865p;
            }
            paddingLeft = (c1168xfe0c8960.getWidth() - paddingRight) - c1168xfe0c8960.f93862m.getWidth();
        } else {
            paddingLeft = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin + c1168xfe0c8960.getPaddingLeft();
            if (f17 > 0.0f || (f17 == 0.0f && c1168xfe0c8960.f93863n > 0.5f)) {
                paddingLeft += c1168xfe0c8960.f93865p;
            }
        }
        c1168xfe0c8960.f93870u.s(paddingLeft, view.getTop());
        c1168xfe0c8960.invalidate();
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public boolean k(android.view.View view, int i17) {
        if (this.f93885a.f93866q) {
            return false;
        }
        return ((p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.LayoutParams) view.getLayoutParams()).f93877b;
    }
}
