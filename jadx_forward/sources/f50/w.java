package f50;

/* loaded from: classes4.dex */
public final class w implements f50.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f50.w f341127a = new f50.w();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f341128b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(100);

    @Override // f50.a0
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f c(byte[] bArr, java.lang.String engineId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(engineId, "engineId");
        r45.u33 u33Var = new r45.u33();
        if (bArr != null) {
            try {
                u33Var.mo11468x92b714fd(bArr);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
        r45.v33 v33Var = new r45.v33();
        java.lang.String key = u33Var.f468517d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key, "key");
        java.lang.String str = (java.lang.String) f341128b.get(key);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterFuncCallService", "get: " + str + " for " + key);
        v33Var.f469384d = str;
        return v33Var;
    }
}
