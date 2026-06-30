package mj;

/* loaded from: classes12.dex */
public class i implements jj.e {

    /* renamed from: o, reason: collision with root package name */
    public static mj.i f408501o;

    /* renamed from: a, reason: collision with root package name */
    public android.view.WindowManager f408504a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.WindowManager.LayoutParams f408505b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f408506c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p588x373aa5.C4717x6bd28ad6 f408507d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View.OnClickListener f408508e;

    /* renamed from: f, reason: collision with root package name */
    public final android.util.DisplayMetrics f408509f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f408510g;

    /* renamed from: h, reason: collision with root package name */
    public final int f408511h;

    /* renamed from: i, reason: collision with root package name */
    public final int f408512i;

    /* renamed from: j, reason: collision with root package name */
    public final int f408513j;

    /* renamed from: k, reason: collision with root package name */
    public final int f408514k;

    /* renamed from: l, reason: collision with root package name */
    public final int f408515l;

    /* renamed from: m, reason: collision with root package name */
    public int f408516m;

    /* renamed from: n, reason: collision with root package name */
    public static final android.os.Handler f408500n = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.Object f408502p = new java.lang.Object();

    /* renamed from: q, reason: collision with root package name */
    public static final int f408503q = android.os.Build.VERSION.SDK_INT;

    public i(android.content.Context context, com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p588x373aa5.C4717x6bd28ad6 c4717x6bd28ad6) {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        this.f408509f = displayMetrics;
        this.f408510g = true;
        mj.a aVar = new mj.a(this);
        this.f408507d = c4717x6bd28ad6;
        int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560828vb);
        this.f408511h = color;
        this.f408512i = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560832vf);
        this.f408513j = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560831ve);
        this.f408514k = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560830vd);
        this.f408515l = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560829vc);
        this.f408516m = color;
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4678x1d1a4af6.f19964x4fbc8495.mo40966xc74540ab(aVar);
        c4717x6bd28ad6.addOnAttachStateChangeListener(new mj.b(this));
        this.f408504a = (android.view.WindowManager) context.getApplicationContext().getSystemService("window");
        try {
            android.util.DisplayMetrics displayMetrics2 = new android.util.DisplayMetrics();
            if (this.f408504a.getDefaultDisplay() != null) {
                this.f408504a.getDefaultDisplay().getMetrics(displayMetrics);
                this.f408504a.getDefaultDisplay().getMetrics(displayMetrics2);
            }
            android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
            this.f408505b = layoutParams;
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                layoutParams.type = 2038;
            } else {
                layoutParams.type = 2002;
            }
            layoutParams.flags = 40;
            layoutParams.gravity = 8388659;
            layoutParams.x = displayMetrics2.widthPixels - (c4717x6bd28ad6.getLayoutParams().width * 2);
            android.view.WindowManager.LayoutParams layoutParams2 = this.f408505b;
            layoutParams2.y = 0;
            layoutParams2.width = -2;
            layoutParams2.height = -2;
            layoutParams2.format = -2;
        } catch (java.lang.Exception unused) {
        }
        c4717x6bd28ad6.setOnTouchListener(new mj.d(this, c4717x6bd28ad6));
    }

    public static void e(mj.i iVar, boolean z17) {
        android.os.Handler handler;
        iVar.getClass();
        oj.j.c("Matrix.FrameDecorator", "[onForeground] isForeground:%s", java.lang.Boolean.valueOf(z17));
        if (iVar.f408510g && (handler = f408500n) != null) {
            handler.post(new mj.h(iVar, z17));
        }
    }

    @Override // jj.e
    public void a(java.lang.String str, long[] jArr, int[] iArr, int[] iArr2, float f17, float f18, float f19) {
        java.lang.String format = java.lang.String.format("unknown delay: %.1fms", java.lang.Double.valueOf(jArr[0] / 1000000.0d));
        java.lang.String format2 = java.lang.String.format("input handling: %.1fms", java.lang.Double.valueOf(jArr[1] / 1000000.0d));
        java.lang.String format3 = java.lang.String.format("animation: %.1fms", java.lang.Double.valueOf(jArr[2] / 1000000.0d));
        java.lang.String format4 = java.lang.String.format("layout measure: %.1fms", java.lang.Double.valueOf(jArr[3] / 1000000.0d));
        java.lang.String format5 = java.lang.String.format("draw: %.1fms", java.lang.Double.valueOf(jArr[4] / 1000000.0d));
        java.lang.String format6 = java.lang.String.format("sync: %.1fms", java.lang.Double.valueOf(jArr[5] / 1000000.0d));
        java.lang.String format7 = java.lang.String.format("command issue: %.1fms", java.lang.Double.valueOf(jArr[6] / 1000000.0d));
        java.lang.String format8 = java.lang.String.format("swap buffers: %.1fms", java.lang.Double.valueOf(jArr[7] / 1000000.0d));
        java.lang.String format9 = java.lang.String.format("gpu: %.1fms", java.lang.Double.valueOf(jArr[9] / 1000000.0d));
        java.lang.String format10 = java.lang.String.format("total: %.1fms", java.lang.Double.valueOf(jArr[8] / 1000000.0d));
        if (f19 <= f18 - 42.0f) {
            this.f408516m = this.f408515l;
        } else if (f19 <= f18 - 24.0f) {
            this.f408516m = this.f408514k;
        } else if (f19 <= f18 - 9.0f) {
            this.f408516m = this.f408513j;
        } else if (f19 <= f18 - 3.0f) {
            this.f408516m = this.f408512i;
        } else {
            this.f408516m = this.f408511h;
        }
        f408500n.post(new com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p588x373aa5.b(this, f19, format, format2, format3, format4, format5, format6, format7, format8, format9, format10, java.util.Arrays.copyOf(iArr2, iArr2.length), java.util.Arrays.copyOf(iArr, iArr.length)));
    }

    @Override // jj.e
    public boolean b() {
        return false;
    }

    @Override // jj.e
    public int c() {
        return 200;
    }

    @Override // jj.e
    public int d() {
        return 0;
    }

    @Override // jj.e
    /* renamed from: getName */
    public java.lang.String mo141031xfb82e301() {
        return null;
    }
}
