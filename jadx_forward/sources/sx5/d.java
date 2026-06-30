package sx5;

/* loaded from: classes13.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public sx5.c f495247a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.ImageView f495248b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.ImageView f495249c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f495250d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f495251e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f495252f;

    /* renamed from: g, reason: collision with root package name */
    public float f495253g;

    /* renamed from: h, reason: collision with root package name */
    public float f495254h;

    /* renamed from: i, reason: collision with root package name */
    public float f495255i;

    public d(android.view.View view) {
        this.f495248b = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61340x2ba7a189);
        this.f495250d = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61341x54ba8235);
        this.f495249c = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61339x7416adce);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61342x5348fa1c);
        this.f495251e = imageView;
        imageView.setOnTouchListener(new sx5.b(this));
    }

    public void a(float f17, boolean z17) {
        android.widget.ImageView imageView;
        if ((!this.f495252f || z17) && (imageView = this.f495251e) != null) {
            android.widget.ImageView imageView2 = this.f495249c;
            if (imageView2.getWidth() == 0) {
                return;
            }
            if (f17 < 0.0f) {
                f17 = 0.0f;
            } else if (f17 > 100.0f) {
                f17 = 100.0f;
            }
            this.f495255i = f17;
            android.widget.ImageView imageView3 = this.f495248b;
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) imageView3.getLayoutParams();
            float f18 = f17 / 100.0f;
            layoutParams.width = (int) (imageView2.getWidth() * f18);
            imageView3.setLayoutParams(layoutParams);
            imageView3.requestLayout();
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams2.leftMargin = f17 <= 0.0f ? 0 : f17 >= 100.0f ? imageView2.getWidth() - (((imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight()) / 2) : (int) (f18 * (r0 - (((imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight()) / 2)));
            imageView.setLayoutParams(layoutParams2);
            imageView.requestLayout();
        }
    }
}
