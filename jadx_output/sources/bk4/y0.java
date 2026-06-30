package bk4;

/* loaded from: classes11.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk4.z0 f21625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pj4.o1 f21626e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pj4.g0 f21627f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f21628g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f21629h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(bk4.z0 z0Var, pj4.o1 o1Var, pj4.g0 g0Var, java.lang.String str, boolean z17) {
        super(1);
        this.f21625d = z0Var;
        this.f21626e = o1Var;
        this.f21627f = g0Var;
        this.f21628g = str;
        this.f21629h = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bi4.j0 j0Var;
        int i17;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (!this.f21625d.f21642q && bitmap != null && !bitmap.isRecycled()) {
            bk4.z0 z0Var = this.f21625d;
            pj4.o1 o1Var = this.f21626e;
            pj4.g0 g0Var = this.f21627f;
            java.lang.String key = this.f21628g;
            boolean z17 = this.f21629h;
            z0Var.getClass();
            bk4.w0 w0Var = bk4.z0.f21632t;
            try {
                if (z17) {
                    int i18 = (z0Var.f21640o * 5) / 4;
                    java.lang.String str = g0Var.f355046d + z0Var.f21635g;
                    vo0.d dVar = vi4.e.f437609a;
                    kk.j jVar = vi4.e.f437610b;
                    android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) ((jt0.i) jVar).get(str);
                    if (bitmap2 == null) {
                        android.graphics.Bitmap b17 = (o1Var.f355231g != 0 || bk4.g0.j(g0Var)) ? bitmap : z0Var.b(bitmap, com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f478547ah));
                        java.lang.Object value = ((jz5.n) vi4.e.f437611c).getValue();
                        kotlin.jvm.internal.o.f(value, "getValue(...)");
                        int i19 = z0Var.f21640o;
                        i17 = i18;
                        bitmap2 = z0Var.a(b17, i19, (android.graphics.Bitmap) value, i19 / 2, (i19 / 4) * 3, i18, i19);
                        ((jt0.i) jVar).put(str, bitmap2);
                    } else {
                        i17 = i18;
                    }
                    android.graphics.drawable.Drawable bitmapDrawable = bitmap2 != null ? new android.graphics.drawable.BitmapDrawable(bitmap2) : bk4.i.a().i(bitmap, bk4.g0.j(g0Var), z0Var.f21638m, z0Var.f21639n);
                    bitmapDrawable.setBounds(0, 0, i17, z0Var.f21640o);
                    z0Var.f21634f = bitmapDrawable;
                    kotlin.jvm.internal.o.g(key, "key");
                    if (!r26.n0.N(key)) {
                        android.util.LruCache lruCache = bk4.z0.f21633u;
                        lruCache.put(key, bitmapDrawable);
                        lruCache.size();
                    }
                } else {
                    android.graphics.drawable.Drawable i27 = bk4.i.a().i(bitmap, bk4.g0.j(g0Var), z0Var.f21638m, z0Var.f21639n);
                    int i28 = z0Var.f21640o;
                    i27.setBounds(0, 0, i28, i28);
                    z0Var.f21634f = i27;
                    kotlin.jvm.internal.o.g(key, "key");
                    if (!r26.n0.N(key)) {
                        android.util.LruCache lruCache2 = bk4.z0.f21633u;
                        lruCache2.put(key, i27);
                        lruCache2.size();
                    }
                }
                z0Var.f21642q = true;
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace(z0Var.f21644s, th6, "handleBitmap err", new java.lang.Object[0]);
            }
            java.lang.ref.WeakReference weakReference = this.f21625d.f21643r;
            if (weakReference != null && (j0Var = (bi4.j0) weakReference.get()) != null) {
                android.view.View view = j0Var.getView();
                java.lang.Object tag = view != null ? view.getTag(com.tencent.mm.R.id.nwm) : null;
                java.util.Set set = kotlin.jvm.internal.m0.i(tag) ? (java.util.Set) tag : null;
                if (set != null && set.contains(this.f21625d.f21635g)) {
                    j0Var.a();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
