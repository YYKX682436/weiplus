package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59;

/* loaded from: classes12.dex */
public final class l2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.l2 f148979d = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.l2();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.vfs.r6[] G;
        boolean z17 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.p2.f148997a;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        xo.b bVar = xo.b.f537275a;
        java.lang.String b17 = bVar.b(0);
        linkedHashMap.put("cgroup", b17);
        java.lang.String str = (java.lang.String) bVar.a(b17).get("cpuset");
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        int myTid = android.os.Process.myTid();
        kz5.p0 p0Var = kz5.p0.f395529d;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6("/proc/" + myTid + "/task/");
        try {
            if (r6Var.y() && (G = r6Var.G()) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(G.length);
                for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
                    if (r6Var2.y()) {
                        try {
                            java.lang.String m82467xfb82e301 = r6Var2.m82467xfb82e301();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m82467xfb82e301, "getName(...)");
                            arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(m82467xfb82e301)));
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LinuxFileSamplerForTestOnly", e17, "parse thread error: " + r6Var2.m82467xfb82e301(), new java.lang.Object[0]);
                        }
                    }
                }
                p0Var = arrayList;
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LinuxFileSamplerForTestOnly", e18, "list thread dir error", new java.lang.Object[0]);
        }
        java.util.Iterator<E> it = p0Var.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            java.lang.String str3 = (java.lang.String) bVar.a(bVar.b(intValue)).get("cpuset");
            if (str3 != null) {
                java.lang.String concat = com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.d() ? str3 + '-' + zh.c.b(com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.b(intValue)) : str3.concat("-?");
                java.lang.Object obj = linkedHashMap2.get(concat);
                if (obj == null) {
                    obj = new java.util.concurrent.atomic.AtomicInteger(0);
                    linkedHashMap2.put(concat, obj);
                }
                ((java.util.concurrent.atomic.AtomicInteger) obj).incrementAndGet();
            }
        }
        java.util.List<java.util.Map.Entry> F0 = kz5.n0.F0(linkedHashMap2.entrySet(), new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.m2());
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
        strArr[1] = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8() ? "bg" : "fg";
        strArr[2] = str2;
        strArr[3] = java.lang.String.valueOf(linkedHashMap2.size());
        ap.a.a(10002, "ThreadProfiler", null, linkedHashMap, strArr);
    }
}
