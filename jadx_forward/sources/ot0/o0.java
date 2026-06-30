package ot0;

/* loaded from: classes9.dex */
public class o0 {

    /* renamed from: a, reason: collision with root package name */
    public int f430149a;

    /* renamed from: b, reason: collision with root package name */
    public int f430150b;

    public static final ot0.o0 a(java.lang.String str) {
        java.util.Map map;
        ot0.o0 o0Var = new ot0.o0();
        ot0.q v17 = ot0.q.v(str);
        if (v17 != null && (map = v17.G2) != null) {
            o0Var.f430149a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.xmlfulllen"), 0);
            o0Var.f430150b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.realinnertype"), 0);
        }
        return o0Var;
    }
}
