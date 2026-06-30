package bp2;

/* loaded from: classes3.dex */
public final class f implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp2.i f23049d;

    public f(bp2.i iVar) {
        this.f23049d = iVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        bp2.i iVar = this.f23049d;
        android.view.View view = iVar.f23053c;
        if (view != null) {
            view.setTag(com.tencent.mm.R.id.f486102k64, "loaded");
        }
        bp2.i.a(iVar);
        android.view.View view2 = iVar.f23053c;
        if (view2 == null) {
            com.tencent.mars.xlog.Log.w("FinderLiveCardPreViewAnimationHelper", "startUIAlphaShowAnim: targetView is null, pos=" + iVar.f23054d);
            return;
        }
        android.view.View findViewById = view2.findViewById(com.tencent.mm.R.id.f484870fs4);
        if (findViewById != null) {
            findViewById.animate().cancel();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/guide/FinderLiveCardPreViewAnimationHelper", "startUIAlphaShowAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/nearby/guide/FinderLiveCardPreViewAnimationHelper", "startUIAlphaShowAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById.animate().alpha(1.0f).setDuration(300L).start();
        }
        android.view.View findViewById2 = view2.findViewById(com.tencent.mm.R.id.f4p);
        if (findViewById2 != null) {
            findViewById2.animate().cancel();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
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
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
