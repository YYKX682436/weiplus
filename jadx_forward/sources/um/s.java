package um;

/* loaded from: classes10.dex */
public class s implements um.m {

    /* renamed from: d, reason: collision with root package name */
    public java.util.Stack f510226d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Stack f510227e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.HashMap f510228f;

    /* renamed from: g, reason: collision with root package name */
    public int f510229g;

    /* renamed from: h, reason: collision with root package name */
    public int f510230h;

    /* renamed from: i, reason: collision with root package name */
    public int f510231i;

    @Override // um.m
    public int A3(boolean z17) {
        if (z17) {
            java.util.Stack stack = this.f510226d;
            if (stack != null) {
                return stack.size();
            }
            return 0;
        }
        java.util.Stack stack2 = this.f510227e;
        if (stack2 != null) {
            return stack2.size();
        }
        return 0;
    }

    @Override // um.m
    public void M(android.graphics.Canvas canvas, boolean z17) {
        if (z17) {
            canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
            java.util.Iterator it = this.f510226d.iterator();
            while (it.hasNext()) {
                xk0.k kVar = (xk0.k) it.next();
                kVar.a(canvas, true, false, (android.graphics.Bitmap) this.f510228f.get(java.lang.Long.valueOf(kVar.f536522g)));
            }
            return;
        }
        java.util.Stack stack = this.f510226d;
        xk0.k kVar2 = (stack == null || stack.size() <= 0) ? null : (xk0.k) this.f510226d.peek();
        if (kVar2 != null) {
            xk0.i iVar = xk0.i.ONE;
            xk0.i iVar2 = kVar2.f536519d;
            if (iVar2 == iVar) {
                kVar2.a(canvas, true, false, (android.graphics.Bitmap) this.f510228f.get(java.lang.Long.valueOf(kVar2.f536522g)));
                return;
            }
            if (iVar2 == xk0.i.TWO) {
                if (!this.f510228f.containsKey(java.lang.Long.valueOf(kVar2.f536522g))) {
                    int i17 = this.f510230h;
                    int i18 = this.f510231i;
                    android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_4444;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(config);
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(i18));
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/cache/MosaicCache", "onDrawCache", "(Landroid/graphics/Canvas;Z)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                    yj0.a.e(obj, createBitmap, "com/tencent/mm/cache/MosaicCache", "onDrawCache", "(Landroid/graphics/Canvas;Z)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    android.graphics.Canvas canvas2 = new android.graphics.Canvas(createBitmap);
                    canvas2.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
                    kVar2.a(canvas2, true, true, (android.graphics.Bitmap) this.f510228f.get(java.lang.Long.valueOf(kVar2.f536522g)));
                    this.f510228f.put(java.lang.Long.valueOf(kVar2.f536522g), createBitmap);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MosaicCache", "draw cache in two mosaic");
                }
                if (kVar2.f536524i) {
                    kVar2.a(canvas, true, false, (android.graphics.Bitmap) this.f510228f.get(java.lang.Long.valueOf(kVar2.f536522g)));
                    kVar2.f536524i = false;
                }
            }
        }
    }

    @Override // um.m
    public void O3(android.graphics.Canvas canvas) {
        java.util.Iterator it = this.f510226d.iterator();
        while (it.hasNext()) {
            xk0.k kVar = (xk0.k) it.next();
            kVar.a(canvas, true, false, (android.graphics.Bitmap) this.f510228f.get(java.lang.Long.valueOf(kVar.f536522g)));
        }
    }

    @Override // um.m
    public void R2(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MosaicCache", "[onSave] size:%s", java.lang.Integer.valueOf(this.f510226d.size()));
        java.util.Stack stack = this.f510227e;
        if (stack != null) {
            stack.clear();
        }
        this.f510227e = (java.util.Stack) this.f510226d.clone();
        if (z17) {
            this.f510226d.clear();
        }
    }

    @Override // um.m
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(xk0.k kVar) {
        java.util.Stack stack = this.f510226d;
        if (stack != null) {
            stack.push(kVar);
        }
    }

    public void b(xk0.k kVar) {
        java.util.Iterator it = this.f510226d.iterator();
        while (it.hasNext()) {
            if (((xk0.k) it.next()).f536522g == kVar.f536522g) {
                it.remove();
            }
        }
    }

    @Override // um.m
    /* renamed from: clear */
    public void mo168218x5a5b64d() {
        java.util.Stack stack = this.f510226d;
        if (stack != null) {
            stack.clear();
        }
    }

    @Override // um.m
    public void f3(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MosaicCache", "[onRestore] size:%s", java.lang.Integer.valueOf(this.f510226d.size()));
        this.f510226d.clear();
        java.util.Stack stack = this.f510227e;
        if (stack != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MosaicCache", "[onRestore] %s", java.lang.Integer.valueOf(stack.size()));
            this.f510226d.addAll(this.f510227e);
            if (z17) {
                this.f510227e.clear();
            }
        }
    }

    @Override // um.m
    public void o5() {
        this.f510229g++;
    }

    @Override // um.m
    /* renamed from: onCreate */
    public void mo168219x3e5a77bb() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MosaicCache", "[onCreate]");
        this.f510226d = new java.util.Stack();
        this.f510228f = new java.util.HashMap();
    }

    @Override // um.m
    /* renamed from: onDestroy */
    public void mo168220xac79a11b() {
        java.util.Stack stack = this.f510226d;
        if (stack != null) {
            java.util.Iterator it = stack.iterator();
            while (it.hasNext()) {
                ((xk0.k) it.next()).getClass();
            }
            this.f510226d.clear();
        }
        java.util.Stack stack2 = this.f510227e;
        if (stack2 != null) {
            java.util.Iterator it6 = stack2.iterator();
            while (it6.hasNext()) {
                ((xk0.k) it6.next()).getClass();
            }
            this.f510227e.clear();
        }
        java.util.Iterator it7 = this.f510228f.entrySet().iterator();
        while (it7.hasNext()) {
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((java.util.Map.Entry) it7.next()).getValue();
            if (bitmap != null && !bitmap.isRecycled()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MosaicCache", "bitmap recycle %s", bitmap.toString());
                bitmap.recycle();
            }
        }
        this.f510228f.clear();
    }

    @Override // um.m
    public java.lang.Object pop() {
        if (this.f510226d.size() > 0) {
            return (xk0.k) this.f510226d.pop();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MosaicCache", "[pop]");
        return null;
    }
}
