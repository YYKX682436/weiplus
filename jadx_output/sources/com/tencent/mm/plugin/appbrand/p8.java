package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class p8 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.r8 f86329d;

    public p8(com.tencent.mm.plugin.appbrand.r8 r8Var) {
        this.f86329d = r8Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (!this.f86329d.f87759b.L0()) {
            com.tencent.mm.plugin.appbrand.o6 o6Var = this.f86329d.f87759b;
            o6Var.f86189u2 = new com.tencent.mm.plugin.appbrand.ae(o6Var);
            if (((java.lang.Boolean) ((jz5.n) this.f86329d.f87759b.f86189u2.f74953b).getValue()).booleanValue()) {
                this.f86329d.f87759b.f86190v2 = new u65.a(2, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.p8$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.appbrand.service.c0 c0Var;
                        boolean hasNext;
                        com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo;
                        com.tencent.mm.plugin.appbrand.p8 p8Var = com.tencent.mm.plugin.appbrand.p8.this;
                        if (p8Var.f86329d.f87759b.s2()) {
                            return;
                        }
                        p8Var.f86329d.f87759b.getClass();
                        boolean z17 = false;
                        p8Var.f86329d.f87759b.K("mEarlyNotifyServicePackageReadyLatch callback", new java.lang.Object[0]);
                        com.tencent.mm.plugin.appbrand.j3 j3Var = p8Var.f86329d.f87759b.f86188t2;
                        if (j3Var == null || (c0Var = j3Var.f78456h) == null) {
                            return;
                        }
                        c0Var.s1(p8Var.f86329d.f87759b);
                        p8Var.f86329d.f87759b.p2();
                        c0Var.u(p8Var.f86329d.f87759b.E);
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo = p8Var.f86329d.f87759b.E0().f305852r;
                        wxaPkgWrappingInfo.getClass();
                        java.util.Iterator it = null;
                        while (true) {
                            if (z17) {
                                if (it == null) {
                                    it = wxaPkgWrappingInfo.f75402g.iterator();
                                }
                                hasNext = it.hasNext();
                            } else {
                                hasNext = true;
                            }
                            if (!hasNext) {
                                break;
                            }
                            if (z17) {
                                modulePkgInfo = (com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) it.next();
                            } else {
                                z17 = true;
                                modulePkgInfo = wxaPkgWrappingInfo;
                            }
                            if (com.tencent.mm.vfs.w6.j(modulePkgInfo.pkgPath())) {
                                if (modulePkgInfo.independent) {
                                    linkedList.addFirst(modulePkgInfo.name);
                                } else {
                                    linkedList.addLast(modulePkgInfo.name);
                                }
                            }
                        }
                        if (linkedList.isEmpty()) {
                            return;
                        }
                        c0Var.J1(true);
                        java.util.Iterator it6 = linkedList.iterator();
                        while (it6.hasNext()) {
                            c0Var.y((java.lang.String) it6.next());
                        }
                    }
                });
            }
        }
        return jz5.f0.f302826a;
    }
}
