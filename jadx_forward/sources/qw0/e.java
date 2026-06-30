package qw0;

/* loaded from: classes3.dex */
public final class e implements hv0.j {

    /* renamed from: a, reason: collision with root package name */
    public float f448600a;

    @Override // hv0.j
    public void a(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 panel, android.view.View animView, android.view.View backgroundView, yz5.p onTranslation, yz5.a end) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animView, "animView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(backgroundView, "backgroundView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onTranslation, "onTranslation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(end, "end");
        w9.c cVar = w9.c.f525572a;
        android.graphics.drawable.Drawable background = backgroundView.getBackground();
        android.graphics.drawable.ColorDrawable colorDrawable = background instanceof android.graphics.drawable.ColorDrawable ? (android.graphics.drawable.ColorDrawable) background : null;
        java.lang.Integer valueOf = colorDrawable != null ? java.lang.Integer.valueOf(colorDrawable.getColor()) : null;
        float f17 = this.f448600a;
        animView.animate().setInterpolator(new android.view.animation.AccelerateInterpolator(1.5f)).translationY(f17).withEndAction(new qw0.a(end)).setUpdateListener(new qw0.b(animView, valueOf, backgroundView, cVar, 0, onTranslation, f17)).setDuration(300L).start();
    }

    @Override // hv0.j
    public void b(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 panel, android.view.View animView, android.view.View backgroundView, yz5.p onTranslation, yz5.a end) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animView, "animView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(backgroundView, "backgroundView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onTranslation, "onTranslation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(end, "end");
        w9.c cVar = w9.c.f525572a;
        android.graphics.drawable.Drawable background = backgroundView.getBackground();
        android.graphics.drawable.ColorDrawable colorDrawable = background instanceof android.graphics.drawable.ColorDrawable ? (android.graphics.drawable.ColorDrawable) background : null;
        java.lang.Integer valueOf = colorDrawable != null ? java.lang.Integer.valueOf(colorDrawable.getColor()) : null;
        float mo47066x10b53b15 = panel.mo47066x10b53b15();
        if (this.f448600a == 0.0f) {
            this.f448600a = mo47066x10b53b15;
        }
        float f17 = mo47066x10b53b15 - this.f448600a;
        animView.setTranslationY(mo47066x10b53b15);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(animView, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/anim/ComposingAddTitlePanelAnimation", "startOpenAnimation", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/base/BaseComposingPanel;Landroid/view/View;Landroid/view/View;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        animView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(animView, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/anim/ComposingAddTitlePanelAnimation", "startOpenAnimation", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/base/BaseComposingPanel;Landroid/view/View;Landroid/view/View;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        animView.animate().setInterpolator(new android.view.animation.DecelerateInterpolator(1.5f)).translationY(f17).alpha(1.0f).withEndAction(new qw0.c(end)).setUpdateListener(new qw0.d(valueOf, backgroundView, cVar, 0, onTranslation, mo47066x10b53b15)).setDuration(300L).start();
    }
}
