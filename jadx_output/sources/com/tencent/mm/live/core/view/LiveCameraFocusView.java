package com.tencent.mm.live.core.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/live/core/view/LiveCameraFocusView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LiveCameraFocusView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f68584d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f68585e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f68586f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f68587g;

    /* renamed from: h, reason: collision with root package name */
    public long f68588h;

    /* renamed from: i, reason: collision with root package name */
    public final int f68589i;

    /* renamed from: m, reason: collision with root package name */
    public final int f68590m;

    /* renamed from: n, reason: collision with root package name */
    public final int f68591n;

    /* renamed from: o, reason: collision with root package name */
    public final int f68592o;

    /* renamed from: p, reason: collision with root package name */
    public final int f68593p;

    /* renamed from: q, reason: collision with root package name */
    public int f68594q;

    /* renamed from: r, reason: collision with root package name */
    public int f68595r;

    /* renamed from: s, reason: collision with root package name */
    public int f68596s;

    /* renamed from: t, reason: collision with root package name */
    public int f68597t;

    /* renamed from: u, reason: collision with root package name */
    public int f68598u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveCameraFocusView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f68584d = new android.graphics.Paint();
        this.f68589i = 200;
        this.f68590m = 200;
        this.f68591n = 3;
        this.f68592o = 300;
        this.f68593p = 200;
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
        this.f68594q = i17;
        this.f68595r = i18;
        this.f68596s = i17 / 2;
        this.f68597t = i18 / 2;
        this.f68598u = i65.a.b(getContext(), 1);
        android.graphics.Paint paint = this.f68584d;
        paint.setColor(i19);
        paint.setStrokeWidth(this.f68598u);
        setLayerType(1, null);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.draw(canvas);
        canvas.translate(this.f68596s / 2, this.f68597t / 2);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f68588h;
        int i17 = this.f68589i;
        if (currentTimeMillis > i17) {
            this.f68585e = false;
            this.f68586f = true;
        }
        int i18 = this.f68590m;
        int i19 = this.f68591n;
        if (currentTimeMillis > (i18 * i19) + i17) {
            this.f68586f = false;
        }
        int i27 = this.f68592o;
        if (currentTimeMillis > (i18 * i19) + i17 + i27) {
            this.f68587g = true;
        }
        int i28 = this.f68593p;
        if (currentTimeMillis > (i18 * i19) + i17 + i27 + i28) {
            this.f68587g = false;
            canvas.drawColor(0);
            return;
        }
        boolean z17 = this.f68585e;
        android.graphics.Paint paint = this.f68584d;
        if (z17) {
            float f17 = (((float) (i17 - currentTimeMillis)) / (i17 * 1.0f)) + 1.0f;
            canvas.scale(f17, f17, this.f68596s / 2, this.f68597t / 2);
            paint.setAlpha((int) (255 * (2.0f - f17)));
        } else {
            canvas.scale(1.0f, 1.0f);
        }
        if (this.f68586f) {
            float f18 = (((float) ((currentTimeMillis - i17) % i18)) / (i18 * 1.0f)) * 2.0f;
            paint.setAlpha((int) (127 + (128 * (f18 > 1.0f ? f18 - 1.0f : 1.0f - f18))));
        } else {
            paint.setAlpha(255);
        }
        if (this.f68587g) {
            paint.setAlpha((int) (255 * (1.0f - (((float) (currentTimeMillis - ((i17 + (i18 * i19)) + i27))) / (i28 * 1.0f)))));
        }
        canvas.drawLine(0.0f, 0.0f, this.f68596s, 0.0f, paint);
        canvas.drawLine(0.0f, 0.0f, 0.0f, this.f68597t, paint);
        int i29 = this.f68596s;
        canvas.drawLine(i29, 0.0f, i29, this.f68597t, paint);
        int i37 = this.f68597t;
        canvas.drawLine(0.0f, i37, this.f68596s, i37, paint);
        int i38 = this.f68597t;
        canvas.drawLine(0.0f, i38 / 2, this.f68596s / 10, i38 / 2, paint);
        int i39 = this.f68596s;
        int i47 = this.f68597t;
        canvas.drawLine(i39, i47 / 2, (i39 * 9) / 10, i47 / 2, paint);
        int i48 = this.f68596s;
        canvas.drawLine(i48 / 2, 0.0f, i48 / 2, this.f68597t / 10, paint);
        int i49 = this.f68596s;
        canvas.drawLine(i49 / 2, this.f68597t, i49 / 2, (r3 * 9) / 10, paint);
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveCameraFocusView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f68584d = new android.graphics.Paint();
        this.f68589i = 200;
        this.f68590m = 200;
        this.f68591n = 3;
        this.f68592o = 300;
        this.f68593p = 200;
        setVisibility(4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveCameraFocusView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f68584d = new android.graphics.Paint();
        this.f68589i = 200;
        this.f68590m = 200;
        this.f68591n = 3;
        this.f68592o = 300;
        this.f68593p = 200;
        setVisibility(4);
    }
}
