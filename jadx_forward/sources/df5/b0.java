package df5;

/* loaded from: classes11.dex */
public final class b0 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final v11.e0 f313577d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f313578e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f313579f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.LinearLayout f313580g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f313581h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f313582i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f313583m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f313584n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f313585o;

    /* renamed from: p, reason: collision with root package name */
    public df5.x f313586p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.a f313587q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(android.content.Context context, v11.e0 renderConfig) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderConfig, "renderConfig");
        this.f313577d = renderConfig;
        this.f313583m = "";
        this.f313584n = "";
        this.f313585o = "";
        setOrientation(1);
        android.view.View view = new android.view.View(context);
        v11.w wVar = renderConfig.f513902h;
        view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, wVar.f514018m));
        int i17 = wVar.f514017l;
        view.setBackgroundColor(i17);
        int i18 = wVar.f514019n;
        com.p314xaae8f345.mm.ui.kk.f(view, i18);
        com.p314xaae8f345.mm.ui.kk.d(view, i18);
        this.f313578e = view;
        addView(view);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        com.p314xaae8f345.mm.ui.kk.f(linearLayout, wVar.f514014i);
        this.f313580g = linearLayout;
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -2, 1.0f));
        float f17 = wVar.f514008c;
        textView.setTextSize(1, f17);
        textView.setTextColor(wVar.f514009d);
        textView.setTypeface(android.graphics.Typeface.MONOSPACE);
        android.text.TextPaint paint = textView.getPaint();
        float f18 = wVar.f514010e;
        com.p314xaae8f345.mm.ui.bk.r0(paint, f18);
        textView.setGravity(8388627);
        textView.setSingleLine(true);
        this.f313579f = textView;
        linearLayout.addView(textView);
        android.widget.TextView textView2 = new android.widget.TextView(context);
        textView2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3m));
        textView2.setTextSize(1, f17);
        textView2.setTextColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
        com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), f18);
        textView2.setGravity(8388629);
        textView2.setIncludeFontPadding(false);
        textView2.setSingleLine(true);
        textView2.setOnClickListener(new df5.w(this));
        linearLayout.addView(textView2);
        addView(linearLayout);
        android.widget.TextView textView3 = new android.widget.TextView(context);
        textView3.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        v11.j0 j0Var = wVar.f514006a;
        textView3.setTextSize(1, j0Var.f513949a);
        textView3.setTextColor(j0Var.f513950b);
        textView3.setTypeface(android.graphics.Typeface.MONOSPACE);
        textView3.setLineSpacing(0.0f, j0Var.f513953e);
        int i19 = j0Var.f513954f;
        int i27 = j0Var.f513955g;
        textView3.setPadding(i19, i27, i19, i27);
        textView3.setHorizontallyScrolling(true);
        this.f313581h = textView3;
        df5.n nVar = new df5.n(context);
        nVar.setHorizontalScrollBarEnabled(false);
        nVar.setVerticalScrollBarEnabled(false);
        nVar.setOverScrollMode(2);
        nVar.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        com.p314xaae8f345.mm.ui.kk.f(nVar, wVar.f514015j);
        com.p314xaae8f345.mm.ui.kk.d(nVar, wVar.f514016k);
        nVar.addView(textView3);
        addView(nVar);
        android.widget.TextView textView4 = new android.widget.TextView(context);
        textView4.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, wVar.f514018m));
        textView4.setBackgroundColor(i17);
        com.p314xaae8f345.mm.ui.kk.f(textView4, i18);
        com.p314xaae8f345.mm.ui.kk.d(textView4, i18);
        textView4.setText("");
        textView4.setTextSize(0, 1.0f);
        textView4.setTextColor(0);
        textView4.setIncludeFontPadding(false);
        this.f313582i = textView4;
        addView(textView4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x043d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.SpannableStringBuilder a(v11.k r33) {
        /*
            Method dump skipped, instructions count: 1234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df5.b0.a(v11.k):android.text.SpannableStringBuilder");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(v11.k block, java.lang.String rawMarkdown, long j17) {
        java.lang.String str;
        v11.s sVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawMarkdown, "rawMarkdown");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f313585o = rawMarkdown;
        c(block, rawMarkdown);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        android.text.SpannableStringBuilder a17 = a(block);
        cf5.t tVar = cf5.t.f122560a;
        long currentTimeMillis3 = java.lang.System.currentTimeMillis() - currentTimeMillis2;
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            v65.i.b(c20976x6ba6452a, null, new cf5.p(j17, currentTimeMillis3, null), 1, null);
        }
        android.widget.TextView textView = this.f313581h;
        textView.setText(a17, android.widget.TextView.BufferType.SPANNABLE);
        jf5.k0.c(textView, df5.y.f313792d);
        android.widget.TextView textView2 = this.f313582i;
        df5.x xVar = this.f313586p;
        if (xVar == null || (sVar = xVar.f313788c) == null) {
            str = "";
        } else {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder("\u2060");
            spannableStringBuilder.setSpan(new jf5.k(sVar), 0, spannableStringBuilder.length(), 33);
            str = spannableStringBuilder;
        }
        textView2.setText(str, android.widget.TextView.BufferType.SPANNABLE);
        jf5.k0.c(textView2, df5.z.f313794d);
        long currentTimeMillis4 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a2 = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a2 != null) {
            v65.i.b(c20976x6ba6452a2, null, new cf5.o(j17, currentTimeMillis4, null), 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(v11.k r20, java.lang.String r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.lang.String r3 = "block"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r3)
            java.lang.String r3 = "rawMarkdown"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r3)
            r0.f313585o = r2
            java.lang.String r3 = r1.f513959b
            r0.f313583m = r3
            java.lang.String r3 = r1.f513958a
            r0.f313584n = r3
            r4 = 0
            v11.s r5 = r1.f513960c
            if (r5 != 0) goto L21
        L1f:
            r2 = r4
            goto L73
        L21:
            int r6 = r5.f513993c
            int r9 = jf5.k0.b(r2, r6)
            java.lang.String r7 = r0.f313585o
            java.lang.String r8 = r1.f513958a
            r10 = 0
            r11 = 4
            r12 = 0
            int r1 = r26.n0.L(r7, r8, r9, r10, r11, r12)
            if (r1 >= 0) goto L35
            goto L1f
        L35:
            java.lang.String r13 = r0.f313585o
            java.lang.String r14 = "\n"
            r16 = 0
            r17 = 4
            r18 = 0
            r15 = r1
            int r2 = r26.n0.L(r13, r14, r15, r16, r17, r18)
            if (r2 >= 0) goto L47
            goto L1f
        L47:
            int r7 = r2 + 1
            java.lang.String r8 = r0.f313585o
            int r1 = jf5.k0.a(r8, r1)
            java.lang.String r8 = r0.f313585o
            int r2 = jf5.k0.a(r8, r2)
            java.lang.String r8 = r0.f313585o
            int r7 = jf5.k0.a(r8, r7)
            v11.s r8 = new v11.s
            r8.<init>(r1, r2, r6, r2)
            v11.s r1 = new v11.s
            int r2 = r5.f513992b
            r1.<init>(r7, r2, r7, r2)
            v11.s r6 = new v11.s
            int r5 = r5.f513994d
            r6.<init>(r2, r5, r2, r5)
            df5.x r2 = new df5.x
            r2.<init>(r8, r1, r6)
        L73:
            r0.f313586p = r2
            android.widget.TextView r1 = r0.f313579f
            int r2 = r3.length()
            r5 = 0
            if (r2 <= 0) goto L80
            r2 = 1
            goto L81
        L80:
            r2 = r5
        L81:
            if (r2 == 0) goto L90
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r2 = r3.toUpperCase(r2)
            java.lang.String r3 = "toUpperCase(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)
            goto L92
        L90:
            java.lang.String r2 = "TEXT"
        L92:
            df5.x r3 = r0.f313586p
            if (r3 == 0) goto L98
            v11.s r4 = r3.f313786a
        L98:
            if (r4 != 0) goto L9b
            goto Laf
        L9b:
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>(r2)
            jf5.k r2 = new jf5.k
            r2.<init>(r4)
            int r4 = r3.length()
            r6 = 33
            r3.setSpan(r2, r5, r4, r6)
            r2 = r3
        Laf:
            android.widget.TextView$BufferType r3 = android.widget.TextView.BufferType.SPANNABLE
            r1.setText(r2, r3)
            r1.setVisibility(r5)
            android.widget.LinearLayout r2 = r0.f313580g
            r2.setVisibility(r5)
            df5.a0 r2 = df5.a0.f313574d
            jf5.k0.c(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df5.b0.c(v11.k, java.lang.String):void");
    }

    /* renamed from: getContentTextView */
    public final android.widget.TextView m124308x390676d5() {
        return this.f313581h;
    }

    /* renamed from: getOnInteractionConsumed */
    public final yz5.a m124309x984bae05() {
        return this.f313587q;
    }

    /* renamed from: setOnInteractionConsumed */
    public final void m124310x685e6079(yz5.a aVar) {
        this.f313587q = aVar;
    }
}
