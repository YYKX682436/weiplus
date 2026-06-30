package df5;

/* loaded from: classes11.dex */
public final class q0 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public v11.e0 f313721d;

    /* renamed from: e, reason: collision with root package name */
    public df5.d1 f313722e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f313723f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f313724g;

    /* renamed from: h, reason: collision with root package name */
    public long f313725h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f313726i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f313727m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(android.content.Context context, v11.e0 renderConfig) {
        super(context, null, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderConfig, "renderConfig");
        this.f313721d = renderConfig;
        df5.d1 d1Var = new df5.d1(context, renderConfig);
        this.f313722e = d1Var;
        this.f313723f = "";
        d1Var.f313607c = this.f313724g;
        setOrientation(1);
    }

    public static android.widget.TextView e(df5.q0 q0Var, java.lang.CharSequence charSequence, v11.j0 j0Var, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        q0Var.getClass();
        android.widget.TextView textView = new android.widget.TextView(q0Var.getContext());
        q0Var.a(textView, charSequence, j0Var, z17);
        jf5.k0.c(textView, df5.p0.f313717d);
        return textView;
    }

    public final void a(android.widget.TextView textView, java.lang.CharSequence charSequence, v11.j0 j0Var, boolean z17) {
        textView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(z17 ? -1 : -2, -2));
        textView.setGravity(8388659);
        textView.setText(charSequence);
        textView.setTextSize(1, j0Var.f513949a);
        textView.setTextColor(j0Var.f513950b);
        if (j0Var.f513951c) {
            textView.setTypeface(textView.getTypeface(), 1);
        }
        if (j0Var.f513952d) {
            textView.setTypeface(android.graphics.Typeface.MONOSPACE);
        }
        textView.setLineSpacing(0.0f, j0Var.f513953e);
        int i17 = j0Var.f513954f;
        int i18 = j0Var.f513955g;
        textView.setPadding(i17, i18, i17, i18);
        if (j0Var.f513956h) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0 y0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(getContext());
            y0Var.f272846s = false;
            textView.setOnTouchListener(y0Var);
            textView.setClickable(false);
            textView.setLongClickable(false);
        }
        java.lang.Integer num = j0Var.f513957i;
        if (num != null) {
            textView.setHighlightColor(num.intValue());
        }
    }

    public final android.view.View b() {
        android.view.View view = new android.view.View(getContext());
        view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, this.f313721d.f513907m.f513908a));
        return view;
    }

    public final android.widget.TextView c(java.lang.CharSequence charSequence, v11.j0 j0Var, boolean z17) {
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        df5.k1 k1Var = new df5.k1(context, this.f313721d.f513901g);
        a(k1Var, charSequence, j0Var, z17);
        jf5.k0.c(k1Var, df5.n0.f313713d);
        return k1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final android.view.View d(df5.j0 j0Var) {
        int i17;
        df5.j1 j1Var;
        if (j0Var instanceof df5.i0) {
            return c(this.f313722e.h(((df5.i0) j0Var).f313665a), this.f313721d.f513897c.f513927a, this.f313726i);
        }
        if (j0Var instanceof df5.d0) {
            v11.k kVar = ((df5.d0) j0Var).f313603a;
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            df5.b0 b0Var = new df5.b0(context, this.f313721d);
            b0Var.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
            b0Var.m124310x685e6079(this.f313724g);
            b0Var.b(kVar, this.f313723f, this.f313725h);
            j1Var = b0Var;
        } else {
            if (!(j0Var instanceof df5.h0)) {
                if (!(j0Var instanceof df5.g0)) {
                    if (j0Var instanceof df5.f0) {
                        android.content.Context context2 = getContext();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                        return new df5.c0(context2, this.f313721d);
                    }
                    if (!(j0Var instanceof df5.e0)) {
                        throw new jz5.j();
                    }
                    v11.l lVar = ((df5.e0) j0Var).f313614a;
                    v11.e0 e0Var = this.f313721d;
                    v11.z zVar = e0Var.f513899e;
                    v11.j0 j0Var2 = e0Var.f513897c.f513927a;
                    float f17 = zVar.f514031h;
                    if (f17 <= 0.0f) {
                        f17 = j0Var2.f513953e;
                    }
                    v11.j0 a17 = v11.j0.a(j0Var2, 0.0f, 0, false, false, f17, 0, 0, false, null, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.j.f33899x366c91de, null);
                    df5.d1 d1Var = this.f313722e;
                    java.util.List list = lVar.f513968b;
                    int i18 = lVar.f513967a;
                    android.widget.TextView c17 = c(d1Var.f(list, i18, lVar.f513969c), a17, this.f313726i);
                    int b17 = zVar.b(i18);
                    if (b17 <= 0) {
                        return c17;
                    }
                    c17.setPadding(c17.getPaddingLeft(), c17.getPaddingTop() + b17, c17.getPaddingRight(), c17.getPaddingBottom());
                    return c17;
                }
                v11.o oVar = ((df5.g0) j0Var).f313641a;
                java.lang.String str = oVar.f513984a;
                java.lang.String obj = str.toString();
                v11.s sVar = oVar.f513985b;
                v11.s sVar2 = null;
                if (sVar != null) {
                    int i19 = sVar.f513991a;
                    if (!(i19 >= 0 && sVar.f513992b >= i19 && (i17 = sVar.f513993c) >= 0 && sVar.f513994d >= i17)) {
                        sVar = null;
                    }
                    if (sVar != null) {
                        java.lang.String str2 = this.f313723f;
                        int i27 = sVar.f513993c;
                        int b18 = jf5.k0.b(str2, i27);
                        int i28 = sVar.f513994d;
                        int b19 = jf5.k0.b(str2, i28);
                        if (b19 < b18) {
                            b19 = b18;
                        }
                        java.lang.String substring = str2.substring(b18, b19);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                        int L = r26.n0.L(substring, obj, 0, false, 6, null);
                        if (L >= 0) {
                            int codePointCount = substring.codePointCount(0, L) + i27;
                            sVar2 = new v11.s(codePointCount, obj.codePointCount(0, obj.length()) + codePointCount, i27, i28);
                        }
                    }
                }
                if (sVar2 != null) {
                    android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str);
                    spannableStringBuilder.setSpan(new jf5.k(sVar2), 0, spannableStringBuilder.length(), 33);
                    str = spannableStringBuilder;
                }
                android.widget.TextView e17 = e(this, str, this.f313721d.f513903i.f513887a, false, 4, null);
                jf5.k0.c(e17, df5.o0.f313716d);
                return e17;
            }
            v11.q qVar = ((df5.h0) j0Var).f313651a;
            android.content.Context context3 = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
            df5.j1 j1Var2 = new df5.j1(context3, this.f313721d);
            j1Var2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
            j1Var2.m124335x685e6079(this.f313724g);
            j1Var2.j(qVar, this.f313723f, this.f313725h);
            j1Var = j1Var2;
        }
        return j1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x06eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0afa  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0bb9  */
    /* JADX WARN: Type inference failed for: r0v138, types: [df5.j1] */
    /* JADX WARN: Type inference failed for: r0v142, types: [df5.j1] */
    /* JADX WARN: Type inference failed for: r13v19, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v27, types: [df5.e0] */
    /* JADX WARN: Type inference failed for: r13v28, types: [df5.f0] */
    /* JADX WARN: Type inference failed for: r13v29, types: [df5.g0] */
    /* JADX WARN: Type inference failed for: r13v30, types: [df5.h0] */
    /* JADX WARN: Type inference failed for: r13v33, types: [df5.d0] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final df5.p1 f(v11.t r51, java.util.Map r52, java.lang.Boolean r53) {
        /*
            Method dump skipped, instructions count: 3441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df5.q0.f(v11.t, java.util.Map, java.lang.Boolean):df5.p1");
    }

    public final void g() {
        android.view.View childAt = getChildAt(getChildCount() - 1);
        if (childAt == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null && layoutParams2.height == this.f313721d.f513907m.f513908a) {
            removeView(childAt);
        }
    }

    /* renamed from: getOnInteractionConsumed */
    public final yz5.a m124358x984bae05() {
        return this.f313724g;
    }

    public final void h(int i17, df5.j0 j0Var) {
        android.view.View childAt = getChildAt(i17);
        if (childAt == null) {
            return;
        }
        if (j0Var instanceof df5.i0) {
            android.widget.TextView textView = childAt instanceof android.widget.TextView ? (android.widget.TextView) childAt : null;
            if (textView == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NativeMarkdownRenderView", "[STREAM_DIFF] updateInPlace: expected TextView at %d, got %s", java.lang.Integer.valueOf(i17), p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(childAt.getClass()).g());
                return;
            }
            java.lang.CharSequence h17 = this.f313722e.h(((df5.i0) j0Var).f313665a);
            textView.setText(h17);
            ((android.text.SpannableStringBuilder) h17).length();
            return;
        }
        if (j0Var instanceof df5.d0) {
            df5.b0 b0Var = childAt instanceof df5.b0 ? (df5.b0) childAt : null;
            if (b0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NativeMarkdownRenderView", "[STREAM_DIFF] updateInPlace: expected CodeBlockView at %d, got %s", java.lang.Integer.valueOf(i17), p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(childAt.getClass()).g());
                return;
            }
            df5.d0 d0Var = (df5.d0) j0Var;
            b0Var.b(d0Var.f313603a, this.f313723f, this.f313725h);
            v11.k kVar = d0Var.f313603a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NativeMarkdownRenderView", "[STREAM_DIFF] updateInPlace: CodeBlock submitCodeBlock, lang=%s, contentLen=%d", kVar.f513958a, java.lang.Integer.valueOf(kVar.f513959b.length()));
            return;
        }
        if (j0Var instanceof df5.h0) {
            df5.j1 j1Var = childAt instanceof df5.j1 ? (df5.j1) childAt : null;
            if (j1Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NativeMarkdownRenderView", "[STREAM_DIFF] updateInPlace: expected TableView at %d, got %s", java.lang.Integer.valueOf(i17), p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(childAt.getClass()).g());
                return;
            }
            df5.h0 h0Var = (df5.h0) j0Var;
            j1Var.j(h0Var.f313651a, this.f313723f, this.f313725h);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NativeMarkdownRenderView", "[STREAM_DIFF] updateInPlace: TableBlock submitTable, rows=%d, cols=%d", java.lang.Integer.valueOf(h0Var.f313651a.f513988b.size()), java.lang.Integer.valueOf(h0Var.f313651a.f513987a.size()));
            return;
        }
        if (j0Var instanceof df5.g0) {
            android.widget.TextView textView2 = childAt instanceof android.widget.TextView ? (android.widget.TextView) childAt : null;
            if (textView2 != null) {
                textView2.setText(((df5.g0) j0Var).f313641a.f513984a);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NativeMarkdownRenderView", "[STREAM_DIFF] updateInPlace: expected TextView at %d, got %s", java.lang.Integer.valueOf(i17), p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(childAt.getClass()).g());
                return;
            }
        }
        if ((j0Var instanceof df5.f0) || !(j0Var instanceof df5.e0)) {
            return;
        }
        android.widget.TextView textView3 = childAt instanceof android.widget.TextView ? (android.widget.TextView) childAt : null;
        if (textView3 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NativeMarkdownRenderView", "[STREAM_DIFF] updateInPlace: expected TextView at %d, got %s", java.lang.Integer.valueOf(i17), p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(childAt.getClass()).g());
            return;
        }
        df5.d1 d1Var = this.f313722e;
        df5.e0 e0Var = (df5.e0) j0Var;
        v11.l lVar = e0Var.f313614a;
        textView3.setText(d1Var.f(lVar.f513968b, lVar.f513967a, lVar.f513969c));
        int i18 = e0Var.f313614a.f513967a;
    }

    /* renamed from: setOnInteractionConsumed */
    public final void m124359x685e6079(yz5.a aVar) {
        this.f313724g = aVar;
        this.f313722e.f313607c = aVar;
    }
}
