package com.p147xb1cd08cc.p148x5de23a5;

/* loaded from: classes13.dex */
public class c implements android.content.ComponentCallbacks2 {

    /* renamed from: o, reason: collision with root package name */
    public static volatile com.p147xb1cd08cc.p148x5de23a5.c f125453o;

    /* renamed from: p, reason: collision with root package name */
    public static volatile boolean f125454p;

    /* renamed from: d, reason: collision with root package name */
    public final x6.d f125455d;

    /* renamed from: e, reason: collision with root package name */
    public final y6.o f125456e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p147xb1cd08cc.p148x5de23a5.f f125457f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p147xb1cd08cc.p148x5de23a5.m f125458g;

    /* renamed from: h, reason: collision with root package name */
    public final x6.b f125459h;

    /* renamed from: i, reason: collision with root package name */
    public final j7.q f125460i;

    /* renamed from: m, reason: collision with root package name */
    public final j7.e f125461m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f125462n = new java.util.ArrayList();

    public c(android.content.Context context, w6.g0 g0Var, y6.o oVar, x6.d dVar, x6.b bVar, j7.q qVar, j7.e eVar, int i17, com.p147xb1cd08cc.p148x5de23a5.b bVar2, java.util.Map map, java.util.List list, boolean z17, boolean z18, int i18, int i19) {
        t6.n gVar;
        t6.n l0Var;
        this.f125455d = dVar;
        this.f125459h = bVar;
        this.f125456e = oVar;
        this.f125460i = qVar;
        this.f125461m = eVar;
        android.content.res.Resources resources = context.getResources();
        com.p147xb1cd08cc.p148x5de23a5.m mVar = new com.p147xb1cd08cc.p148x5de23a5.m();
        this.f125458g = mVar;
        d7.p pVar = new d7.p();
        l7.c cVar = mVar.f125498g;
        synchronized (cVar) {
            ((java.util.ArrayList) cVar.f398313a).add(pVar);
        }
        int i27 = android.os.Build.VERSION.SDK_INT;
        if (i27 >= 27) {
            d7.c0 c0Var = new d7.c0();
            l7.c cVar2 = mVar.f125498g;
            synchronized (cVar2) {
                ((java.util.ArrayList) cVar2.f398313a).add(c0Var);
            }
        }
        java.util.List d17 = mVar.d();
        h7.c cVar3 = new h7.c(context, d17, dVar, bVar);
        d7.w0 w0Var = new d7.w0(dVar, new d7.v0());
        if (!z18 || i27 < 28) {
            d7.y yVar = new d7.y(mVar.d(), resources.getDisplayMetrics(), dVar, bVar);
            gVar = new d7.g(yVar);
            l0Var = new d7.l0(yVar, bVar);
        } else {
            l0Var = new d7.f0();
            gVar = new d7.h();
        }
        f7.d dVar2 = new f7.d(context);
        a7.c1 c1Var = new a7.c1(resources);
        a7.d1 d1Var = new a7.d1(resources);
        a7.b1 b1Var = new a7.b1(resources);
        a7.a1 a1Var = new a7.a1(resources);
        d7.c cVar4 = new d7.c(bVar);
        i7.a aVar = new i7.a();
        i7.d dVar3 = new i7.d();
        android.content.ContentResolver contentResolver = context.getContentResolver();
        a7.l lVar = new a7.l();
        l7.b bVar3 = mVar.f125493b;
        synchronized (bVar3) {
            ((java.util.ArrayList) bVar3.f398312a).add(new l7.a(java.nio.ByteBuffer.class, lVar));
        }
        a7.f1 f1Var = new a7.f1(bVar);
        l7.b bVar4 = mVar.f125493b;
        synchronized (bVar4) {
            ((java.util.ArrayList) bVar4.f398312a).add(new l7.a(java.io.InputStream.class, f1Var));
        }
        mVar.c("Bitmap", java.nio.ByteBuffer.class, android.graphics.Bitmap.class, gVar);
        mVar.c("Bitmap", java.io.InputStream.class, android.graphics.Bitmap.class, l0Var);
        mVar.c("Bitmap", android.os.ParcelFileDescriptor.class, android.graphics.Bitmap.class, w0Var);
        mVar.c("Bitmap", android.content.res.AssetFileDescriptor.class, android.graphics.Bitmap.class, new d7.w0(dVar, new d7.s0(null)));
        a7.k1 k1Var = a7.k1.f83369a;
        mVar.a(android.graphics.Bitmap.class, android.graphics.Bitmap.class, k1Var);
        mVar.c("Bitmap", android.graphics.Bitmap.class, android.graphics.Bitmap.class, new d7.p0());
        mVar.b(android.graphics.Bitmap.class, cVar4);
        mVar.c("BitmapDrawable", java.nio.ByteBuffer.class, android.graphics.drawable.BitmapDrawable.class, new d7.a(resources, gVar));
        mVar.c("BitmapDrawable", java.io.InputStream.class, android.graphics.drawable.BitmapDrawable.class, new d7.a(resources, l0Var));
        mVar.c("BitmapDrawable", android.os.ParcelFileDescriptor.class, android.graphics.drawable.BitmapDrawable.class, new d7.a(resources, w0Var));
        mVar.b(android.graphics.drawable.BitmapDrawable.class, new d7.b(dVar, cVar4));
        mVar.c("Gif", java.io.InputStream.class, h7.f.class, new h7.p(d17, cVar3, bVar));
        mVar.c("Gif", java.nio.ByteBuffer.class, h7.f.class, cVar3);
        mVar.b(h7.f.class, new h7.g());
        mVar.a(s6.b.class, s6.b.class, k1Var);
        mVar.c("Bitmap", s6.b.class, android.graphics.Bitmap.class, new h7.n(dVar));
        mVar.c("legacy_append", android.net.Uri.class, android.graphics.drawable.Drawable.class, dVar2);
        mVar.c("legacy_append", android.net.Uri.class, android.graphics.Bitmap.class, new d7.j0(dVar2, dVar));
        e7.a aVar2 = new e7.a();
        u6.j jVar = mVar.f125496e;
        synchronized (jVar) {
            ((java.util.HashMap) jVar.f506382a).put(java.nio.ByteBuffer.class, aVar2);
        }
        mVar.a(java.io.File.class, java.nio.ByteBuffer.class, new a7.n());
        mVar.a(java.io.File.class, java.io.InputStream.class, new a7.a0());
        mVar.c("legacy_append", java.io.File.class, java.io.File.class, new g7.a());
        mVar.a(java.io.File.class, android.os.ParcelFileDescriptor.class, new a7.w());
        mVar.a(java.io.File.class, java.io.File.class, k1Var);
        u6.p pVar2 = new u6.p(bVar);
        u6.j jVar2 = mVar.f125496e;
        synchronized (jVar2) {
            ((java.util.HashMap) jVar2.f506382a).put(java.io.InputStream.class, pVar2);
        }
        java.lang.Class cls = java.lang.Integer.TYPE;
        mVar.a(cls, java.io.InputStream.class, c1Var);
        mVar.a(cls, android.os.ParcelFileDescriptor.class, b1Var);
        mVar.a(java.lang.Integer.class, java.io.InputStream.class, c1Var);
        mVar.a(java.lang.Integer.class, android.os.ParcelFileDescriptor.class, b1Var);
        mVar.a(java.lang.Integer.class, android.net.Uri.class, d1Var);
        mVar.a(cls, android.content.res.AssetFileDescriptor.class, a1Var);
        mVar.a(java.lang.Integer.class, android.content.res.AssetFileDescriptor.class, a1Var);
        mVar.a(cls, android.net.Uri.class, d1Var);
        mVar.a(java.lang.String.class, java.io.InputStream.class, new a7.s());
        mVar.a(android.net.Uri.class, java.io.InputStream.class, new a7.s());
        mVar.a(java.lang.String.class, java.io.InputStream.class, new a7.i1());
        mVar.a(java.lang.String.class, android.os.ParcelFileDescriptor.class, new a7.h1());
        mVar.a(java.lang.String.class, android.content.res.AssetFileDescriptor.class, new a7.g1());
        mVar.a(android.net.Uri.class, java.io.InputStream.class, new b7.c());
        mVar.a(android.net.Uri.class, java.io.InputStream.class, new a7.c(context.getAssets()));
        mVar.a(android.net.Uri.class, android.os.ParcelFileDescriptor.class, new a7.b(context.getAssets()));
        mVar.a(android.net.Uri.class, java.io.InputStream.class, new b7.e(context));
        mVar.a(android.net.Uri.class, java.io.InputStream.class, new b7.g(context));
        mVar.a(android.net.Uri.class, java.io.InputStream.class, new a7.q1(contentResolver));
        mVar.a(android.net.Uri.class, android.os.ParcelFileDescriptor.class, new a7.o1(contentResolver));
        mVar.a(android.net.Uri.class, android.content.res.AssetFileDescriptor.class, new a7.n1(contentResolver));
        mVar.a(android.net.Uri.class, java.io.InputStream.class, new a7.s1());
        mVar.a(java.net.URL.class, java.io.InputStream.class, new b7.i());
        mVar.a(android.net.Uri.class, java.io.File.class, new a7.i0(context));
        mVar.a(a7.c0.class, java.io.InputStream.class, new b7.a());
        mVar.a(byte[].class, java.nio.ByteBuffer.class, new a7.f());
        mVar.a(byte[].class, java.io.InputStream.class, new a7.j());
        mVar.a(android.net.Uri.class, android.net.Uri.class, k1Var);
        mVar.a(android.graphics.drawable.Drawable.class, android.graphics.drawable.Drawable.class, k1Var);
        mVar.c("legacy_append", android.graphics.drawable.Drawable.class, android.graphics.drawable.Drawable.class, new f7.e());
        mVar.f(android.graphics.Bitmap.class, android.graphics.drawable.BitmapDrawable.class, new i7.b(resources));
        mVar.f(android.graphics.Bitmap.class, byte[].class, aVar);
        mVar.f(android.graphics.drawable.Drawable.class, byte[].class, new i7.c(dVar, aVar, dVar3));
        mVar.f(h7.f.class, byte[].class, dVar3);
        this.f125457f = new com.p147xb1cd08cc.p148x5de23a5.f(context, bVar, mVar, new n7.f(), bVar2, map, list, g0Var, z17, i17);
    }

