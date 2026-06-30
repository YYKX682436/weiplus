package or1;

/* loaded from: classes9.dex */
public class e1 {

    /* renamed from: a, reason: collision with root package name */
    public android.widget.ImageView f429015a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f429016b;

    public e1(or1.f1 f1Var) {
    }

    public void a() {
        android.widget.ImageView imageView = this.f429015a;
        if (imageView != null) {
            imageView.setImageDrawable(null);
            this.f429015a.setVisibility(8);
        }
        android.widget.TextView textView = this.f429016b;
        if (textView != null) {
            textView.setText("");
            this.f429016b.setVisibility(8);
        }
    }
}
