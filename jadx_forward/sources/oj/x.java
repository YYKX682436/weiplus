package oj;

/* loaded from: classes5.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final oj.x f427253d = new oj.x();

    public x() {
        super(2);
    }

    public final int a(java.util.Map getInt, java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getInt, "$this$getInt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.lang.String str = (java.lang.String) getInt.get(key);
        if (str != null) {
            return java.lang.Integer.parseInt(str);
        }
        return -1;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Integer.valueOf(a((java.util.Map) obj, (java.lang.String) obj2));
    }
}
