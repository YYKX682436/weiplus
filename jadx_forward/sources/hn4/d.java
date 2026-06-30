package hn4;

/* loaded from: classes10.dex */
public class d extends in4.e0 {

    /* renamed from: c, reason: collision with root package name */
    public final fn4.b f364079c;

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 f364080d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 f364081e;

    public d(fn4.b bVar) {
        this.f364079c = bVar;
    }

    @Override // in4.e0
    public int[] c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, android.view.View view) {
        int[] iArr = new int[2];
        boolean f180019n = layoutManager.getF180019n();
        fn4.b bVar = this.f364079c;
        if (f180019n) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var = this.f364081e;
            if (w1Var == null || w1Var.f93792a != layoutManager) {
                this.f364081e = new p012xc85e97e9.p103xe821e364.p104xd1075a44.u1(layoutManager);
            }
            iArr[0] = this.f364081e.e(view) - bVar.l4();
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.getF204840r()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var2 = this.f364080d;
            if (w1Var2 == null || w1Var2.f93792a != layoutManager) {
                this.f364080d = new p012xc85e97e9.p103xe821e364.p104xd1075a44.v1(layoutManager);
            }
            iArr[1] = this.f364080d.e(view) - bVar.l4();
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // in4.e0
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 d(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.f3) {
            return new hn4.c(this, this.f374494a.getContext());
        }
        return null;
    }

    @Override // in4.e0
    public android.view.View e(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        if (layoutManager.getF204840r()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var = this.f364080d;
            if (w1Var == null || w1Var.f93792a != layoutManager) {
                this.f364080d = new p012xc85e97e9.p103xe821e364.p104xd1075a44.v1(layoutManager);
            }
            return h(layoutManager, this.f364080d);
        }
        if (!layoutManager.getF180019n()) {
            return null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var2 = this.f364081e;
        if (w1Var2 == null || w1Var2.f93792a != layoutManager) {
            this.f364081e = new p012xc85e97e9.p103xe821e364.p104xd1075a44.u1(layoutManager);
        }
        return h(layoutManager, this.f364081e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // in4.e0
    public int f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, int i17, int i18) {
        int m8020x7e414b06;
        android.graphics.PointF a17;
        if (java.lang.Math.abs(i18) <= 500 || java.lang.Math.abs(i17) >= java.lang.Math.abs(i18) || (m8020x7e414b06 = layoutManager.m8020x7e414b06()) == 0) {
            return -1;
        }
        fn4.b bVar = this.f364079c;
        int Y2 = bVar.Y2() + 1;
        if (Y2 == -1) {
            return -1;
        }
        boolean z17 = false;
        boolean z18 = !layoutManager.getF180019n() ? i18 <= 0 : i17 <= 0;
        if ((layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.f3) && (a17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.f3) layoutManager).a(m8020x7e414b06 - 1)) != null && (a17.x < 0.0f || a17.y < 0.0f)) {
            z17 = true;
        }
        int i19 = (!z17 ? z18 : !z18) ? Y2 - 1 : Y2 + 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoPagerSnapHelper", "findTargetSnapPosition velocityY: %d centerPosition: %d forwardDirection: %b result: %d currentPlayPos: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(Y2), java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(bVar.Y2() + 1));
        return i19;
    }

    public final android.view.View h(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var) {
        int m8008x3d79f549 = layoutManager.m8008x3d79f549();
        android.view.View view = null;
        if (m8008x3d79f549 == 0) {
            return null;
        }
        int k17 = layoutManager.m8009xf2b87f0() ? w1Var.k() + ((w1Var.l() - wm4.a.f528816a) / 2) : w1Var.f() / 2;
        int i17 = Integer.MAX_VALUE;
        for (int i18 = 0; i18 < m8008x3d79f549; i18++) {
            android.view.View m8007x6a486239 = layoutManager.m8007x6a486239(i18);
            int abs = java.lang.Math.abs((w1Var.e(m8007x6a486239) + (w1Var.c(m8007x6a486239) / 2)) - k17);
            if (abs < i17) {
                view = m8007x6a486239;
                i17 = abs;
            }
        }
        return view;
    }
}
