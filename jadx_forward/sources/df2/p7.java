package df2;

/* loaded from: classes3.dex */
public final class p7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f312576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f312577e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f312578f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f312579g;

    public p7(android.widget.TextView textView, df2.s8 s8Var, long j17, boolean z17) {
        this.f312576d = textView;
        this.f312577e = s8Var;
        this.f312578f = j17;
        this.f312579g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        al5.w wVar;
        android.widget.TextView textView = this.f312576d;
        textView.setPadding(0, textView.getPaddingTop(), textView.getPaddingRight(), textView.getPaddingBottom());
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        int width = textView.getWidth();
        f0Var.f391649d = width;
        df2.s8 s8Var = this.f312577e;
        if (width == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s8Var.f312832m, "txtView.width is 0, measure now");
            textView.measure(0, 0);
            f0Var.f391649d = textView.getMeasuredWidth();
        }
        boolean z17 = f0Var.f391649d > df2.s8.a7(s8Var);
        if (f0Var.f391649d > 0) {
            int a76 = df2.s8.a7(s8Var) - f0Var.f391649d;
            if (a76 < 0) {
                a76 = 0;
            }
            textView.setPadding(a76 / 2, textView.getPaddingTop(), textView.getPaddingRight(), textView.getPaddingBottom());
        }
        textView.setScrollX(0);
        textView.setTranslationX(0.0f);
        android.animation.ObjectAnimator objectAnimator = s8Var.f312836p0;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
        }
        android.animation.ObjectAnimator objectAnimator2 = s8Var.f312836p0;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s8Var.f312832m, "[checkAndLaunchScrollAnim] textViewWidth:" + f0Var.f391649d + ", " + df2.s8.a7(s8Var) + ", txtView.scrollX:" + textView.getScrollX() + ", txtView.translationX:" + textView.getTranslationX());
        if (z17) {
            int measureText = (int) textView.getPaint().measureText(s8Var.E1);
            java.lang.CharSequence text = textView.getText();
            java.lang.String str = ((java.lang.Object) text) + s8Var.E1 + ((java.lang.Object) text);
            if (text instanceof android.text.SpannedString) {
                al5.w[] wVarArr = (al5.w[]) ((android.text.Spanned) text).getSpans(0, text.length(), al5.w.class);
                jz5.f0 f0Var2 = null;
                if (!(!(wVarArr.length == 0))) {
                    wVarArr = null;
                }
                if (wVarArr != null && (wVar = (al5.w) kz5.z.U(wVarArr, 0)) != null) {
                    al5.w wVar2 = new al5.w(wVar.getDrawable(), 1);
                    android.text.SpannedString spannedString = (android.text.SpannedString) text;
                    int spanStart = spannedString.getSpanStart(wVar);
                    int spanEnd = spannedString.getSpanEnd(wVar);
                    android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str);
                    spannableStringBuilder.setSpan(wVar2, spanStart, spanEnd, 34);
                    spannableStringBuilder.setSpan(new al5.w(wVar.getDrawable(), 1), spanStart + text.length() + s8Var.E1.length(), spanEnd + text.length() + s8Var.E1.length(), 34);
                    textView.setText(spannableStringBuilder);
                    textView.invalidate();
                    f0Var2 = jz5.f0.f384359a;
                }
                if (f0Var2 == null) {
                    textView.setText(str);
                }
            } else {
                textView.setText(str);
            }
            int[] iArr = new int[2];
            iArr[0] = 0;
            int a77 = ((f0Var.f391649d * 2) - df2.s8.a7(s8Var)) + measureText;
            iArr[1] = a77 >= 0 ? a77 : 0;
            s8Var.f312836p0 = android.animation.ObjectAnimator.ofInt(textView, "scrollX", iArr);
            android.animation.ObjectAnimator objectAnimator3 = s8Var.f312836p0;
            if (objectAnimator3 != null) {
                objectAnimator3.setDuration(this.f312578f);
            }
            android.animation.ObjectAnimator objectAnimator4 = s8Var.f312836p0;
            if (objectAnimator4 != null) {
                objectAnimator4.setInterpolator(new android.view.animation.LinearInterpolator());
            }
            df2.s8 s8Var2 = this.f312577e;
            android.animation.ObjectAnimator objectAnimator5 = s8Var2.f312836p0;
            if (objectAnimator5 != null) {
                objectAnimator5.addListener(new df2.o7(s8Var2, this.f312579g, f0Var, measureText, this.f312578f, this.f312576d));
            }
            android.animation.ObjectAnimator objectAnimator6 = s8Var.f312836p0;
            if (objectAnimator6 != null) {
                objectAnimator6.start();
            }
        }
    }
}
