package fl1;

/* loaded from: classes5.dex */
public final class q implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.s f345378d;

    public q(fl1.s sVar) {
        this.f345378d = sVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        fl1.s sVar = this.f345378d;
        int lineHeight = sVar.f345390g.getLineHeight();
        int height = sVar.f345391h.getHeight();
        if (lineHeight > height) {
            if (sVar.f345392i.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) {
                android.view.ViewGroup.LayoutParams layoutParams = sVar.f345392i.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = (lineHeight - height) / 2;
            }
        } else if (sVar.f345390g.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.LayoutParams layoutParams2 = sVar.f345390g.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (height - lineHeight) / 2;
        }
        sVar.f345390g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
