package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.p1634x90ae7bab;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0010B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/finder/shopping/view/subsidy/FinderLiveShoppingSubsidyOverlayView;", "Lcom/tencent/mm/ui/widget/RoundCornerFrameLayout;", "Lcom/tencent/mm/sdk/platformtools/b4;", "y", "Ljz5/g;", "getSubWordTickerHandler", "()Lcom/tencent/mm/sdk/platformtools/b4;", "subWordTickerHandler", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "yt2/i", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.shopping.view.subsidy.FinderLiveShoppingSubsidyOverlayView */
/* loaded from: classes3.dex */
public final class C14986x9295a1e4 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 {
    public static final /* synthetic */ int F = 0;
    public yz5.a A;
    public yz5.a B;
    public yz5.a C;
    public boolean D;
    public yz5.a E;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f207881f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f207882g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f207883h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f207884i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f207885m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f207886n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.ImageView f207887o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.LinearLayout f207888p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f207889q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f207890r;

    /* renamed from: s, reason: collision with root package name */
    public android.animation.AnimatorSet f207891s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Runnable f207892t;

    /* renamed from: u, reason: collision with root package name */
    public android.animation.AnimatorSet f207893u;

    /* renamed from: v, reason: collision with root package name */
    public long f207894v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f207895w;

    /* renamed from: x, reason: collision with root package name */
    public final yt2.q f207896x;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final jz5.g subWordTickerHandler;

    /* renamed from: z, reason: collision with root package name */
    public yt2.i f207898z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14986x9295a1e4(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: getSubWordTickerHandler */
    private final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 m59116xd850140c() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((jz5.n) this.subWordTickerHandler).mo141623x754a37bb();
    }

