package pf1;

/* loaded from: classes7.dex */
public final class z extends gb1.d {

    /* renamed from: CTRL_INDEX */
    @java.lang.Deprecated
    public static final int f76416x366c91de = -2;

    /* renamed from: NAME */
    @java.lang.Deprecated
    public static final java.lang.String f76417x24728b = "insertHTMLVConsoleView";

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return data.optInt("htmlId");
    }

    @Override // gb1.d
    public android.view.View K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 component = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) tVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        lm0.a K1 = component.mo32091x9a3f0ba2().K1(pf1.y.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(K1);
        android.content.Context f229340d = component.getF229340d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f229340d, "getContext(...)");
        pf1.w wVar = (pf1.w) ((pf1.y) K1);
        if (!com.p314xaae8f345.p3210x3857dc.a3.j()) {
            sh0.e eVar = (sh0.e) i95.n0.c(sh0.e.class);
            com.p314xaae8f345.p3210x3857dc.f1 f1Var = com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.f301722m;
            com.p314xaae8f345.p3210x3857dc.f1 f1Var2 = com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS;
            ((th0.a0) eVar).getClass();
            com.p314xaae8f345.mm.p2829xfa87f9de.y0.b(f1Var2, null);
        }
        pf1.n nVar = new pf1.n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z6.b(f229340d), wVar.f435339d);
        component.c1(nVar);
        return nVar.mo158317x11b85c7e();
    }
}
