package bs0;

/* loaded from: classes3.dex */
public final class a extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f23779a;

    public a(float f17) {
        this.f23779a = f17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, view != null ? view.getMeasuredWidth() : 0, view != null ? view.getMeasuredHeight() : 0);
        if (outline != null) {
            outline.setRoundRect(rect, this.f23779a);
        }
    }
}
