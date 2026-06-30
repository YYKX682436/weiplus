package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046;

/* renamed from: com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView */
/* loaded from: classes10.dex */
public class C19694xdfd03243 extends android.widget.FrameLayout {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f272352r = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f272353d;

    /* renamed from: e, reason: collision with root package name */
    public int f272354e;

    /* renamed from: f, reason: collision with root package name */
    public int f272355f;

    /* renamed from: g, reason: collision with root package name */
    public int f272356g;

    /* renamed from: h, reason: collision with root package name */
    public int f272357h;

    /* renamed from: i, reason: collision with root package name */
    public int f272358i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19690x7f5eb045 f272359m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ProgressBar f272360n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f272361o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f272362p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f272363q;

    public C19694xdfd03243(android.content.Context context) {
        super(context);
        this.f272353d = -1;
        this.f272363q = true;
    }

    public void a() {
        this.f272354e = getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561924wm);
        this.f272355f = getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561922wk);
        this.f272357h = getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561926wo);
        this.f272358i = getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561925wn);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19690x7f5eb045 c19690x7f5eb045 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19690x7f5eb045(getContext(), null);
        this.f272359m = c19690x7f5eb045;
        c19690x7f5eb045.setId(com.p314xaae8f345.mm.R.id.t7g);
        android.widget.ProgressBar progressBar = new android.widget.ProgressBar(getContext());
        this.f272360n = progressBar;
        progressBar.setIndeterminateDrawable(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.avm));
        android.widget.TextView textView = new android.widget.TextView(getContext());
        this.f272361o = textView;
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bxr);
        this.f272361o.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560447kn));
        int b17 = i65.a.b(getContext(), 32);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(b17, b17);
        layoutParams.gravity = 17;
        addView(this.f272360n, layoutParams);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        addView(this.f272361o, layoutParams2);
    }

    public void b(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, long j17, boolean z17) {
        c(interfaceC4987x84e327cb, j17, z17, new com.p314xaae8f345.mm.p2621x8fb0427b.y4("").f277888c);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb r19, long r20, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19694xdfd03243.c(com.tencent.mm.api.IEmojiInfo, long, boolean, boolean):void");
    }

    public final void d(int i17) {
        this.f272353d = i17;
        if (i17 == 0) {
            this.f272360n.setVisibility(0);
            this.f272361o.setVisibility(4);
            this.f272359m.setVisibility(4);
            setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563723b84);
            return;
        }
        if (i17 == 1) {
            this.f272360n.setVisibility(0);
            this.f272361o.setVisibility(4);
            this.f272359m.setVisibility(4);
            setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.n_);
            return;
        }
        if (i17 == 2) {
            this.f272359m.setVisibility(0);
            this.f272360n.setVisibility(4);
            this.f272361o.setVisibility(4);
            setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563723b84);
            return;
        }
        if (i17 != 3) {
            return;
        }
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f77984xe03f84f7);
        int i18 = this.f272356g;
        drawable.setBounds(0, 0, i18, i18);
        hashCode();
        this.f272361o.setCompoundDrawables(null, drawable, null, null);
        this.f272361o.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bxr);
        this.f272361o.setVisibility(0);
        this.f272360n.setVisibility(4);
        this.f272359m.setVisibility(4);
        setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.n_);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19 = this.f272353d;
        if (i19 == 0 || i19 == 1 || i19 == 3) {
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f272362p;
            int max = (interfaceC4987x84e327cb == null || interfaceC4987x84e327cb.mo42931x1c4fb41d() == 0) ? this.f272354e : java.lang.Math.max((int) (this.f272362p.mo42931x1c4fb41d() * this.f272359m.m64929x43aa77f2()), this.f272355f);
            int i27 = this.f272354e;
            if (max > i27) {
                max = i27;
            }
            int i28 = this.f272357h;
            this.f272356g = i28;
            int i29 = this.f272355f;
            if (max >= i29) {
                int i37 = this.f272358i;
                if (max < (i28 - i37) + i29) {
                    this.f272356g = i37 + (max - i29);
                }
            }
        }
        super.onMeasure(i17, i18);
    }

    @Override // android.view.View
    public boolean performClick() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.RTChattingEmojiView", "performClick: %s", java.lang.Integer.valueOf(this.f272353d));
        int i17 = this.f272353d;
        if (i17 == 3) {
            this.f272363q = false;
            this.f272359m.z();
            return true;
        }
        if (i17 == 2) {
            return super.performClick();
        }
        return true;
    }

    /* renamed from: setChattingEmojiMaxSize */
    public void m75582x5f9a8547(int i17) {
        this.f272354e = i17;
        this.f272359m.m75574x5f9a8547(i17);
    }

    /* renamed from: setImageBitmap */
    public void m75583xd44890a8(android.graphics.Bitmap bitmap) {
        d(2);
        if (this.f272359m == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.setDensity(this.f272359m.m64928x7ab78438());
        this.f272359m.setImageBitmap(bitmap);
    }

    public C19694xdfd03243(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f272353d = -1;
        this.f272363q = true;
    }

    public C19694xdfd03243(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f272353d = -1;
        this.f272363q = true;
    }
}
