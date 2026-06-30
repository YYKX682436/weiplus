package m95;

/* loaded from: classes13.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static volatile m95.h f406637a;

    /* renamed from: b, reason: collision with root package name */
    public static android.util.LongSparseArray[] f406638b;

    /* renamed from: c, reason: collision with root package name */
    public static android.util.LongSparseArray f406639c;

    /* renamed from: d, reason: collision with root package name */
    public static m95.j f406640d;

    /* renamed from: e, reason: collision with root package name */
    public static m95.j f406641e;

    /* renamed from: f, reason: collision with root package name */
    public static android.util.LongSparseArray f406642f;

    /* renamed from: g, reason: collision with root package name */
    public static m95.f f406643g;

    /* renamed from: h, reason: collision with root package name */
    public static android.app.Application f406644h;

    /* renamed from: i, reason: collision with root package name */
    public static android.content.res.Resources f406645i;

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.String f406646j;

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.Class f406647k;

    /* renamed from: l, reason: collision with root package name */
    public static volatile boolean f406648l;

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Map f406649m = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.ThreadLocal f406650n = new java.lang.ThreadLocal();

    /* renamed from: o, reason: collision with root package name */
    public static final boolean f406651o = "xiaomi".equalsIgnoreCase(android.os.Build.BRAND);

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f406652p = new byte[0];

    /* renamed from: q, reason: collision with root package name */
    public static android.util.TypedValue f406653q = new android.util.TypedValue();

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.reflect.Method f406654r = null;

    /* renamed from: s, reason: collision with root package name */
    public static java.lang.reflect.Method f406655s = null;

    public static m95.g a(long j17, m95.i iVar) {
        android.util.LongSparseArray longSparseArray;
        android.util.TypedValue typedValue;
        m95.g gVar;
        try {
            longSparseArray = f406642f;
        } catch (java.lang.Throwable th6) {
            n95.d.c("MicroMsg.SVGResourceLoader", th6, "", new java.lang.Object[0]);
            return null;
        }
        if (longSparseArray == null || longSparseArray.indexOfKey(j17) < 0) {
            byte[] bArr = f406652p;
            synchronized (bArr) {
                typedValue = f406653q;
                if (typedValue != null) {
                    f406653q = null;
                } else {
                    typedValue = null;
                }
            }
            if (typedValue == null) {
                typedValue = new android.util.TypedValue();
            }
            try {
                iVar.f406634c.getValue(iVar.f406632a, typedValue, true);
                long j18 = typedValue.assetCookie << 32;
                int i17 = typedValue.data;
                if (j17 == (j18 | i17)) {
                    synchronized (bArr) {
                        if (f406653q == null) {
                            f406653q = typedValue;
                        }
                    }
                    return null;
                }
                synchronized (bArr) {
                    if (f406653q == null) {
                        f406653q = typedValue;
                    }
                }
                java.lang.Object[] objArr = {java.lang.Integer.valueOf(iVar.f406632a), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17)};
                if (n95.d.f417463a != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SVGResourceLoader", "Found a res need justify, %s %s %s", objArr);
                }
                if (f406643g == null) {
                    f406643g = new m95.f();
                }
                java.lang.String a17 = f406643g.a(f406645i.getAssets(), j17);
                if (a17 == null) {
                    return null;
                }
                if (a17.endsWith(".svg")) {
                    java.lang.String substring = a17.substring(a17.lastIndexOf("/") + 1, a17.lastIndexOf("."));
                    int identifier = iVar.f406634c.getIdentifier(substring, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55633x65da3463, f406644h.getPackageName());
                    if (identifier == 0) {
                        n95.d.b("MicroMsg.SVGResourceLoader", "Justified SVG failed, %s %s %s", java.lang.Integer.valueOf(identifier), java.lang.Long.valueOf(j17), substring);
                        return null;
                    }
                    if (f406642f == null) {
                        f406642f = new android.util.LongSparseArray();
                    }
                    m95.g gVar2 = new m95.g(new m95.i(identifier, iVar.f406634c, j17, i17), false);
                    n95.d.b("MicroMsg.SVGResourceLoader", "Justified SVG done, %s %s %s", java.lang.Integer.valueOf(identifier), java.lang.Long.valueOf(j17), substring);
                    f406642f.put(j17, gVar2);
                    return gVar2;
                }
                n95.d.b("MicroMsg.SVGResourceLoader", "Found a res not SVG, %s %s", java.lang.Long.valueOf(j17), a17);
                gVar = new m95.g(null, true);
            } catch (java.lang.Throwable th7) {
                synchronized (f406652p) {
                    if (f406653q == null) {
                        f406653q = typedValue;
                    }
                    throw th7;
                }
            }
            n95.d.c("MicroMsg.SVGResourceLoader", th6, "", new java.lang.Object[0]);
            return null;
        }
        gVar = (m95.g) f406642f.get(j17);
        return gVar;
    }

    public static void b(android.app.Application application, android.content.res.Resources resources, int i17, android.util.TypedValue typedValue) {
        if (i17 == 0) {
            n95.d.a("MicroMsg.SVGResourceLoader", "preloadDrawable Why this id is %d. TypedValue %s", java.lang.Integer.valueOf(i17), typedValue);
            n95.d.b("MicroMsg.SVGResourceLoader", android.util.Log.getStackTraceString(new java.lang.Throwable()), new java.lang.Object[0]);
        }
        resources.getValue(i17, typedValue, true);
        long j17 = (typedValue.assetCookie << 32) | typedValue.data;
        m95.i iVar = new m95.i(i17, application.getResources(), j17, typedValue.data);
        synchronized (f406639c) {
            f406639c.put(j17, iVar);
        }
    }

    public static void c(android.content.Context context, java.lang.Object obj) {
        java.lang.reflect.Field field;
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("obj cannot be null");
        }
        java.lang.Class<?> cls = obj.getClass();
        while (true) {
            if (cls == null) {
                field = null;
                break;
            }
            try {
                field = cls.getDeclaredField("sPreloadedDrawables");
                field.setAccessible(true);
                break;
            } catch (java.lang.Exception unused) {
            } finally {
                cls.getSuperclass();
            }
        }
        if (field == null) {
            throw new java.lang.NoSuchFieldException();
        }
        try {
            java.lang.Object obj2 = field.get(obj);
            if (obj2 == null) {
                n95.d.a("MicroMsg.SVGResourceLoader", "mResourcePreloadDrawable is null!! OMG!!!", new java.lang.Object[0]);
                return;
            }
            if (obj2 instanceof android.util.LongSparseArray[]) {
                android.util.LongSparseArray[] longSparseArrayArr = (android.util.LongSparseArray[]) obj2;
                f406638b = longSparseArrayArr;
                android.util.LongSparseArray longSparseArray = longSparseArrayArr[0];
                for (int i17 = 0; i17 < f406638b[0].size(); i17++) {
                    long keyAt = f406638b[0].keyAt(i17);
                    f406640d.put(keyAt, (android.graphics.drawable.Drawable.ConstantState) f406638b[0].get(keyAt));
                }
                for (int i18 = 0; i18 < f406638b[1].size(); i18++) {
                    long keyAt2 = f406638b[1].keyAt(i18);
                    f406641e.put(keyAt2, (android.graphics.drawable.Drawable.ConstantState) f406638b[1].get(keyAt2));
                }
                android.util.LongSparseArray[] longSparseArrayArr2 = f406638b;
                longSparseArrayArr2[0] = f406640d;
                longSparseArrayArr2[1] = f406641e;
                return;
            }
            if (!(obj2 instanceof android.util.LongSparseArray)) {
                n95.d.a("MicroMsg.SVGResourceLoader", "mResourcePreloadDrawable is others!! OMG!", new java.lang.Object[0]);
                return;
            }
            n95.a aVar = new n95.a(context.getResources(), "sPreloadedDrawables", null);
            android.util.LongSparseArray longSparseArray2 = (android.util.LongSparseArray) aVar.a();
            for (int i19 = 0; i19 < longSparseArray2.size(); i19++) {
                long keyAt3 = longSparseArray2.keyAt(i19);
                f406640d.put(keyAt3, (android.graphics.drawable.Drawable.ConstantState) longSparseArray2.get(keyAt3));
            }
            m95.j jVar = f406640d;
            aVar.b();
            java.lang.reflect.Field field2 = aVar.f417458d;
            if (field2 == null) {
                throw new java.lang.NoSuchFieldException();
            }
            field2.set(aVar.f417455a, jVar);
            if (aVar.a() == null) {
                n95.d.a("MicroMsg.SVGResourceLoader", "resourcePreloadDrawable is null!! OMG!!", new java.lang.Object[0]);
            }
        } catch (java.lang.ClassCastException unused2) {
            throw new java.lang.IllegalArgumentException("unable to cast object");
        }
    }

    public static m95.h d(android.app.Application application, android.content.res.Resources resources) {
        if (f406637a == null) {
            synchronized (m95.k.class) {
                if (f406637a == null) {
                    f406637a = new m95.h(m95.a.f406603d, application, resources);
                }
            }
        }
        return f406637a;
    }

    public static void e(android.app.Application application, java.lang.String str) {
        f406646j = str;
        m95.a.f406602c = str;
        float f17 = application.getResources().getDisplayMetrics().density;
        if (m95.a.f406606g == null) {
            m95.a.f406606g = java.lang.Float.valueOf(f17 / 3.0f);
        }
        m95.a.f406606g.floatValue();
        if (m95.a.f406607h == null) {
            m95.a.f406607h = java.lang.Float.valueOf(f17 / 1.0f);
        }
        m95.a.f406607h.floatValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SVGCompat", "initDensity -> %s", java.lang.Float.valueOf(f17));
        n95.b.f417459a = str;
        f406644h = application;
        j(application);
    }

    public static android.graphics.drawable.Drawable f(android.content.res.Resources resources, int i17) {
        android.graphics.drawable.Drawable createFromResourceStream;
        android.util.TypedValue typedValue = new android.util.TypedValue();
        resources.getValue(i17, typedValue, true);
        int i18 = typedValue.type;
        android.graphics.drawable.ColorDrawable colorDrawable = i18 >= 28 && i18 <= 31 ? new android.graphics.drawable.ColorDrawable(typedValue.data) : null;
        if (f406654r == null) {
            try {
                java.lang.Class cls = java.lang.Integer.TYPE;
                java.lang.reflect.Method declaredMethod = android.content.res.Resources.class.getDeclaredMethod("loadXmlResourceParser", java.lang.String.class, cls, cls, java.lang.String.class);
                f406654r = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SVGResourceLoader", e17, "", new java.lang.Object[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SVGResourceLoader", e17, "", new java.lang.Object[0]);
                return null;
            }
        }
        if (f406655s == null) {
            try {
                java.lang.Class cls2 = java.lang.Integer.TYPE;
                java.lang.reflect.Method declaredMethod2 = android.content.res.AssetManager.class.getDeclaredMethod("openNonAsset", cls2, java.lang.String.class, cls2);
                f406655s = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (java.lang.NoSuchMethodException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SVGResourceLoader", e18, "", new java.lang.Object[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SVGResourceLoader", e18, "", new java.lang.Object[0]);
                return null;
            }
        }
        if (colorDrawable != null) {
            return colorDrawable;
        }
        java.lang.CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new android.content.res.Resources.NotFoundException("Resource is not a Drawable (color or path): " + typedValue);
        }
        java.lang.String charSequence2 = charSequence.toString();
        if (charSequence2.endsWith(".xml")) {
            try {
                android.content.res.XmlResourceParser xmlResourceParser = (android.content.res.XmlResourceParser) f406654r.invoke(resources, charSequence2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(typedValue.assetCookie), "drawable");
                createFromResourceStream = android.graphics.drawable.Drawable.createFromXml(resources, xmlResourceParser);
                xmlResourceParser.close();
            } catch (java.lang.Exception e19) {
                android.content.res.Resources.NotFoundException notFoundException = new android.content.res.Resources.NotFoundException("File " + charSequence2 + " from drawable resource ID #0x" + java.lang.Integer.toHexString(i17));
                notFoundException.initCause(e19);
                throw notFoundException;
            }
        } else {
            try {
                java.io.InputStream inputStream = (java.io.InputStream) f406655s.invoke(resources.getAssets(), java.lang.Integer.valueOf(typedValue.assetCookie), charSequence2, 2);
                createFromResourceStream = android.graphics.drawable.Drawable.createFromResourceStream(resources, typedValue, inputStream, charSequence2, null);
                inputStream.close();
            } catch (java.lang.Exception e27) {
                android.content.res.Resources.NotFoundException notFoundException2 = new android.content.res.Resources.NotFoundException("File " + charSequence2 + " from drawable resource ID #0x" + java.lang.Integer.toHexString(i17));
                notFoundException2.initCause(e27);
                throw notFoundException2;
            }
        }
        return createFromResourceStream;
    }

    public static void g(android.app.Application application, android.content.res.Resources resources, java.lang.Class cls) {
        f406644h = application;
        f406645i = resources;
        if (cls == null) {
            return;
        }
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            ((m95.e) cls.newInstance()).mo43367x32c4e6(d(application, f406645i));
            n95.d.b("MicroMsg.SVGResourceLoader", "SVGCode wrapper size %s, spent %s", java.lang.Integer.valueOf(d(application, f406645i).f406631d.size()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (android.content.res.Resources.NotFoundException e17) {
            n95.d.c("MicroMsg.SVGResourceLoader", e17, "We found one NotFoundException.", new java.lang.Object[0]);
        }
    }

    public static void h(android.app.Application application, android.content.res.Resources resources) {
        java.lang.Class<?> cls = f406647k;
        if (cls == null) {
            try {
                cls = java.lang.Class.forName(f406646j + ".R$raw");
            } catch (java.lang.ClassNotFoundException unused) {
                java.lang.Object a17 = n95.b.a("WxSVGRawClass");
                cls = a17 != null ? (java.lang.Class) a17 : null;
                if (cls == null) {
                    cls = null;
                }
            }
        }
        if (cls == null) {
            n95.d.a("MicroMsg.SVGResourceLoader", "Raw class is null!", new java.lang.Object[0]);
            return;
        }
        java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
        m95.h d17 = d(application, resources);
        try {
            m95.a aVar = new m95.a();
            for (java.lang.reflect.Field field : declaredFields) {
                int i17 = field.getInt(null);
                if (aVar.g(application.getResources(), i17)) {
                    b(d17.f406628a, d17.f406629b, i17, d17.f406630c);
                }
            }
        } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException unused2) {
        }
    }

    public static boolean i(android.app.Application application, android.content.res.Resources resources) {
        java.lang.String str = f406646j + ".svg.SVGPreload";
        try {
            n95.d.b("MicroMsg.SVGResourceLoader", "try to load SVGPreload", new java.lang.Object[0]);
            java.lang.Class<?> cls = java.lang.Class.forName(str);
            long nanoTime = java.lang.System.nanoTime();
            g(application, resources, cls);
            n95.d.b("MicroMsg.SVGResourceLoader", "load SVGPreload spent %s", java.lang.Long.valueOf((java.lang.System.nanoTime() - nanoTime) / 1000));
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            n95.d.a("MicroMsg.SVGResourceLoader", "ClassNotFoundException %s. Go fallback logic.", str);
            return false;
        } catch (java.lang.IllegalAccessException e17) {
            n95.d.a("MicroMsg.SVGResourceLoader", "IllegalAccessException %s", str);
            n95.d.c("MicroMsg.SVGResourceLoader", e17, "", new java.lang.Object[0]);
            return false;
        } catch (java.lang.InstantiationException e18) {
            n95.d.c("MicroMsg.SVGResourceLoader", e18, "", new java.lang.Object[0]);
            n95.d.a("MicroMsg.SVGResourceLoader", "InstantiationException %s", str);
            return false;
        }
    }

    public static void j(android.content.Context context) {
        if (f406640d == null) {
            try {
                f406639c = new android.util.LongSparseArray();
                m95.j jVar = new m95.j();
                f406640d = jVar;
                jVar.f406636d = f406639c;
                m95.j jVar2 = new m95.j();
                f406641e = jVar2;
                jVar2.f406636d = f406639c;
                n95.a aVar = new n95.a(context.getResources(), "mResourcesImpl", null);
                aVar.b();
                c(context, aVar.f417458d != null ? aVar.a() : context.getResources());
                n95.d.b("MicroMsg.SVGResourceLoader", "SVG this resources %s", context.getResources());
            } catch (java.lang.IllegalAccessException e17) {
                n95.d.c("MicroMsg.SVGResourceLoader", e17, "Call reflectPreloadCache failed. Reason : IllegalAccessException.", new java.lang.Object[0]);
            } catch (java.lang.IllegalArgumentException e18) {
                n95.d.c("MicroMsg.SVGResourceLoader", e18, "Call reflectPreloadCache failed. Reason : IllegalArgumentException.", new java.lang.Object[0]);
            } catch (java.lang.NoSuchFieldException e19) {
                n95.d.c("MicroMsg.SVGResourceLoader", e19, "Call reflectPreloadCache failed. Reason : NoSuchFieldException.", new java.lang.Object[0]);
            }
        }
    }
}
