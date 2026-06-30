package p000;

/* loaded from: classes10.dex */
public final class x {
    public x(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final p000.y a() {
        d95.b0 b0Var = new d95.b0();
        java.lang.String str = gm0.j1.u().h() + "UniComment.db";
        p000.x xVar = p000.y.f539830f;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(java.lang.Integer.valueOf(p000.y.f539832h.hashCode()), p000.w.f523341a);
        if (b0Var.S(str, hashMap, true, true)) {
            return new p000.y(b0Var);
        }
        throw new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183("db init failed");
    }
}
