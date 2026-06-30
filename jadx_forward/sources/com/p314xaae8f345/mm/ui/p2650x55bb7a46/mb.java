package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes11.dex */
public final class mb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.tb f283515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f283516e;

    public mb(com.p314xaae8f345.mm.ui.p2650x55bb7a46.tb tbVar, int i17) {
        this.f283515d = tbVar;
        this.f283516e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float height;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.tb tbVar = this.f283515d;
        if (tbVar.f284245e == null || tbVar.m158354x19263085().isFinishing() || tbVar.m158354x19263085().isDestroyed()) {
            return;
        }
        em.i1 i1Var = tbVar.f284244d;
        if (i1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21469xdaa23983 b17 = i1Var.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getMarkdownPreviewScrollContainer(...)");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22094xdaed490b c22094xdaed490b = tbVar.f284245e;
        if (c22094xdaed490b == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mvvmView");
            throw null;
        }
        java.util.Iterator<jf5.f0> it = c22094xdaed490b.m80120x9909cadb().m80130x3eed8436().iterator();
        jf5.j0 j0Var = null;
        java.lang.Integer num = null;
        while (it.hasNext()) {
            jf5.j0 j0Var2 = (jf5.j0) it.next();
            java.lang.CharSequence c17 = j0Var2.c();
            android.text.Spanned spanned = c17 instanceof android.text.Spanned ? (android.text.Spanned) c17 : null;
            if (spanned != null) {
                java.util.Iterator it6 = ((java.util.ArrayList) jf5.k0.d(spanned, 0, c17.length())).iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    jf5.k kVar = (jf5.k) it6.next();
                    v11.s sVar = kVar.f381009a;
                    if (sVar != null && jf5.k0.f(sVar)) {
                        int i17 = sVar.f513993c;
                        int i18 = this.f283516e;
                        if (i18 >= i17 && i18 <= sVar.f513994d) {
                            int spanStart = spanned.getSpanStart(kVar);
                            int spanEnd = spanned.getSpanEnd(kVar);
                            if (jf5.k0.f(sVar)) {
                                int i19 = sVar.f513991a;
                                int i27 = sVar.f513992b;
                                int f17 = e06.p.f(i18, i19, i27) - i19;
                                int i28 = i27 - i19;
                                int i29 = spanEnd - spanStart;
                                if (i28 > 0 && i29 > 0) {
                                    spanStart = e06.p.f((int) (spanStart + ((f17 / i28) * i29)), spanStart, spanEnd - 1);
                                }
                            }
                            num = java.lang.Integer.valueOf(spanStart);
                            j0Var = j0Var2;
                        }
                    }
                }
                if (j0Var != null) {
                    break;
                }
            }
        }
        if (j0Var == null) {
            b17.scrollTo(0, 0);
            return;
        }
        android.widget.TextView textView = j0Var.f381007a;
        android.widget.TextView textView2 = textView instanceof android.widget.TextView ? textView : null;
        android.text.Layout layout = textView2 != null ? textView2.getLayout() : null;
        float lineTop = (layout == null || num == null || !new e06.k(0, j0Var.c().length()).m(num.intValue())) ? 0.0f : layout.getLineTop(layout.getLineForOffset(num.intValue())) + textView.getPaddingTop();
        textView.getLocationInWindow(new int[2]);
        b17.getLocationInWindow(new int[2]);
        float scrollY = (r9[1] - r8[1]) + b17.getScrollY() + lineTop;
        int height2 = (b17.getHeight() - b17.getPaddingTop()) - b17.getPaddingBottom();
        if (layout == null || num == null || !new e06.k(0, j0Var.c().length()).m(num.intValue())) {
            height = textView.getHeight();
        } else {
            int lineForOffset = layout.getLineForOffset(num.intValue());
            height = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
        }
        float f18 = height2;
        float height3 = (b17.getChildAt(0) != null ? r2.getHeight() : 0.0f) - f18;
        float f19 = (scrollY - (f18 / 2.0f)) + (height / 2.0f);
        if (height3 < 0.0f) {
            height3 = 0.0f;
        }
        b17.scrollTo(0, (int) e06.p.e(f19, 0.0f, height3));
    }
}
