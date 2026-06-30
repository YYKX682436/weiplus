package mx0;

/* loaded from: classes5.dex */
public final class ja implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f413608d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f413609e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f413610f;

    /* renamed from: g, reason: collision with root package name */
    public final mx0.z f413611g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Integer f413612h;

    /* renamed from: i, reason: collision with root package name */
    public mx0.t9 f413613i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f413614m;

    /* renamed from: n, reason: collision with root package name */
    public volatile e06.k f413615n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f413616o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f413617p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f413618q;

    /* renamed from: r, reason: collision with root package name */
    public wu5.c f413619r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f413620s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f413621t;

    public ja(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 templateListRv, android.widget.TextView selectedTemplateNameTv, android.widget.TextView guideWordingTv, mx0.z controller) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateListRv, "templateListRv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedTemplateNameTv, "selectedTemplateNameTv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(guideWordingTv, "guideWordingTv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.f413608d = templateListRv;
        this.f413609e = selectedTemplateNameTv;
        this.f413610f = guideWordingTv;
        this.f413611g = controller;
        this.f413613i = new mx0.v9(0);
        this.f413614m = new java.util.ArrayList();
        this.f413615n = new e06.k(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f413618q = true;
        this.f413620s = jz5.h.a(jz5.i.f384364f, new mx0.ea(this));
        this.f413621t = true;
    }

    public static final void a(mx0.ja jaVar) {
        mx0.t9 t9Var = jaVar.f413613i;
        mx0.v9 v9Var = t9Var instanceof mx0.v9 ? (mx0.v9) t9Var : null;
        if (v9Var == null) {
            return;
        }
        t9Var.f413893h = null;
        jaVar.f413612h = null;
        int i17 = v9Var.f413889d;
        v9Var.f413889d = 0;
        mx0.r9 r9Var = mx0.r9.f413828e;
        v9Var.m8148xed6e4d18(i17, r9Var);
        v9Var.m8148xed6e4d18(0, r9Var);
        android.widget.TextView textView = jaVar.f413609e;
        textView.setText("");
        textView.setVisibility(8);
    }

    public final void b(java.lang.String str, boolean z17) {
        int i17 = 0;
        boolean z18 = str == null || str.length() == 0;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f413608d;
        if (z18 || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "kEmptyTemplateId")) {
            if (this.f413612h != null) {
                c1163xf1deaba4.post(new mx0.fa(this));
                return;
            }
            return;
        }
        mx0.t9 t9Var = this.f413613i;
        java.util.Iterator it = t9Var.f413891f.iterator();
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((vt3.p) it.next()).f521553b, str)) {
                break;
            } else {
                i17++;
            }
        }
        c1163xf1deaba4.post(new mx0.ga(this, t9Var.z(i17), z17));
    }

    public final void c(int i17) {
        this.f413613i.f413893h = null;
        this.f413612h = java.lang.Integer.valueOf(i17);
        mx0.t9 t9Var = this.f413613i;
        int i18 = t9Var.f413889d;
        t9Var.f413889d = t9Var.z(i17);
        mx0.r9 r9Var = mx0.r9.f413828e;
        t9Var.m8148xed6e4d18(i18, r9Var);
        t9Var.m8148xed6e4d18(t9Var.f413889d, r9Var);
        java.lang.Object obj = this.f413614m.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        vt3.p pVar = (vt3.p) obj;
        java.lang.String str = pVar.f521554c;
        android.widget.TextView textView = this.f413609e;
        textView.setText(str);
        textView.setVisibility(0);
        if (!(pVar.f521565n.length() > 0)) {
            this.f413610f.setVisibility(8);
            return;
        }
        this.f413610f.setVisibility(0);
        this.f413610f.setText(pVar.f521565n);
        ku5.u0 u0Var = ku5.t0.f394148d;
        mx0.ha haVar = new mx0.ha(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f413619r = t0Var.z(haVar, 3000L, false);
    }

    @Override // yt3.r2
    /* renamed from: onPause */
    public void mo11000xb01dfb57() {
        this.f413612h = null;
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        wu5.c cVar = this.f413619r;
        if (cVar != null) {
            cVar.cancel(false);
        }
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        if (this.f413618q) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f413608d;
            if (i17 != 0) {
                if (c1163xf1deaba4.getVisibility() == 0) {
                    sa5.d.d(this.f413608d, 0, 0L, null, 7, null);
                }
            } else if (c1163xf1deaba4.getVisibility() == 4 || c1163xf1deaba4.getVisibility() == 8) {
                sa5.d.c(this.f413608d, 0.0f, 0L, null, 7, null);
            }
        }
    }

    @Override // yt3.r2
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        mx0.t9 t9Var = this.f413613i;
        mx0.ca caVar = new mx0.ca(this);
        t9Var.getClass();
        t9Var.f413892g = caVar;
        mx0.t9 t9Var2 = this.f413613i;
        mx0.v9 v9Var = t9Var2 instanceof mx0.v9 ? (mx0.v9) t9Var2 : null;
        if (v9Var != null) {
            v9Var.f413936i = new mx0.da(this);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f413608d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c1163xf1deaba4.getContext());
        c1162x665295de.Q(0);
        c1163xf1deaba4.mo7967x900dcbe1(c1162x665295de);
        c1163xf1deaba4.mo7960x6cab2c8d(this.f413613i);
        c1163xf1deaba4.N(new mx0.y9());
        com.p314xaae8f345.mm.ui.fk.a(this.f413609e);
    }
}
