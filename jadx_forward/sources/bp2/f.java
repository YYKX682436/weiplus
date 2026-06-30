package bp2;

/* loaded from: classes3.dex */
public final class f implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp2.i f104582d;

    public f(bp2.i iVar) {
        this.f104582d = iVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        bp2.i iVar = this.f104582d;
        android.view.View view = iVar.f104586c;
        if (view != null) {
            view.setTag(com.p314xaae8f345.mm.R.id.f567635k64, "loaded");
        }
        bp2.i.a(iVar);
        android.view.View view2 = iVar.f104586c;
        if (view2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveCardPreViewAnimationHelper", "startUIAlphaShowAnim: targetView is null, pos=" + iVar.f104587d);
            return;
        }
        android.view.View findViewById = view2.findViewById(com.p314xaae8f345.mm.R.id.f566403fs4);
        if (findViewById != null) {
            findViewById.animate().cancel();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/guide/FinderLiveCardPreViewAnimationHelper", "startUIAlphaShowAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/nearby/guide/FinderLiveCardPreViewAnimationHelper", "startUIAlphaShowAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById.animate().alpha(1.0f).setDuration(300L).start();
        }
        android.view.View findViewById2 = view2.findViewById(com.p314xaae8f345.mm.R.id.f4p);
        if (findViewById2 != null) {
            findViewById2.animate().cancel();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/guide/FinderLiveCardPreViewAnimationHelper", "startUIAlphaShowAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/nearby/guide/FinderLiveCardPreViewAnimationHelper", "startUIAlphaShowAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById2.animate().alpha(1.0f).setDuration(300L).start();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }
}
