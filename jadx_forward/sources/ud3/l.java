package ud3;

/* loaded from: classes7.dex */
public final class l extends lc3.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final ud3.c f508206d = new ud3.c();

    @Override // lc3.c0
    public java.lang.String f() {
        return "getLocalDataSync";
    }

    @Override // lc3.d0
    public lc3.a0 r(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.util.HashMap a17 = this.f508206d.a(data, e().f425864a);
        java.lang.Object obj = a17.get("error");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.magicbrush.base.MBErrorInfo");
        lc3.z zVar = (lc3.z) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(zVar, lc3.x.f399467a)) {
            return h(zVar.f399477a, zVar.f399478b);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Object obj2 = a17.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, (java.lang.String) obj2);
        java.lang.Object obj3 = a17.get("type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
        hashMap.put("type", (java.lang.String) obj3);
        java.lang.Object obj4 = a17.get("size");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj4, "null cannot be cast to non-null type kotlin.String");
        hashMap.put("size", (java.lang.String) obj4);
        return l(hashMap);
    }
}
