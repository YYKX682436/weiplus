package gl5;

/* loaded from: classes15.dex */
public class e0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public gl5.e1 D;
    public boolean E;
    public android.graphics.drawable.Drawable G;
    public android.graphics.drawable.Drawable H;
    public android.graphics.drawable.Drawable I;

    /* renamed from: J, reason: collision with root package name */
    public gl5.z f354474J;
    public android.view.ActionMode.Callback K;
    public android.view.ActionMode.Callback L;
    public boolean M;
    public int N;
    public java.lang.Runnable P;
    public kl5.b Q;
    public kl5.b R;
    public boolean S;
    public android.graphics.Rect T;
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 U;
    public final java.lang.Runnable V;
    public boolean W;
    public final int X;
    public final int Y;
    public hl5.g Z;

    /* renamed from: a, reason: collision with root package name */
    public gl5.w f354475a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f354476a0;

    /* renamed from: b, reason: collision with root package name */
    public gl5.b0 f354477b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.ActionMode f354478c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f354479d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f354480e;

    /* renamed from: f, reason: collision with root package name */
    public gl5.y f354481f;

    /* renamed from: i, reason: collision with root package name */
    public gl5.o f354484i;

    /* renamed from: j, reason: collision with root package name */
    public gl5.r f354485j;

    /* renamed from: k, reason: collision with root package name */
    public gl5.s f354486k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f354487l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f354488m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f354489n;

    /* renamed from: o, reason: collision with root package name */
    public android.text.method.KeyListener f354490o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f354492q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f354493r;

    /* renamed from: s, reason: collision with root package name */
    public long f354494s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f354495t;

    /* renamed from: u, reason: collision with root package name */
    public gl5.n f354496u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f354498w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f354499x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f354500y;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f354482g = new gl5.k(this);

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnDrawListener f354483h = new gl5.l(this);

    /* renamed from: p, reason: collision with root package name */
    public int f354491p = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f354497v = true;

    /* renamed from: z, reason: collision with root package name */
    public boolean f354501z = true;
    public android.graphics.drawable.Drawable F = null;
    public final gl5.f0 O = new gl5.f0();

    public e0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023) {
        new android.view.inputmethod.CursorAnchorInfo.Builder();
        new android.graphics.Matrix();
        this.V = new gl5.m(this);
        this.W = false;
        this.f354476a0 = false;
        this.U = viewTreeObserverOnPreDrawListenerC22668xe0605023;
        viewTreeObserverOnPreDrawListenerC22668xe0605023.m81742x7e4f2d39(viewTreeObserverOnPreDrawListenerC22668xe0605023.m81641xadddfc5());
        this.X = (int) android.util.TypedValue.applyDimension(1, 45.0f, viewTreeObserverOnPreDrawListenerC22668xe0605023.getContext().getResources().getDisplayMetrics());
        this.Y = (int) android.util.TypedValue.applyDimension(1, 12.0f, viewTreeObserverOnPreDrawListenerC22668xe0605023.getContext().getResources().getDisplayMetrics());
    }

    public static android.graphics.drawable.Drawable C(android.content.Context context, android.graphics.drawable.Drawable drawable, int i17) {
        if (!(drawable instanceof android.graphics.drawable.BitmapDrawable)) {
            return drawable;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == 0 || intrinsicHeight == 0) {
            return drawable;
        }
        android.graphics.Bitmap bitmap = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
        float f17 = intrinsicWidth;
        float width = f17 / bitmap.getWidth();
        float a17 = com.p314xaae8f345.mm.ui.zk.a(context, i17);
        return new android.graphics.drawable.BitmapDrawable(context.getResources(), android.graphics.Bitmap.createScaledBitmap(bitmap, (int) (((f17 / intrinsicHeight) * a17) / width), (int) (a17 / width), true));
    }

    public static int a(gl5.e0 e0Var, int i17) {
        int d17;
        kl5.b q17 = e0Var.q();
        q17.b(i17);
        if (e0Var.q().f(q17.f390513d.following(i17))) {
            kl5.b q18 = e0Var.q();
            q18.b(i17);
            d17 = i17;
            while (d17 != -1) {
                if (!q18.h(d17) && q18.f(d17)) {
                    break;
                }
                q18.b(d17);
                d17 = q18.f390513d.following(d17);
            }
        } else {
            d17 = e0Var.q().d(i17, true);
        }
        return d17 == -1 ? i17 : d17;
    }

    public static int b(gl5.e0 e0Var, int i17) {
        int c17;
        kl5.b q17 = e0Var.q();
        q17.b(i17);
        if (e0Var.q().h(q17.f390513d.preceding(i17))) {
            kl5.b q18 = e0Var.q();
            q18.b(i17);
            c17 = i17;
            while (c17 != -1) {
                if (q18.h(c17) && !q18.f(c17)) {
                    break;
                }
                q18.b(c17);
                c17 = q18.f390513d.preceding(c17);
            }
        } else {
            c17 = e0Var.q().c(i17, true);
        }
        return c17 == -1 ? i17 : c17;
    }

    public void A() {
        if (g()) {
            this.B = false;
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = this.U;
        boolean M = viewTreeObserverOnPreDrawListenerC22668xe0605023.M();
        gl5.b0 p17 = p();
        gl5.w k17 = k();
        if ((p17 != null && p17.e()) || (k17 != null && k17.e())) {
            this.B = false;
            return;
        }
        if (M) {
            r();
            if (t()) {
                if (this.B) {
                    I(false);
                }
            } else if (p17 == null || !p17.a()) {
                K();
                I(false);
            } else {
                android.view.ActionMode actionMode = this.f354478c;
                if (actionMode != null) {
                    actionMode.invalidateContentRect();
                }
                viewTreeObserverOnPreDrawListenerC22668xe0605023.postDelayed(this.V, android.view.ViewConfiguration.getDoubleTapTimeout());
                gl5.e1 o17 = o();
                o17.getClass();
                android.view.ActionMode actionMode2 = o17.f354502a.f354478c;
                if (actionMode2 != null) {
                    actionMode2.invalidate();
                }
            }
        } else if (k17 == null || !k17.a()) {
            J();
        } else {
            android.view.ActionMode actionMode3 = this.f354478c;
            if (actionMode3 != null) {
                actionMode3.invalidateContentRect();
            }
        }
        this.B = false;
    }

    public boolean B() {
        android.view.inputmethod.InputMethodManager j17;
        gl5.s sVar = this.f354486k;
        if (sVar == null) {
            return false;
        }
        boolean z17 = sVar.f354626f;
        if (!z17 && !sVar.f354625e) {
            return false;
        }
        sVar.f354626f = false;
        sVar.f354625e = false;
        android.view.inputmethod.ExtractedTextRequest extractedTextRequest = sVar.f354621a;
        if (extractedTextRequest == null || (j17 = j()) == null) {
            return false;
        }
        if (sVar.f354627g < 0 && !z17) {
            sVar.f354627g = -2;
        }
        int i17 = sVar.f354627g;
        int i18 = sVar.f354628h;
        int i19 = sVar.f354629i;
        android.view.inputmethod.ExtractedText extractedText = sVar.f354622b;
        if (!f(extractedTextRequest, i17, i18, i19, extractedText)) {
            return false;
        }
        j17.updateExtractedText(this.U, extractedTextRequest.token, extractedText);
        sVar.f354627g = -1;
        sVar.f354628h = -1;
        sVar.f354629i = 0;
        sVar.f354626f = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0110 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gl5.e0.D():boolean");
    }

    public final boolean E() {
        int m81686xffd93625;
        boolean z17 = this.f354497v;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = this.U;
        if ((z17 && viewTreeObserverOnPreDrawListenerC22668xe0605023.V()) && viewTreeObserverOnPreDrawListenerC22668xe0605023.isFocused()) {
            int m81687x6f2c472c = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81687x6f2c472c();
            if (m81687x6f2c472c < 0 || (m81686xffd93625 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81686xffd93625()) < 0) {
                return false;
            }
            if (m81687x6f2c472c == m81686xffd93625) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b1 A[EDGE_INSN: B:45:0x01b1->B:46:0x01b1 BREAK  A[LOOP:1: B:37:0x016a->B:43:0x01ae], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F() {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gl5.e0.F():void");
    }

    public final void G() {
        o().getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = this.U;
        viewTreeObserverOnPreDrawListenerC22668xe0605023.getClass();
        android.content.ClipData.newPlainText(null, viewTreeObserverOnPreDrawListenerC22668xe0605023.f0(viewTreeObserverOnPreDrawListenerC22668xe0605023.C.subSequence(viewTreeObserverOnPreDrawListenerC22668xe0605023.m81687x6f2c472c(), viewTreeObserverOnPreDrawListenerC22668xe0605023.m81686xffd93625())));
        J();
        if (this.f354480e) {
            p().g();
        }
    }

    public void H() {
        java.lang.Runnable runnable = this.P;
        if (runnable != null) {
            this.U.removeCallbacks(runnable);
        }
        if (g()) {
            return;
        }
        J();
        new gl5.c0(this, 1);
        F();
        if (t() || k() == null) {
            return;
        }
        k().mo131740x35dafd();
    }

    public void I(boolean z17) {
        boolean z18;
        gl5.b0 p17;
        boolean z19;
        android.view.inputmethod.InputMethodManager j17;
        gl5.e1 o17 = o();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = o17.f354503b;
        viewTreeObserverOnPreDrawListenerC22668xe0605023.mo81602xfb85ada3();
        gl5.e0 e0Var = o17.f354502a;
        if (!e0Var.g()) {
            android.view.ActionMode actionMode = e0Var.f354478c;
            if (actionMode == null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe06050232 = e0Var.U;
                z18 = true;
                if (viewTreeObserverOnPreDrawListenerC22668xe06050232.z() && viewTreeObserverOnPreDrawListenerC22668xe06050232.requestFocus()) {
                    z19 = true;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("cmEdit.CMTextView", "TextView does not support text selection. Selection cancelled.");
                    z19 = false;
                }
                if (z19 && viewTreeObserverOnPreDrawListenerC22668xe06050232.M()) {
                    new gl5.c0(e0Var, 0);
                    e0Var.F();
                    if (!viewTreeObserverOnPreDrawListenerC22668xe06050232.V()) {
                        viewTreeObserverOnPreDrawListenerC22668xe06050232.W();
                    }
                    if ((!e0Var.t()) && viewTreeObserverOnPreDrawListenerC22668xe06050232.V() && !viewTreeObserverOnPreDrawListenerC22668xe06050232.W() && e0Var.f354501z && (j17 = e0Var.j()) != null) {
                        j17.showSoftInput(viewTreeObserverOnPreDrawListenerC22668xe06050232, 0, null);
                    }
                    if (z18 && (p17 = e0Var.p()) != null && (viewTreeObserverOnPreDrawListenerC22668xe0605023.W() || viewTreeObserverOnPreDrawListenerC22668xe0605023.V())) {
                        p17.mo131740x35dafd();
                    }
                    e0Var.B = false;
                }
            } else if (actionMode != null) {
                actionMode.invalidate();
            }
        }
        z18 = false;
        if (z18) {
            p17.mo131740x35dafd();
        }
        e0Var.B = false;
    }

    public void J() {
        android.view.ActionMode actionMode = this.f354478c;
        if (actionMode != null) {
            actionMode.finish();
        }
        java.lang.Runnable runnable = this.V;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = this.U;
        viewTreeObserverOnPreDrawListenerC22668xe0605023.removeCallbacks(runnable);
        if (this.f354476a0) {
            o().getClass();
            this.f354478c = null;
            hl5.g gVar = this.Z;
            if (gVar != null) {
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("cmEdit.OperateWindow", "destroy OpWindow@%s", java.lang.Integer.valueOf(gVar.hashCode()));
                    try {
                        gVar.f363667i.m81637x17234463().n().b(gVar.f363673o);
                        gVar.f363659a.dismiss();
                    } catch (java.lang.Throwable unused) {
                    }
                    gVar.f363659a.setContentView(null);
                    gVar.f363669k = true;
                } catch (java.lang.Throwable unused2) {
                }
            }
            this.f354476a0 = false;
            if (!this.A) {
                android.text.Selection.setSelection((android.text.Spannable) viewTreeObserverOnPreDrawListenerC22668xe0605023.mo81602xfb85ada3(), viewTreeObserverOnPreDrawListenerC22668xe0605023.m81686xffd93625());
            }
            gl5.b0 b0Var = this.f354477b;
            if (b0Var != null) {
                b0Var.c();
            }
            this.C = false;
        }
    }

    public final void K() {
        if (!t()) {
            this.B = true;
        }
        this.A = true;
        J();
        this.A = false;
    }

    public final int c(android.graphics.drawable.Drawable drawable, float f17) {
        int i17;
        float max = java.lang.Math.max(0.5f, f17 - 0.5f);
        if (this.T == null) {
            this.T = new android.graphics.Rect();
        }
        if (drawable != null) {
            drawable.getPadding(this.T);
            i17 = drawable.getIntrinsicWidth();
        } else {
            this.T.setEmpty();
            i17 = 0;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = this.U;
        int scrollX = viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollX();
        float f18 = max - scrollX;
        int width = (viewTreeObserverOnPreDrawListenerC22668xe0605023.getWidth() - viewTreeObserverOnPreDrawListenerC22668xe0605023.m81628xdc9a71d7()) - viewTreeObserverOnPreDrawListenerC22668xe0605023.m81629xb70a2a4c();
        float f19 = width;
        return f18 >= f19 - 1.0f ? (width + scrollX) - (i17 - this.T.right) : (java.lang.Math.abs(f18) <= 1.0f || (android.text.TextUtils.isEmpty(viewTreeObserverOnPreDrawListenerC22668xe0605023.mo81602xfb85ada3()) && ((float) (1048576 - scrollX)) <= f19 + 1.0f && max <= 1.0f)) ? scrollX - this.T.left : ((int) max) - this.T.left;
    }

    public void d() {
        if (this.f354485j == null) {
            this.f354485j = new gl5.r();
        }
    }

    public final void e() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = this.U;
        if (viewTreeObserverOnPreDrawListenerC22668xe0605023.v0() || !viewTreeObserverOnPreDrawListenerC22668xe0605023.M()) {
            return;
        }
        android.text.Selection.setSelection((android.text.Spannable) viewTreeObserverOnPreDrawListenerC22668xe0605023.mo81602xfb85ada3(), viewTreeObserverOnPreDrawListenerC22668xe0605023.m81723xbe0e3ae6(), viewTreeObserverOnPreDrawListenerC22668xe0605023.m81723xbe0e3ae6());
    }

    public final boolean f(android.view.inputmethod.ExtractedTextRequest extractedTextRequest, int i17, int i18, int i19, android.view.inputmethod.ExtractedText extractedText) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023;
        java.lang.CharSequence mo81602xfb85ada3;
        if (extractedTextRequest == null || extractedText == null || (mo81602xfb85ada3 = (viewTreeObserverOnPreDrawListenerC22668xe0605023 = this.U).mo81602xfb85ada3()) == null) {
            return false;
        }
        if (i17 != -2) {
            int length = mo81602xfb85ada3.length();
            if (i17 < 0) {
                extractedText.partialEndOffset = -1;
                extractedText.partialStartOffset = -1;
                i17 = 0;
            } else {
                int i27 = i18 + i19;
                if (mo81602xfb85ada3 instanceof android.text.Spanned) {
                    android.text.Spanned spanned = (android.text.Spanned) mo81602xfb85ada3;
                    java.lang.Object[] spans = spanned.getSpans(i17, i27, android.text.ParcelableSpan.class);
                    int length2 = spans.length;
                    while (length2 > 0) {
                        length2--;
                        int spanStart = spanned.getSpanStart(spans[length2]);
                        if (spanStart < i17) {
                            i17 = spanStart;
                        }
                        int spanEnd = spanned.getSpanEnd(spans[length2]);
                        if (spanEnd > i27) {
                            i27 = spanEnd;
                        }
                    }
                }
                extractedText.partialStartOffset = i17;
                extractedText.partialEndOffset = i27 - i19;
                if (i17 > length) {
                    i17 = length;
                } else if (i17 < 0) {
                    i17 = 0;
                }
                if (i27 <= length) {
                    length = i27 < 0 ? 0 : i27;
                }
            }
            if ((extractedTextRequest.flags & 1) != 0) {
                extractedText.text = mo81602xfb85ada3.subSequence(i17, length);
            } else {
                extractedText.text = android.text.TextUtils.substring(mo81602xfb85ada3, i17, length);
            }
        } else {
            extractedText.partialStartOffset = 0;
            extractedText.partialEndOffset = 0;
            extractedText.text = "";
        }
        extractedText.flags = 0;
        if (android.text.method.MetaKeyKeyListener.getMetaState(mo81602xfb85ada3, 2048) != 0) {
            extractedText.flags |= 2;
        }
        if (viewTreeObserverOnPreDrawListenerC22668xe0605023.E1) {
            extractedText.flags |= 1;
        }
        extractedText.startOffset = 0;
        extractedText.selectionStart = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81687x6f2c472c();
        extractedText.selectionEnd = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81686xffd93625();
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            extractedText.hint = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81647xfb8046fd();
        }
        return true;
    }

    public final boolean g() {
        this.U.getClass();
        android.view.inputmethod.InputMethodManager j17 = j();
        return j17 != null && j17.isFullscreenMode();
    }

    public void h(gl5.s sVar) {
        android.view.inputmethod.InputMethodManager j17;
        int i17;
        int i18;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = this.U;
        viewTreeObserverOnPreDrawListenerC22668xe0605023.getClass();
        if (sVar.f354626f || sVar.f354625e) {
            viewTreeObserverOnPreDrawListenerC22668xe0605023.w0();
            B();
        } else if (sVar.f354624d) {
            int m81686xffd93625 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81686xffd93625();
            viewTreeObserverOnPreDrawListenerC22668xe0605023.O(m81686xffd93625, m81686xffd93625, m81686xffd93625);
        }
        gl5.s sVar2 = this.f354486k;
        if (sVar2 != null && sVar2.f354623c <= 0 && (j17 = j()) != null) {
            int m81687x6f2c472c = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81687x6f2c472c();
            int m81686xffd936252 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81686xffd93625();
            if (viewTreeObserverOnPreDrawListenerC22668xe0605023.mo81602xfb85ada3() instanceof android.text.Spannable) {
                android.text.Spannable spannable = (android.text.Spannable) viewTreeObserverOnPreDrawListenerC22668xe0605023.mo81602xfb85ada3();
                int composingSpanStart = android.view.inputmethod.BaseInputConnection.getComposingSpanStart(spannable);
                i18 = android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(spannable);
                i17 = composingSpanStart;
            } else {
                i17 = -1;
                i18 = -1;
            }
            j17.updateSelection(this.U, m81687x6f2c472c, m81686xffd936252, i17, i18);
        }
        if (t()) {
            return;
        }
        gl5.p p17 = viewTreeObserverOnPreDrawListenerC22668xe0605023.M() ? p() : k();
        if (p17 == null || p17.a() || p17.e()) {
            return;
        }
        p17.mo131740x35dafd();
    }

    public int i(android.text.Layout layout, int i17, float f17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = this.U;
        int J2 = viewTreeObserverOnPreDrawListenerC22668xe0605023.J(f17);
        if (layout == null || i17 > layout.getLineCount() || layout.getLineCount() <= 0 || i17 < 0 || java.lang.Math.abs(J2 - i17) >= 2) {
            return J2;
        }
        int lineBottom = layout.getLineBottom(i17) - layout.getLineTop(i17);
        int max = java.lang.Math.max(0, java.lang.Math.max(this.Y, java.lang.Math.min(this.X, ((int) ((layout.getLineBottom(J2) - layout.getLineTop(J2)) * 0.5f)) + lineBottom)) - lineBottom);
        float y07 = viewTreeObserverOnPreDrawListenerC22668xe0605023.y0();
        return (J2 <= i17 || f17 < ((float) (layout.getLineBottom(i17) + max)) + y07) ? (J2 >= i17 || f17 > ((float) (layout.getLineTop(i17) - max)) + y07) ? i17 : J2 : J2;
    }

    public final android.view.inputmethod.InputMethodManager j() {
        return (android.view.inputmethod.InputMethodManager) this.U.getContext().getSystemService(android.view.inputmethod.InputMethodManager.class);
    }

    public gl5.w k() {
        if (!this.f354479d) {
            return null;
        }
        if (this.f354475a == null) {
            this.f354475a = new gl5.w(this);
            this.U.getViewTreeObserver().addOnTouchModeChangeListener(this.f354475a);
        }
        return this.f354475a;
    }

    public final int l(int i17, boolean z17) {
        android.text.Layout m81661x22f21e20 = this.U.m81661x22f21e20();
        return m81661x22f21e20 == null ? i17 : z17 == m81661x22f21e20.isRtlCharAt(i17) ? m81661x22f21e20.getOffsetToLeftOf(i17) : m81661x22f21e20.getOffsetToRightOf(i17);
    }

    public final long m(int i17, int i18) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = this.U;
        android.text.Layout m81661x22f21e20 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20();
        if (m81661x22f21e20 == null) {
            return jl5.b.a(-1, -1);
        }
        java.lang.CharSequence mo81602xfb85ada3 = viewTreeObserverOnPreDrawListenerC22668xe0605023.mo81602xfb85ada3();
        int lineForOffset = m81661x22f21e20.getLineForOffset(i17);
        while (lineForOffset > 0 && mo81602xfb85ada3.charAt(m81661x22f21e20.getLineEnd(lineForOffset - 1) - 1) != '\n') {
            lineForOffset--;
        }
        int lineForOffset2 = m81661x22f21e20.getLineForOffset(i18);
        while (lineForOffset2 < m81661x22f21e20.getLineCount() - 1 && mo81602xfb85ada3.charAt(m81661x22f21e20.getLineEnd(lineForOffset2) - 1) != '\n') {
            lineForOffset2++;
        }
        return jl5.b.a(m81661x22f21e20.getLineStart(lineForOffset), m81661x22f21e20.getLineEnd(lineForOffset2));
    }

    public final gl5.z n() {
        if (this.f354474J == null) {
            this.f354474J = new gl5.z(this, null);
        }
        return this.f354474J;
    }

    public final gl5.e1 o() {
        if (this.D == null) {
            this.D = new gl5.e1(this);
        }
        return this.D;
    }

    public gl5.b0 p() {
        if (!this.f354480e) {
            return null;
        }
        if (this.f354477b == null) {
            this.f354477b = new gl5.b0(this);
            this.U.getViewTreeObserver().addOnTouchModeChangeListener(this.f354477b);
        }
        return this.f354477b;
    }

    public final kl5.b q() {
        kl5.b bVar = this.R;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = this.U;
        if (bVar == null) {
            this.R = new kl5.b(viewTreeObserverOnPreDrawListenerC22668xe0605023.m81707x9f3c2cdb());
            this.S = true;
        }
        if (this.S) {
            java.lang.CharSequence mo81602xfb85ada3 = viewTreeObserverOnPreDrawListenerC22668xe0605023.mo81602xfb85ada3();
            this.R.j(mo81602xfb85ada3, 0, mo81602xfb85ada3.length());
            this.S = false;
        }
        return this.R;
    }

    public void r() {
        gl5.u uVar;
        gl5.w wVar = this.f354475a;
        if (wVar == null || (uVar = wVar.f354638d) == null) {
            return;
        }
        uVar.i();
    }

    public void s() {
        android.view.ActionMode actionMode;
        gl5.u uVar;
        gl5.b0 b0Var = this.f354477b;
        if (b0Var != null) {
            gl5.a0 a0Var = b0Var.f354436d;
            if (a0Var != null) {
                a0Var.invalidate();
            }
            gl5.a0 a0Var2 = b0Var.f354437e;
            if (a0Var2 != null) {
                a0Var2.invalidate();
            }
        }
        gl5.w wVar = this.f354475a;
        if (wVar != null && (uVar = wVar.f354638d) != null) {
            uVar.invalidate();
        }
        if (t() || (actionMode = this.f354478c) == null) {
            return;
        }
        actionMode.invalidate();
    }

    public boolean t() {
        return this.f354478c == null && !this.f354476a0;
    }

    public final boolean u() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = this.U;
        for (android.text.style.SuggestionSpan suggestionSpan : (android.text.style.SuggestionSpan[]) ((android.text.Spannable) viewTreeObserverOnPreDrawListenerC22668xe0605023.mo81602xfb85ada3()).getSpans(viewTreeObserverOnPreDrawListenerC22668xe0605023.m81687x6f2c472c(), viewTreeObserverOnPreDrawListenerC22668xe0605023.m81686xffd93625(), android.text.style.SuggestionSpan.class)) {
            if ((suggestionSpan.getFlags() & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean v(float f17, float f18) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = this.U;
        android.text.Layout m81661x22f21e20 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20();
        if (m81661x22f21e20 == null) {
            return false;
        }
        int J2 = viewTreeObserverOnPreDrawListenerC22668xe0605023.J(f18);
        float C = viewTreeObserverOnPreDrawListenerC22668xe0605023.C(f17);
        return C >= m81661x22f21e20.getLineLeft(J2) && C <= m81661x22f21e20.getLineRight(J2);
    }

    public void w(boolean z17) {
        gl5.w k17;
        gl5.u uVar;
        gl5.b0 p17;
        gl5.a0 a0Var;
        android.graphics.drawable.Drawable drawable = this.I;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = this.U;
        if (drawable == null || z17) {
            android.graphics.drawable.Drawable m81704xb4748787 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81704xb4748787();
            this.I = m81704xb4748787;
            if (m81704xb4748787 != null) {
                android.graphics.drawable.Drawable C = C(viewTreeObserverOnPreDrawListenerC22668xe0605023.getContext(), this.I, 23);
                this.I = C;
                C.setTint(viewTreeObserverOnPreDrawListenerC22668xe0605023.f293127j2);
            }
            if (this.f354479d && (uVar = (k17 = k()).f354638d) != null) {
                android.graphics.drawable.Drawable drawable2 = k17.f354639e.I;
                uVar.f354592e = drawable2;
                uVar.f354593f = drawable2;
                uVar.p(true);
            }
        }
        if (this.G == null || this.H == null || z17) {
            this.G = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81705xd06b802e();
            android.graphics.drawable.Drawable C2 = C(viewTreeObserverOnPreDrawListenerC22668xe0605023.getContext(), this.G, 21);
            this.G = C2;
            C2.setTint(viewTreeObserverOnPreDrawListenerC22668xe0605023.f293127j2);
            this.H = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81706x3d5ae6d5();
            android.graphics.drawable.Drawable C3 = C(viewTreeObserverOnPreDrawListenerC22668xe0605023.getContext(), this.H, 21);
            this.H = C3;
            C3.setTint(viewTreeObserverOnPreDrawListenerC22668xe0605023.f293127j2);
            if (!this.f354480e || (a0Var = (p17 = p()).f354436d) == null) {
                return;
            }
            gl5.e0 e0Var = p17.f354446q;
            android.graphics.drawable.Drawable drawable3 = e0Var.G;
            android.graphics.drawable.Drawable drawable4 = e0Var.H;
            a0Var.f354592e = drawable3;
            a0Var.f354593f = drawable4;
            a0Var.p(true);
            gl5.a0 a0Var2 = p17.f354437e;
            android.graphics.drawable.Drawable drawable5 = e0Var.H;
            android.graphics.drawable.Drawable drawable6 = e0Var.G;
            a0Var2.f354592e = drawable5;
            a0Var2.f354593f = drawable6;
            a0Var2.p(true);
        }
    }

    public void x() {
        boolean E = E();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = this.U;
        if (!E) {
            gl5.n nVar = this.f354496u;
            if (nVar != null) {
                viewTreeObserverOnPreDrawListenerC22668xe0605023.removeCallbacks(nVar);
                return;
            }
            return;
        }
        this.f354494s = android.os.SystemClock.uptimeMillis();
        if (this.f354496u == null) {
            this.f354496u = new gl5.n(this, null);
        }
        viewTreeObserverOnPreDrawListenerC22668xe0605023.removeCallbacks(this.f354496u);
        viewTreeObserverOnPreDrawListenerC22668xe0605023.postDelayed(this.f354496u, 500L);
    }

    public final boolean y() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = this.U;
        if (viewTreeObserverOnPreDrawListenerC22668xe0605023.H instanceof android.text.method.PasswordTransformationMethod) {
            return true;
        }
        int m81657x652bd76e = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81657x652bd76e();
        int i17 = m81657x652bd76e & 15;
        int i18 = m81657x652bd76e & 4080;
        return i17 == 2 || i17 == 3 || i17 == 4 || i18 == 16 || i18 == 32 || i18 == 208 || i18 == 176;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z() {
        /*
            r5 = this;
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r5.U
            android.view.View r1 = r0.getRootView()
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r2 = r1 instanceof android.view.WindowManager.LayoutParams
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L1e
            android.view.WindowManager$LayoutParams r1 = (android.view.WindowManager.LayoutParams) r1
            int r1 = r1.type
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r1 < r2) goto L1c
            r2 = 1999(0x7cf, float:2.801E-42)
            if (r1 <= r2) goto L1e
        L1c:
            r1 = r3
            goto L1f
        L1e:
            r1 = r4
        L1f:
            if (r1 == 0) goto L29
            android.text.Layout r1 = r0.m81661x22f21e20()
            if (r1 == 0) goto L29
            r1 = r3
            goto L2a
        L29:
            r1 = r4
        L2a:
            if (r1 == 0) goto L3d
            boolean r2 = r5.f354497v
            if (r2 == 0) goto L38
            boolean r2 = r0.V()
            if (r2 == 0) goto L38
            r2 = r3
            goto L39
        L38:
            r2 = r4
        L39:
            if (r2 == 0) goto L3d
            r2 = r3
            goto L3e
        L3d:
            r2 = r4
        L3e:
            r5.f354479d = r2
            if (r1 == 0) goto L49
            boolean r0 = r0.v0()
            if (r0 == 0) goto L49
            goto L4a
        L49:
            r3 = r4
        L4a:
            r5.f354480e = r3
            boolean r0 = r5.f354479d
            r1 = 0
            if (r0 != 0) goto L74
            r5.r()
            gl5.w r0 = r5.f354475a
            if (r0 == 0) goto L74
            gl5.e0 r2 = r0.f354639e
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r2 = r2.U
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
            r2.removeOnTouchModeChangeListener(r0)
            gl5.u r0 = r0.f354638d
            if (r0 == 0) goto L72
            java.lang.Runnable r2 = r0.Q
            if (r2 == 0) goto L72
            gl5.e0 r0 = r0.T
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r0 = r0.U
            r0.removeCallbacks(r2)
        L72:
            r5.f354475a = r1
        L74:
            boolean r0 = r5.f354480e
            if (r0 != 0) goto L8c
            r5.J()
            gl5.b0 r0 = r5.f354477b
            if (r0 == 0) goto L8c
            gl5.e0 r2 = r0.f354446q
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r2 = r2.U
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
            r2.removeOnTouchModeChangeListener(r0)
            r5.f354477b = r1
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gl5.e0.z():void");
    }
}
