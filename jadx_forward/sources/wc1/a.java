package wc1;

/* loaded from: classes7.dex */
public class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    public static final int f77339x366c91de = 1184;

    /* renamed from: NAME */
    public static final java.lang.String f77340x24728b = "awaitLoadSubPackageTask";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b5 b5Var;
        java.lang.String optString = jSONObject.optString("loadTaskId");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAwaitLoadSubPackageTask", "null or nil loadTaskId");
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            return u(str, jSONObject2);
        }
        int optInt = jSONObject.optInt("timeout", 10000);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAwaitLoadSubPackageTask", "await taskId: %s, timeout: %d", optString, java.lang.Integer.valueOf(optInt));
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.String tag = "AwaitTagLoadSubPackage_" + optString;
        long j17 = optInt;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c5 c5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c5) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p0.a(lVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = c5Var.f171931d;
        if ((concurrentHashMap.get(tag) != null) && (b5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b5) concurrentHashMap.get(tag)) != null) {
            java.util.concurrent.locks.ReentrantLock reentrantLock = b5Var.f171924a;
            reentrantLock.lock();
            try {
                try {
                    b5Var.f171925b.await(j17, java.util.concurrent.TimeUnit.MILLISECONDS);
                } catch (java.lang.InterruptedException unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SyncWaiter", "hy: wait from async fail due to timeout!");
                    reentrantLock.unlock();
                    z17 = false;
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        z17 = true;
        ph1.g gVar = (ph1.g) c5Var.f171932e.get(tag);
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = optString;
        objArr[1] = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
        objArr[2] = java.lang.Boolean.valueOf(z17);
        objArr[3] = gVar != null ? gVar.toString() : "null";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAwaitLoadSubPackageTask", "await taskId: %s done, using %d ms and is success %b and load result is %s", objArr);
        return r(null, z17 ? gVar == ph1.g.OK ? jc1.f.f380445a : gVar == ph1.g.CANCEL ? jc1.f.f380446b : jc1.f.f380448d : jc1.f.f380449e, null);
    }
}
