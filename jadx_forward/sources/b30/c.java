package b30;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f99087a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f99088b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f99089c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Class f99090d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f99091e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f99092f;

    static {
        new b30.a(null);
    }

    public c(java.lang.Object defaultValue, java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultValue, "defaultValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        this.f99087a = "brandService_accounts";
        this.f99092f = jz5.h.b(new b30.b(this));
        this.f99088b = key;
        this.f99089c = defaultValue;
        this.f99090d = defaultValue.getClass();
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f99092f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb;
    }

    public final java.lang.Object b(java.lang.Object thisRef, f06.v property) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thisRef, "thisRef");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(property, "property");
        this.f99091e = thisRef;
        java.lang.Class cls = java.lang.Float.TYPE;
        java.lang.Class cls2 = this.f99090d;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, cls) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Float.class);
        java.lang.String str = this.f99088b;
        java.lang.Object obj = this.f99089c;
        if (b17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Float");
            return java.lang.Float.valueOf(a17.getFloat(str, ((java.lang.Float) obj).floatValue()));
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Integer.TYPE) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Integer.class)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a18 = a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
            return java.lang.Integer.valueOf(a18.getInt(str, ((java.lang.Integer) obj).intValue()));
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.String.class)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a19 = a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.String string = a19.getString(str, (java.lang.String) obj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(string, "null cannot be cast to non-null type T of com.tencent.mm.feature.ecs.util.BrandEcsMMKVProperty");
            return string;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Long.TYPE) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Long.class)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a27 = a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
            return java.lang.Long.valueOf(a27.getLong(str, ((java.lang.Long) obj).longValue()));
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Boolean.TYPE) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Boolean.class)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a28 = a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return java.lang.Boolean.valueOf(a28.getBoolean(str, ((java.lang.Boolean) obj).booleanValue()));
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, byte[].class)) {
            byte[] j17 = a().j(str);
            if (j17 != null) {
                obj = j17;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type T of com.tencent.mm.feature.ecs.util.BrandEcsMMKVProperty");
            return obj;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Class superclass = cls2.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            arrayList.add(superclass);
        }
        if (!arrayList.contains(com.p314xaae8f345.mm.p2495xc50a8b8b.f.class)) {
            throw new java.lang.IllegalAccessError("unsupported type:" + cls2);
        }
        byte[] j18 = a().j(str);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MircoMsg.BrandEcsMMKVProperty", "parse pb failed, class:" + cls2.getCanonicalName());
            return obj;
        }
    }

    public final void c(java.lang.Object thisRef, f06.v property, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thisRef, "thisRef");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(property, "property");
        this.f99091e = thisRef;
        java.lang.String str = this.f99088b;
        if (obj == null) {
            a().W(str);
            return;
        }
        java.lang.Class cls = java.lang.Float.TYPE;
        java.lang.Class cls2 = this.f99090d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, cls) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Float.class)) {
            a().putFloat(str, ((java.lang.Float) obj).floatValue());
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Integer.TYPE) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Integer.class)) {
            a().putInt(str, ((java.lang.Integer) obj).intValue());
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.String.class)) {
            a().putString(str, (java.lang.String) obj);
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Long.TYPE) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Long.class)) {
            a().putLong(str, ((java.lang.Long) obj).longValue());
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Boolean.TYPE) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Boolean.class)) {
            a().putBoolean(str, ((java.lang.Boolean) obj).booleanValue());
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, byte[].class)) {
            a().H(str, (byte[]) obj);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Class superclass = cls2.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            arrayList.add(superclass);
        }
        if (!arrayList.contains(com.p314xaae8f345.mm.p2495xc50a8b8b.f.class)) {
            throw new java.lang.IllegalAccessError("unsupported type:" + cls2);
        }
        a().H(str, ((com.p314xaae8f345.mm.p2495xc50a8b8b.f) obj).mo14344x5f01b1f6());
    }
}
