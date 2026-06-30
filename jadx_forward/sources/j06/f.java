package j06;

/* loaded from: classes12.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final j06.f f378592d = new j06.f();

    public f() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String obj2;
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entry, "entry");
        java.lang.String str = (java.lang.String) entry.getKey();
        java.lang.Object value = entry.getValue();
        if (value instanceof boolean[]) {
            obj2 = java.util.Arrays.toString((boolean[]) value);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "toString(...)");
        } else if (value instanceof char[]) {
            obj2 = java.util.Arrays.toString((char[]) value);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "toString(...)");
        } else if (value instanceof byte[]) {
            obj2 = java.util.Arrays.toString((byte[]) value);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "toString(...)");
        } else if (value instanceof short[]) {
            obj2 = java.util.Arrays.toString((short[]) value);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "toString(...)");
        } else if (value instanceof int[]) {
            obj2 = java.util.Arrays.toString((int[]) value);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "toString(...)");
        } else if (value instanceof float[]) {
            obj2 = java.util.Arrays.toString((float[]) value);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "toString(...)");
        } else if (value instanceof long[]) {
            obj2 = java.util.Arrays.toString((long[]) value);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "toString(...)");
        } else if (value instanceof double[]) {
            obj2 = java.util.Arrays.toString((double[]) value);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "toString(...)");
        } else if (value instanceof java.lang.Object[]) {
            obj2 = java.util.Arrays.toString((java.lang.Object[]) value);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "toString(...)");
        } else {
            obj2 = value.toString();
        }
        return str + '=' + obj2;
    }
}
