package c13;

/* loaded from: classes11.dex */
public final class e extends com.tencent.mm.sdk.platformtools.n3 {
    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        boolean z17 = false;
        if (message != null && message.what == 1) {
            z17 = true;
        }
        if (z17) {
            java.lang.Object obj = message.obj;
            if (obj instanceof jz5.l) {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                jz5.l lVar = (jz5.l) obj;
                java.lang.Object obj2 = lVar.f302833d;
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                java.lang.String str = (java.lang.String) obj2;
                if (c13.b0.f37866m.contains(str)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipService", "on timeout, clear engine:".concat(str));
                    ((e50.a) ((f50.x) i95.n0.c(f50.x.class))).wi(str);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipService", "on timeout, " + str + " is already cleared");
                }
                java.lang.Object obj3 = lVar.f302834e;
                kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
                c13.b0.f37871r.remove((java.lang.String) obj3);
            }
        }
    }
}
