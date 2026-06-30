package sf4;

/* loaded from: classes10.dex */
public final class w extends p012xc85e97e9.p103xe821e364.p104xd1075a44.y1 {

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 f489136f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 f489137g;

    private final int i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var) {
        int m8035xd0248a36;
        int m8006xda9e9138;
        if (layoutManager.getF180019n()) {
            m8035xd0248a36 = layoutManager.m8023xe96e78b9(view);
            m8006xda9e9138 = layoutManager.m8033x269429b0(view);
        } else {
            m8035xd0248a36 = layoutManager.m8035xd0248a36(view);
            m8006xda9e9138 = layoutManager.m8006xda9e9138(view);
        }
        return (w1Var.e(view) + ((w1Var.c(view) - (m8035xd0248a36 + m8006xda9e9138)) / 2)) - (layoutManager.m8009xf2b87f0() ? w1Var.k() + (w1Var.l() / 2) : w1Var.f() / 2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.y1, p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public int[] c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, android.view.View targetView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetView, "targetView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageScrollHelper", "LogStory: calculateDistanceToFinalSnap " + layoutManager.m8032xa86cd69f(targetView));
        int[] iArr = new int[2];
        if (layoutManager.getF180019n()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var = this.f489137g;
            if (w1Var == null || w1Var.f93792a != layoutManager) {
                this.f489137g = new p012xc85e97e9.p103xe821e364.p104xd1075a44.u1(layoutManager);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var2 = this.f489137g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w1Var2);
            iArr[0] = i(layoutManager, targetView, w1Var2);
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.getF204840r()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var3 = this.f489136f;
            if (w1Var3 == null || w1Var3.f93792a != layoutManager) {
                this.f489136f = new p012xc85e97e9.p103xe821e364.p104xd1075a44.v1(layoutManager);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var4 = this.f489136f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w1Var4);
            iArr[1] = i(layoutManager, targetView, w1Var4);
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
