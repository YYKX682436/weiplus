package gx4;

/* loaded from: classes8.dex */
public final class b extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f358930d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f358931e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Vibrator f358932f;

    public b(android.content.Context context) {
        super(context);
        this.f358932f = (android.os.Vibrator) context.getSystemService("vibrator");
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d9s, this);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.agc);
        this.f358930d = imageView;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) imageView.getLayoutParams();
        int i17 = gx4.e.f358948f;
        layoutParams.height = i17;
        layoutParams.width = i17;
        this.f358930d.setLayoutParams(layoutParams);
        this.f358931e = findViewById(com.p314xaae8f345.mm.R.id.cgi);
    }

    public final void a(float f17, float f18) {
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(f17, f18, f17, f18, 1, 1.0f, 1, 1.0f);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setDuration(50L);
        this.f358930d.startAnimation(scaleAnimation);
    }
}
