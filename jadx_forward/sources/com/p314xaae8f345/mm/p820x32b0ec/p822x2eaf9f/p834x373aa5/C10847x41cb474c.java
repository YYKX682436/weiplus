package com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/live/core/view/LiveCameraFocusView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.live.core.view.LiveCameraFocusView */
/* loaded from: classes3.dex */
public final class C10847x41cb474c extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f150117d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f150118e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f150119f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f150120g;

    /* renamed from: h, reason: collision with root package name */
    public long f150121h;

    /* renamed from: i, reason: collision with root package name */
    public final int f150122i;

    /* renamed from: m, reason: collision with root package name */
    public final int f150123m;

    /* renamed from: n, reason: collision with root package name */
    public final int f150124n;

    /* renamed from: o, reason: collision with root package name */
    public final int f150125o;

    /* renamed from: p, reason: collision with root package name */
    public final int f150126p;

    /* renamed from: q, reason: collision with root package name */
    public int f150127q;

    /* renamed from: r, reason: collision with root package name */
    public int f150128r;

    /* renamed from: s, reason: collision with root package name */
    public int f150129s;

    /* renamed from: t, reason: collision with root package name */
    public int f150130t;

    /* renamed from: u, reason: collision with root package name */
    public int f150131u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10847x41cb474c(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f150117d = new android.graphics.Paint();
        this.f150122i = 200;
        this.f150123m = 200;
        this.f150124n = 3;
        this.f150125o = 300;
        this.f150126p = 200;
        setVisibility(4);
    }

    public final void a(int i17, int i18, int i19) {
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i17;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = i18;
        }
        this.f150127q = i17;
        this.f150128r = i18;
        this.f150129s = i17 / 2;
        this.f150130t = i18 / 2;
        this.f150131u = i65.a.b(getContext(), 1);
        android.graphics.Paint paint = this.f150117d;
        paint.setColor(i19);
        paint.setStrokeWidth(this.f150131u);
        setLayerType(1, null);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.draw(canvas);
        canvas.translate(this.f150129s / 2, this.f150130t / 2);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f150121h;
        int i17 = this.f150122i;
        if (currentTimeMillis > i17) {
            this.f150118e = false;
            this.f150119f = true;
        }
        int i18 = this.f150123m;
        int i19 = this.f150124n;
        if (currentTimeMillis > (i18 * i19) + i17) {
            this.f150119f = false;
        }
        int i27 = this.f150125o;
        if (currentTimeMillis > (i18 * i19) + i17 + i27) {
            this.f150120g = true;
        }
        int i28 = this.f150126p;
        if (currentTimeMillis > (i18 * i19) + i17 + i27 + i28) {
            this.f150120g = false;
            canvas.drawColor(0);
            return;
        }
        boolean z17 = this.f150118e;
        android.graphics.Paint paint = this.f150117d;
        if (z17) {
            float f17 = (((float) (i17 - currentTimeMillis)) / (i17 * 1.0f)) + 1.0f;
            canvas.scale(f17, f17, this.f150129s / 2, this.f150130t / 2);
            paint.setAlpha((int) (255 * (2.0f - f17)));
        } else {
            canvas.scale(1.0f, 1.0f);
        }
        if (this.f150119f) {
            float f18 = (((float) ((currentTimeMillis - i17) % i18)) / (i18 * 1.0f)) * 2.0f;
            paint.setAlpha((int) (127 + (128 * (f18 > 1.0f ? f18 - 1.0f : 1.0f - f18))));
        } else {
            paint.setAlpha(255);
        }
        if (this.f150120g) {
            paint.setAlpha((int) (255 * (1.0f - (((float) (currentTimeMillis - ((i17 + (i18 * i19)) + i27))) / (i28 * 1.0f)))));
        }
        canvas.drawLine(0.0f, 0.0f, this.f150129s, 0.0f, paint);
        canvas.drawLine(0.0f, 0.0f, 0.0f, this.f150130t, paint);
        int i29 = this.f150129s;
        canvas.drawLine(i29, 0.0f, i29, this.f150130t, paint);
        int i37 = this.f150130t;
        canvas.drawLine(0.0f, i37, this.f150129s, i37, paint);
        int i38 = this.f150130t;
        canvas.drawLine(0.0f, i38 / 2, this.f150129s / 10, i38 / 2, paint);
        int i39 = this.f150129s;
        int i47 = this.f150130t;
        canvas.drawLine(i39, i47 / 2, (i39 * 9) / 10, i47 / 2, paint);
        int i48 = this.f150129s;
        canvas.drawLine(i48 / 2, 0.0f, i48 / 2, this.f150130t / 10, paint);
        int i49 = this.f150129s;
        canvas.drawLine(i49 / 2, this.f150130t, i49 / 2, (r3 * 9) / 10, paint);
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10847x41cb474c(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f150117d = new android.graphics.Paint();
        this.f150122i = 200;
        this.f150123m = 200;
        this.f150124n = 3;
        this.f150125o = 300;
        this.f150126p = 200;
        setVisibility(4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10847x41cb474c(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f150117d = new android.graphics.Paint();
        this.f150122i = 200;
        this.f150123m = 200;
        this.f150124n = 3;
        this.f150125o = 300;
        this.f150126p = 200;
        setVisibility(4);
    }
}
