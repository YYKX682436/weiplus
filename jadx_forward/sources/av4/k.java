package av4;

/* loaded from: classes.dex */
public final class k extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.k f95827d = new av4.k();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebViewIsMinimizeTaskEnabledJSAPI", "addToStar: handleMsg");
        java.lang.String str = msg.f422546c;
        java.lang.String str2 = msg.f422552i + ":ok";
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ai() ? 1 : 0));
        hashMap.put("multiContentSwitch", java.lang.Integer.valueOf(((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Di() ? 1 : 0));
        env.f422396d.e(str, str2, hashMap);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 10000;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "isMinimizeTaskEnabled";
    }
}
