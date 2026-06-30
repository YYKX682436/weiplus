package df5;

/* loaded from: classes15.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f313753a = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public final android.view.animation.AccelerateInterpolator f313754b = new android.view.animation.AccelerateInterpolator();

    /* renamed from: c, reason: collision with root package name */
    public int f313755c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f313756d;

    /* renamed from: e, reason: collision with root package name */
    public android.animation.ValueAnimator f313757e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f313758f;

    /* renamed from: g, reason: collision with root package name */
    public int f313759g;

    /* renamed from: h, reason: collision with root package name */
    public int f313760h;

    /* renamed from: i, reason: collision with root package name */
    public final df5.q1[] f313761i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f313762j;

    public u1() {
        df5.q1[] q1VarArr = new df5.q1[3];
        for (int i17 = 0; i17 < 3; i17++) {
            q1VarArr[i17] = new df5.q1();
        }
        this.f313761i = q1VarArr;
    }

    public final void a(android.text.Spannable spannable, df5.q1 q1Var) {
        int spanStart = spannable.getSpanStart(q1Var);
        int spanEnd = spannable.getSpanEnd(q1Var);
        if (spanStart < 0 || spanEnd <= spanStart) {
            return;
        }
        int spanFlags = spannable.getSpanFlags(q1Var);
        spannable.removeSpan(q1Var);
        spannable.setSpan(q1Var, spanStart, spanEnd, spanFlags);
    }

    public final void b(android.widget.TextView tv6) {
        android.text.Editable editableText;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tv6, "tv");
        c();
        if (tv6.isAttachedToWindow() && (editableText = tv6.getEditableText()) != null) {
            this.f313758f = tv6;
            this.f313759g = editableText.length();
            this.f313762j = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WaitingDotsCtrl", "[WAITING_DOTS] start: tvHash=%d, originalLen=%d, gen=%d", java.lang.Integer.valueOf(java.lang.System.identityHashCode(tv6)), java.lang.Integer.valueOf(this.f313759g), java.lang.Integer.valueOf(this.f313755c));
            editableText.append((java.lang.CharSequence) "...");
            tv6.requestLayout();
            for (int i17 = 0; i17 < 3; i17++) {
                df5.q1 q1Var = this.f313761i[i17];
                q1Var.f313728d = 0;
                int i18 = this.f313759g + i17;
                editableText.setSpan(q1Var, i18, i18 + 1, 33);
            }
            this.f313760h = 0;
            java.lang.Runnable runnable = this.f313756d;
            android.os.Handler handler = this.f313753a;
            if (runnable != null) {
                handler.removeCallbacks(runnable);
            }
            df5.t1 t1Var = new df5.t1(this, this.f313755c);
            this.f313756d = t1Var;
            handler.postDelayed(t1Var, 150L);
        }
    }

    public final void c() {
        android.text.Editable editableText;
        int i17;
        if (this.f313762j || this.f313758f != null) {
            android.widget.TextView textView = this.f313758f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WaitingDotsCtrl", "[WAITING_DOTS] stop: tvHash=%d, state=%d, gen=%d", java.lang.Integer.valueOf(textView != null ? java.lang.System.identityHashCode(textView) : 0), java.lang.Integer.valueOf(this.f313760h), java.lang.Integer.valueOf(this.f313755c));
            this.f313755c++;
            this.f313762j = false;
            java.lang.Runnable runnable = this.f313756d;
            if (runnable != null) {
                this.f313753a.removeCallbacks(runnable);
            }
            this.f313756d = null;
            android.animation.ValueAnimator valueAnimator = this.f313757e;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f313757e = null;
            }
            android.widget.TextView textView2 = this.f313758f;
            if (textView2 != null && (editableText = textView2.getEditableText()) != null && editableText.length() >= (i17 = this.f313759g + 3)) {
                for (df5.q1 q1Var : this.f313761i) {
                    editableText.removeSpan(q1Var);
                }
                editableText.delete(this.f313759g, i17);
                textView2.requestLayout();
            }
            this.f313758f = null;
            this.f313759g = 0;
            this.f313760h = 0;
        }
    }
}
