package s5;

/* loaded from: classes13.dex */
public final class g implements s5.c {

    /* renamed from: e, reason: collision with root package name */
    public static final android.os.Handler f484550e = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    public final a6.d0 f484551a;

    /* renamed from: b, reason: collision with root package name */
    public final s5.a f484552b;

    /* renamed from: c, reason: collision with root package name */
    public final x.o f484553c;

    /* renamed from: d, reason: collision with root package name */
    public int f484554d;

    public g(a6.d0 weakMemoryCache, s5.a bitmapPool, h6.k kVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weakMemoryCache, "weakMemoryCache");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmapPool, "bitmapPool");
        this.f484551a = weakMemoryCache;
        this.f484552b = bitmapPool;
        this.f484553c = new x.o();
    }

    @Override // s5.c
    public synchronized void a(android.graphics.Bitmap bitmap, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        int identityHashCode = java.lang.System.identityHashCode(bitmap);
        if (!z17) {
            s5.h e17 = e(identityHashCode, bitmap);
            if (e17 == null) {
                e17 = new s5.h(new java.lang.ref.WeakReference(bitmap), 0, false);
                this.f484553c.g(identityHashCode, e17);
            }
            e17.f484559c = false;
        } else if (e(identityHashCode, bitmap) == null) {
            this.f484553c.g(identityHashCode, new s5.h(new java.lang.ref.WeakReference(bitmap), 0, true));
        }
        d();
    }

    @Override // s5.c
    public synchronized boolean b(final android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        int identityHashCode = java.lang.System.identityHashCode(bitmap);
        s5.h e17 = e(identityHashCode, bitmap);
        boolean z17 = false;
        if (e17 == null) {
            return false;
        }
        int i17 = e17.f484558b - 1;
        e17.f484558b = i17;
        if (i17 <= 0 && e17.f484559c) {
            z17 = true;
        }
        if (z17) {
            x.o oVar = this.f484553c;
            int a17 = x.e.a(oVar.f532382e, oVar.f532384g, identityHashCode);
            if (a17 >= 0) {
                java.lang.Object[] objArr = oVar.f532383f;
                java.lang.Object obj = objArr[a17];
                java.lang.Object obj2 = x.o.f532380h;
                if (obj != obj2) {
                    objArr[a17] = obj2;
                    oVar.f532381d = true;
                }
            }
            this.f484551a.d(bitmap);
            f484550e.post(new java.lang.Runnable() { // from class: s5.g$$a
                @Override // java.lang.Runnable
                public final void run() {
                    s5.g this$0 = s5.g.this;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
                    android.graphics.Bitmap bitmap2 = bitmap;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap2, "$bitmap");
                    this$0.f484552b.b(bitmap2);
                }
            });
        }
        d();
        return z17;
    }

    @Override // s5.c
    public synchronized void c(android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        int identityHashCode = java.lang.System.identityHashCode(bitmap);
        s5.h e17 = e(identityHashCode, bitmap);
        if (e17 == null) {
            e17 = new s5.h(new java.lang.ref.WeakReference(bitmap), 0, false);
            this.f484553c.g(identityHashCode, e17);
        }
        e17.f484558b++;
        d();
    }

    public final void d() {
        int i17 = this.f484554d;
        this.f484554d = i17 + 1;
        if (i17 < 50) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        x.o oVar = this.f484553c;
        int h17 = oVar.h();
        int i18 = 0;
        if (h17 > 0) {
            int i19 = 0;
            while (true) {
                int i27 = i19 + 1;
                if (((s5.h) oVar.i(i19)).f484557a.get() == null) {
                    arrayList.add(java.lang.Integer.valueOf(i19));
                }
                if (i27 >= h17) {
                    break;
                } else {
                    i19 = i27;
                }
            }
        }
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i28 = i18 + 1;
            int intValue = ((java.lang.Number) arrayList.get(i18)).intValue();
            java.lang.Object[] objArr = oVar.f532383f;
            java.lang.Object obj = objArr[intValue];
            java.lang.Object obj2 = x.o.f532380h;
            if (obj != obj2) {
                objArr[intValue] = obj2;
                oVar.f532381d = true;
            }
            if (i28 > size) {
                return;
            } else {
                i18 = i28;
            }
        }
    }

    public final s5.h e(int i17, android.graphics.Bitmap bitmap) {
        s5.h hVar = (s5.h) this.f484553c.e(i17, null);
        if (hVar == null) {
            return null;
        }
        if (hVar.f484557a.get() == bitmap) {
            return hVar;
        }
        return null;
    }
}
