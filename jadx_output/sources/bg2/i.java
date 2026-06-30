package bg2;

/* loaded from: classes10.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.k f20150d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(bg2.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20150d = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.i(this.f20150d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bg2.i iVar = (bg2.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        iVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ri2.a aVar;
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator listener;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator interpolator;
        pz5.a aVar2 = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        bg2.k kVar = this.f20150d;
        int i17 = kVar.f20229p;
        kVar.getClass();
        if (i17 == 0) {
            if ((kVar.d7() == 1) && (aVar = kVar.f20224h) != null) {
                ri2.j jVar = (ri2.j) aVar;
                android.view.View view = jVar.f396066i;
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "onStartBattleAnimateStart", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "onStartBattleAnimateStart", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
                android.view.View view2 = jVar.f396066i;
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "onStartBattleAnimateStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "onStartBattleAnimateStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view3 = jVar.f396066i;
                if (view3 != null && (animate = view3.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (listener = alpha.setListener(null)) != null && (duration = listener.setDuration(500L)) != null && (interpolator = duration.setInterpolator(new android.view.animation.AccelerateInterpolator())) != null) {
                    interpolator.start();
                }
                kotlinx.coroutines.y0 y0Var = jVar.f396059b.f417141d.f417147g;
                if (y0Var != null) {
                    kotlinx.coroutines.l.d(y0Var, null, null, new ri2.g(jVar, null), 3, null);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
