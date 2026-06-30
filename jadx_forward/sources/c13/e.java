package c13;

/* loaded from: classes11.dex */
public final class e extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {
    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        boolean z17 = false;
        if (message != null && message.what == 1) {
            z17 = true;
        }
        if (z17) {
            java.lang.Object obj = message.obj;
            if (obj instanceof jz5.l) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                jz5.l lVar = (jz5.l) obj;
                java.lang.Object obj2 = lVar.f384366d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                java.lang.String str = (java.lang.String) obj2;
                if (c13.b0.f119399m.contains(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipService", "on timeout, clear engine:".concat(str));
                    ((e50.a) ((f50.x) i95.n0.c(f50.x.class))).wi(str);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipService", "on timeout, " + str + " is already cleared");
                }
                java.lang.Object obj3 = lVar.f384367e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
                c13.b0.f119404r.remove((java.lang.String) obj3);
            }
        }
    }
}
