package fx2;

/* loaded from: classes8.dex */
public final class f extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f348659a;

    /* renamed from: b, reason: collision with root package name */
    public final int f348660b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f348661c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f348662d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f348663e;

    /* renamed from: f, reason: collision with root package name */
    public int f348664f;

    /* renamed from: g, reason: collision with root package name */
    public mn2.f1 f348665g;

    public f(java.lang.String url, int i17, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        this.f348659a = url;
        this.f348660b = i17;
        this.f348661c = "Finder.UrlBitmapDrawable";
        this.f348662d = new java.lang.ref.WeakReference(view);
        this.f348664f = 255;
        if (view != null) {
            view.setTag(i17, url);
        }
        this.f348665g = mn2.f1.f411498s;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        android.graphics.Bitmap bitmap = this.f348663e;
        java.lang.ref.WeakReference weakReference = this.f348662d;
        java.lang.String str = this.f348661c;
        java.lang.String str2 = this.f348659a;
        if (bitmap != null) {
            android.graphics.Rect bounds = getBounds();
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setAlpha(this.f348664f);
            canvas.drawBitmap(bitmap, (android.graphics.Rect) null, bounds, paint);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("draw, view:");
            android.view.View view = (android.view.View) weakReference.get();
            sb6.append(view != null ? java.lang.Integer.valueOf(view.hashCode()) : null);
            sb6.append(", drawableAlpha=");
            sb6.append(this.f348664f);
            sb6.append(" rect:");
            sb6.append(getBounds());
            sb6.append(", ");
            sb6.append(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("start load, view:");
            android.view.View view2 = (android.view.View) weakReference.get();
            sb7.append(view2 != null ? java.lang.Integer.valueOf(view2.hashCode()) : null);
            sb7.append(", ");
            sb7.append(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7.toString());
            mn2.g1 g1Var = mn2.g1.f411508a;
            wo0.c b17 = g1Var.e().b(new mn2.q3(str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), g1Var.h(this.f348665g));
            fx2.e eVar = new fx2.e(this, this);
            b17.getClass();
            b17.f529406d = eVar;
            b17.a();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }
}
