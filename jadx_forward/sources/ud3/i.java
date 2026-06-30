package ud3;

/* loaded from: classes7.dex */
public final class i extends lc3.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final ud3.b f508203d = new ud3.b();

    @Override // lc3.c0
    public java.lang.String f() {
        return "getLocalDataAllKeysSync";
    }

    @Override // lc3.d0
    public lc3.a0 r(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.util.HashMap a17 = this.f508203d.a(data, e().f425864a);
        java.lang.Object obj = a17.get("error");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.magicbrush.base.MBErrorInfo");
        lc3.z zVar = (lc3.z) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(zVar, lc3.x.f399467a)) {
            return h(zVar.f399477a, zVar.f399478b);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Object obj2 = a17.get("keys");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
        hashMap.put("keys", (java.util.ArrayList) obj2);
        return l(hashMap);
    }
}
