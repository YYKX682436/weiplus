package f3;

/* loaded from: classes13.dex */
public class i extends f3.j {
    @Override // f3.j
    public void a(int i17, int i18, int i19, android.graphics.Rect rect, android.graphics.Rect rect2) {
        android.view.Gravity.apply(i17, i18, i19, rect, rect2, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline outline) {
        d();
        outline.setRoundRect(this.f340786h, this.f340785g);
    }
}
