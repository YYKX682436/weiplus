package b04;

/* loaded from: classes4.dex */
public final class s extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f16932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f16933e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b04.z f16934f;

    public s(android.widget.LinearLayout linearLayout, android.view.View view, b04.z zVar) {
        this.f16932d = linearLayout;
        this.f16933e = view;
        this.f16934f = zVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f16932d.getLayoutParams().height = -2;
        this.f16933e.getLayoutParams().height = -2;
        b04.z zVar = this.f16934f;
        com.tencent.mm.ui.widget.code.CodeItemView codeItemView = zVar.f16950g;
        if (codeItemView != null) {
            codeItemView.setBottomView(null);
        }
        zVar.f16961u = null;
    }
}
