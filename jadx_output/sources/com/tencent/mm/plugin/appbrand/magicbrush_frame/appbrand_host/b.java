package com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host;

/* loaded from: classes7.dex */
public final class b implements com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f85734a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f85735b;

    /* renamed from: c, reason: collision with root package name */
    public final android.util.SparseArray f85736c;

    public b(com.tencent.mm.plugin.appbrand.o6 runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        this.f85734a = runtime;
        java.lang.String str = "MicroMsg.MBFrameBizHostMiniProgramHolderImpl(" + hashCode() + ')';
        this.f85735b = str;
        this.f85736c = new android.util.SparseArray();
        com.tencent.mars.xlog.Log.i(str, "<init> with runtime:" + runtime);
    }

    public void a() {
        fh1.x0 x0Var;
        java.lang.String str;
        com.tencent.mars.xlog.Log.i(this.f85735b, "destroy");
        android.util.SparseArray sparseArray = this.f85736c;
        int i17 = 0;
        while (true) {
            if (!(i17 < sparseArray.size())) {
                return;
            }
            int i18 = i17 + 1;
            fh1.z zVar = (fh1.z) ((fh1.i) sparseArray.valueAt(i17));
            zVar.f262634h.set(true);
            kotlinx.coroutines.z0.e(zVar.f262633g, null, 1, null);
            synchronized (zVar) {
                x0Var = zVar.f262635i;
                zVar.f262635i = null;
            }
            if (x0Var != null) {
                com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.k0 k0Var = com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.k0.f84302a;
                jc3.j0 j0Var = x0Var.f282995g;
                if (j0Var == null || (str = ((rc3.w0) j0Var).f394087e) == null) {
                    str = "";
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WAMagicBrushFrameTaskManager", "killByBizInstance(" + str + ')');
                java.util.Iterator it = com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.k0.f84303b.iterator();
                kotlin.jvm.internal.o.f(it, "iterator(...)");
                while (it.hasNext()) {
                    fj1.y yVar = (fj1.y) it.next();
                    if (kotlin.jvm.internal.o.b(yVar.f263143c.f84254i, str)) {
                        try {
                            yVar.b();
                        } finally {
                            it.remove();
                        }
                    }
                }
                x0Var.destroy();
            }
            i17 = i18;
        }
    }
}
