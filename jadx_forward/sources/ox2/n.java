package ox2;

/* loaded from: classes2.dex */
public final class n implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f431221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e f431222e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f431223f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f431224g;

    public n(yz5.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e c15408x626e05e, yz5.a aVar2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e c15408x626e05e2, android.view.View view) {
        this.f431221d = aVar;
        this.f431222e = c15408x626e05e;
        this.f431223f = aVar2;
        this.f431224g = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f431223f.mo152xb9724478();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f431221d.mo152xb9724478();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e c15408x626e05e = this.f431222e;
        if (c15408x626e05e.isPreview) {
            return;
        }
        hc2.f1.d(c15408x626e05e);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e c15408x626e05e = this.f431222e;
        java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
        c15408x626e05e.setAlpha(1.0f);
        c15408x626e05e.setVisibility(0);
        c15408x626e05e.f213915t = true;
        c15408x626e05e.h();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 c15276x168ec665 = c15408x626e05e.f213906h;
        if (c15276x168ec665 != null) {
            c15276x168ec665.setAlpha(1.0f);
        }
        android.view.View view = c15408x626e05e.f213904f;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(valueOf);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEgg$turnAnimation$lambda$7$$inlined$addListener$default$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEgg$turnAnimation$lambda$7$$inlined$addListener$default$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view2 = this.f431224g;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEgg$turnAnimation$lambda$7$$inlined$addListener$default$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEgg$turnAnimation$lambda$7$$inlined$addListener$default$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = this.f431224g;
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(valueOf);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEgg$turnAnimation$lambda$7$$inlined$addListener$default$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEgg$turnAnimation$lambda$7$$inlined$addListener$default$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        c15408x626e05e.getClass();
        try {
            if (!c15408x626e05e.f213920y) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("InteractionEasterEggCenter", "playPag: initPagSuccess is false");
                if (!c15408x626e05e.c()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("InteractionEasterEggCenter", "playPag: initPag return false");
                }
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = c15408x626e05e.f213908m;
            if (c22789xd23e9a9b != null) {
                c22789xd23e9a9b.setVisibility(0);
                c22789xd23e9a9b.m82582x3ae760af(0.0d);
                c22789xd23e9a9b.m82583xcde73672(1);
                c22789xd23e9a9b.g();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("InteractionEasterEggCenter", "playPag e:" + th6);
        }
    }
}
