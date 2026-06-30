package pk2;

/* loaded from: classes3.dex */
public final class p7 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f437693a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f437694b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f437695c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f437696d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.LinearLayout f437697e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f437698f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f437699g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f437700h;

    public p7(android.content.Context context, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f437693a = context;
        this.f437694b = z17;
        this.f437695c = jz5.h.b(new pk2.o7(this));
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.eek, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f437696d = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.tv8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f437697e = (android.widget.LinearLayout) findViewById;
        this.f437698f = new java.util.LinkedHashMap();
        this.f437699g = new java.util.LinkedHashMap();
        this.f437700h = new java.util.LinkedHashMap();
    }

    public final pk2.g7 a(java.lang.String levelId, java.lang.String str, db5.o4 o4Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(levelId, "levelId");
        java.util.Map map = this.f437700h;
        pk2.g7 g7Var = (pk2.g7) ((java.util.LinkedHashMap) map).get(levelId);
        if (g7Var == null) {
            pk2.g7 g7Var2 = new pk2.g7(levelId, null, new db5.g4(this.f437693a), null, null, false, null, null, 250, null);
            map.put(levelId, g7Var2);
            g7Var = g7Var2;
        }
        if (str != null) {
            g7Var.f437313b = str;
        }
        if (o4Var != null) {
            g7Var.f437315d = o4Var;
        }
        return g7Var;
    }

    public final void b(java.lang.String levelId, android.view.View widget) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(levelId, "levelId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        java.util.Map map = this.f437700h;
        pk2.g7 g7Var = (pk2.g7) ((java.util.LinkedHashMap) map).get(levelId);
        if (g7Var == null) {
            g7Var = new pk2.g7(levelId, null, new db5.g4(this.f437693a), null, null, false, null, null, 250, null);
            map.put(levelId, g7Var);
        }
        android.view.View view = g7Var.f437318g;
        if (view != null && view != widget && view.getParent() != null) {
            android.view.ViewParent parent = view.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        g7Var.f437318g = widget;
        g7Var.f437317f = true;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 c() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3) ((jz5.n) this.f437695c).mo141623x754a37bb();
    }

    public final void d(java.lang.String levelId, db5.t4 t4Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(levelId, "levelId");
        pk2.g7 g7Var = (pk2.g7) ((java.util.LinkedHashMap) this.f437700h).get(levelId);
        if (g7Var != null) {
            g7Var.f437316e = t4Var;
        }
        pk2.l7 l7Var = (pk2.l7) ((java.util.LinkedHashMap) this.f437698f).get(levelId);
        if (l7Var != null) {
            l7Var.f437492e = t4Var;
        }
    }

    public final void e(java.lang.String levelId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(levelId, "levelId");
        pk2.g7 g7Var = (pk2.g7) ((java.util.LinkedHashMap) this.f437700h).get(levelId);
        if (g7Var != null) {
            g7Var.f437317f = z17;
        }
        jz5.l lVar = (jz5.l) ((java.util.LinkedHashMap) this.f437699g).get(levelId);
        if (lVar != null) {
            android.widget.TextView textView = (android.widget.TextView) lVar.f384366d;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) lVar.f384367e;
            if (textView != null) {
                textView.setVisibility(z17 ? 0 : 8);
            }
            c1163xf1deaba4.setVisibility(z17 ? 0 : 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0083, code lost:
    
        if ((r10.length() > 0) == true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.p7.f():void");
    }
}
