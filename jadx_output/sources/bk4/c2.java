package bk4;

/* loaded from: classes11.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f21410a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f21411b;

    /* renamed from: c, reason: collision with root package name */
    public int f21412c;

    /* renamed from: d, reason: collision with root package name */
    public int f21413d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21414e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.CharSequence f21415f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.CharSequence f21416g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f21417h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Integer f21418i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View.OnClickListener f21419j;

    /* renamed from: k, reason: collision with root package name */
    public bk4.l1 f21420k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.CharSequence f21421l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.CharSequence f21422m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f21423n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f21424o;

    /* renamed from: p, reason: collision with root package name */
    public int f21425p;

    /* renamed from: q, reason: collision with root package name */
    public final androidx.transition.Transition f21426q;

    /* renamed from: r, reason: collision with root package name */
    public final u4.d1 f21427r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewGroup f21428s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f21429t;

    /* renamed from: u, reason: collision with root package name */
    public android.text.method.MovementMethod f21430u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f21431v;

    /* renamed from: w, reason: collision with root package name */
    public final yz5.q f21432w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f21433x;

    public c2(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "textView");
        this.f21410a = textView;
        this.f21411b = new java.util.LinkedList();
        java.lang.CharSequence text = textView.getText();
        kotlin.jvm.internal.o.f(text, "getText(...)");
        this.f21415f = text;
        this.f21416g = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.jvn);
        this.f21417h = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.jvp);
        this.f21418i = java.lang.Integer.valueOf(com.tencent.mm.R.color.BW_100_Alpha_0_6);
        this.f21424o = true;
        this.f21425p = 3;
        this.f21426q = new androidx.transition.AutoTransition();
        this.f21427r = new bk4.b2(this);
        android.view.ViewParent parent = textView.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f21428s = (android.view.ViewGroup) parent;
        this.f21430u = android.text.method.LinkMovementMethod.getInstance();
        this.f21432w = new bk4.a2(this);
        this.f21433x = jz5.h.b(bk4.y1.f21630d);
        if (textView.getLayoutParams().width == -2) {
            throw new java.lang.RuntimeException("textView's width can't be wrap_content. Only support match_parent or specified size");
        }
    }

    public static final int b(java.util.Map map, kotlin.jvm.internal.f0 f0Var, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, android.widget.TextView textView, yz5.q qVar, bk4.c2 c2Var, int i17, int i18) {
        java.lang.CharSequence charSequence3;
        int i19 = (i17 << 16) | i18;
        java.lang.Integer num = (java.lang.Integer) map.get(java.lang.Integer.valueOf(i19));
        if (num != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("verify: ");
            sb6.append(i18);
            sb6.append(" cached");
            return num.intValue();
        }
        f0Var.f310116d++;
        java.lang.String str = charSequence.subSequence(i17, i18).toString() + ((java.lang.Object) charSequence2);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (qVar == null || (charSequence3 = (java.lang.CharSequence) qVar.invoke(str, charSequence2, java.lang.Integer.valueOf(i18))) == null) {
            charSequence3 = str;
        }
        textView.setText(pg5.d.a(context, charSequence3));
        int lineCount = textView.getLineCount();
        if (i18 == charSequence.length() && !kotlin.jvm.internal.o.b(str, charSequence2)) {
            c2Var.f21413d = lineCount;
            c2Var.f21414e = true;
            bk4.l1 l1Var = c2Var.f21420k;
            if (l1Var != null) {
                l1Var.onChange(lineCount);
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

    public static final void e(bk4.c2 c2Var, androidx.transition.Transition transition) {
        c2Var.f21410a.setMaxLines(c2Var.f21425p);
        android.text.TextUtils.TruncateAt truncateAt = android.text.TextUtils.TruncateAt.END;
        android.widget.TextView textView = c2Var.f21410a;
        textView.setEllipsize(truncateAt);
        java.lang.CharSequence text = textView.getText();
        textView.setText(pg5.d.a(com.tencent.mm.sdk.platformtools.x2.f193071a, c2Var.f21415f));
        if (transition != null) {
            android.text.Layout layout = textView.getLayout();
            if (layout != null) {
                int height = layout.getHeight() + textView.getPaddingTop() + textView.getPaddingBottom();
                textView.setText(pg5.d.a(com.tencent.mm.sdk.platformtools.x2.f193071a, text));
                textView.setMaxLines(Integer.MAX_VALUE);
                textView.getLayoutParams().height = height;
                textView.setLayoutParams(textView.getLayoutParams());
                bk4.u1 u1Var = new bk4.u1(c2Var, textView);
                transition.a(u1Var);
                ((java.util.LinkedList) c2Var.f21411b).add(u1Var);
            }
            u4.g1.a(c2Var.f21428s, transition);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v0, types: [yz5.q] */
    public static final void h(yz5.l lVar, java.lang.CharSequence charSequence, android.widget.TextView textView, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, yz5.q qVar, yz5.l lVar2, int i17) {
        java.lang.CharSequence a17;
        ?? r37;
        if (i17 < 0) {
            kotlin.jvm.internal.o.d(charSequence);
            lVar.invoke(charSequence);
            return;
        }
        if (i17 >= charSequence2.length()) {
            a17 = pg5.d.a(com.tencent.mm.sdk.platformtools.x2.f193071a, charSequence2);
        } else {
            java.lang.String str = charSequence2.subSequence(0, i17).toString() + ((java.lang.Object) charSequence3);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (qVar != 0 && (r37 = (java.lang.CharSequence) qVar.invoke(str, charSequence3, java.lang.Integer.valueOf(i17))) != 0) {
                str = r37;
            }
            a17 = pg5.d.a(context, str);
        }
        textView.setText(a17);
        java.lang.CharSequence text = textView.getText();
        kotlin.jvm.internal.o.f(text, "getText(...)");
        lVar2.invoke(text);
    }

    public final int a(android.widget.TextView textView, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i17, yz5.q qVar) {
        int i18;
        java.util.LinkedHashMap linkedHashMap;
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
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
            textView.setText(pg5.d.a(com.tencent.mm.sdk.platformtools.x2.f193071a, charSequence));
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
                    sb7.append(f0Var.f310116d);
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
        new java.lang.StringBuilder("failed, verifyCount = ").append(f0Var.f310116d);
        return -1;
    }

    public final void c(boolean z17) {
        java.lang.CharSequence charSequence;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("collapse: isAnimationRunning:");
        sb6.append(this.f21431v);
        sb6.append(" textview:");
        android.widget.TextView textview = this.f21410a;
        sb6.append(textview);
        com.tencent.mars.xlog.Log.i("TextViewSuffixWrapper", sb6.toString());
        if (this.f21431v) {
            return;
        }
        textview.scrollTo(0, 0);
        androidx.transition.Transition transition = z17 ? this.f21426q : null;
        this.f21423n = true;
        java.lang.CharSequence charSequence2 = this.f21416g;
        if (charSequence2 == null) {
            e(this, transition);
            return;
        }
        if (!this.f21424o || (charSequence = this.f21421l) == null) {
            java.lang.CharSequence mainContent = this.f21415f;
            int i17 = this.f21425p;
            android.view.ViewGroup sceneRoot = this.f21428s;
            bk4.s1 s1Var = new bk4.s1(this);
            bk4.t1 t1Var = new bk4.t1(this, transition);
            yz5.q qVar = this.f21432w;
            kotlin.jvm.internal.o.g(textview, "textview");
            kotlin.jvm.internal.o.g(mainContent, "mainContent");
            kotlin.jvm.internal.o.g(sceneRoot, "sceneRoot");
            bk4.p1 p1Var = new bk4.p1(transition, s1Var, textview, textview.getText(), this, sceneRoot);
            bk4.q1 q1Var = new bk4.q1(textview, mainContent, i17, t1Var);
            java.lang.CharSequence text = textview.getText();
            if (textview.getLayout() == null) {
                textview.addOnLayoutChangeListener(new bk4.x1(textview, q1Var, this, mainContent, charSequence2, i17, qVar, text, p1Var));
                textview.requestLayout();
                return;
            } else {
                java.lang.System.currentTimeMillis();
                h(q1Var, text, textview, mainContent, charSequence2, qVar, p1Var, a(this.f21410a, mainContent, charSequence2, i17, qVar));
                java.lang.System.currentTimeMillis();
                return;
            }
        }
        if (kotlin.jvm.internal.o.b(charSequence, this.f21415f)) {
            return;
        }
        if (transition == null) {
            textview.setMaxLines(this.f21425p);
            textview.setEllipsize(android.text.TextUtils.TruncateAt.END);
            textview.setText(pg5.d.a(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f21421l));
            return;
        }
        java.lang.CharSequence charSequence3 = this.f21421l;
        kotlin.jvm.internal.o.d(charSequence3);
        android.view.ViewGroup sceneRoot2 = this.f21428s;
        kotlin.jvm.internal.o.g(textview, "textview");
        kotlin.jvm.internal.o.g(sceneRoot2, "sceneRoot");
        java.lang.CharSequence text2 = textview.getText();
        textview.setText(pg5.d.a(com.tencent.mm.sdk.platformtools.x2.f193071a, charSequence3));
        android.text.Layout layout = textview.getLayout();
        if (layout != null) {
            int height = layout.getHeight() + textview.getPaddingTop() + textview.getPaddingBottom();
            textview.setText(pg5.d.a(com.tencent.mm.sdk.platformtools.x2.f193071a, text2));
            textview.getLayoutParams().height = height;
            textview.setLayoutParams(textview.getLayoutParams());
            bk4.v1 v1Var = new bk4.v1(this, textview, charSequence3);
            transition.a(v1Var);
            ((java.util.LinkedList) this.f21411b).add(v1Var);
        }
        u4.g1.a(sceneRoot2, transition);
    }

    public final java.lang.CharSequence d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((java.lang.Object) this.f21415f);
        sb6.append((java.lang.Object) this.f21417h);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(sb6.toString());
        bk4.r1 r1Var = new bk4.r1(this);
        int length = spannableStringBuilder.length();
        java.lang.CharSequence charSequence = this.f21417h;
        kotlin.jvm.internal.o.d(charSequence);
        spannableStringBuilder.setSpan(r1Var, length - charSequence.length(), spannableStringBuilder.length(), 33);
        this.f21422m = spannableStringBuilder;
        return spannableStringBuilder;
    }

    public final void f(u4.b1 b1Var) {
        androidx.transition.Transition transition = this.f21426q;
        if (transition != null) {
            transition.E(b1Var);
        }
        ((java.util.LinkedList) this.f21411b).remove(b1Var);
    }

    public final void g(java.lang.CharSequence value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.f21421l = null;
        this.f21422m = null;
        this.f21413d = 0;
        this.f21414e = false;
        this.f21415f = value;
        c(false);
        if (this.f21417h != null && this.f21418i != null) {
            d();
        }
        boolean z17 = value.length() == 0;
        android.widget.TextView textView = this.f21410a;
        if (z17) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    public final void i(int i17, int i18, int i19, android.view.View.OnClickListener listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        android.widget.TextView textView = this.f21410a;
        android.content.res.Resources resources = textView.getResources();
        android.content.res.Resources.Theme theme = textView.getContext().getTheme();
        java.lang.ThreadLocal threadLocal = d3.q.f226108a;
        ((java.util.List) ((jz5.n) this.f21433x).getValue()).add(new bk4.n1(i17, i18, java.lang.Integer.valueOf(d3.m.a(resources, i19, theme)), listener));
    }
}
