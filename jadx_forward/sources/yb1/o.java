package yb1;

/* loaded from: classes7.dex */
public final class o implements yb1.p {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f542203e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f542204f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f542205g;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f542206d = jz5.h.b(yb1.g.f542185d);

    static {
        new yb1.f(null);
        f542203e = new java.util.concurrent.atomic.AtomicInteger(0);
        f542204f = 5000L;
        f542205g = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    public static final void a(yb1.o oVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, java.lang.String method, org.json.JSONObject jSONObject, int i17) {
        oVar.getClass();
        if (n7Var != null) {
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(method, "method");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EventRemoteDebugCommand", "dispatch: component:" + n7Var + " callbackId:" + i17 + " method:" + method + " commandParams:" + jSONObject2);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(ya.b.f77491x8758c4e1, method);
            try {
                hashMap.put("commandParams", new org.json.JSONObject(jSONObject2));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EventRemoteDebugCommand", "parse commandParams failed: " + e17 + ", commandParams:" + jSONObject2);
            }
            hashMap.put("callbackID", java.lang.String.valueOf(i17));
            yb1.a aVar = new yb1.a();
            aVar.t(hashMap);
            aVar.u(n7Var);
            aVar.m();
        }
    }

    public final java.util.concurrent.ConcurrentHashMap b() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f542206d).mo141623x754a37bb();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0 A[Catch: Exception -> 0x004c, x3 -> 0x004f, TryCatch #2 {x3 -> 0x004f, Exception -> 0x004c, blocks: (B:12:0x002e, B:13:0x00e3, B:20:0x0043, B:21:0x00c7, B:23:0x00d0, B:25:0x00d6, B:28:0x0048, B:43:0x00a5, B:46:0x00b6), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6 A[Catch: Exception -> 0x004c, x3 -> 0x004f, TryCatch #2 {x3 -> 0x004f, Exception -> 0x004c, blocks: (B:12:0x002e, B:13:0x00e3, B:20:0x0043, B:21:0x00c7, B:23:0x00d0, B:25:0x00d6, B:28:0x0048, B:43:0x00a5, B:46:0x00b6), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 r13, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r14) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yb1.o.c(com.tencent.mm.plugin.appbrand.o6, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPageContentService", "getDocumentRootId");
        int andIncrement = f542205g.getAndIncrement();
        rVar.m(new yb1.k(this, andIncrement));
        b().put(new java.lang.Integer(andIncrement), new yb1.l(andIncrement, rVar));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("depth", 1);
        a(this, n7Var, "DOM.getDocument", jSONObject, andIncrement);
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    public final java.lang.Object e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPageContentService", "getOuterHTML nodeId:" + i17);
        int andIncrement = f542205g.getAndIncrement();
        rVar.m(new yb1.m(this, andIncrement));
        b().put(new java.lang.Integer(andIncrement), new yb1.n(andIncrement, rVar));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("nodeId", i17);
        a(this, n7Var, "DOM.getOuterHTML", jSONObject, andIncrement);
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }
}
