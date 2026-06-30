package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.MaskImageView */
/* loaded from: classes4.dex */
public class C17972xe84284f4 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18146x7d99d446 {
    public static final /* synthetic */ int V = 0;
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 K;
    public java.lang.Runnable L;
    public int M;
    public int N;
    public int P;
    public int Q;
    public boolean R;
    public final android.graphics.Paint S;
    public final android.graphics.Paint T;
    public final android.graphics.Rect U;

    public C17972xe84284f4(android.content.Context context) {
        super(context);
        this.M = 90;
        this.N = 0;
        this.P = 0;
        this.Q = 0;
        this.R = true;
        this.S = new android.graphics.Paint(1);
        this.T = new android.graphics.Paint(1);
        this.U = new android.graphics.Rect();
        p();
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.ui.C10912x86c557b2, android.view.View
    public void onAttachedToWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        super.onAttachedToWindow();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.MaskImageView");
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.ui.C10912x86c557b2, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22638x8e581d4f, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        super.onDetachedFromWindow();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.MaskImageView");
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22638x8e581d4f, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDraw", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        super.onDraw(canvas);
        if (isPressed()) {
            canvas.drawARGB(this.M, this.N, this.P, this.Q);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        boolean z17 = ld4.a.f399640c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        if (z17) {
            android.graphics.drawable.Drawable m81416x4a96be14 = m81416x4a96be14();
            if (m81416x4a96be14 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p5) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p5 p5Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p5) m81416x4a96be14;
                sb6.append(p5Var.c().f150503d.getWidth());
                sb6.append("x");
                sb6.append(p5Var.c().f150503d.getHeight());
                java.lang.String sb7 = sb6.toString();
                android.graphics.Paint paint = this.S;
                paint.getTextBounds(sb7, 0, sb7.length(), this.U);
                canvas.drawRect(0.0f, 0.0f, r6.width() + 24, r6.height() + 24, this.T);
                canvas.drawText(sb7, 12.0f, r6.height() + 12, paint);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDraw", "com.tencent.mm.plugin.sns.ui.MaskImageView");
    }

    public final void p() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.MaskImageView");
        this.K = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.L = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.s5(this);
        super.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.t5(this));
        super.setContentDescription(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jar));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initDebugInfo", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        boolean z17 = ld4.a.f399640c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        if (z17) {
            android.graphics.Paint paint = this.S;
            paint.setColor(-1);
            paint.setTextSize(i65.a.b(getContext(), 12));
            paint.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
            this.T.setColor(-65536);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initDebugInfo", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.MaskImageView");
    }

    public boolean q(android.view.View view, android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateState", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        int action = motionEvent.getAction();
        if (action == 0) {
            view.setPressed(true);
            view.invalidate();
            this.K.mo50300x3fa464aa(this.L);
        } else if (action == 1 || action == 3) {
            this.K.mo50293x3498a0(this.L);
        }
        boolean z17 = (isClickable() || isLongClickable()) ? false : true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateState", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        return z17;
    }

    @Override // android.view.View
    public void setClickable(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setClickable", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MaskImageView", "setClickable %b", java.lang.Boolean.valueOf(z17));
        super.setClickable(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClickable", "com.tencent.mm.plugin.sns.ui.MaskImageView");
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnClickListener", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MaskImageView", "setOnClickListener", new java.lang.Object[0]);
        super.setOnClickListener(onClickListener);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnClickListener", "com.tencent.mm.plugin.sns.ui.MaskImageView");
    }

    /* renamed from: settouchEnable */
    public void m70598x59285800(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("settouchEnable", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        this.R = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("settouchEnable", "com.tencent.mm.plugin.sns.ui.MaskImageView");
    }

    public C17972xe84284f4(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M = 90;
        this.N = 0;
        this.P = 0;
        this.Q = 0;
        this.R = true;
        this.S = new android.graphics.Paint(1);
        this.T = new android.graphics.Paint(1);
        this.U = new android.graphics.Rect();
        p();
    }
}
