package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f159157a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f159158b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Class f159159c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.SharedPreferences f159160d;

    public b(java.lang.String key, java.lang.Object defaultValue, android.content.SharedPreferences sharedPreferences, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        sharedPreferences = (i17 & 4) != 0 ? null : sharedPreferences;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultValue, "defaultValue");
        this.f159157a = key;
        this.f159158b = defaultValue;
        this.f159159c = defaultValue.getClass();
        this.f159160d = sharedPreferences == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("AppBrandDebugUI") : sharedPreferences;
    }

    public final java.lang.Object a(java.lang.Object thisRef, f06.v property) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thisRef, "thisRef");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(property, "property");
        boolean g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e4.g();
        java.lang.Object obj = this.f159158b;
        if (!g17) {
            return obj;
        }
        java.lang.Class cls = java.lang.Float.TYPE;
        java.lang.Class cls2 = this.f159159c;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, cls) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Float.class);
        java.lang.String str = this.f159157a;
        android.content.SharedPreferences sharedPreferences = this.f159160d;
        if (b17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Float");
            return java.lang.Float.valueOf(sharedPreferences.getFloat(str, ((java.lang.Float) obj).floatValue()));
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Integer.TYPE) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Integer.class)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
            return java.lang.Integer.valueOf(sharedPreferences.getInt(str, ((java.lang.Integer) obj).intValue()));
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.String.class)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.String string = sharedPreferences.getString(str, (java.lang.String) obj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(string, "null cannot be cast to non-null type T of com.tencent.mm.plugin.appbrand.debugger.AppBrandDebugPreferenceDelegate");
            return string;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Long.TYPE) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Long.class)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
            return java.lang.Long.valueOf(sharedPreferences.getLong(str, ((java.lang.Long) obj).longValue()));
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Boolean.TYPE) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Boolean.class)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return java.lang.Boolean.valueOf(sharedPreferences.getBoolean(str, ((java.lang.Boolean) obj).booleanValue()));
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, byte[].class)) {
            if (!(sharedPreferences instanceof com.p314xaae8f345.mm.sdk.p2603x2137b148.o4)) {
                throw new java.lang.IllegalAccessError("unsupported type:" + cls2);
            }
            byte[] j17 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) sharedPreferences).j(str);
            if (j17 != null) {
                obj = j17;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type T of com.tencent.mm.plugin.appbrand.debugger.AppBrandDebugPreferenceDelegate");
            return obj;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Class superclass = cls2.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            arrayList.add(superclass);
        }
        if (!arrayList.contains(com.p314xaae8f345.mm.p2495xc50a8b8b.f.class) || !(sharedPreferences instanceof com.p314xaae8f345.mm.sdk.p2603x2137b148.o4)) {
            throw new java.lang.IllegalAccessError("unsupported type:" + cls2);
        }
        byte[] j18 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) sharedPreferences).j(str);
        if (j18 == null) {
            return obj;
        }
        try {
            java.lang.Object newInstance = cls2.newInstance();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance, "null cannot be cast to non-null type com.tencent.mm.protobuf.BaseProtoBuf");
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) newInstance;
            fVar.mo11468x92b714fd(j18);
            return fVar;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandDebugUIPreferenceDelegate", "parse pb failed, class:" + cls2.getCanonicalName());
            return obj;
        }
    }

    public final void b(java.lang.Object thisRef, f06.v property, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thisRef, "thisRef");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(property, "property");
        java.lang.String str = this.f159157a;
        android.content.SharedPreferences sharedPreferences = this.f159160d;
        if (obj == null) {
            sharedPreferences.edit().remove(str).apply();
            return;
        }
        java.lang.Class cls = java.lang.Float.TYPE;
        java.lang.Class cls2 = this.f159159c;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, cls) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Float.class)) {
            sharedPreferences.edit().putFloat(str, ((java.lang.Float) obj).floatValue()).apply();
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Integer.TYPE) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Integer.class)) {
            sharedPreferences.edit().putInt(str, ((java.lang.Integer) obj).intValue()).apply();
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.String.class)) {
            sharedPreferences.edit().putString(str, (java.lang.String) obj).apply();
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Long.TYPE) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Long.class)) {
            sharedPreferences.edit().putLong(str, ((java.lang.Long) obj).longValue()).apply();
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Boolean.TYPE) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Boolean.class)) {
            sharedPreferences.edit().putBoolean(str, ((java.lang.Boolean) obj).booleanValue()).apply();
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, byte[].class)) {
            if (!(sharedPreferences instanceof com.p314xaae8f345.mm.sdk.p2603x2137b148.o4)) {
                throw new java.lang.IllegalAccessError("unsupported type:" + cls2);
            }
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) sharedPreferences).H(str, (byte[]) obj);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Class superclass = cls2.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            arrayList.add(superclass);
        }
        if (!arrayList.contains(com.p314xaae8f345.mm.p2495xc50a8b8b.f.class) || !(sharedPreferences instanceof com.p314xaae8f345.mm.sdk.p2603x2137b148.o4)) {
            throw new java.lang.IllegalAccessError("unsupported type:" + cls2);
        }
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) sharedPreferences).H(str, ((com.p314xaae8f345.mm.p2495xc50a8b8b.f) obj).mo14344x5f01b1f6());
    }
}
