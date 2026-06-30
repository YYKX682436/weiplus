package aa;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.material.card.MaterialCardView f2475a;

    /* renamed from: b, reason: collision with root package name */
    public int f2476b;

    /* renamed from: c, reason: collision with root package name */
    public int f2477c;

    public a(com.google.android.material.card.MaterialCardView materialCardView) {
        this.f2475a = materialCardView;
    }

    public final void a() {
        com.google.android.material.card.MaterialCardView materialCardView = this.f2475a;
        materialCardView.f10386f.set(materialCardView.getContentPaddingLeft() + this.f2477c, materialCardView.getContentPaddingTop() + this.f2477c, materialCardView.getContentPaddingRight() + this.f2477c, materialCardView.getContentPaddingBottom() + this.f2477c);
        ((w.b) androidx.cardview.widget.CardView.f10383m).c(materialCardView.f10388h);
    }

    public void b() {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        com.google.android.material.card.MaterialCardView materialCardView = this.f2475a;
        gradientDrawable.setCornerRadius(materialCardView.getRadius());
        int i17 = this.f2476b;
        if (i17 != -1) {
            gradientDrawable.setStroke(this.f2477c, i17);
        }
        materialCardView.setForeground(gradientDrawable);
    }
}
