package com.tencent.mm.plugin.appbrand.launch.magicbrush_frame;

/* loaded from: classes7.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.h0 f84288a = new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.h0();

    public final void a(com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameLaunchParams params, fh1.z bizHostImpl) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(bizHostImpl, "bizHostImpl");
        com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.k0 k0Var = com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.k0.f84302a;
        java.lang.String str = params.f84242d;
        java.lang.String str2 = params.f84243e;
        int i17 = params.f84244f;
        java.util.Iterator it = com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.k0.f84303b.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            fj1.y yVar = (fj1.y) next;
            boolean z17 = false;
            if (yVar.f263147g == i17) {
                if ((str2 == null || str2.length() == 0) || !kotlin.jvm.internal.o.b(yVar.c(), str2)) {
                    if (!(str == null || str.length() == 0)) {
                        java.lang.String str3 = yVar.f263145e;
                        if (str3 == null) {
                            kotlin.jvm.internal.o.o(dm.i4.COL_USERNAME);
                            throw null;
                        }
                        if (!kotlin.jvm.internal.o.b(str3, str)) {
                        }
                    }
                }
                z17 = true;
            }
            if (z17) {
                obj = next;
                break;
            }
        }
        fj1.y yVar2 = (fj1.y) obj;
        if (yVar2 == null) {
            yVar2 = new fj1.y(params);
            com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.k0 k0Var2 = com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.k0.f84302a;
            com.tencent.mars.xlog.Log.i("MicroMsg.WAMagicBrushFrameTaskManager", "addTask hash:" + yVar2.hashCode() + ", params:" + yVar2.f263143c);
            com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.k0.f84303b.add(yVar2);
            uk0.a.b(params, com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.t.f84316d, new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.u(new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.v(yVar2), params));
        }
        com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.f0 f0Var = new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.f0(yVar2, bizHostImpl, params);
        ej1.g gVar = yVar2.f253278a;
        int compareTo = gVar.compareTo(ej1.g.INITIALIZED);
        ej1.g gVar2 = ej1.g.DESTROYED;
        if (compareTo >= 0 && gVar.compareTo(gVar2) < 0) {
            f0Var.invoke();
            return;
        }
        if (gVar != gVar2) {
            yVar2.f253279b.add(new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.g0(f0Var, yVar2));
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.WAMagicBrushFrameLauncher", "WAMagicBrushFrameRuntime(" + yVar2.c() + ").runOnInitialized but destroyed");
    }
}
