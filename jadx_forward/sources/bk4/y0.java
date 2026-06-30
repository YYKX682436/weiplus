package bk4;

/* loaded from: classes11.dex */
public final class y0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk4.z0 f103158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pj4.o1 f103159e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pj4.g0 f103160f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f103161g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f103162h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(bk4.z0 z0Var, pj4.o1 o1Var, pj4.g0 g0Var, java.lang.String str, boolean z17) {
        super(1);
        this.f103158d = z0Var;
        this.f103159e = o1Var;
        this.f103160f = g0Var;
        this.f103161g = str;
        this.f103162h = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        bi4.j0 j0Var;
        int i17;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (!this.f103158d.f103175q && bitmap != null && !bitmap.isRecycled()) {
            bk4.z0 z0Var = this.f103158d;
            pj4.o1 o1Var = this.f103159e;
            pj4.g0 g0Var = this.f103160f;
            java.lang.String key = this.f103161g;
            boolean z17 = this.f103162h;
            z0Var.getClass();
            bk4.w0 w0Var = bk4.z0.f103165t;
            try {
                if (z17) {
                    int i18 = (z0Var.f103173o * 5) / 4;
                    java.lang.String str = g0Var.f436579d + z0Var.f103168g;
                    vo0.d dVar = vi4.e.f519142a;
                    kk.j jVar = vi4.e.f519143b;
                    android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) ((jt0.i) jVar).get(str);
                    if (bitmap2 == null) {
                        android.graphics.Bitmap b17 = (o1Var.f436764g != 0 || bk4.g0.j(g0Var)) ? bitmap : z0Var.b(bitmap, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560080ah));
                        java.lang.Object mo141623x754a37bb = ((jz5.n) vi4.e.f519144c).mo141623x754a37bb();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
                        int i19 = z0Var.f103173o;
                        i17 = i18;
                        bitmap2 = z0Var.a(b17, i19, (android.graphics.Bitmap) mo141623x754a37bb, i19 / 2, (i19 / 4) * 3, i18, i19);
                        ((jt0.i) jVar).put(str, bitmap2);
                    } else {
                        i17 = i18;
                    }
                    android.graphics.drawable.Drawable bitmapDrawable = bitmap2 != null ? new android.graphics.drawable.BitmapDrawable(bitmap2) : bk4.i.a().i(bitmap, bk4.g0.j(g0Var), z0Var.f103171m, z0Var.f103172n);
                    bitmapDrawable.setBounds(0, 0, i17, z0Var.f103173o);
                    z0Var.f103167f = bitmapDrawable;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
                    if (!r26.n0.N(key)) {
                        android.util.LruCache lruCache = bk4.z0.f103166u;
                        lruCache.put(key, bitmapDrawable);
                        lruCache.size();
                    }
                } else {
                    android.graphics.drawable.Drawable i27 = bk4.i.a().i(bitmap, bk4.g0.j(g0Var), z0Var.f103171m, z0Var.f103172n);
                    int i28 = z0Var.f103173o;
                    i27.setBounds(0, 0, i28, i28);
                    z0Var.f103167f = i27;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
                    if (!r26.n0.N(key)) {
                        android.util.LruCache lruCache2 = bk4.z0.f103166u;
                        lruCache2.put(key, i27);
                        lruCache2.size();
                    }
                }
                z0Var.f103175q = true;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(z0Var.f103177s, th6, "handleBitmap err", new java.lang.Object[0]);
            }
            java.lang.ref.WeakReference weakReference = this.f103158d.f103176r;
            if (weakReference != null && (j0Var = (bi4.j0) weakReference.get()) != null) {
                android.view.View mo10619xfb86a31b = j0Var.mo10619xfb86a31b();
                java.lang.Object tag = mo10619xfb86a31b != null ? mo10619xfb86a31b.getTag(com.p314xaae8f345.mm.R.id.nwm) : null;
                java.util.Set set = p3321xbce91901.jvm.p3324x21ffc6bd.m0.i(tag) ? (java.util.Set) tag : null;
                if (set != null && set.contains(this.f103158d.f103168g)) {
                    j0Var.a();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
