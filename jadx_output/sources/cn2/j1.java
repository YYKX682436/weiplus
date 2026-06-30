package cn2;

/* loaded from: classes3.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f43546a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f43547b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f43548c;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f43549d;

    /* renamed from: e, reason: collision with root package name */
    public long f43550e;

    /* renamed from: f, reason: collision with root package name */
    public long f43551f;

    /* renamed from: g, reason: collision with root package name */
    public final int f43552g;

    public j1(android.view.View container) {
        kotlin.jvm.internal.o.g(container, "container");
        this.f43546a = container;
        this.f43547b = "LightStarProxy";
        jz5.h.b(new cn2.h1(this));
        jz5.h.b(cn2.i1.f43540d);
        this.f43552g = 1000;
    }

    public final void a(android.graphics.Canvas canvas, float f17, float f18, float f19, float f27) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setTranslate(f17, f18);
        float f28 = ((float) this.f43550e) - f27;
        float f29 = this.f43552g;
        float f37 = f28 % f29;
        if (f37 < 0.0f) {
            f37 = 0.0f;
        }
        float f38 = f37 / f29;
        if (f38 > 0.0f) {
            canvas.save();
            if (f38 < 0.5f) {
                float f39 = f19 * (f38 / 0.5f);
                kotlin.jvm.internal.o.d(this.f43549d);
                kotlin.jvm.internal.o.d(this.f43549d);
                matrix.preScale(f39, f39, r4.getWidth() / 2.0f, r5.getHeight() / 2.0f);
            } else {
                float f47 = f19 - ((int) (((f38 - 0.5f) / 0.5f) * f19));
                kotlin.jvm.internal.o.d(this.f43549d);
                kotlin.jvm.internal.o.d(this.f43549d);
                matrix.preScale(f47, f47, r4.getWidth() / 2.0f, r5.getHeight() / 2.0f);
            }
            android.graphics.Bitmap bitmap = this.f43549d;
            kotlin.jvm.internal.o.d(bitmap);
            canvas.drawBitmap(bitmap, matrix, null);
            canvas.restore();
        }
    }

    public final void b(int i17) {
        com.tencent.mars.xlog.Log.i(this.f43547b, "stop source:" + i17 + '!');
        this.f43548c = false;
        android.view.View view = this.f43546a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/bulletcommet/LightStarProxy", "stop", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/LightStarProxy", "stop", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
