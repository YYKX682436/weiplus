package sc2;

/* loaded from: classes2.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f487756d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(sc2.h1 h1Var) {
        super(0);
        this.f487756d = h1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sc2.h1 h1Var = this.f487756d;
        android.animation.AnimatorSet animatorSet = h1Var.f487466y0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        h1Var.f487466y0 = null;
        android.view.View view = h1Var.X;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$dismissLoading$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$dismissLoading$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15179x385a9ce5 c15179x385a9ce5 = h1Var.U;
        if (c15179x385a9ce5 != null) {
            c15179x385a9ce5.setVisibility(0);
        }
        return jz5.f0.f384359a;
    }
}
