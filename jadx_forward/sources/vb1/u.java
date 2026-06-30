package vb1;

/* loaded from: classes7.dex */
public final class u extends gb1.d {

    /* renamed from: CTRL_INDEX */
    public static final int f77272x366c91de = 594;

    /* renamed from: NAME */
    public static final java.lang.String f77273x24728b = "insertWebGLCanvas";

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f516034g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public boolean f516035h;

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return data.getInt("canvasId");
    }

    @Override // gb1.d
    public boolean I() {
        return this.f516035h;
    }

    @Override // gb1.d
    public boolean J() {
        return this.f516035h;
    }

    @Override // gb1.d
    public android.view.View L(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, org.json.JSONObject data, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 component = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) tVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiInsertHTMLCanvasElement", "inflateView of HTMLCanvasElement for canvasId [" + i17 + "] [" + data + ']');
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 U1 = component.U1();
        ae.r rVar = U1 != null ? (ae.r) U1.z1(ae.r.class) : null;
        if (rVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("JsApiInsertHTMLCanvasElement", "hy: webgl extension not exists!");
            return null;
        }
        com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad w17 = rVar.w();
        if (w17 == null) {
            return null;
        }
        this.f516035h = data.optBoolean("scrollSupportedTouchEvent", false);
        vb1.q qVar = new vb1.q(this, i17);
        this.f516034g.put(java.lang.Integer.valueOf(i17), qVar);
        android.content.Context f229340d = component.getF229340d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f229340d, "getContext(...)");
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2 = new com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2(f229340d, gh.y.TextureView);
        c4216x654bedf2.m34867x7867078f(w17);
        c4216x654bedf2.getPreparedListeners().a(new vb1.r(qVar));
        if (data.optBoolean("transparentBackground", false)) {
            c4216x654bedf2.m34868x1c0e5b23(false);
        }
        vb1.b bVar = vb1.d.f516006c;
        java.lang.String mo48798x74292566 = component.mo48798x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
        bVar.a(mo48798x74292566).a(i17, c4216x654bedf2);
        if (this.f516035h) {
            c4216x654bedf2.m34866xdd3a8900(false);
        }
        component.U(new vb1.s(component, i17, w17));
        if (component.l2()) {
            java.lang.String mo48798x742925662 = component.mo48798x74292566();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x742925662, "getAppId(...)");
            vb1.d a17 = bVar.a(mo48798x742925662);
            a17.c(i17);
            if (a17.d() == 1) {
                w17.f();
            }
        }
        component.R(new vb1.t(component, i17, w17));
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505(component.getF229340d(), c4216x654bedf2);
    }

    @Override // gb1.d
    public void O(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject data, gb1.n callback) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 component = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) tVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.Object obj = this.f516034g.get(java.lang.Integer.valueOf(i17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        vb1.q qVar = (vb1.q) obj;
        qVar.f516025c = callback;
        if (qVar.f516024b) {
            qVar.a();
        }
    }
}
