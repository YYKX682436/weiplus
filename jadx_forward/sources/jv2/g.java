package jv2;

/* loaded from: classes10.dex */
public final class g {
    public g(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final jv2.h a() {
        d95.b0 b0Var = new d95.b0();
        java.lang.String str = gm0.j1.u().h() + "UniComment.db";
        jv2.g gVar = jv2.h.f383750f;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(java.lang.Integer.valueOf(jv2.h.f383752h.hashCode()), jv2.f.f383749a);
        if (b0Var.S(str, hashMap, true, true)) {
            return new jv2.h(b0Var);
        }
        throw new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183("db init failed");
    }
}
