package bk4;

/* loaded from: classes11.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f102943a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f102944b;

    /* renamed from: c, reason: collision with root package name */
    public int f102945c;

    /* renamed from: d, reason: collision with root package name */
    public int f102946d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f102947e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.CharSequence f102948f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.CharSequence f102949g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f102950h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Integer f102951i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View.OnClickListener f102952j;

    /* renamed from: k, reason: collision with root package name */
    public bk4.l1 f102953k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.CharSequence f102954l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.CharSequence f102955m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f102956n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f102957o;

    /* renamed from: p, reason: collision with root package name */
    public int f102958p;

    /* renamed from: q, reason: collision with root package name */
    public final p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 f102959q;

    /* renamed from: r, reason: collision with root package name */
    public final u4.d1 f102960r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewGroup f102961s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f102962t;

    /* renamed from: u, reason: collision with root package name */
    public android.text.method.MovementMethod f102963u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f102964v;

    /* renamed from: w, reason: collision with root package name */
    public final yz5.q f102965w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f102966x;

    public c2(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        this.f102943a = textView;
        this.f102944b = new java.util.LinkedList();
        java.lang.CharSequence text = textView.getText();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text, "getText(...)");
        this.f102948f = text;
        this.f102949g = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jvn);
        this.f102950h = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jvp);
        this.f102951i = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30859x5a72f63.f77678x8113c22e);
        this.f102957o = true;
        this.f102958p = 3;
        this.f102959q = new p012xc85e97e9.p112x993b6d55.C1172x76e7e484();
        this.f102960r = new bk4.b2(this);
        android.view.ViewParent parent = textView.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f102961s = (android.view.ViewGroup) parent;
        this.f102963u = android.text.method.LinkMovementMethod.getInstance();
        this.f102965w = new bk4.a2(this);
        this.f102966x = jz5.h.b(bk4.y1.f103163d);
        if (textView.getLayoutParams().width == -2) {
            throw new java.lang.RuntimeException("textView's width can't be wrap_content. Only support match_parent or specified size");
        }
    }

    public static final int b(java.util.Map map, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, android.widget.TextView textView, yz5.q qVar, bk4.c2 c2Var, int i17, int i18) {
        java.lang.CharSequence charSequence3;
        int i19 = (i17 << 16) | i18;
        java.lang.Integer num = (java.lang.Integer) map.get(java.lang.Integer.valueOf(i19));
        if (num != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("verify: ");
            sb6.append(i18);
            sb6.append(" cached");
            return num.intValue();
        }
        f0Var.f391649d++;
        java.lang.String str = charSequence.subSequence(i17, i18).toString() + ((java.lang.Object) charSequence2);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (qVar == null || (charSequence3 = (java.lang.CharSequence) qVar.mo147xb9724478(str, charSequence2, java.lang.Integer.valueOf(i18))) == null) {
            charSequence3 = str;
        }
        textView.setText(pg5.d.a(context, charSequence3));
        int lineCount = textView.getLineCount();
        if (i18 == charSequence.length() && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, charSequence2)) {
            c2Var.f102946d = lineCount;
            c2Var.f102947e = true;
            bk4.l1 l1Var = c2Var.f102953k;
            if (l1Var != null) {
                l1Var.mo10695x3dcbea6f(lineCount);
            }
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("verify: end:");
        sb7.append(i18);
        sb7.append(", lineCount = ");
        sb7.append(lineCount);
        sb7.append(" content:");
        sb7.append(str);
        map.put(java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(lineCount));
        return lineCount;
    }

    public static final void e(bk4.c2 c2Var, p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975) {
        c2Var.f102943a.setMaxLines(c2Var.f102958p);
        android.text.TextUtils.TruncateAt truncateAt = android.text.TextUtils.TruncateAt.END;
        android.widget.TextView textView = c2Var.f102943a;
        textView.setEllipsize(truncateAt);
        java.lang.CharSequence text = textView.getText();
        textView.setText(pg5.d.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, c2Var.f102948f));
        if (abstractC1183x100d4975 != null) {
            android.text.Layout layout = textView.getLayout();
            if (layout != null) {
                int height = layout.getHeight() + textView.getPaddingTop() + textView.getPaddingBottom();
                textView.setText(pg5.d.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, text));
                textView.setMaxLines(Integer.MAX_VALUE);
                textView.getLayoutParams().height = height;
                textView.setLayoutParams(textView.getLayoutParams());
                bk4.u1 u1Var = new bk4.u1(c2Var, textView);
                abstractC1183x100d4975.a(u1Var);
                ((java.util.LinkedList) c2Var.f102944b).add(u1Var);
            }
            u4.g1.a(c2Var.f102961s, abstractC1183x100d4975);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v0, types: [yz5.q] */
    public static final void h(yz5.l lVar, java.lang.CharSequence charSequence, android.widget.TextView textView, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, yz5.q qVar, yz5.l lVar2, int i17) {
        java.lang.CharSequence a17;
        ?? r37;
        if (i17 < 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(charSequence);
            lVar.mo146xb9724478(charSequence);
            return;
        }
        if (i17 >= charSequence2.length()) {
            a17 = pg5.d.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, charSequence2);
        } else {
            java.lang.String str = charSequence2.subSequence(0, i17).toString() + ((java.lang.Object) charSequence3);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            if (qVar != 0 && (r37 = (java.lang.CharSequence) qVar.mo147xb9724478(str, charSequence3, java.lang.Integer.valueOf(i17))) != 0) {
                str = r37;
            }
            a17 = pg5.d.a(context, str);
        }
        textView.setText(a17);
        java.lang.CharSequence text = textView.getText();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text, "getText(...)");
        lVar2.mo146xb9724478(text);
    }

    public final int a(android.widget.TextView textView, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i17, yz5.q qVar) {
        int i18;
        java.util.LinkedHashMap linkedHashMap;
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        if (textView.getLayout() == null) {
            return -1;
        }
        int b17 = b(linkedHashMap2, f0Var, charSequence, charSequence2, textView, qVar, this, 0, charSequence.length());
        if (b17 <= i17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("verify <= targetLineCount, verify = ");
            sb6.append(b17);
            sb6.append(", targetLineCount = ");
            sb6.append(i17);
            textView.setText(pg5.d.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, charSequence));
            return charSequence.length();
        }
        int length = charSequence.length();
        new java.lang.StringBuilder("left = 0, right = ").append(length);
        int i19 = length;
        int i27 = 0;
        while (true) {
            if (i27 > i19) {
                break;
            }
            int i28 = (i27 + i19) / 2;
            int i29 = i27;
            int i37 = i19;
            int b18 = b(linkedHashMap2, f0Var, charSequence, charSequence2, textView, qVar, this, 0, i28);
            java.lang.String str = "binarySearch: (" + i29 + ", " + i28 + ", " + i37 + "), pLineCount = " + b18;
            if (b18 < i17) {
                str = str + ", targetLineCount = " + i17 + ", pLineCount < targetLineCount";
                i27 = i28 + 1;
                i18 = i28;
                linkedHashMap = linkedHashMap2;
            } else if (b18 == i17) {
                int i38 = i28 + 1;
                linkedHashMap = linkedHashMap2;
                int b19 = b(linkedHashMap2, f0Var, charSequence, charSequence2, textView, qVar, this, 0, i38);
                str = str + ", nLineCount = " + b19;
                int i39 = i17 + 1;
                if (b19 < i39) {
                    i18 = i28;
                    i27 = i38;
                } else if (b19 == i39) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("success = ");
                    sb7.append(i28);
                    sb7.append(", verifyCount = ");
                    sb7.append(f0Var.f391649d);
                    return i28;
                }
            } else {
                i18 = i28;
                linkedHashMap = linkedHashMap2;
                i37 = i18 - 1;
                i27 = i29;
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str);
            sb8.append(", text = ");
            sb8.append(charSequence.subSequence(0, i18).toString());
            sb8.append((java.lang.Object) charSequence2);
            i19 = i37;
            linkedHashMap2 = linkedHashMap;
        }
        new java.lang.StringBuilder("failed, verifyCount = ").append(f0Var.f391649d);
        return -1;
    }

    public final void c(boolean z17) {
        java.lang.CharSequence charSequence;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("collapse: isAnimationRunning:");
        sb6.append(this.f102964v);
        sb6.append(" textview:");
        android.widget.TextView textview = this.f102943a;
        sb6.append(textview);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TextViewSuffixWrapper", sb6.toString());
        if (this.f102964v) {
            return;
        }
        textview.scrollTo(0, 0);
        p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975 = z17 ? this.f102959q : null;
        this.f102956n = true;
        java.lang.CharSequence charSequence2 = this.f102949g;
        if (charSequence2 == null) {
            e(this, abstractC1183x100d4975);
            return;
        }
        if (!this.f102957o || (charSequence = this.f102954l) == null) {
            java.lang.CharSequence mainContent = this.f102948f;
            int i17 = this.f102958p;
            android.view.ViewGroup sceneRoot = this.f102961s;
            bk4.s1 s1Var = new bk4.s1(this);
            bk4.t1 t1Var = new bk4.t1(this, abstractC1183x100d4975);
            yz5.q qVar = this.f102965w;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textview, "textview");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainContent, "mainContent");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneRoot, "sceneRoot");
            bk4.p1 p1Var = new bk4.p1(abstractC1183x100d4975, s1Var, textview, textview.getText(), this, sceneRoot);
            bk4.q1 q1Var = new bk4.q1(textview, mainContent, i17, t1Var);
            java.lang.CharSequence text = textview.getText();
            if (textview.getLayout() == null) {
                textview.addOnLayoutChangeListener(new bk4.x1(textview, q1Var, this, mainContent, charSequence2, i17, qVar, text, p1Var));
                textview.requestLayout();
                return;
            } else {
                java.lang.System.currentTimeMillis();
                h(q1Var, text, textview, mainContent, charSequence2, qVar, p1Var, a(this.f102943a, mainContent, charSequence2, i17, qVar));
                java.lang.System.currentTimeMillis();
                return;
            }
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(charSequence, this.f102948f)) {
            return;
        }
        if (abstractC1183x100d4975 == null) {
            textview.setMaxLines(this.f102958p);
            textview.setEllipsize(android.text.TextUtils.TruncateAt.END);
            textview.setText(pg5.d.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.f102954l));
            return;
        }
        java.lang.CharSequence charSequence3 = this.f102954l;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(charSequence3);
        android.view.ViewGroup sceneRoot2 = this.f102961s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textview, "textview");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneRoot2, "sceneRoot");
        java.lang.CharSequence text2 = textview.getText();
        textview.setText(pg5.d.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, charSequence3));
        android.text.Layout layout = textview.getLayout();
        if (layout != null) {
            int height = layout.getHeight() + textview.getPaddingTop() + textview.getPaddingBottom();
            textview.setText(pg5.d.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, text2));
            textview.getLayoutParams().height = height;
            textview.setLayoutParams(textview.getLayoutParams());
            bk4.v1 v1Var = new bk4.v1(this, textview, charSequence3);
            abstractC1183x100d4975.a(v1Var);
            ((java.util.LinkedList) this.f102944b).add(v1Var);
        }
        u4.g1.a(sceneRoot2, abstractC1183x100d4975);
    }

    public final java.lang.CharSequence d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((java.lang.Object) this.f102948f);
        sb6.append((java.lang.Object) this.f102950h);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(sb6.toString());
        bk4.r1 r1Var = new bk4.r1(this);
        int length = spannableStringBuilder.length();
        java.lang.CharSequence charSequence = this.f102950h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(charSequence);
        spannableStringBuilder.setSpan(r1Var, length - charSequence.length(), spannableStringBuilder.length(), 33);
        this.f102955m = spannableStringBuilder;
        return spannableStringBuilder;
    }

    public final void f(u4.b1 b1Var) {
        p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975 = this.f102959q;
        if (abstractC1183x100d4975 != null) {
            abstractC1183x100d4975.E(b1Var);
        }
        ((java.util.LinkedList) this.f102944b).remove(b1Var);
    }

    public final void g(java.lang.CharSequence value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.f102954l = null;
        this.f102955m = null;
        this.f102946d = 0;
        this.f102947e = false;
        this.f102948f = value;
        c(false);
        if (this.f102950h != null && this.f102951i != null) {
            d();
        }
        boolean z17 = value.length() == 0;
        android.widget.TextView textView = this.f102943a;
        if (z17) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    public final void i(int i17, int i18, int i19, android.view.View.OnClickListener listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        android.widget.TextView textView = this.f102943a;
        android.content.res.Resources resources = textView.getResources();
        android.content.res.Resources.Theme theme = textView.getContext().getTheme();
        java.lang.ThreadLocal threadLocal = d3.q.f307641a;
        ((java.util.List) ((jz5.n) this.f102966x).mo141623x754a37bb()).add(new bk4.n1(i17, i18, java.lang.Integer.valueOf(d3.m.a(resources, i19, theme)), listener));
    }
}
