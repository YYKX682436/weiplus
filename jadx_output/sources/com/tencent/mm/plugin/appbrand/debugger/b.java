package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f77624a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f77625b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Class f77626c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.SharedPreferences f77627d;

    public b(java.lang.String key, java.lang.Object defaultValue, android.content.SharedPreferences sharedPreferences, int i17, kotlin.jvm.internal.i iVar) {
        sharedPreferences = (i17 & 4) != 0 ? null : sharedPreferences;
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(defaultValue, "defaultValue");
        this.f77624a = key;
        this.f77625b = defaultValue;
        this.f77626c = defaultValue.getClass();
        this.f77627d = sharedPreferences == null ? com.tencent.mm.sdk.platformtools.o4.M("AppBrandDebugUI") : sharedPreferences;
    }

    public final java.lang.Object a(java.lang.Object thisRef, f06.v property) {
        kotlin.jvm.internal.o.g(thisRef, "thisRef");
        kotlin.jvm.internal.o.g(property, "property");
        boolean g17 = com.tencent.mm.plugin.appbrand.ui.e4.g();
        java.lang.Object obj = this.f77625b;
        if (!g17) {
            return obj;
        }
        java.lang.Class cls = java.lang.Float.TYPE;
        java.lang.Class cls2 = this.f77626c;
        boolean b17 = kotlin.jvm.internal.o.b(cls2, cls) ? true : kotlin.jvm.internal.o.b(cls2, java.lang.Float.class);
        java.lang.String str = this.f77624a;
        android.content.SharedPreferences sharedPreferences = this.f77627d;
        if (b17) {
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Float");
            return java.lang.Float.valueOf(sharedPreferences.getFloat(str, ((java.lang.Float) obj).floatValue()));
        }
        if (kotlin.jvm.internal.o.b(cls2, java.lang.Integer.TYPE) ? true : kotlin.jvm.internal.o.b(cls2, java.lang.Integer.class)) {
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
            return java.lang.Integer.valueOf(sharedPreferences.getInt(str, ((java.lang.Integer) obj).intValue()));
        }
        if (kotlin.jvm.internal.o.b(cls2, java.lang.String.class)) {
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.String string = sharedPreferences.getString(str, (java.lang.String) obj);
            kotlin.jvm.internal.o.e(string, "null cannot be cast to non-null type T of com.tencent.mm.plugin.appbrand.debugger.AppBrandDebugPreferenceDelegate");
            return string;
        }
        if (kotlin.jvm.internal.o.b(cls2, java.lang.Long.TYPE) ? true : kotlin.jvm.internal.o.b(cls2, java.lang.Long.class)) {
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
            return java.lang.Long.valueOf(sharedPreferences.getLong(str, ((java.lang.Long) obj).longValue()));
        }
        if (kotlin.jvm.internal.o.b(cls2, java.lang.Boolean.TYPE) ? true : kotlin.jvm.internal.o.b(cls2, java.lang.Boolean.class)) {
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return java.lang.Boolean.valueOf(sharedPreferences.getBoolean(str, ((java.lang.Boolean) obj).booleanValue()));
        }
        if (kotlin.jvm.internal.o.b(cls2, byte[].class)) {
            if (!(sharedPreferences instanceof com.tencent.mm.sdk.platformtools.o4)) {
                throw new java.lang.IllegalAccessError("unsupported type:" + cls2);
            }
            byte[] j17 = ((com.tencent.mm.sdk.platformtools.o4) sharedPreferences).j(str);
            if (j17 != null) {
                obj = j17;
            }
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type T of com.tencent.mm.plugin.appbrand.debugger.AppBrandDebugPreferenceDelegate");
            return obj;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Class superclass = cls2.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            arrayList.add(superclass);
        }
        if (!arrayList.contains(com.tencent.mm.protobuf.f.class) || !(sharedPreferences instanceof com.tencent.mm.sdk.platformtools.o4)) {
            throw new java.lang.IllegalAccessError("unsupported type:" + cls2);
        }
        byte[] j18 = ((com.tencent.mm.sdk.platformtools.o4) sharedPreferences).j(str);
        if (j18 == null) {
            return obj;
        }
        try {
            java.lang.Object newInstance = cls2.newInstance();
            kotlin.jvm.internal.o.e(newInstance, "null cannot be cast to non-null type com.tencent.mm.protobuf.BaseProtoBuf");
            com.tencent.mm.protobuf.f fVar = (com.tencent.mm.protobuf.f) newInstance;
            fVar.parseFrom(j18);
            return fVar;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandDebugUIPreferenceDelegate", "parse pb failed, class:" + cls2.getCanonicalName());
            return obj;
        }
    }

    public final void b(java.lang.Object thisRef, f06.v property, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(thisRef, "thisRef");
        kotlin.jvm.internal.o.g(property, "property");
        java.lang.String str = this.f77624a;
        android.content.SharedPreferences sharedPreferences = this.f77627d;
        if (obj == null) {
            sharedPreferences.edit().remove(str).apply();
            return;
        }
        java.lang.Class cls = java.lang.Float.TYPE;
        java.lang.Class cls2 = this.f77626c;
        if (kotlin.jvm.internal.o.b(cls2, cls) ? true : kotlin.jvm.internal.o.b(cls2, java.lang.Float.class)) {
            sharedPreferences.edit().putFloat(str, ((java.lang.Float) obj).floatValue()).apply();
            return;
        }
        if (kotlin.jvm.internal.o.b(cls2, java.lang.Integer.TYPE) ? true : kotlin.jvm.internal.o.b(cls2, java.lang.Integer.class)) {
            sharedPreferences.edit().putInt(str, ((java.lang.Integer) obj).intValue()).apply();
            return;
        }
        if (kotlin.jvm.internal.o.b(cls2, java.lang.String.class)) {
            sharedPreferences.edit().putString(str, (java.lang.String) obj).apply();
            return;
        }
        if (kotlin.jvm.internal.o.b(cls2, java.lang.Long.TYPE) ? true : kotlin.jvm.internal.o.b(cls2, java.lang.Long.class)) {
            sharedPreferences.edit().putLong(str, ((java.lang.Long) obj).longValue()).apply();
            return;
        }
        if (kotlin.jvm.internal.o.b(cls2, java.lang.Boolean.TYPE) ? true : kotlin.jvm.internal.o.b(cls2, java.lang.Boolean.class)) {
            sharedPreferences.edit().putBoolean(str, ((java.lang.Boolean) obj).booleanValue()).apply();
            return;
        }
        if (kotlin.jvm.internal.o.b(cls2, byte[].class)) {
            if (!(sharedPreferences instanceof com.tencent.mm.sdk.platformtools.o4)) {
                throw new java.lang.IllegalAccessError("unsupported type:" + cls2);
            }
            ((com.tencent.mm.sdk.platformtools.o4) sharedPreferences).H(str, (byte[]) obj);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Class superclass = cls2.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            arrayList.add(superclass);
        }
        if (!arrayList.contains(com.tencent.mm.protobuf.f.class) || !(sharedPreferences instanceof com.tencent.mm.sdk.platformtools.o4)) {
            throw new java.lang.IllegalAccessError("unsupported type:" + cls2);
        }
        ((com.tencent.mm.sdk.platformtools.o4) sharedPreferences).H(str, ((com.tencent.mm.protobuf.f) obj).toByteArray());
    }
}
