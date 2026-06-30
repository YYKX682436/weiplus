package fn2;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final fn2.d f345775a = new fn2.d();

    public final fn2.c a(android.view.View view, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.graphics.drawable.Drawable background = view.getBackground();
        android.graphics.drawable.ColorDrawable colorDrawable = background instanceof android.graphics.drawable.ColorDrawable ? (android.graphics.drawable.ColorDrawable) background : null;
        fn2.c cVar = new fn2.c(view, colorDrawable != null ? colorDrawable.getColor() : context.getColor(android.R.color.transparent));
        android.animation.ArgbEvaluator argbEvaluator = new android.animation.ArgbEvaluator();
        int i17 = cVar.f345762b;
        android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(argbEvaluator, java.lang.Integer.valueOf(i17), 436715872);
        ofObject.setDuration(300L);
        ofObject.addUpdateListener(new fn2.a(cVar));
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, 1);
        ofInt.setDuration(1000L);
        android.animation.ValueAnimator ofObject2 = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), 436715872, java.lang.Integer.valueOf(i17));
        ofObject2.setDuration(300L);
        ofObject2.addUpdateListener(new fn2.b(cVar));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playSequentially(ofObject, ofInt, ofObject2);
        animatorSet.start();
        cVar.f345763c = animatorSet;
        return cVar;
    }
}
