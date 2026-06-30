package up;

/* loaded from: classes5.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final up.c f511289d = new up.c();

    public c() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        sc.c type = (sc.c) obj;
        java.lang.String name = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        jz5.g gVar = up.g.f511293a;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (type == sc.c.f487144d) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(name);
            java.lang.Object obj3 = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj3, arrayList.toArray(), "com/tencent/mm/cso/CsoStartup", "originLoadByName", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
            yj0.a.f(obj3, "com/tencent/mm/cso/CsoStartup", "originLoadByName", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }
        return java.lang.Boolean.FALSE;
    }
}
