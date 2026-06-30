package sc2;

/* loaded from: classes2.dex */
public final class w1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.f2 f487858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f487859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f487860f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(sc2.f2 f2Var, android.view.ViewGroup viewGroup, android.view.ViewGroup viewGroup2) {
        super(0);
        this.f487858d = f2Var;
        this.f487859e = viewGroup;
        this.f487860f = viewGroup2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sc2.f2 f2Var = this.f487858d;
        android.view.ViewGroup viewGroup = this.f487859e;
        sc2.v1 v1Var = new sc2.v1(f2Var, viewGroup, this.f487860f);
        f2Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(childAt, "getChildAt(...)");
            android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(childAt, "alpha", 0.0f).setDuration(150L);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(duration, "setDuration(...)");
            arrayList.add(duration);
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new sc2.l1(v1Var));
        animatorSet.start();
        return jz5.f0.f384359a;
    }
}
