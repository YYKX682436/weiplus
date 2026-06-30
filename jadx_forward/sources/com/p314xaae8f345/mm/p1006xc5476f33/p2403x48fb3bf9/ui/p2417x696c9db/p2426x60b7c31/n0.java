package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public final class n0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.n0 f266814d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.n0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiH5ReuqestQueryCashier", "get data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiH5ReuqestQueryCashier", "data: %s", msg.f422323a.toString());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", (java.lang.String) msg.f422323a.get("appId"));
        bundle.putString("nonceStr", (java.lang.String) msg.f422323a.get("nonceStr"));
        bundle.putString("timeStamp", (java.lang.String) msg.f422323a.get("timeStamp"));
        bundle.putString("package", (java.lang.String) msg.f422323a.get("package"));
        bundle.putString("paySign", (java.lang.String) msg.f422323a.get("paySign"));
        bundle.putString("signType", (java.lang.String) msg.f422323a.get("signType"));
        bundle.putString("jsapiName", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.y6.f35021x24728b);
        bundle.putString("notifyType", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.y6.f35021x24728b);
        bundle.putInt("jsapi_type", 0);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3170x59c587e3.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.m0(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4.f38124x4e729db1;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.y6.f35021x24728b;
    }
}