    public final void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SubsidyOverlay", "cancelAll");
        android.animation.AnimatorSet animatorSet = this.f207891s;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f207891s = null;
        android.animation.AnimatorSet animatorSet2 = this.f207893u;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.f207893u = null;
        java.lang.Runnable runnable = this.f207892t;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.f207892t = null;
        m59116xd850140c().d();
        this.A = null;
        this.B = null;
        this.C = null;
        this.E = null;
        this.D = false;
        setClickable(false);
        setVisibility(8);
    }

    public final void e(r45.z64 data, java.lang.String str, float f17, float f18, float f19, yz5.a aVar, yz5.a aVar2, yz5.a aVar3, yz5.a aVar4) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("play subsidy anim, wording=");
        boolean z17 = true;
        sb6.append(data.m75945x2fec8307(1));
        sb6.append(", descTarget=(");
        sb6.append(f17);
        sb6.append(", centerY=");
        sb6.append(f18);
        sb6.append(", h=");
        sb6.append(f19);
        sb6.append(')');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SubsidyOverlay", sb6.toString());
        d();
        java.lang.Float dpSize = java.lang.Float.valueOf(17.0f);
        android.widget.TextView textView = this.f207889q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dpSize, "dpSize");
        textView.setTextSize(1, ((dpSize.floatValue() * 1.0f) * j65.f.g()) / 400);
        java.lang.String m75945x2fec8307 = data.m75945x2fec8307(1);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        textView.setText(m75945x2fec8307);
        m59116xd850140c().d();
        this.f207894v = data.m75942xfb822ef2(4);
        java.lang.String m75945x2fec83072 = data.m75945x2fec8307(2);
        java.lang.String str2 = m75945x2fec83072 != null ? m75945x2fec83072 : "";
        this.f207895w = str2;
        if (this.f207894v <= 0) {
            this.f207890r.setText(str2);
        } else {
            f();
            m59116xd850140c().c(1000L, 1000L);
        }
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        android.widget.ImageView imageView = this.f207883h;
        if (z17) {
            imageView.setImageDrawable(null);
        } else {
            mn2.g1 g1Var = mn2.g1.f411508a;
            g1Var.f().c(new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView, g1Var.h(mn2.f1.f411500u));
        }
        this.E = aVar;
        this.A = aVar2;
        this.B = aVar3;
        this.C = aVar4;
        this.f207898z = new yt2.i(f17, f18, f19);
        int width = getWidth() > 0 ? getWidth() : getResources().getDisplayMetrics().widthPixels;
        android.view.View view = this.f207881f;
        view.setTranslationX(width);
        view.setTranslationY(0.0f);
        android.view.View view2 = this.f207881f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/view/subsidy/FinderLiveShoppingSubsidyOverlayView", "resetToBeforeEnter", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/shopping/view/subsidy/FinderLiveShoppingSubsidyOverlayView", "resetToBeforeEnter", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setPivotX(0.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        android.view.View view3 = this.f207882g;
        view3.setTranslationX(0.0f);
        android.view.View view4 = this.f207882g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/view/subsidy/FinderLiveShoppingSubsidyOverlayView", "resetToBeforeEnter", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view4.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/shopping/view/subsidy/FinderLiveShoppingSubsidyOverlayView", "resetToBeforeEnter", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setScaleX(1.0f);
        view3.setScaleY(1.0f);
        android.view.View view5 = this.f207882g;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/finder/shopping/view/subsidy/FinderLiveShoppingSubsidyOverlayView", "resetToBeforeEnter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/finder/shopping/view/subsidy/FinderLiveShoppingSubsidyOverlayView", "resetToBeforeEnter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ImageView imageView2 = this.f207885m;
        imageView2.setScaleX(0.3f);
        imageView2.setScaleY(0.3f);
        imageView2.setAlpha(0.0f);
        android.widget.ImageView imageView3 = this.f207886n;
        imageView3.setScaleX(0.0f);
        imageView3.setScaleY(0.0f);
        imageView3.setAlpha(0.0f);
        android.widget.ImageView imageView4 = this.f207887o;
        imageView4.setScaleX(0.0f);
        imageView4.setScaleY(0.0f);
        imageView4.setAlpha(0.0f);
        this.f207888p.setAlpha(0.0f);
        setVisibility(0);
        setClickable(false);
        this.D = false;
        post(new yt2.m(this));
    }

    public final boolean f() {
        int max = (int) java.lang.Math.max(0L, this.f207894v - (c01.id.c() / 1000));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        no0.l lVar = no0.m.f420263a;
        sb6.append(max < 3600 ? no0.l.a(lVar, max, ":", false, false, false, 24, null) : no0.l.a(lVar, max, ":", false, false, false, 28, null));
        sb6.append(this.f207895w);
        this.f207890r.setText(sb6.toString());
        return max > 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    public /* synthetic */ C14986x9295a1e4(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14986x9295a1e4(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f207895w = "";
        this.f207896x = new yt2.q(this);
        this.subWordTickerHandler = jz5.h.b(new yt2.r(this));
        this.f207898z = new yt2.i(0.0f, 0.0f, 0.0f);
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ebu, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.vat);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f207881f = findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.vas);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.vaz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f207882g = findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.vay);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f207883h = (android.widget.ImageView) findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.vau);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f207884i = findViewById5;
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f207885m = (android.widget.ImageView) findViewById6;
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.vav);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f207886n = (android.widget.ImageView) findViewById7;
        android.view.View findViewById8 = findViewById(com.p314xaae8f345.mm.R.id.vaw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f207887o = (android.widget.ImageView) findViewById8;
        android.view.View findViewById9 = findViewById(com.p314xaae8f345.mm.R.id.f568701vb1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.f207888p = (android.widget.LinearLayout) findViewById9;
        android.view.View findViewById10 = findViewById(com.p314xaae8f345.mm.R.id.vax);
        android.widget.TextView textView = (android.widget.TextView) findViewById10;
        d92.f fVar = d92.f.f309003a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        fVar.h(textView, java.lang.Float.valueOf(17.0f));
        ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
        textView.setTypeface(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.F(context, 4));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "apply(...)");
        this.f207889q = (android.widget.TextView) findViewById10;
        android.view.View findViewById11 = findViewById(com.p314xaae8f345.mm.R.id.f568700vb0);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById11;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
        fVar.h(textView2, java.lang.Float.valueOf(14.0f));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "apply(...)");
        this.f207890r = (android.widget.TextView) findViewById11;
        m81432x205ac394(getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561204c8));
        setVisibility(8);
        float dimension = getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        android.graphics.drawable.PaintDrawable paintDrawable = new android.graphics.drawable.PaintDrawable();
        paintDrawable.setCornerRadius(dimension);
        paintDrawable.setShaderFactory(new yt2.j(new int[]{-25734, -38318, -42166, -33967}, new float[]{0.0f, 0.43f, 0.59f, 1.0f}));
        findViewById.setBackground(paintDrawable);
        setOnClickListener(new yt2.h(this));
    }
}
