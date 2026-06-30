package e3;

/* loaded from: classes13.dex */
public class k extends e3.i {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Class f328595f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.reflect.Constructor f328596g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.reflect.Method f328597h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.reflect.Method f328598i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.reflect.Method f328599j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.reflect.Method f328600k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.reflect.Method f328601l;

    public k() {
        java.lang.Class<?> cls;
        java.lang.reflect.Method method;
        java.lang.reflect.Constructor<?> constructor;
        java.lang.reflect.Method method2;
        java.lang.reflect.Method method3;
        java.lang.reflect.Method method4;
        java.lang.reflect.Method method5;
        try {
            cls = java.lang.Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new java.lang.Class[0]);
            method2 = l(cls);
            method3 = m(cls);
            method4 = cls.getMethod("freeze", new java.lang.Class[0]);
            method = cls.getMethod("abortCreation", new java.lang.Class[0]);
            method5 = n(cls);
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f328595f = cls;
        this.f328596g = constructor;
        this.f328597h = method2;
        this.f328598i = method3;
        this.f328599j = method4;
        this.f328600k = method;
        this.f328601l = method5;
    }

    @Override // e3.i, e3.p
    public android.graphics.Typeface a(android.content.Context context, d3.g gVar, android.content.res.Resources resources, int i17) {
        java.lang.Object obj;
        if (!(this.f328597h != null)) {
            return super.a(context, gVar, resources, i17);
        }
        try {
            obj = this.f328596g.newInstance(new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (d3.h hVar : gVar.f307619a) {
            if (!i(context, obj, hVar.f307620a, hVar.f307624e, hVar.f307621b, hVar.f307622c ? 1 : 0, android.graphics.fonts.FontVariationAxis.fromFontVariationSettings(hVar.f307623d))) {
                try {
                    this.f328600k.invoke(obj, new java.lang.Object[0]);
                } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused2) {
                }
                return null;
            }
        }
        if (k(obj)) {
            return j(obj);
        }
        return null;
    }

    @Override // e3.i, e3.p
    public android.graphics.Typeface b(android.content.Context context, android.os.CancellationSignal cancellationSignal, k3.n[] nVarArr, int i17) {
        java.lang.Object obj;
        android.graphics.Typeface j17;
        boolean z17;
        if (nVarArr.length < 1) {
            return null;
        }
        if (this.f328597h != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            for (k3.n nVar : nVarArr) {
                if (nVar.f385340e == 0) {
                    android.net.Uri uri = nVar.f385336a;
                    if (!hashMap.containsKey(uri)) {
                        hashMap.put(uri, e3.r.e(context, cancellationSignal, uri));
                    }
                }
            }
            java.util.Map unmodifiableMap = java.util.Collections.unmodifiableMap(hashMap);
            try {
                obj = this.f328596g.newInstance(new java.lang.Object[0]);
            } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
                obj = null;
            }
            if (obj == null) {
                return null;
            }
            int length = nVarArr.length;
            int i18 = 0;
            boolean z18 = false;
            while (true) {
                java.lang.reflect.Method method = this.f328600k;
                if (i18 >= length) {
                    if (!z18) {
                        try {
                            method.invoke(obj, new java.lang.Object[0]);
                            return null;
                        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused2) {
                            return null;
                        }
                    }
                    if (k(obj) && (j17 = j(obj)) != null) {
                        return android.graphics.Typeface.create(j17, i17);
                    }
                    return null;
                }
                k3.n nVar2 = nVarArr[i18];
                java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) unmodifiableMap.get(nVar2.f385336a);
                if (byteBuffer != null) {
                    try {
                        z17 = ((java.lang.Boolean) this.f328598i.invoke(obj, byteBuffer, java.lang.Integer.valueOf(nVar2.f385337b), null, java.lang.Integer.valueOf(nVar2.f385338c), java.lang.Integer.valueOf(nVar2.f385339d ? 1 : 0))).booleanValue();
                    } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused3) {
                        z17 = false;
                    }
                    if (!z17) {
                        try {
                            method.invoke(obj, new java.lang.Object[0]);
                            return null;
                        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused4) {
                            return null;
                        }
                    }
                    z18 = true;
                }
                i18++;
                z18 = z18;
            }
        } else {
            k3.n f17 = f(nVarArr, i17);
            try {
                android.os.ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f17.f385336a, "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    android.graphics.Typeface build = new android.graphics.Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(f17.f385338c).setItalic(f17.f385339d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (java.io.IOException unused5) {
                return null;
            }
        }
    }

    @Override // e3.p
    public android.graphics.Typeface d(android.content.Context context, android.content.res.Resources resources, int i17, java.lang.String str, int i18) {
        java.lang.Object obj;
        if (!(this.f328597h != null)) {
            return super.d(context, resources, i17, str, i18);
        }
        try {
            obj = this.f328596g.newInstance(new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        if (!i(context, obj, str, 0, -1, -1, null)) {
            try {
                this.f328600k.invoke(obj, new java.lang.Object[0]);
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused2) {
            }
            return null;
        }
        if (k(obj)) {
            return j(obj);
        }
        return null;
    }

    public final boolean i(android.content.Context context, java.lang.Object obj, java.lang.String str, int i17, int i18, int i19, android.graphics.fonts.FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((java.lang.Boolean) this.f328597h.invoke(obj, context.getAssets(), str, 0, java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), fontVariationAxisArr)).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    public android.graphics.Typeface j(java.lang.Object obj) {
        try {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.f328595f, 1);
            java.lang.reflect.Array.set(newInstance, 0, obj);
            return (android.graphics.Typeface) this.f328601l.invoke(null, newInstance, -1, -1);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(java.lang.Object obj) {
        try {
            return ((java.lang.Boolean) this.f328599j.invoke(obj, new java.lang.Object[0])).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    public java.lang.reflect.Method l(java.lang.Class cls) {
        java.lang.Class<?> cls2 = java.lang.Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", android.content.res.AssetManager.class, java.lang.String.class, cls2, java.lang.Boolean.TYPE, cls2, cls2, cls2, android.graphics.fonts.FontVariationAxis[].class);
    }

    public java.lang.reflect.Method m(java.lang.Class cls) {
        java.lang.Class<?> cls2 = java.lang.Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", java.nio.ByteBuffer.class, cls2, android.graphics.fonts.FontVariationAxis[].class, cls2, cls2);
    }

    public java.lang.reflect.Method n(java.lang.Class cls) {
        java.lang.Class cls2 = java.lang.Integer.TYPE;
        java.lang.reflect.Method declaredMethod = android.graphics.Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
