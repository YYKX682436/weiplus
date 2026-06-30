package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public final class l2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.feature.performance.adpf.l2 f67446d = new com.tencent.mm.feature.performance.adpf.l2();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.vfs.r6[] G;
        boolean z17 = com.tencent.mm.feature.performance.adpf.p2.f67464a;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        xo.b bVar = xo.b.f455742a;
        java.lang.String b17 = bVar.b(0);
        linkedHashMap.put("cgroup", b17);
        java.lang.String str = (java.lang.String) bVar.a(b17).get("cpuset");
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        int myTid = android.os.Process.myTid();
        kz5.p0 p0Var = kz5.p0.f313996d;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6("/proc/" + myTid + "/task/");
        try {
            if (r6Var.y() && (G = r6Var.G()) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(G.length);
                for (com.tencent.mm.vfs.r6 r6Var2 : G) {
                    if (r6Var2.y()) {
                        try {
                            java.lang.String name = r6Var2.getName();
                            kotlin.jvm.internal.o.f(name, "getName(...)");
                            arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(name)));
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LinuxFileSamplerForTestOnly", e17, "parse thread error: " + r6Var2.getName(), new java.lang.Object[0]);
                        }
                    }
                }
                p0Var = arrayList;
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LinuxFileSamplerForTestOnly", e18, "list thread dir error", new java.lang.Object[0]);
        }
        java.util.Iterator<E> it = p0Var.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            java.lang.String str3 = (java.lang.String) bVar.a(bVar.b(intValue)).get("cpuset");
            if (str3 != null) {
                java.lang.String concat = com.tencent.matrix.hook.junwind.PthreadHackJni.d() ? str3 + '-' + zh.c.b(com.tencent.matrix.hook.junwind.PthreadHackJni.b(intValue)) : str3.concat("-?");
                java.lang.Object obj = linkedHashMap2.get(concat);
                if (obj == null) {
                    obj = new java.util.concurrent.atomic.AtomicInteger(0);
                    linkedHashMap2.put(concat, obj);
                }
                ((java.util.concurrent.atomic.AtomicInteger) obj).incrementAndGet();
            }
        }
        java.util.List<java.util.Map.Entry> F0 = kz5.n0.F0(linkedHashMap2.entrySet(), new com.tencent.mm.feature.performance.adpf.m2());
        int d17 = kz5.b1.d(kz5.d0.q(F0, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(d17);
        for (java.util.Map.Entry entry : F0) {
            linkedHashMap3.put(entry.getKey(), entry.getValue());
        }
        for (java.util.Map.Entry entry2 : linkedHashMap3.entrySet()) {
            linkedHashMap.put((java.lang.String) entry2.getKey(), (java.util.concurrent.atomic.AtomicInteger) entry2.getValue());
        }
        java.lang.String[] strArr = new java.lang.String[4];
        strArr[0] = "cgroupCpuSet";
        strArr[1] = com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground() ? "bg" : "fg";
        strArr[2] = str2;
        strArr[3] = java.lang.String.valueOf(linkedHashMap2.size());
        ap.a.a(10002, "ThreadProfiler", null, linkedHashMap, strArr);
    }
}
