package dl;

/* loaded from: classes10.dex */
public class d0 extends dl.b {

    /* renamed from: s, reason: collision with root package name */
    public float f316614s;

    /* renamed from: t, reason: collision with root package name */
    public float f316615t;

    /* renamed from: u, reason: collision with root package name */
    public float f316616u;

    /* renamed from: v, reason: collision with root package name */
    public float f316617v;

    /* renamed from: x, reason: collision with root package name */
    public android.graphics.Bitmap f316619x;

    /* renamed from: q, reason: collision with root package name */
    public boolean f316612q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f316613r = false;

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.Path f316618w = new android.graphics.Path();

    /* renamed from: y, reason: collision with root package name */
    public final java.util.LinkedList f316620y = new java.util.LinkedList();

    /* renamed from: z, reason: collision with root package name */
    public xk0.i f316621z = xk0.i.ONE;
    public final hk0.y A = new hk0.y();
    public boolean B = false;
    public java.util.ArrayList C = new java.util.ArrayList();

    public static void G(dl.d0 d0Var, xk0.k kVar) {
        if (d0Var.l() != null) {
            d0Var.l().Y6();
        }
        super.E(true);
        d0Var.r();
    }

    @Override // dl.b
    public void A(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MosaicArtist", "forwardUndo >> editId: %s", str);
        hk0.u0 l17 = l();
        if (l17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MosaicArtist", "forwardUndo but model is null");
            return;
        }
        hk0.w0 e17 = l17.f363351i.e(str);
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MosaicArtist", "forwardUndo editData is null");
            return;
        }
        hk0.z0 z0Var = hk0.z0.f363398g;
        xk0.k kVar = e17.f363370d;
        if (e17.f363369c != z0Var) {
            d().add(kVar);
            if (kVar.f536519d == xk0.i.TWO) {
                kVar.f536524i = true;
            }
            super.E(false);
            return;
        }
        if (kVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MosaicArtist", "onForwardUndo is item");
            d().b(kVar);
        } else {
            java.util.ArrayList arrayList = e17.f363371e;
            if (arrayList != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MosaicArtist", "onForwardUndo is itemList");
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    d().b((xk0.k) it.next());
                }
            }
        }
        super.E(true);
    }

    @Override // dl.b
    public void C() {
        super.E(true);
    }

    @Override // dl.b
    public void E(boolean z17) {
        super.E(z17);
    }

    @Override // dl.b
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public um.s d() {
        return (um.s) super.d();
    }

    public void I(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MosaicArtist", "setInEraser %b", java.lang.Boolean.valueOf(z17));
        this.B = z17;
    }

    @Override // dl.b
    public dl.a m() {
        return dl.a.MOSAIC;
    }

    @Override // dl.b
    public void t() {
        android.graphics.Bitmap bitmap;
        int width;
        int height;
        super.t();
        android.graphics.Bitmap bitmap2 = ((l45.n) this.f316572a).f397998f;
        if (bitmap2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MosaicArtist", "[generateMosaicImage] bitmap is null");
            bitmap = null;
        } else {
            int width2 = bitmap2.getWidth();
            int height2 = bitmap2.getHeight();
            int b17 = cm5.h.b(6.0f);
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.RGB_565;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(height2));
            arrayList.add(java.lang.Integer.valueOf(width2));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/artists/MosaicArtist", "generateMosaicImage", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            int i17 = 0;
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/artists/MosaicArtist", "generateMosaicImage", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            float f17 = b17;
            int ceil = (int) java.lang.Math.ceil(width2 / f17);
            int ceil2 = (int) java.lang.Math.ceil(height2 / f17);
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setAntiAlias(true);
            int i18 = 0;
            while (i18 < ceil) {
                int i19 = i17;
                while (i19 < ceil2) {
                    int i27 = b17 * i18;
                    int i28 = b17 * i19;
                    int i29 = i27 + b17;
                    if (i29 > width2) {
                        i29 = width2;
                    }
                    int i37 = i28 + b17;
                    int i38 = width2;
                    if (i37 > height2) {
                        i37 = height2;
                    }
                    int pixel = bitmap2.getPixel(i27, i28);
                    android.graphics.Bitmap bitmap3 = bitmap2;
                    android.graphics.Rect rect = new android.graphics.Rect(i27, i28, i29, i37);
                    paint.setColor(pixel);
                    canvas.drawRect(rect, paint);
                    i19++;
                    width2 = i38;
                    bitmap2 = bitmap3;
                }
                i18++;
                i17 = 0;
            }
            bitmap = createBitmap;
        }
        this.f316619x = bitmap;
        android.graphics.Rect m10940x30103138 = ((l45.n) this.f316572a).f397993a.m177310x5143ab24().m10940x30103138();
        if (m10940x30103138.isEmpty() || !((l45.n) this.f316572a).f397993a.m177310x5143ab24().f()) {
            width = ((l45.n) this.f316572a).f397993a.m177310x5143ab24().m10934x9faf4b34().width();
            height = ((l45.n) this.f316572a).f397993a.m177310x5143ab24().m10934x9faf4b34().height();
        } else {
            width = m10940x30103138.width();
            height = m10940x30103138.height();
        }
        if (width > 0 && height > 0) {
            um.s d17 = d();
            d17.f510230h = width;
            d17.f510231i = height;
        }
        dl.C28230x5978c15 c28230x5978c15 = new dl.C28230x5978c15(this);
        hk0.y yVar = this.A;
        yVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditEraserHelper", "setMosaicSelectCallback");
        yVar.f363378e = c28230x5978c15;
    }

    @Override // dl.b
    public void w() {
        super.w();
        android.graphics.Bitmap bitmap = this.f316619x;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f316619x.recycle();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r3 != 5) goto L117;
     */
    @Override // dl.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean x(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 937
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dl.d0.x(android.view.MotionEvent):boolean");
    }

    @Override // dl.b
    public void y(android.graphics.Canvas canvas) {
        canvas.save();
        canvas.clipRect(this.f316574c);
        xk0.i iVar = this.f316621z;
        if (iVar == xk0.i.ONE) {
            v(canvas);
            new xk0.k(this.f316621z, this.f316618w, 1.0f / k(), this.f316619x).a(canvas, false, false, null);
        } else if (iVar == xk0.i.TWO) {
            new xk0.k(this.f316621z, new java.util.LinkedList(this.f316620y), 1.0f / k()).a(new android.graphics.Canvas(e()), false, false, null);
            v(canvas);
        }
        canvas.restore();
    }
}
