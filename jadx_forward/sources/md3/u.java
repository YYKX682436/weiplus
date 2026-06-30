package md3;

/* loaded from: classes4.dex */
public final class u extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "preloadEcsJumpInfo";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 param) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        java.lang.String optString = param.optString("ecsJumpInfo", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (optString.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBJsApiPreloadEcsJumpInfo", "error: ecsJumpInfo is empty");
            s().mo146xb9724478(j(lc3.x.f399470d, "ecsJumpInfo is empty"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiPreloadEcsJumpInfo", "preload, ecsJumpInfo: ".concat(optString));
        i95.m c17 = i95.n0.c(pq.q.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        pq.q qVar = (pq.q) c17;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pq.q.ub(qVar, new pq.a(context), optString, null, null, 12, null);
        s().mo146xb9724478(k());
    }
}
