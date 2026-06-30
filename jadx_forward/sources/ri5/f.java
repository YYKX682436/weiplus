package ri5;

/* loaded from: classes.dex */
public final class f implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ em.o2 f477633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ri5.g f477634e;

    public f(em.o2 o2Var, ri5.g gVar) {
        this.f477633d = o2Var;
        this.f477634e = gVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.ViewGroup.LayoutParams layoutParams;
        em.o2 o2Var = this.f477633d;
        o2Var.f().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int width = o2Var.f().getWidth();
        android.view.ViewGroup.LayoutParams layoutParams2 = o2Var.h().getLayoutParams();
        if (layoutParams2 != null) {
            int i17 = layoutParams2.width;
            if (i17 <= 0) {
                i17 = o2Var.h().getWidth();
            }
            ri5.g gVar = this.f477634e;
            int intValue = (width - i17) - ((java.lang.Number) ((jz5.n) gVar.f477636f).mo141623x754a37bb()).intValue();
            jz5.g gVar2 = gVar.f477635e;
            if (intValue >= ((java.lang.Number) ((jz5.n) gVar2).mo141623x754a37bb()).intValue() || (layoutParams = o2Var.h().getLayoutParams()) == null) {
                return;
            }
            layoutParams.width = i17 - ((java.lang.Number) ((jz5.n) gVar2).mo141623x754a37bb()).intValue();
            o2Var.h().setLayoutParams(layoutParams);
            o2Var.h().postInvalidate();
        }
    }
}
