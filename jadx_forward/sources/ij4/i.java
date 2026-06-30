package ij4;

/* loaded from: classes10.dex */
public final class i extends mr.i {

    /* renamed from: q, reason: collision with root package name */
    public final boolean f373264q;

    public i(boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f373264q = (i17 & 1) != 0 ? true : z17;
    }

    @Override // mr.i
    public android.view.View o(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        if (layoutManager == null) {
            return null;
        }
        if (layoutManager.getF204840r()) {
            return j(layoutManager, m(layoutManager));
        }
        if (layoutManager.mo2416xc6ea780e()) {
            return j(layoutManager, l(layoutManager));
        }
        return null;
    }

    @Override // mr.i
    public boolean p(android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 helper) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        if (!this.f373264q) {
            return false;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = null;
        if (view != null && (c1163xf1deaba4 = this.f412353h) != null) {
            k3Var = c1163xf1deaba4.w0(view);
        }
        if (k3Var != null && k3Var.m8183xf806b362() == layoutManager.m8020x7e414b06() - 1) {
            if ((helper.k() + helper.l()) - helper.e(view) > helper.c(view) / 2) {
                return true;
            }
        }
        super.p(view, layoutManager, helper);
        return false;
    }
}
