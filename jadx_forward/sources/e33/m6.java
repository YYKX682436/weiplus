package e33;

/* loaded from: classes10.dex */
public final class m6 extends android.graphics.drawable.Drawable {

    /* renamed from: o, reason: collision with root package name */
    public static final android.graphics.Paint f328896o;

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.ImageView f328897a;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.Bitmap f328898b;

    /* renamed from: c, reason: collision with root package name */
    public f60.a f328899c;

    /* renamed from: f, reason: collision with root package name */
    public long f328902f;

    /* renamed from: g, reason: collision with root package name */
    public int f328903g;

    /* renamed from: h, reason: collision with root package name */
    public int f328904h;

    /* renamed from: i, reason: collision with root package name */
    public t23.j2 f328905i;

    /* renamed from: j, reason: collision with root package name */
    public long f328906j;

    /* renamed from: k, reason: collision with root package name */
    public final android.graphics.Rect f328907k = new android.graphics.Rect();

    /* renamed from: l, reason: collision with root package name */
    public boolean f328908l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f328909m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f328910n = false;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f328900d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f328901e = "";

    static {
        android.graphics.Paint paint = new android.graphics.Paint();
        f328896o = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
    }

    public m6(android.widget.ImageView imageView) {
        this.f328897a = imageView;
    }

    public static void a(android.widget.ImageView imageView, int i17, java.lang.String str, java.lang.String str2, long j17, int i18, long j18) {
        c(imageView, i17, str, str2, j17, i18, null, null, j18);
    }

    public static void b(android.widget.ImageView imageView, int i17, java.lang.String str, java.lang.String str2, long j17, int i18, f60.a aVar, long j18) {
        c(imageView, i17, str, str2, j17, i18, aVar, null, j18);
    }

    public static void c(android.widget.ImageView imageView, int i17, java.lang.String str, java.lang.String str2, long j17, int i18, f60.a aVar, t23.j2 j2Var, long j18) {
        android.widget.ImageView imageView2;
        android.graphics.Bitmap bitmap;
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        e33.m6 m6Var = drawable instanceof e33.m6 ? (e33.m6) drawable : new e33.m6(imageView);
        if (j2Var == null) {
            m6Var.f328905i = null;
            m6Var.f328908l = false;
        } else if (!j2Var.m165752xb2c87fbf(m6Var.f328905i)) {
            m6Var.f328908l = true;
            m6Var.f328905i = j2Var;
        }
        if (m6Var.f328904h != i18) {
            m6Var.f328909m = true;
            m6Var.f328904h = i18;
        }
        if (m6Var.f328906j != j18) {
            m6Var.f328910n = true;
            m6Var.f328906j = j18;
        }
        m6Var.f328899c = aVar;
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? str2 : str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ThumbDrawable", "filepath is null or nil");
        } else if (!m6Var.f328900d.equals(str3) || (bitmap = m6Var.f328898b) == null || bitmap.isRecycled() || m6Var.f328908l || m6Var.f328909m || m6Var.f328910n) {
            t23.j2 j2Var2 = m6Var.f328905i;
            if (j2Var2 != null) {
                j2Var2.m165753x9616526c();
            }
            if (m6Var.f328908l) {
                m6Var.f328908l = false;
            }
            m6Var.f328900d.equals(str3);
            if (m6Var.f328909m) {
                m6Var.f328909m = false;
            }
            if (m6Var.f328910n) {
                m6Var.f328910n = false;
            }
            m6Var.f328900d = str3;
            m6Var.f328901e = str2;
            m6Var.f328902f = j17;
            m6Var.f328903g = i17;
            android.graphics.Bitmap g17 = t23.p0.h().g(m6Var.f328900d, m6Var.f328901e, m6Var.f328902f, m6Var.f328905i, m6Var.f328906j);
            m6Var.f328898b = g17;
            if (g17 != null) {
                g17.isRecycled();
            }
            android.graphics.Bitmap bitmap2 = m6Var.f328898b;
            android.widget.ImageView imageView3 = m6Var.f328897a;
            if (bitmap2 == null || bitmap2.isRecycled()) {
                t23.p0.h().a(new e33.l6(imageView3, j33.d0.d(m6Var.f328900d, m6Var.f328905i, m6Var.f328904h)));
                imageView2 = imageView3;
                android.graphics.Bitmap f17 = t23.p0.h().f(m6Var.f328900d, i17, str2, j17, m6Var.f328905i, m6Var.f328904h, m6Var.f328906j);
                m6Var.f328898b = f17;
                if (f17 != null) {
                    f17.isRecycled();
                }
            } else {
                android.graphics.Bitmap bitmap3 = m6Var.f328898b;
                if (bitmap3 != null) {
                    bitmap3.isRecycled();
                }
                imageView2 = imageView3;
            }
            android.graphics.Bitmap bitmap4 = m6Var.f328898b;
            if (bitmap4 != null && !bitmap4.isRecycled()) {
                imageView2.invalidate();
            }
        } else {
            android.graphics.Bitmap bitmap5 = m6Var.f328898b;
            if (bitmap5 != null) {
                bitmap5.isRecycled();
            }
        }
        imageView.setImageDrawable(m6Var);
    }

    public static void d(android.widget.ImageView imageView, int i17, java.lang.String str, java.lang.String str2, long j17, f60.a aVar, long j18) {
        c(imageView, i17, str, str2, j17, -1, aVar, null, j18);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Bitmap bitmap = this.f328898b;
        if (bitmap == null || bitmap.isRecycled()) {
            t23.p0.h().a(new e33.l6(this.f328897a, j33.d0.d(this.f328900d, this.f328905i, this.f328904h)));
            android.graphics.Bitmap f17 = t23.p0.h().f(this.f328900d, this.f328903g, this.f328901e, this.f328902f, this.f328905i, this.f328904h, this.f328906j);
            this.f328898b = f17;
            if (f17 != null) {
                f17.isRecycled();
            }
        }
        android.graphics.Bitmap bitmap2 = this.f328898b;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        f60.a aVar = this.f328899c;
        if (aVar != null) {
            aVar.a();
            this.f328899c = null;
        }
        android.graphics.Bitmap bitmap3 = this.f328898b;
        int width = bitmap3.getWidth();
        int height = bitmap3.getHeight();
        android.graphics.Rect rect = this.f328907k;
        if (width > height) {
            rect.top = 0;
            rect.bottom = bitmap3.getHeight();
            int width2 = (bitmap3.getWidth() - bitmap3.getHeight()) >> 1;
            rect.left = width2;
            rect.right = width2 + bitmap3.getHeight();
        } else {
            rect.left = 0;
            rect.right = bitmap3.getWidth();
            int height2 = (bitmap3.getHeight() - bitmap3.getWidth()) >> 1;
            rect.top = height2;
            rect.bottom = height2 + bitmap3.getWidth();
        }
        canvas.drawBitmap(this.f328898b, rect, getBounds(), f328896o);
        getBounds().toString();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return 400;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return 400;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i17, int i18, int i19, int i27) {
        super.setBounds(i17, i18, i19, i27);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(android.graphics.Rect rect) {
        rect.toString();
        super.setBounds(rect);
    }
}
