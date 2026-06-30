package jx;

/* loaded from: classes.dex */
public final class a extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "getOldAdInfo";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("__WebJsEngineLocalData__");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 v3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.v3(M, 15552000L);
        java.lang.String optString = data.optString("key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        java.lang.String s17 = v3Var.s(optString, "");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("value", s17);
        s().mo146xb9724478(l(hashMap));
    }
}
