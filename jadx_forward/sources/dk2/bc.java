package dk2;

/* loaded from: classes2.dex */
public final class bc {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f314787a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f314788b;

    /* renamed from: c, reason: collision with root package name */
    public final dk2.hc f314789c;

    public bc(r45.yk2 backendModel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(backendModel, "backendModel");
        this.f314787a = java.lang.String.valueOf(backendModel.m75942xfb822ef2(0));
        this.f314788b = java.lang.String.valueOf(backendModel.m75942xfb822ef2(3));
        java.util.LinkedList<r45.zk2> m75941xfb821914 = backendModel.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getQuestions(...)");
        int d17 = kz5.b1.d(kz5.d0.q(m75941xfb821914, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        for (r45.zk2 zk2Var : m75941xfb821914) {
            linkedHashMap.put(java.lang.Long.valueOf(zk2Var.m75942xfb822ef2(0)), zk2Var);
        }
        this.f314789c = dk2.ec.a(dk2.hc.f315111f, backendModel.m75942xfb822ef2(2), linkedHashMap);
    }
}
