package fh0;

/* loaded from: classes5.dex */
public final class a extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.WindowManager f344041d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.WindowManager.LayoutParams f344042e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f344043f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f344044g;

    /* renamed from: h, reason: collision with root package name */
    public long f344045h;

    /* renamed from: i, reason: collision with root package name */
    public float f344046i;

    /* renamed from: m, reason: collision with root package name */
    public float f344047m;

    /* renamed from: n, reason: collision with root package name */
    public float f344048n;

    /* renamed from: o, reason: collision with root package name */
    public float f344049o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f344050p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.Object systemService = context.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f344041d = (android.view.WindowManager) systemService;
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.gravity = 51;
        layoutParams.x = 0;
        layoutParams.y = 200;
        layoutParams.type = android.os.Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
        layoutParams.flags = 8;
        layoutParams.format = 1;
        layoutParams.width = -2;
        layoutParams.height = -2;
        this.f344042e = layoutParams;
        float f17 = context.getResources().getDisplayMetrics().density;
        int i17 = (int) (8.0f * f17);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(-872415232);
        gradientDrawable.setCornerRadius(f17 * 6.0f);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(i17, i17, i17, i17);
        linearLayout.setBackground(gradientDrawable);
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setText("Stream Monitor");
        textView.setTextColor(-1);
        textView.setTextSize(2, 10.0f);
        textView.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.MONOSPACE, 1));
        linearLayout.addView(textView);
        android.widget.TextView textView2 = new android.widget.TextView(context);
        textView2.setTextColor(-1);
        textView2.setTextSize(2, 9.0f);
        textView2.setTypeface(android.graphics.Typeface.MONOSPACE);
        textView2.setText("waiting...");
        this.f344043f = textView2;
        linearLayout.addView(textView2);
        android.widget.ScrollView scrollView = new android.widget.ScrollView(context);
        scrollView.addView(linearLayout, new android.widget.FrameLayout.LayoutParams((int) (m129553xd6cf2784() * 0.6f), -2));
        addView(scrollView, new android.widget.FrameLayout.LayoutParams(-2, -2));
    }

    /* renamed from: getScreenWidth */
    private final int m129553xd6cf2784() {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        this.f344041d.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        int action = event.getAction();
        if (action == 0) {
            this.f344050p = false;
            this.f344046i = event.getRawX();
            this.f344047m = event.getRawY();
            this.f344048n = event.getRawX();
            this.f344049o = event.getRawY();
        } else if (action != 1) {
            if (action == 2) {
                float rawX = event.getRawX() - this.f344046i;
                float rawY = event.getRawY() - this.f344047m;
                if ((rawX * rawX) + (rawY * rawY) > 100.0f) {
                    this.f344050p = true;
                }
                android.view.WindowManager.LayoutParams layoutParams = this.f344042e;
                layoutParams.x += (int) (event.getRawX() - this.f344048n);
                layoutParams.y += (int) (event.getRawY() - this.f344049o);
                this.f344048n = event.getRawX();
                this.f344049o = event.getRawY();
                this.f344041d.updateViewLayout(this, layoutParams);
            }
        } else if (!this.f344050p) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - this.f344045h < 300) {
                yz5.a aVar = this.f344044g;
                if (aVar != null) {
                    aVar.mo152xb9724478();
                }
                this.f344045h = 0L;
            } else {
                this.f344045h = currentTimeMillis;
            }
        }
        return true;
    }

    /* renamed from: getOnDoubleTap */
    public final yz5.a m129554xa7f371bd() {
        return this.f344044g;
    }

    /* renamed from: setOnDoubleTap */
    public final void m129555x3e58e531(yz5.a aVar) {
        this.f344044g = aVar;
    }
}
