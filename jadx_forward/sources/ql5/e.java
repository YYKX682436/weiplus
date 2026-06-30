package ql5;

/* loaded from: classes13.dex */
public class e extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f446131d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.drawable.Drawable f446132e;

    /* renamed from: f, reason: collision with root package name */
    public int f446133f;

    /* renamed from: g, reason: collision with root package name */
    public int f446134g;

    public e(android.content.Context context, ql5.a aVar) {
        super(context);
        this.f446131d = new java.util.ArrayList();
    }

    @Override // android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        canvas.save();
        android.graphics.drawable.Drawable drawable = this.f446132e;
        if (drawable != null) {
            drawable.setBounds(0, 0, this.f446133f, this.f446134g);
        }
        java.util.List list = this.f446131d;
        int size = ((java.util.ArrayList) list).size();
        for (int i17 = 0; i17 < size; i17++) {
            ((android.view.View) ((java.util.ArrayList) list).get(i17)).draw(canvas);
            canvas.translate(0.0f, r3.getMeasuredHeight());
            android.graphics.drawable.Drawable drawable2 = this.f446132e;
            if (drawable2 != null) {
                drawable2.draw(canvas);
                canvas.translate(0.0f, this.f446134g);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        java.util.List list = this.f446131d;
        int size = ((java.util.ArrayList) list).size();
        for (int i28 = 0; i28 < size; i28++) {
            ((android.view.View) ((java.util.ArrayList) list).get(i28)).layout(i17, i18, i19, i27);
        }
    }
}