    public static void a(android.content.Context context, com.p147xb1cd08cc.p148x5de23a5.AbstractC1426x60c9bcdf abstractC1426x60c9bcdf) {
        if (f125454p) {
            throw new java.lang.IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        f125454p = true;
        com.p147xb1cd08cc.p148x5de23a5.e eVar = new com.p147xb1cd08cc.p148x5de23a5.e();
        android.content.Context applicationContext = context.getApplicationContext();
        java.util.Collections.emptyList();
        android.util.Log.isLoggable("ManifestParser", 3);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            android.content.pm.ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                android.util.Log.isLoggable("ManifestParser", 3);
            } else {
                if (android.util.Log.isLoggable("ManifestParser", 2)) {
                    java.util.Objects.toString(applicationInfo.metaData);
                }
                for (java.lang.String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        k7.d.a(str);
                        throw null;
                    }
                }
                android.util.Log.isLoggable("ManifestParser", 3);
            }
            if (abstractC1426x60c9bcdf != null && !abstractC1426x60c9bcdf.a().isEmpty()) {
                abstractC1426x60c9bcdf.a();
                java.util.Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
                    throw null;
                }
            }
            if (android.util.Log.isLoggable("Glide", 3)) {
                java.util.Iterator it6 = arrayList.iterator();
                if (it6.hasNext()) {
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it6.next());
                    throw null;
                }
            }
            eVar.f125474l = null;
            java.util.Iterator it7 = arrayList.iterator();
            if (it7.hasNext()) {
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it7.next());
                throw null;
            }
            z6.e eVar2 = eVar.f125468f;
            z6.d dVar = z6.d.f551841a;
            if (eVar2 == null) {
                if (z6.e.f551843f == 0) {
                    z6.e.f551843f = java.lang.Math.min(4, java.lang.Runtime.getRuntime().availableProcessors());
                }
                int i17 = z6.e.f551843f;
                eVar.f125468f = new z6.e(new java.util.concurrent.ThreadPoolExecutor(i17, i17, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.PriorityBlockingQueue(), new z6.b(ya.b.f77502x92235c1b, dVar, false)));
            }
            if (eVar.f125469g == null) {
                eVar.f125469g = new z6.e(new java.util.concurrent.ThreadPoolExecutor(1, 1, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.PriorityBlockingQueue(), new z6.b("disk-cache", dVar, true)));
            }
            if (eVar.f125475m == null) {
                if (z6.e.f551843f == 0) {
                    z6.e.f551843f = java.lang.Math.min(4, java.lang.Runtime.getRuntime().availableProcessors());
                }
                int i18 = z6.e.f551843f >= 4 ? 2 : 1;
                eVar.f125475m = new z6.e(new java.util.concurrent.ThreadPoolExecutor(i18, i18, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.PriorityBlockingQueue(), new z6.b("animation", dVar, true)));
            }
            if (eVar.f125471i == null) {
                eVar.f125471i = new y6.s(new y6.p(applicationContext));
            }
            if (eVar.f125472j == null) {
                eVar.f125472j = new j7.h();
            }
            if (eVar.f125465c == null) {
                int i19 = eVar.f125471i.f541141a;
                if (i19 > 0) {
                    eVar.f125465c = new x6.o(i19);
                } else {
                    eVar.f125465c = new x6.e();
                }
            }
            if (eVar.f125466d == null) {
                eVar.f125466d = new x6.l(eVar.f125471i.f541143c);
            }
            if (eVar.f125467e == null) {
                eVar.f125467e = new y6.m(eVar.f125471i.f541142b);
            }
            if (eVar.f125470h == null) {
                eVar.f125470h = new y6.l(applicationContext);
            }
            if (eVar.f125464b == null) {
                eVar.f125464b = new w6.g0(eVar.f125467e, eVar.f125470h, eVar.f125469g, eVar.f125468f, new z6.e(new java.util.concurrent.ThreadPoolExecutor(0, Integer.MAX_VALUE, z6.e.f551842e, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.SynchronousQueue(), new z6.b("source-unlimited", dVar, false))), eVar.f125475m, false);
            }
            java.util.List list = eVar.f125476n;
            if (list == null) {
                eVar.f125476n = java.util.Collections.emptyList();
            } else {
                eVar.f125476n = java.util.Collections.unmodifiableList(list);
            }
            com.p147xb1cd08cc.p148x5de23a5.c cVar = new com.p147xb1cd08cc.p148x5de23a5.c(applicationContext, eVar.f125464b, eVar.f125467e, eVar.f125465c, eVar.f125466d, new j7.q(eVar.f125474l), eVar.f125472j, 4, eVar.f125473k, eVar.f125463a, eVar.f125476n, false, false, 700, 128);
            java.util.Iterator it8 = arrayList.iterator();
            if (it8.hasNext()) {
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it8.next());
                throw null;
            }
            applicationContext.registerComponentCallbacks(cVar);
            f125453o = cVar;
            f125454p = false;
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            throw new java.lang.RuntimeException("Unable to find metadata to parse GlideModules", e17);
        }
    }

    public static com.p147xb1cd08cc.p148x5de23a5.c b(android.content.Context context) {
        com.p147xb1cd08cc.p148x5de23a5.AbstractC1426x60c9bcdf abstractC1426x60c9bcdf;
        if (f125453o == null) {
            try {
                abstractC1426x60c9bcdf = (com.p147xb1cd08cc.p148x5de23a5.AbstractC1426x60c9bcdf) java.lang.Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(android.content.Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (java.lang.ClassNotFoundException unused) {
                android.util.Log.isLoggable("Glide", 5);
                abstractC1426x60c9bcdf = null;
            } catch (java.lang.IllegalAccessException e17) {
                throw new java.lang.IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e17);
            } catch (java.lang.InstantiationException e18) {
                throw new java.lang.IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e18);
            } catch (java.lang.NoSuchMethodException e19) {
                throw new java.lang.IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e19);
            } catch (java.lang.reflect.InvocationTargetException e27) {
                throw new java.lang.IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e27);
            }
            synchronized (com.p147xb1cd08cc.p148x5de23a5.c.class) {
                if (f125453o == null) {
                    a(context, abstractC1426x60c9bcdf);
                }
            }
        }
        return f125453o;
    }

    public static com.p147xb1cd08cc.p148x5de23a5.r d(android.content.Context context) {
        if (context != null) {
            return b(context).f125460i.b(context);
        }
        throw new java.lang.NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    public void c(com.p147xb1cd08cc.p148x5de23a5.r rVar) {
        synchronized (this.f125462n) {
            if (!((java.util.ArrayList) this.f125462n).contains(rVar)) {
                throw new java.lang.IllegalStateException("Cannot unregister not yet registered manager");
            }
            ((java.util.ArrayList) this.f125462n).remove(rVar);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        char[] cArr = q7.p.f441843a;
        if (!(android.os.Looper.myLooper() == android.os.Looper.getMainLooper())) {
            throw new java.lang.IllegalArgumentException("You must call this method on the main thread");
        }
        ((q7.k) this.f125456e).d(0L);
        this.f125455d.e();
        x6.l lVar = (x6.l) this.f125459h;
        synchronized (lVar) {
            lVar.b(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        long j17;
        char[] cArr = q7.p.f441843a;
        if (!(android.os.Looper.myLooper() == android.os.Looper.getMainLooper())) {
            throw new java.lang.IllegalArgumentException("You must call this method on the main thread");
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f125462n).iterator();
        while (it.hasNext()) {
            ((com.p147xb1cd08cc.p148x5de23a5.r) it.next()).getClass();
        }
        y6.m mVar = (y6.m) this.f125456e;
        mVar.getClass();
        if (i17 >= 40) {
            mVar.d(0L);
        } else if (i17 >= 20 || i17 == 15) {
            synchronized (mVar) {
                j17 = mVar.f441836b;
            }
            mVar.d(j17 / 2);
        }
        this.f125455d.a(i17);
        x6.l lVar = (x6.l) this.f125459h;
        synchronized (lVar) {
            try {
                if (i17 >= 40) {
                    synchronized (lVar) {
                        lVar.b(0);
                    }
                } else if (i17 >= 20 || i17 == 15) {
                    lVar.b(lVar.f533694e / 2);
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
    }
}
