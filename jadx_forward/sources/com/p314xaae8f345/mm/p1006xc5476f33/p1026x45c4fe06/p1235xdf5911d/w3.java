package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d;

/* loaded from: classes5.dex */
public final class w3 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View.OnClickListener f173863d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f173864e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f173865f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f173866g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.WindowManager.LayoutParams f173867h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.WindowManager f173868i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f173869m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f173870n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(android.content.Context context, android.view.View.OnClickListener onClickListener, android.view.View.OnLongClickListener onLongClickListener) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f173863d = onClickListener;
        this.f173864e = onLongClickListener;
        this.f173865f = "LAST_WINDOW_X";
        this.f173866g = "LAST_WINDOW_Y";
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.gravity = 51;
        layoutParams.x = 0;
        layoutParams.y = 0;
        layoutParams.type = android.os.Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
        layoutParams.flags = 8;
        layoutParams.format = 1;
        layoutParams.width = -2;
        layoutParams.height = -2;
        this.f173867h = layoutParams;
        java.lang.Object systemService = context.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f173868i = (android.view.WindowManager) systemService;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eqx, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f173870n = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.h5n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        addView(inflate);
        setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.t3(this));
        setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.u3(this));
        setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v3(this));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("WxAssistantWindow");
        layoutParams.x = M.getInt("LAST_WINDOW_X", 0);
        layoutParams.y = M.getInt("LAST_WINDOW_Y", 0);
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.w3 w3Var) {
        int[] iArr = new int[2];
        w3Var.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        int m53784xd6cf2784 = w3Var.m53784xd6cf2784() / 2;
        android.view.WindowManager.LayoutParams layoutParams = w3Var.f173867h;
        if (i17 > m53784xd6cf2784) {
            layoutParams.x = w3Var.m53784xd6cf2784() - w3Var.getWidth();
        } else {
            layoutParams.x = 0;
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(iArr[0], layoutParams.x);
        ofInt.setDuration(200L);
        ofInt.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofInt.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.r3(w3Var));
        ofInt.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.s3(w3Var));
        ofInt.start();
    }

    /* renamed from: getScreenWidth */
    private final int m53784xd6cf2784() {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        this.f173868i.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }
}
