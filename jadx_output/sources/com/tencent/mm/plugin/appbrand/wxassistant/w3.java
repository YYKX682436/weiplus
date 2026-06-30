package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes5.dex */
public final class w3 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View.OnClickListener f92330d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f92331e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f92332f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f92333g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.WindowManager.LayoutParams f92334h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.WindowManager f92335i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f92336m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f92337n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(android.content.Context context, android.view.View.OnClickListener onClickListener, android.view.View.OnLongClickListener onLongClickListener) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f92330d = onClickListener;
        this.f92331e = onLongClickListener;
        this.f92332f = "LAST_WINDOW_X";
        this.f92333g = "LAST_WINDOW_Y";
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.gravity = 51;
        layoutParams.x = 0;
        layoutParams.y = 0;
        layoutParams.type = android.os.Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
        layoutParams.flags = 8;
        layoutParams.format = 1;
        layoutParams.width = -2;
        layoutParams.height = -2;
        this.f92334h = layoutParams;
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f92335i = (android.view.WindowManager) systemService;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.eqx, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f92337n = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.h5n);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        addView(inflate);
        setOnTouchListener(new com.tencent.mm.plugin.appbrand.wxassistant.t3(this));
        setOnClickListener(new com.tencent.mm.plugin.appbrand.wxassistant.u3(this));
        setOnLongClickListener(new com.tencent.mm.plugin.appbrand.wxassistant.v3(this));
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("WxAssistantWindow");
        layoutParams.x = M.getInt("LAST_WINDOW_X", 0);
        layoutParams.y = M.getInt("LAST_WINDOW_Y", 0);
    }

    public static final void a(com.tencent.mm.plugin.appbrand.wxassistant.w3 w3Var) {
        int[] iArr = new int[2];
        w3Var.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        int screenWidth = w3Var.getScreenWidth() / 2;
        android.view.WindowManager.LayoutParams layoutParams = w3Var.f92334h;
        if (i17 > screenWidth) {
            layoutParams.x = w3Var.getScreenWidth() - w3Var.getWidth();
        } else {
            layoutParams.x = 0;
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(iArr[0], layoutParams.x);
        ofInt.setDuration(200L);
        ofInt.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofInt.addUpdateListener(new com.tencent.mm.plugin.appbrand.wxassistant.r3(w3Var));
        ofInt.addListener(new com.tencent.mm.plugin.appbrand.wxassistant.s3(w3Var));
        ofInt.start();
    }

    private final int getScreenWidth() {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        this.f92335i.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }
}
