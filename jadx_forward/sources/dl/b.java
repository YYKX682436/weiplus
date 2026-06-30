package dl;

/* loaded from: classes10.dex */
public abstract class b {

    /* renamed from: p, reason: collision with root package name */
    public static final dl.b f316571p = new dl.c();

    /* renamed from: a, reason: collision with root package name */
    public l45.q f316572a;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.Matrix f316573b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Rect f316574c;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Rect f316575d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f316576e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f316577f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f316578g;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.Runnable f316581j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.Runnable f316582k;

    /* renamed from: o, reason: collision with root package name */
    public dl.f f316586o;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Paint f316579h = new android.graphics.Paint();

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Canvas f316580i = new android.graphics.Canvas();

    /* renamed from: l, reason: collision with root package name */
    public final android.graphics.PointF f316583l = new android.graphics.PointF();

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.PointF f316584m = new android.graphics.PointF();

    /* renamed from: n, reason: collision with root package name */
    public final float[] f316585n = new float[9];

    public abstract void A(java.lang.String str);

    public void B() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseArtist" + m(), "[onSelected] ");
    }

    public abstract void C();

    public void D() {
        if (d().pop() != null) {
            d().o5();
        }
        ((l45.n) this.f316572a).f397993a.removeCallbacks(this.f316581j);
        ym5.h hVar = ((l45.n) this.f316572a).f397993a;
        dl.e eVar = new dl.e(this);
        this.f316581j = eVar;
        hVar.postDelayed(eVar, 66L);
    }

    public void E(boolean z17) {
        android.graphics.Canvas canvas = this.f316580i;
        canvas.setBitmap(e());
        um.m d17 = d();
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseArtist", "updateCache: cache is null");
        } else {
            d17.M(canvas, z17);
            canvas.drawArc(0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, true, this.f316579h);
        }
    }

    public void F(android.view.MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        android.graphics.PointF pointF = this.f316583l;
        if (pointerCount > 1) {
            android.graphics.PointF pointF2 = this.f316584m;
            pointF2.x = motionEvent.getX(1);
            pointF2.y = motionEvent.getY(1);
        } else if (motionEvent.getPointerCount() == 1) {
            pointF.x = motionEvent.getX(0);
            pointF.y = motionEvent.getY(0);
        }
        if (motionEvent.getActionMasked() == 6) {
            if (motionEvent.getPointerCount() <= 1 || 1 - motionEvent.getActionIndex() < 0 || 1 - motionEvent.getActionIndex() >= motionEvent.getPointerCount()) {
                pointF.x = motionEvent.getX(0);
                pointF.y = motionEvent.getY(0);
            } else {
                pointF.x = motionEvent.getX(1 - motionEvent.getActionIndex());
                pointF.y = motionEvent.getY(1 - motionEvent.getActionIndex());
            }
        }
    }

    public float[] a(float f17, float f18) {
        android.graphics.Matrix matrix = new android.graphics.Matrix(this.f316573b);
        this.f316573b.invert(matrix);
        float[] fArr = {f17, f18};
        matrix.mapPoints(fArr);
        return fArr;
    }

    public void b(final java.lang.String str) {
        ((l45.n) this.f316572a).f397993a.removeCallbacks(this.f316582k);
        ym5.h hVar = ((l45.n) this.f316572a).f397993a;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: dl.b$$a
            @Override // java.lang.Runnable
            public final void run() {
                dl.b bVar = dl.b.this;
                bVar.A(str);
                bVar.r();
                bVar.f316582k = null;
            }
        };
        this.f316582k = runnable;
        hVar.postDelayed(runnable, 66L);
    }

    public android.graphics.Rect c() {
        return ((l45.n) this.f316572a).f397993a.m177310x5143ab24().m10934x9faf4b34();
    }

    public um.m d() {
        l45.q qVar = this.f316572a;
        dl.a m17 = m();
        l45.n nVar = (l45.n) qVar;
        nVar.getClass();
        com.p314xaae8f345.mm.p647x5a0af82.C10322x22f91ed2 a17 = com.p314xaae8f345.mm.p647x5a0af82.C10322x22f91ed2.a();
        java.lang.String str = nVar.f397994b.f445767d;
        a17.getClass();
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p647x5a0af82.C10322x22f91ed2.f145163d;
        if (isEmpty) {
            if (hashMap.containsKey(a17.f145165a)) {
                return ((um.c) hashMap.get(a17.f145165a)).b(m17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ArtistCacheManager", "[getArtistCache] id is not contains! %s", a17.f145165a);
        } else {
            if (hashMap.containsKey(str)) {
                return ((um.c) hashMap.get(str)).b(m17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ArtistCacheManager", "[getArtistCache] id is not contains! %s", str);
        }
        return null;
    }

    public android.graphics.Bitmap e() {
        int width;
        int height;
        android.graphics.Bitmap bitmap = this.f316578g;
        if (bitmap == null || bitmap.isRecycled()) {
            android.graphics.Rect m10940x30103138 = ((l45.n) this.f316572a).f397993a.m177310x5143ab24().m10940x30103138();
            if (m10940x30103138.isEmpty() || !((l45.n) this.f316572a).f397993a.m177310x5143ab24().f()) {
                width = ((l45.n) this.f316572a).f397993a.m177310x5143ab24().m10934x9faf4b34().width();
                height = ((l45.n) this.f316572a).f397993a.m177310x5143ab24().m10934x9faf4b34().height();
            } else {
                width = m10940x30103138.width();
                height = m10940x30103138.height();
            }
            if (width <= 0 || height <= 0) {
                return null;
            }
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_4444;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/artists/BaseArtist", "getCacheBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/artists/BaseArtist", "getCacheBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            this.f316578g = createBitmap;
        }
        return this.f316578g;
    }

    public int f(android.view.MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() <= 1) {
            return 0;
        }
        int x17 = (int) (motionEvent.getX(0) - motionEvent.getX(1));
        int y17 = (int) (motionEvent.getY(0) - motionEvent.getY(1));
        return (int) java.lang.Math.sqrt((x17 * x17) + (y17 * y17));
    }

    public int[] g(android.view.MotionEvent motionEvent) {
        int[] iArr = new int[2];
        if (motionEvent.getPointerCount() > 1) {
            iArr[0] = (int) (motionEvent.getX(0) - motionEvent.getX(1));
            iArr[1] = (int) (motionEvent.getY(0) - motionEvent.getY(1));
        }
        return iArr;
    }

    public android.graphics.Matrix h() {
        return ((l45.n) this.f316572a).f397993a.m177310x5143ab24().m10942xfeaf52d0();
    }

    public float i() {
        android.graphics.Matrix matrix = this.f316573b;
        float[] fArr = this.f316585n;
        matrix.getValues(fArr);
        double d17 = fArr[1];
        this.f316573b.getValues(fArr);
        return (float) java.lang.Math.round(java.lang.Math.atan2(d17, fArr[0]) * 57.29577951308232d);
    }

    public float j(android.graphics.Matrix matrix) {
        float[] fArr = this.f316585n;
        matrix.getValues(fArr);
        double d17 = fArr[1];
        matrix.getValues(fArr);
        return (float) java.lang.Math.round(java.lang.Math.atan2(d17, fArr[0]) * 57.29577951308232d);
    }

    public float k() {
        android.graphics.Matrix matrix = this.f316573b;
        float[] fArr = this.f316585n;
        matrix.getValues(fArr);
        float f17 = fArr[3];
        this.f316573b.getValues(fArr);
        float f18 = fArr[0];
        return (float) java.lang.Math.sqrt((f18 * f18) + (f17 * f17));
    }

    public hk0.u0 l() {
        l45.q qVar = this.f316572a;
        if (qVar != null) {
            return ((l45.n) qVar).f398017y;
        }
        return null;
    }

    public abstract dl.a m();

    public boolean n() {
        return this.f316577f && this.f316576e;
    }

    public boolean o() {
        try {
            return d().A3(true) > 0;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public boolean p(android.view.MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        android.graphics.PointF pointF = this.f316583l;
        if (pointerCount <= 1) {
            if (motionEvent.getPointerCount() == 1) {
                return java.lang.Math.abs(pointF.x - motionEvent.getX(0)) > 3.0f || java.lang.Math.abs(pointF.y - motionEvent.getY(0)) > 3.0f;
            }
            return false;
        }
        if (java.lang.Math.abs(pointF.x - motionEvent.getX(0)) <= 3.0f && java.lang.Math.abs(pointF.y - motionEvent.getY(0)) <= 3.0f) {
            android.graphics.PointF pointF2 = this.f316584m;
            if (java.lang.Math.abs(pointF2.x - motionEvent.getX(1)) <= 3.0f && java.lang.Math.abs(pointF2.y - motionEvent.getY(1)) <= 3.0f) {
                return false;
            }
        }
        return true;
    }

    public boolean q() {
        return ((l45.n) this.f316572a).f().m() == m();
    }

    public void r() {
        ((l45.n) this.f316572a).f397993a.m177310x5143ab24().postInvalidate();
    }

    public void s() {
        ((l45.n) this.f316572a).f397993a.m177311xc3ab3d87().postInvalidate();
    }

    public void t() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseArtist" + m(), "[onAlive] isAlive:%s", java.lang.Boolean.valueOf(this.f316576e));
        if (this.f316576e) {
            return;
        }
        this.f316576e = true;
        um.m d17 = d();
        if (d17 != null) {
            d17.f3(false);
            d17.R2(false);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseArtist", "[onAlive] type:%s cache is null", m());
        }
        this.f316578g = e();
    }

    public void u(l45.q qVar, android.graphics.Matrix matrix, android.graphics.Rect rect) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseArtist" + m(), "[onCreate]");
        this.f316577f = true;
        this.f316572a = qVar;
        this.f316573b = matrix;
        this.f316574c = rect;
        this.f316575d = rect;
    }

    public void v(android.graphics.Canvas canvas) {
        android.graphics.Bitmap bitmap = this.f316578g;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.f316578g, 0.0f, 0.0f, (android.graphics.Paint) null);
    }

    public void w() {
        this.f316577f = false;
        this.f316576e = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseArtist" + m(), "[onDestroy]");
        ((ku5.t0) ku5.t0.f394148d).B(new dl.d(this));
    }

    public boolean x(android.view.MotionEvent motionEvent) {
        if (!p(motionEvent)) {
            return false;
        }
        F(motionEvent);
        return false;
    }

    public abstract void y(android.graphics.Canvas canvas);

    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseArtist", "[onFinish] type:%s", m());
        this.f316576e = false;
        this.f316577f = false;
        um.m d17 = d();
        if (d17 != null) {
            d17.R2(true);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseArtist", "[onFinish] type:%s cache is null", m());
        }
        ((ku5.t0) ku5.t0.f394148d).B(new dl.d(this));
    }
}
