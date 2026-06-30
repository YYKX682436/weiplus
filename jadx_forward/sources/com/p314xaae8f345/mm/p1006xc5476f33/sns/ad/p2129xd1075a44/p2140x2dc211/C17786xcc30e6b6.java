package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2140x2dc211;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/widget/anim/EdgeAlphaFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout */
/* loaded from: classes5.dex */
public final class C17786xcc30e6b6 extends android.widget.FrameLayout {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f245025v = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f245026d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f245027e;

    /* renamed from: f, reason: collision with root package name */
    public float f245028f;

    /* renamed from: g, reason: collision with root package name */
    public float f245029g;

    /* renamed from: h, reason: collision with root package name */
    public float f245030h;

    /* renamed from: i, reason: collision with root package name */
    public float f245031i;

    /* renamed from: m, reason: collision with root package name */
    public float f245032m;

    /* renamed from: n, reason: collision with root package name */
    public float f245033n;

    /* renamed from: o, reason: collision with root package name */
    public float f245034o;

    /* renamed from: p, reason: collision with root package name */
    public float f245035p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Paint f245036q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.Paint f245037r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.Paint f245038s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.Paint f245039t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.Paint f245040u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17786xcc30e6b6(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f245026d = new int[]{android.graphics.Color.parseColor("#fff7f7f7"), android.graphics.Color.parseColor("#00f7f7f7")};
        this.f245027e = new float[]{0.0f, 1.0f};
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f245036q = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f245037r = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        this.f245038s = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint(1);
        this.f245039t = paint4;
        java.util.List<android.graphics.Paint> k17 = kz5.c0.k(paint, paint2, paint3, paint4);
        this.f245040u = new android.graphics.Paint(1);
        for (android.graphics.Paint paint5 : k17) {
            paint5.setStyle(android.graphics.Paint.Style.FILL);
            paint5.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        }
        this.f245040u.setColor(-1);
        this.f245040u.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        addOnLayoutChangeListener(new o84.a(this));
    }

    public final void a(float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAlphaRect", "com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout");
        int width = getWidth();
        int height = getHeight();
        this.f245028f = f17;
        this.f245029g = f18;
        this.f245030h = f19;
        this.f245031i = f27;
        this.f245032m = f28;
        this.f245033n = f29;
        this.f245034o = f37;
        this.f245035p = f38;
        this.f245036q.setShader(new android.graphics.LinearGradient(f17, 0.0f, f17 + f18, 0.0f, this.f245026d, this.f245027e, android.graphics.Shader.TileMode.CLAMP));
        float f39 = width - f28;
        this.f245037r.setShader(new android.graphics.LinearGradient(f39, 0.0f, f39 - f29, 0.0f, this.f245026d, this.f245027e, android.graphics.Shader.TileMode.CLAMP));
        this.f245038s.setShader(new android.graphics.LinearGradient(0.0f, f19, 0.0f, f19 + f27, this.f245026d, this.f245027e, android.graphics.Shader.TileMode.CLAMP));
        float f47 = height - f37;
        this.f245039t.setShader(new android.graphics.LinearGradient(0.0f, f47, 0.0f, f47 - f38, this.f245026d, this.f245027e, android.graphics.Shader.TileMode.CLAMP));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAlphaRect", "com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout");
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("drawChild", "com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        boolean drawChild = super.drawChild(canvas, view, j17);
        canvas.drawRect(0.0f, 0.0f, this.f245028f, getHeight(), this.f245040u);
        float f17 = this.f245028f;
        canvas.drawRect(f17, 0.0f, f17 + this.f245029g, getHeight(), this.f245036q);
        canvas.drawRect(getWidth() - this.f245032m, 0.0f, getWidth(), getHeight(), this.f245040u);
        canvas.drawRect((getWidth() - this.f245032m) - this.f245033n, 0.0f, getWidth() - this.f245032m, getHeight(), this.f245037r);
        canvas.drawRect(0.0f, 0.0f, getWidth(), this.f245030h, this.f245040u);
        canvas.drawRect(0.0f, this.f245030h, getWidth(), this.f245031i + this.f245030h, this.f245038s);
        canvas.drawRect(0.0f, getHeight() - this.f245034o, getWidth(), getHeight(), this.f245040u);
        canvas.drawRect(0.0f, (getHeight() - this.f245034o) - this.f245035p, getWidth(), getHeight() - this.f245034o, this.f245039t);
        canvas.restoreToCount(saveLayer);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("drawChild", "com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout");
        return drawChild;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17786xcc30e6b6(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f245026d = new int[]{android.graphics.Color.parseColor("#fff7f7f7"), android.graphics.Color.parseColor("#00f7f7f7")};
        this.f245027e = new float[]{0.0f, 1.0f};
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f245036q = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f245037r = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        this.f245038s = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint(1);
        this.f245039t = paint4;
        java.util.List<android.graphics.Paint> k17 = kz5.c0.k(paint, paint2, paint3, paint4);
        this.f245040u = new android.graphics.Paint(1);
        for (android.graphics.Paint paint5 : k17) {
            paint5.setStyle(android.graphics.Paint.Style.FILL);
            paint5.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        }
        this.f245040u.setColor(-1);
        this.f245040u.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        addOnLayoutChangeListener(new o84.a(this));
    }
}
