package mi1;

/* loaded from: classes7.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final mi1.t1 f408225a = new mi1.t1();

    public final android.widget.TextView a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        android.view.View a17 = runtime.f156354z.a(com.p314xaae8f345.mm.R.id.e5d);
        if (a17 instanceof android.widget.TextView) {
            return (android.widget.TextView) a17;
        }
        return null;
    }

    public final android.animation.ValueAnimator b(int i17, int i18, android.view.View view, boolean z17) {
        int i19;
        if (view == null) {
            return null;
        }
        if (z17) {
            if (view.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) {
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                i19 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
            } else {
                i19 = i18;
            }
            if (i19 == i18) {
                return null;
            }
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(i17, i18);
        ofInt.addUpdateListener(new mi1.c3(view));
        return ofInt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.CharSequence] */
    public final void c(android.widget.TextView textView, int i17, boolean z17) {
        boolean z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<this>");
        java.lang.CharSequence text = textView.getText();
        if (i17 < 1 || i17 > text.length()) {
            return;
        }
        if (textView.getWidth() <= 0) {
            if (z17) {
                return;
            }
            textView.post(new mi1.s1(textView, i17));
            return;
        }
        java.lang.String obj = text.subSequence(i17, text.length()).toString();
        java.lang.String obj2 = text.subSequence(0, i17).toString();
        int width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight();
        android.graphics.drawable.Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(compoundDrawablesRelative);
        int length = compoundDrawablesRelative.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                z18 = false;
                break;
            }
            if (compoundDrawablesRelative[i18] != null) {
                z18 = true;
                break;
            }
            i18++;
        }
        if (!z18) {
            compoundDrawablesRelative = null;
        }
        if (compoundDrawablesRelative == null) {
            compoundDrawablesRelative = textView.getCompoundDrawables();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(compoundDrawablesRelative);
        android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) kz5.z.U(compoundDrawablesRelative, 0);
        android.graphics.drawable.Drawable drawable2 = (android.graphics.drawable.Drawable) kz5.z.U(compoundDrawablesRelative, 2);
        int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() + textView.getCompoundDrawablePadding() + 0 : 0;
        if (drawable2 != null) {
            intrinsicWidth += drawable2.getIntrinsicWidth() + textView.getCompoundDrawablePadding();
        }
        int i19 = width - intrinsicWidth;
        if (i19 <= 0) {
            textView.setText(text);
            textView.setContentDescription(text);
            return;
        }
        ?? ellipsize = android.text.TextUtils.ellipsize(obj2, textView.getPaint(), i19 - textView.getPaint().measureText(obj), android.text.TextUtils.TruncateAt.END);
        if (ellipsize != 0) {
            obj2 = ellipsize;
        }
        textView.setText(android.text.TextUtils.concat(obj2, obj));
        textView.setContentDescription(text);
    }
}
