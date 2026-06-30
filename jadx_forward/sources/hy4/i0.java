package hy4;

/* loaded from: classes7.dex */
public final class i0 implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy4.k0 f367649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367650e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f367651f;

    public i0(hy4.k0 k0Var, java.lang.String str, yz5.a aVar) {
        this.f367649d = k0Var;
        this.f367650e = str;
        this.f367651f = aVar;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        java.util.Iterator<java.lang.String> keys;
        this.f367649d.f367676y = null;
        java.lang.System.currentTimeMillis();
        try {
            java.lang.String s17 = this.f367650e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(s17, "$s");
            java.lang.String substring = s17.substring(1, this.f367650e.length() - 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            org.json.JSONObject jSONObject = new org.json.JSONObject(u46.k.e(substring));
            yz5.a aVar = this.f367651f;
            hy4.k0 k0Var = this.f367649d;
            java.util.Iterator<java.lang.String> keys2 = jSONObject.keys();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys2, "keys(...)");
            while (keys2.hasNext()) {
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject(keys2.next());
                if (optJSONObject != null && (keys = optJSONObject.keys()) != null) {
                    while (keys.hasNext()) {
                        java.lang.String next = keys.next();
                        optJSONObject.optLong(next);
                        k0Var.a(next, optJSONObject.optLong(next));
                    }
                }
            }
            aVar.mo152xb9724478();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebViewPerformanceHelper", e17, "fetchDocumentTime exception", new java.lang.Object[0]);
        }
        hy4.k0 k0Var2 = this.f367649d;
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = k0Var2.f424084b;
        if (concurrentLinkedDeque != null && !concurrentLinkedDeque.isEmpty()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = concurrentLinkedDeque.iterator();
            while (it.hasNext()) {
                o25.j2 j2Var = (o25.j2) it.next();
                sb6.append("[");
                sb6.append(j2Var.f424078a);
                sb6.append(": ");
                sb6.append(j2Var.f424079b);
                if (j2Var.f424079b > k0Var2.f367673v) {
                    sb6.append(", ");
                    sb6.append(j2Var.f424079b - k0Var2.f367673v);
                }
                java.lang.String str = j2Var.f424080c;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    sb6.append(", ");
                    sb6.append(str);
                }
                sb6.append("] ");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewPerformanceHelper", "WebView-Trace#" + k0Var2.f367672u + ", webViewPerformance: %s", sb6.toString());
            concurrentLinkedDeque.clear();
        }
        java.lang.System.currentTimeMillis();
        return false;
    }
}
