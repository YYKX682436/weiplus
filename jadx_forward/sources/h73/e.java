package h73;

/* loaded from: classes13.dex */
public abstract class e {
    public static final android.os.Bundle a(h73.f... pairs) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pairs, "pairs");
        android.os.Bundle bundle = new android.os.Bundle();
        for (h73.f fVar : pairs) {
            fVar.getClass();
            fVar.f361024a.mo146xb9724478(bundle);
        }
        return bundle;
    }

    public static final h73.f b(java.lang.String str, java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        return new h73.f(new h73.d(str, value));
    }

    public static final void c(android.os.Bundle bundle, java.lang.String key, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        bundle.putInt(key, i17);
    }

    public static final void d(android.os.Bundle bundle, java.lang.String key, java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        bundle.putString(key, value);
    }
}
