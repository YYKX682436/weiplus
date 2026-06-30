package is0;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final is0.b f375924a = new is0.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f375925b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f375926c = new java.util.HashMap();

    public static final is0.c b(boolean z17, long j17) {
        is0.c cVar = new is0.c(z17, j17);
        f375925b.put(java.lang.Integer.valueOf(cVar.hashCode()), new java.lang.ref.WeakReference(cVar));
        return cVar;
    }

    public final is0.a a(long j17) {
        is0.a aVar = new is0.a(j17);
        f375926c.put(java.lang.Integer.valueOf(aVar.hashCode()), new java.lang.ref.WeakReference(aVar));
        return aVar;
    }

    public final synchronized void c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("--------printAllocatedGLObjectInfo, current allocated tex size:");
        java.util.HashMap hashMap = f375925b;
        sb6.append(hashMap.size());
        sb6.append(", frameBuffer size:");
        sb6.append(f375926c.size());
        sb6.append(" calledStack:");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLObjectFactory", sb6.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLObjectFactory", "--------------------------------------------");
        for (java.util.Map.Entry entry : new java.util.HashMap(hashMap).entrySet()) {
            java.lang.Integer num = (java.lang.Integer) entry.getKey();
            is0.c cVar = (is0.c) ((java.lang.ref.WeakReference) entry.getValue()).get();
            if (cVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLObjectFactory", num + " tex recycled");
                f375925b.remove(num);
            } else if (cVar.f375927d) {
                f375925b.remove(num);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(num);
                sb7.append(" tex released, texId:");
                sb7.append(cVar.f375928e);
                sb7.append(", external:");
                sb7.append(!cVar.f375929f);
                sb7.append(", allocatedTid:");
                sb7.append(cVar.f375932i);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLObjectFactory", sb7.toString());
            } else {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(num);
                sb8.append(" tex leak, texId:");
                sb8.append(cVar.f375928e);
                sb8.append(", external:");
                sb8.append(!cVar.f375929f);
                sb8.append(", allocatedTid:");
                sb8.append(cVar.f375932i);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLObjectFactory", sb8.toString());
            }
        }
        for (java.util.Map.Entry entry2 : new java.util.HashMap(f375926c).entrySet()) {
            java.lang.Integer num2 = (java.lang.Integer) entry2.getKey();
            is0.a aVar = (is0.a) ((java.lang.ref.WeakReference) entry2.getValue()).get();
            if (aVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLObjectFactory", num2 + " fbo recycled");
                f375926c.remove(num2);
            } else if (aVar.f375919d) {
                f375926c.remove(num2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLObjectFactory", num2 + " fbo released, fbo:" + aVar.f375920e + ", allocatedTid:" + aVar.f375922g);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLObjectFactory", num2 + " fbo leak, fbo:" + aVar.f375920e + ", allocatedTid:" + aVar.f375922g);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLObjectFactory", "--------finish printAllocatedGLObjectInfo--------");
    }
}
