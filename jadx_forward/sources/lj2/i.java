package lj2;

/* loaded from: classes.dex */
public final class i implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f400396d;

    public i(android.view.ViewGroup viewGroup) {
        this.f400396d = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.ViewGroup viewGroup = this.f400396d;
        viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        viewGroup.setTranslationY(viewGroup.getHeight() / 2.0f);
    }
}
