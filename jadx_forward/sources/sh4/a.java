package sh4;

/* loaded from: classes8.dex */
public final class a extends ph4.j {

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c f489562b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f489563c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ph4.f callback) {
        super(callback);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f489563c = "TaskBarSectionOtherViewWebViewHelper";
    }

    @Override // ph4.j
    public int a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return com.p314xaae8f345.mm.R.C30861xcebc809e.f563694cg2;
    }

    @Override // ph4.j
    public java.lang.String b(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c) {
        java.lang.String r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f571858ru);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
        return r17;
    }

    @Override // ph4.j
    public void c(ph4.b viewHolder) {
        r45.lr4 v07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        if (this.f489562b == null) {
            return;
        }
        r45.k97 k97Var = new r45.k97();
        java.lang.String str = null;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f489562b;
            k97Var.mo11468x92b714fd(c16601x7ed0e40c != null ? c16601x7ed0e40c.f66790x225a93cf : null);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f489563c, "WebMultiTaskData parse failed");
        }
        java.lang.String m75945x2fec8307 = k97Var.m75945x2fec8307(28);
        if (m75945x2fec8307 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c2 = this.f489562b;
            if (c16601x7ed0e40c2 != null && (v07 = c16601x7ed0e40c2.v0()) != null) {
                str = v07.m75945x2fec8307(5);
            }
        } else {
            str = m75945x2fec8307;
        }
        if (str != null) {
            n11.a.b().h(str, viewHolder.f435995e, gh4.j0.f353466a);
        }
    }

    @Override // ph4.j
    public void d(int i17, ph4.b viewHolder, lh4.n viewModel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewModel, "viewModel");
        java.util.List list = viewModel.f400257d;
        this.f489562b = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) ((java.util.ArrayList) list).get(i17);
        viewHolder.f435996f.setText(((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) ((java.util.ArrayList) list).get(i17)).v0().m75945x2fec8307(1));
        super.d(i17, viewHolder, viewModel);
    }
}
