package ww1;

/* loaded from: classes15.dex */
public class x2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f531875a;

    /* renamed from: b, reason: collision with root package name */
    public final int f531876b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f531877c;

    /* renamed from: d, reason: collision with root package name */
    public ww1.a3 f531878d;

    /* renamed from: e, reason: collision with root package name */
    public final ww1.b3 f531879e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f531880f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 f531881g;

    /* renamed from: h, reason: collision with root package name */
    public final int f531882h;

    /* renamed from: i, reason: collision with root package name */
    public final int f531883i;

    /* renamed from: j, reason: collision with root package name */
    public final int f531884j;

    /* renamed from: k, reason: collision with root package name */
    public final int f531885k;

    /* renamed from: l, reason: collision with root package name */
    public final int f531886l;

    public x2(int i17, android.content.Context context, ww1.a3 a3Var, ww1.b3 b3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3) {
        this.f531876b = i17;
        this.f531877c = context;
        this.f531878d = a3Var;
        this.f531879e = b3Var;
        this.f531881g = activityC13149x63b02cb3;
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        this.f531882h = ((displayMetrics.widthPixels / 2) - i65.a.b(context, 8)) - i65.a.b(context, 16);
        this.f531884j = i65.a.b(context, 52);
        this.f531885k = i65.a.b(context, 35);
        this.f531886l = i65.a.b(context, 60);
        this.f531883i = i65.a.b(context, 64);
    }

    public void a(int i17) {
        int i18 = this.f531876b;
        int i19 = i17 == 0 ? i18 : i17;
        boolean z17 = this.f531875a;
        java.util.LinkedList linkedList = this.f531880f;
        if (z17) {
            linkedList.size();
            return;
        }
        if (linkedList.isEmpty()) {
            return;
        }
        ww1.b0 b0Var = (ww1.b0) linkedList.poll();
        if (i19 == 0) {
            i19 = i18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ToastAnimationHelper", "[doAnimation]，needRefreshType：%s", java.lang.Integer.valueOf(i19));
        this.f531875a = true;
        ww1.b3 b3Var = this.f531879e;
        android.widget.TextView textView = b3Var.f531667g0;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str = b0Var.f531735n;
        float textSize = b3Var.f531667g0.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this.f531877c, str, textSize));
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) b3Var.f531655a0.getLayoutParams();
        if (b3Var.f531656b.getVisibility() == 0) {
            b3Var.f531657b0.setVisibility(0);
            layoutParams.height = b3Var.f531672k.getHeight() + b3Var.f531656b.getHeight();
        } else {
            b3Var.f531657b0.setVisibility(8);
            layoutParams.height = b3Var.f531672k.getHeight();
        }
        layoutParams.width = b3Var.f531672k.getWidth();
        b3Var.f531655a0.setLayoutParams(layoutParams);
        if (i18 == 2) {
            b3Var.f531665f0.m75394x3288e7c1(true);
            b3Var.f531665f0.m75395x7083e041(0.1f);
            b3Var.f531665f0.b(b0Var.f531739r, 0, 0, com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(b3Var.f531665f0, b0Var.f531728d, null);
        }
        b3Var.f531669h0.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(b0Var.f531730f, b0Var.f531731g));
        b3Var.f531655a0.setVisibility(0);
        b3Var.f531661d0.setRotation(270.0f);
        android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(false);
        animationSet.addAnimation(new android.view.animation.ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f));
        int i27 = 0;
        for (int i28 = 0; i28 < ((java.util.LinkedList) this.f531878d.f531646w).size(); i28++) {
            if (((ww1.b0) ((java.util.LinkedList) this.f531878d.f531646w).get(i28)).f531729e.equals(b0Var.f531729e)) {
                i27 = i28;
            }
        }
        animationSet.addAnimation(new android.view.animation.TranslateAnimation(0.0f, this.f531882h, 0.0f, (b3Var.f531656b.getVisibility() == 0 ? (b3Var.f531672k.getHeight() + this.f531883i) / 2 : b3Var.f531672k.getHeight() / 2) + 0 + this.f531886l + (i27 * this.f531884j) + this.f531885k));
        animationSet.setDuration(300L);
        animationSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
        animationSet.setAnimationListener(new ww1.v2(this, b0Var, i19));
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300L);
        scaleAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
        scaleAnimation.setAnimationListener(new ww1.w2(this, animationSet));
        b3Var.f531655a0.startAnimation(scaleAnimation);
    }
}
