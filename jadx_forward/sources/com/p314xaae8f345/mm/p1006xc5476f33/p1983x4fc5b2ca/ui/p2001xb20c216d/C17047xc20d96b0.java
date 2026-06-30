package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d;

/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorRecordButton */
/* loaded from: classes15.dex */
public class C17047xc20d96b0 extends android.widget.FrameLayout {
    public static final int B = android.view.ViewConfiguration.getTapTimeout();
    public static final float C = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.by) / com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
    public final java.lang.Runnable A;

    /* renamed from: d, reason: collision with root package name */
    public long f237569d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f237570e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f237571f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f237572g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237573h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f237574i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f237575m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f237576n;

    /* renamed from: o, reason: collision with root package name */
    public android.animation.ValueAnimator f237577o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f237578p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f237579q;

    /* renamed from: r, reason: collision with root package name */
    public int f237580r;

    /* renamed from: s, reason: collision with root package name */
    public int f237581s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.drawable.Drawable f237582t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.drawable.Drawable f237583u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.drawable.Drawable f237584v;

    /* renamed from: w, reason: collision with root package name */
    public float f237585w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f237586x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f237587y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.Runnable f237588z;

    public C17047xc20d96b0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f237569d = -1L;
        this.f237573h = false;
        this.f237574i = false;
        this.f237575m = false;
        this.f237579q = false;
        this.f237585w = -1.0f;
        this.f237586x = true;
        this.f237587y = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f237588z = new wu3.o1(this);
        this.A = new wu3.p1(this);
        b();
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecordButton", "init, longPressTimeout: %s, tapTimeout: %s", 500, java.lang.Integer.valueOf(B));
        this.f237582t = getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.ap7);
        this.f237583u = getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.ap8);
        this.f237584v = com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79805xc851170e, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7));
        this.f237580r = android.graphics.Color.parseColor("#FFDDDDDD");
        this.f237581s = android.graphics.Color.parseColor("#4CFA9D3B");
        com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c1r, (android.view.ViewGroup) this, true);
        this.f237572g = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.hd6);
        this.f237570e = findViewById(com.p314xaae8f345.mm.R.id.f566876hd2);
        this.f237571f = findViewById(com.p314xaae8f345.mm.R.id.kn_);
        this.f237572g.setImageDrawable(this.f237584v);
        this.f237570e.setBackground(this.f237582t);
        this.f237571f.setBackground(this.f237583u);
        this.f237586x = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (r0 != 3) goto L38;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17047xc20d96b0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: setErrorPressCallback */
    public void m68248x27310482(wu3.r1 r1Var) {
    }

    /* renamed from: setHighLightOuter */
    public void m68249x4b4a8549(int i17) {
        this.f237581s = i17;
        android.graphics.drawable.Drawable drawable = this.f237583u;
        if (drawable instanceof android.graphics.drawable.GradientDrawable) {
            ((android.graphics.drawable.GradientDrawable) drawable).setColor(i17);
        }
    }

    /* renamed from: setInnerColor */
    public void m68250x4bef7caf(int i17) {
        android.graphics.drawable.Drawable drawable = this.f237582t;
        if (drawable instanceof android.graphics.drawable.GradientDrawable) {
            ((android.graphics.drawable.GradientDrawable) drawable).setColor(i17);
        }
    }

    /* renamed from: setLongPressCallback */
    public void m68251x86d19c4a(wu3.s1 s1Var) {
    }

    /* renamed from: setLongPressScrollCallback */
    public void m68252x7f8af277(wu3.t1 t1Var) {
    }

    /* renamed from: setSimpleTapCallback */
    public void m68253xee2457b4(wu3.u1 u1Var) {
    }

    /* renamed from: setTouchEnable */
    public void m68254xbc91ffe0(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecordButton", "setTouchEnable: %s", java.lang.Boolean.valueOf(z17));
        this.f237586x = z17;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecordButton", "setVisibility, isAnimating: %s", java.lang.Boolean.valueOf(this.f237575m));
        if (this.f237575m) {
            postDelayed(new wu3.n1(this, i17), 150L);
        } else {
            super.setVisibility(i17);
        }
    }

    public C17047xc20d96b0(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f237569d = -1L;
        this.f237573h = false;
        this.f237574i = false;
        this.f237575m = false;
        this.f237579q = false;
        this.f237585w = -1.0f;
        this.f237586x = true;
        this.f237587y = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f237588z = new wu3.o1(this);
        this.A = new wu3.p1(this);
        b();
    }
}
