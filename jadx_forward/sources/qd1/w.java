package qd1;

/* loaded from: classes7.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f443213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f443214e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f443215f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f443216g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f443217h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443218i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f443219m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f443220n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443221o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443222p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ qd1.x f443223q;

    public w(qd1.x xVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, int i17, int i18, java.lang.String str, int i19, boolean z18, java.lang.String str2, java.lang.String str3) {
        this.f443223q = xVar;
        this.f443213d = e9Var;
        this.f443214e = z17;
        this.f443215f = v5Var;
        this.f443216g = i17;
        this.f443217h = i18;
        this.f443218i = str;
        this.f443219m = i19;
        this.f443220n = z18;
        this.f443221o = str2;
        this.f443222p = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.drawable.Drawable drawable;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f443213d;
        if (!e9Var.mo50262x39e05d35()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiShowToast", "service is not running");
            return;
        }
        boolean z17 = this.f443214e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f443215f;
        android.view.View inflate = z17 ? android.view.LayoutInflater.from(v5Var.mo50352x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569624h1, (android.view.ViewGroup) v5Var.mo51310xc2a54588(), false) : android.view.LayoutInflater.from(v5Var.mo50352x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569625h2, (android.view.ViewGroup) v5Var.mo51310xc2a54588(), false);
        if (this.f443220n) {
            new qd1.s(this, inflate);
        }
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.obc);
        java.lang.String str = this.f443218i;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            textView.setVisibility(8);
        } else {
            textView.setLineSpacing(0.0f, 1.0f);
            textView.setSpannableFactory(new qd1.v(this, i65.a.h(textView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561466jd)));
            textView.setText(str, android.widget.TextView.BufferType.SPANNABLE);
            textView.setVisibility(0);
            textView.getViewTreeObserver().addOnGlobalLayoutListener(new qd1.t(this, textView));
            if (!z17) {
                inflate.findViewById(com.p314xaae8f345.mm.R.id.mvs).setPadding(0, i65.a.b(textView.getContext(), 27), 0, 0);
            }
        }
        if (!z17) {
            android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.hlr);
            android.widget.ProgressBar progressBar = (android.widget.ProgressBar) inflate.findViewById(com.p314xaae8f345.mm.R.id.lbi);
            java.lang.String str2 = this.f443221o;
            if (str2.equals("loading")) {
                imageView.setVisibility(8);
                progressBar.setVisibility(0);
            } else {
                imageView.setVisibility(0);
                progressBar.setVisibility(8);
                java.lang.String str3 = this.f443222p;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    drawable = str2.equals("error") ? e9Var.mo50352x76847179().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.bdc) : e9Var.mo50352x76847179().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.bds);
                    drawable.mutate().setColorFilter(new android.graphics.PorterDuffColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP));
                } else {
                    android.graphics.Bitmap b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.s5.b(e9Var.t3(), str3);
                    drawable = (b17 == null || b17.isRecycled()) ? null : new android.graphics.drawable.BitmapDrawable(imageView.getResources(), b17);
                }
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                }
            }
        }
        int i17 = this.f443216g;
        if (i17 != -1) {
            inflate.setTag(java.lang.Integer.valueOf(i17));
        }
        v5Var.P1().b(false);
        v5Var.P1().e(inflate, this.f443217h);
        inflate.post(new qd1.q(this, inflate));
        e9Var.a(this.f443219m, this.f443223q.o("ok"));
    }
}
