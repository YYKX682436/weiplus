package nf;

/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f418133a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f418134b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Class f418135c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f418136d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f418137e;

    static {
        new nf.p(null);
    }

    public r(java.lang.Object defaultValue) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultValue, "defaultValue");
        this.f418137e = jz5.h.b(new nf.q(this));
        this.f418134b = defaultValue;
        this.f418135c = defaultValue.getClass();
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f418137e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb;
    }

    public final java.lang.Object b(java.lang.Object thisRef, f06.v property) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thisRef, "thisRef");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(property, "property");
        this.f418136d = thisRef;
        java.lang.Class cls = java.lang.Float.TYPE;
        java.lang.Class cls2 = this.f418135c;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, cls) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Float.class);
        java.lang.Object obj = this.f418134b;
        if (b17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = a();
            java.lang.String mo9624xfb82e301 = property.mo9624xfb82e301();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Float");
            return java.lang.Float.valueOf(a17.getFloat(mo9624xfb82e301, ((java.lang.Float) obj).floatValue()));
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Integer.TYPE) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Integer.class)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a18 = a();
            java.lang.String mo9624xfb82e3012 = property.mo9624xfb82e301();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
            return java.lang.Integer.valueOf(a18.getInt(mo9624xfb82e3012, ((java.lang.Integer) obj).intValue()));
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.String.class)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a19 = a();
            java.lang.String mo9624xfb82e3013 = property.mo9624xfb82e301();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.String string = a19.getString(mo9624xfb82e3013, (java.lang.String) obj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(string, "null cannot be cast to non-null type T of com.tencent.luggage.util.LuggageMMKVProperty");
            return string;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Long.TYPE) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Long.class)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a27 = a();
            java.lang.String mo9624xfb82e3014 = property.mo9624xfb82e301();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
            return java.lang.Long.valueOf(a27.getLong(mo9624xfb82e3014, ((java.lang.Long) obj).longValue()));
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Boolean.TYPE) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Boolean.class)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a28 = a();
            java.lang.String mo9624xfb82e3015 = property.mo9624xfb82e301();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return java.lang.Boolean.valueOf(a28.getBoolean(mo9624xfb82e3015, ((java.lang.Boolean) obj).booleanValue()));
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, byte[].class)) {
            byte[] j17 = a().j(property.mo9624xfb82e301());
            if (j17 != null) {
                obj = j17;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type T of com.tencent.luggage.util.LuggageMMKVProperty");
            return obj;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Class superclass = cls2.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            arrayList.add(superclass);
        }
        if (!arrayList.contains(com.p314xaae8f345.mm.p2495xc50a8b8b.f.class)) {
            throw new java.lang.IllegalAccessError("unsupported type:" + cls2);
        }
        byte[] j18 = a().j(property.mo9624xfb82e301());
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AppBrand.utils.AppBrandMMKVProperty", "parse pb failed, class:" + cls2.getCanonicalName());
            return obj;
        }
    }

    public final void c(java.lang.Object thisRef, f06.v property, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thisRef, "thisRef");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(property, "property");
        this.f418136d = thisRef;
        if (obj == null) {
            a().W(property.mo9624xfb82e301());
            return;
        }
        java.lang.Class cls = java.lang.Float.TYPE;
        java.lang.Class cls2 = this.f418135c;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, cls) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Float.class)) {
            a().putFloat(property.mo9624xfb82e301(), ((java.lang.Float) obj).floatValue());
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Integer.TYPE) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Integer.class)) {
            a().putInt(property.mo9624xfb82e301(), ((java.lang.Integer) obj).intValue());
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.String.class)) {
            a().putString(property.mo9624xfb82e301(), (java.lang.String) obj);
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Long.TYPE) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Long.class)) {
            a().putLong(property.mo9624xfb82e301(), ((java.lang.Long) obj).longValue());
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Boolean.TYPE) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Boolean.class)) {
            a().putBoolean(property.mo9624xfb82e301(), ((java.lang.Boolean) obj).booleanValue());
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, byte[].class)) {
            a().H(property.mo9624xfb82e301(), (byte[]) obj);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Class superclass = cls2.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            arrayList.add(superclass);
        }
        if (!arrayList.contains(com.p314xaae8f345.mm.p2495xc50a8b8b.f.class)) {
            throw new java.lang.IllegalAccessError("unsupported type:" + cls2);
        }
        a().H(property.mo9624xfb82e301(), ((com.p314xaae8f345.mm.p2495xc50a8b8b.f) obj).mo14344x5f01b1f6());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(java.lang.Object defaultValue, java.lang.String mmkvName) {
        this(defaultValue);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultValue, "defaultValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mmkvName, "mmkvName");
        this.f418133a = mmkvName;
        this.f418134b = defaultValue;
        this.f418135c = defaultValue.getClass();
    }
}
