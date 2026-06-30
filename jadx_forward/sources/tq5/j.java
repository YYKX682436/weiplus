package tq5;

/* loaded from: classes.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final tq5.j f502804d = new tq5.j();

    public j() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(it, "it");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(it);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/xeffect/XEffectLib$libLoader$1", "invoke", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj2, "com/tencent/mm/xeffect/XEffectLib$libLoader$1", "invoke", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        return jz5.f0.f384359a;
    }
}
