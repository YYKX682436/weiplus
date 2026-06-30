package b30;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f17554a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f17555b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f17556c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Class f17557d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f17558e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f17559f;

    static {
        new b30.a(null);
    }

    public c(java.lang.Object defaultValue, java.lang.String key) {
        kotlin.jvm.internal.o.g(defaultValue, "defaultValue");
        kotlin.jvm.internal.o.g(key, "key");
        this.f17554a = "brandService_accounts";
        this.f17559f = jz5.h.b(new b30.b(this));
        this.f17555b = key;
        this.f17556c = defaultValue;
        this.f17557d = defaultValue.getClass();
    }

    public final com.tencent.mm.sdk.platformtools.o4 a() {
        java.lang.Object value = ((jz5.n) this.f17559f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.sdk.platformtools.o4) value;
    }

    public final java.lang.Object b(java.lang.Object thisRef, f06.v property) {
        kotlin.jvm.internal.o.g(thisRef, "thisRef");
        kotlin.jvm.internal.o.g(property, "property");
        this.f17558e = thisRef;
        java.lang.Class cls = java.lang.Float.TYPE;
        java.lang.Class cls2 = this.f17557d;
        boolean b17 = kotlin.jvm.internal.o.b(cls2, cls) ? true : kotlin.jvm.internal.o.b(cls2, java.lang.Float.class);
        java.lang.String str = this.f17555b;
        java.lang.Object obj = this.f17556c;
        if (b17) {
            com.tencent.mm.sdk.platformtools.o4 a17 = a();
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Float");
            return java.lang.Float.valueOf(a17.getFloat(str, ((java.lang.Float) obj).floatValue()));
        }
        if (kotlin.jvm.internal.o.b(cls2, java.lang.Integer.TYPE) ? true : kotlin.jvm.internal.o.b(cls2, java.lang.Integer.class)) {
            com.tencent.mm.sdk.platformtools.o4 a18 = a();
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
            return java.lang.Integer.valueOf(a18.getInt(str, ((java.lang.Integer) obj).intValue()));
        }
        if (kotlin.jvm.internal.o.b(cls2, java.lang.String.class)) {
            com.tencent.mm.sdk.platformtools.o4 a19 = a();
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.String string = a19.getString(str, (java.lang.String) obj);
            kotlin.jvm.internal.o.e(string, "null cannot be cast to non-null type T of com.tencent.mm.feature.ecs.util.BrandEcsMMKVProperty");
            return string;
        }
        if (kotlin.jvm.internal.o.b(cls2, java.lang.Long.TYPE) ? true : kotlin.jvm.internal.o.b(cls2, java.lang.Long.class)) {
            com.tencent.mm.sdk.platformtools.o4 a27 = a();
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
            return java.lang.Long.valueOf(a27.getLong(str, ((java.lang.Long) obj).longValue()));
        }
        if (kotlin.jvm.internal.o.b(cls2, java.lang.Boolean.TYPE) ? true : kotlin.jvm.internal.o.b(cls2, java.lang.Boolean.class)) {
            com.tencent.mm.sdk.platformtools.o4 a28 = a();
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return java.lang.Boolean.valueOf(a28.getBoolean(str, ((java.lang.Boolean) obj).booleanValue()));
        }
        if (kotlin.jvm.internal.o.b(cls2, byte[].class)) {
            byte[] j17 = a().j(str);
            if (j17 != null) {
                obj = j17;
            }
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type T of com.tencent.mm.feature.ecs.util.BrandEcsMMKVProperty");
            return obj;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Class superclass = cls2.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            arrayList.add(superclass);
        }
        if (!arrayList.contains(com.tencent.mm.protobuf.f.class)) {
            throw new java.lang.IllegalAccessError("unsupported type:" + cls2);
        }
        byte[] j18 = a().j(str);
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
            com.tencent.mars.xlog.Log.e("MircoMsg.BrandEcsMMKVProperty", "parse pb failed, class:" + cls2.getCanonicalName());
            return obj;
        }
    }

    public final void c(java.lang.Object thisRef, f06.v property, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(thisRef, "thisRef");
        kotlin.jvm.internal.o.g(property, "property");
        this.f17558e = thisRef;
        java.lang.String str = this.f17555b;
        if (obj == null) {
            a().W(str);
            return;
        }
        java.lang.Class cls = java.lang.Float.TYPE;
        java.lang.Class cls2 = this.f17557d;
        if (kotlin.jvm.internal.o.b(cls2, cls) ? true : kotlin.jvm.internal.o.b(cls2, java.lang.Float.class)) {
            a().putFloat(str, ((java.lang.Float) obj).floatValue());
            return;
        }
        if (kotlin.jvm.internal.o.b(cls2, java.lang.Integer.TYPE) ? true : kotlin.jvm.internal.o.b(cls2, java.lang.Integer.class)) {
            a().putInt(str, ((java.lang.Integer) obj).intValue());
            return;
        }
        if (kotlin.jvm.internal.o.b(cls2, java.lang.String.class)) {
            a().putString(str, (java.lang.String) obj);
            return;
        }
        if (kotlin.jvm.internal.o.b(cls2, java.lang.Long.TYPE) ? true : kotlin.jvm.internal.o.b(cls2, java.lang.Long.class)) {
            a().putLong(str, ((java.lang.Long) obj).longValue());
            return;
        }
        if (kotlin.jvm.internal.o.b(cls2, java.lang.Boolean.TYPE) ? true : kotlin.jvm.internal.o.b(cls2, java.lang.Boolean.class)) {
            a().putBoolean(str, ((java.lang.Boolean) obj).booleanValue());
            return;
        }
        if (kotlin.jvm.internal.o.b(cls2, byte[].class)) {
            a().H(str, (byte[]) obj);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Class superclass = cls2.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            arrayList.add(superclass);
        }
        if (!arrayList.contains(com.tencent.mm.protobuf.f.class)) {
            throw new java.lang.IllegalAccessError("unsupported type:" + cls2);
        }
        a().H(str, ((com.tencent.mm.protobuf.f) obj).toByteArray());
    }
}
