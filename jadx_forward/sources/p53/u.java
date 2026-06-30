package p53;

/* loaded from: classes8.dex */
public class u extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f433608d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f433609e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f433610f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p794xb0fa9b5e.r f433611g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65 f433612h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb f433613i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f433614m;

    /* renamed from: n, reason: collision with root package name */
    public float f433615n;

    public u(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65 c16008xdb77bd65, java.lang.String str) {
        super(context);
        java.lang.String str2;
        this.f433615n = 1.0f;
        this.f433610f = context;
        this.f433612h = c16008xdb77bd65;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb c16009xd65d32cb = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb(context);
        this.f433613i = c16009xd65d32cb;
        c16009xd65d32cb.b(c16008xdb77bd65, str);
        m53.i3 i3Var = c16008xdb77bd65.f222688h;
        if (i3Var != null) {
            int i17 = i3Var.f405320d;
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            this.f433615n = java.lang.Math.max(displayMetrics.widthPixels / (i17 * displayMetrics.density), this.f433615n);
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            this.f433609e = imageView;
            imageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            boolean z17 = true;
            android.view.ViewGroup.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, (int) (android.util.TypedValue.applyDimension(1, c16008xdb77bd65.f222688h.f405321e, getResources().getDisplayMetrics()) * this.f433615n));
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = new com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b(context);
            this.f433608d = c22789xd23e9a9b;
            c22789xd23e9a9b.o(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20313x85eb58f4()) == 1);
            this.f433608d.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            this.f433608d.setClipToOutline(true);
            float f17 = getResources().getDisplayMetrics().density * 34.0f * this.f433615n;
            this.f433608d.setTranslationY(f17);
            this.f433609e.setTranslationY(f17);
            this.f433608d.setVisibility(8);
            this.f433609e.setVisibility(8);
            p53.n nVar = new p53.n(this);
            this.f433608d.setOnClickListener(nVar);
            this.f433609e.setOnClickListener(nVar);
            addView(this.f433608d, layoutParams);
            addView(this.f433609e, layoutParams);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16008xdb77bd65.f222688h.f405323g)) {
                java.lang.String str3 = c16008xdb77bd65.f222688h.f405323g;
                if (str3 != null && str3.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    str2 = null;
                } else {
                    java.lang.String D = lp0.b.D();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(D);
                    D = r26.i0.n(D, "/", false) ? D : D.concat("/");
                    char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
                    str2 = D + "gametab/res/pag/" + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str3.getBytes()) + ".pag";
                }
                if (o35.a.b(str2)) {
                    ((ku5.t0) ku5.t0.f394148d).B(new p53.o(this, new jz5.l(java.lang.Boolean.TRUE, str2), 0));
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("url", str3);
                bundle.putString("savePath", str2);
                p53.p pVar = new p53.p(this, str2, 0);
                this.f433611g = pVar;
                com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, p53.t.class, pVar);
                this.f433614m = c16008xdb77bd65.f222688h.f405323g;
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16008xdb77bd65.f222688h.f405322f)) {
                a(c16008xdb77bd65.f222688h.f405322f);
                this.f433614m = c16008xdb77bd65.f222688h.f405322f;
            }
        }
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        addView(this.f433613i, layoutParams2);
    }

    public final void a(java.lang.String str) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && this.f433609e.getTag() == null) {
            this.f433609e.setTag(str);
            this.f433609e.setVisibility(0);
            this.f433609e.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            this.f433613i.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
            n11.a.b().h(str, this.f433609e, new o11.f().a());
        }
    }

    public void b() {
        int c17 = com.p314xaae8f345.mm.ui.bl.c(this.f433610f);
        float f17 = c17;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, (int) ((android.util.TypedValue.applyDimension(1, this.f433612h.f222688h.f405321e, getResources().getDisplayMetrics()) * this.f433615n) + java.lang.Math.max(f17 - ((getResources().getDisplayMetrics().density * 34.0f) * this.f433615n), 0.0f)));
        float max = java.lang.Math.max(((getResources().getDisplayMetrics().density * 34.0f) * this.f433615n) - f17, 0.0f);
        this.f433608d.setTranslationY(max);
        this.f433609e.setTranslationY(max);
        this.f433608d.setLayoutParams(layoutParams);
        this.f433609e.setLayoutParams(layoutParams);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f433613i.getLayoutParams();
        marginLayoutParams.bottomMargin = c17;
        this.f433613i.setLayoutParams(marginLayoutParams);
        invalidate();
    }

    /* renamed from: getGameTabWidget */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb m157861x421622b1() {
        return this.f433613i;
    }

    /* renamed from: getScale */
    public float m157862x7520af94() {
        return this.f433615n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.c(this.f433611g);
    }
}
