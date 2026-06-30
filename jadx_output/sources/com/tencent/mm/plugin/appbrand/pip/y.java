package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public class y implements pd1.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.pip.o0 f87567a;

    public y(com.tencent.mm.plugin.appbrand.pip.o0 o0Var) {
        this.f87567a = o0Var;
    }

    public void a(pd1.o oVar) {
        java.lang.String key = oVar.getKey();
        com.tencent.mars.xlog.Log.i(this.f87567a.f87518a, "onError, key: " + key);
    }

    public void b(pd1.o oVar) {
        com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView appBrandPipContainerView;
        java.lang.String key = oVar.getKey();
        com.tencent.mm.plugin.appbrand.pip.o0 o0Var = this.f87567a;
        com.tencent.mars.xlog.Log.i(o0Var.f87518a, "onLoadEnd, key: " + key);
        java.lang.String str = o0Var.f87530m;
        if (str == null || !str.equals(key) || (appBrandPipContainerView = o0Var.f87523f) == null) {
            return;
        }
        appBrandPipContainerView.post(new com.tencent.mm.plugin.appbrand.pip.t(this));
        oVar.start();
    }

    public void c(pd1.o oVar) {
        com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView appBrandPipContainerView;
        java.lang.String key = oVar.getKey();
        com.tencent.mm.plugin.appbrand.pip.o0 o0Var = this.f87567a;
        com.tencent.mars.xlog.Log.i(o0Var.f87518a, "onLoading, key: " + key);
        java.lang.String str = o0Var.f87530m;
        if (str == null || !str.equals(key) || (appBrandPipContainerView = o0Var.f87523f) == null) {
            return;
        }
        appBrandPipContainerView.post(new com.tencent.mm.plugin.appbrand.pip.s(this));
    }

    public void d(pd1.o oVar) {
        java.lang.String key = oVar.getKey();
        com.tencent.mars.xlog.Log.i(this.f87567a.f87518a, "onPause, key: " + key);
        if (this.f87567a.D) {
            com.tencent.mars.xlog.Log.i(this.f87567a.f87518a, "onPause, runtime paused");
            return;
        }
        java.lang.Integer c17 = oVar.c();
        if (c17 == null) {
            com.tencent.mars.xlog.Log.w(this.f87567a.f87518a, "onPause, pageViewId is null");
            return;
        }
        com.tencent.mm.plugin.appbrand.pip.o0 o0Var = this.f87567a;
        int intValue = c17.intValue();
        pd1.n type = oVar.getType();
        com.tencent.mm.plugin.appbrand.pip.d h17 = o0Var.h(intValue);
        if (h17 != null) {
            h17.c(type, key);
        }
        java.lang.String str = this.f87567a.f87530m;
        if (str == null || !str.equals(key)) {
            this.f87567a.l(c17.intValue(), key, "onPause");
        }
    }

    public void e(pd1.o oVar, boolean z17) {
        com.tencent.mm.plugin.appbrand.pip.c cVar;
        com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView appBrandPipContainerView;
        java.lang.String str;
        pd1.c cVar2;
        java.lang.String key = oVar.getKey();
        com.tencent.mars.xlog.Log.i(this.f87567a.f87518a, "onPlay, key: " + key);
        if (this.f87567a.D) {
            com.tencent.mars.xlog.Log.i(this.f87567a.f87518a, "onPlay, runtime paused");
            return;
        }
        java.lang.Integer c17 = oVar.c();
        pd1.c cVar3 = pd1.c.NONE;
        int i17 = 1;
        if (c17 != null) {
            cVar = this.f87567a.j(c17.intValue(), key);
            if (cVar != null) {
                pd1.c cVar4 = cVar.f87430b;
                if ((cVar4 == null || cVar3 == cVar4) ? false : true) {
                    com.tencent.mm.plugin.appbrand.pip.o0 o0Var = this.f87567a;
                    int intValue = c17.intValue();
                    pd1.n type = oVar.getType();
                    com.tencent.mm.plugin.appbrand.pip.d h17 = o0Var.h(intValue);
                    if (h17 != null) {
                        if (!o0Var.f87524g) {
                            o0Var.f87521d.setPipPageLifeCycleListener(new com.tencent.mm.plugin.appbrand.pip.p(o0Var));
                            o0Var.f87521d.setOnPageSwitchListener(new com.tencent.mm.plugin.appbrand.pip.r(o0Var));
                            com.tencent.mm.plugin.appbrand.x0.a(o0Var.f87520c.f74803n, new com.tencent.mm.plugin.appbrand.pip.o(o0Var));
                            o0Var.f87521d.setDelegateWrapperFactory(new com.tencent.mm.plugin.appbrand.pip.b0(o0Var));
                            o0Var.f87524g = true;
                        }
                        h17.a(type, key);
                    }
                }
            }
        } else {
            com.tencent.mars.xlog.Log.w(this.f87567a.f87518a, "onPlay, pageViewId is null");
            cVar = null;
        }
        com.tencent.mm.plugin.appbrand.pip.k kVar = this.f87567a.C;
        if (kVar != null && cVar != null && (cVar2 = cVar.f87430b) != null && cVar3 != cVar2) {
            com.tencent.mm.autogen.mmdata.rpt.WeAppFloatingVideoStruct a17 = ((com.tencent.mm.plugin.appbrand.pip.p0) kVar).a(cVar.f87437i);
            a17.f62277g = 1L;
            int ordinal = cVar2.ordinal();
            if (ordinal != 1) {
                i17 = 2;
                if (ordinal != 2) {
                    i17 = 3;
                    if (ordinal != 3) {
                        i17 = 0;
                    }
                }
            }
            a17.f62278h = i17;
            a17.k();
        }
        if (com.tencent.mm.plugin.appbrand.pip.o0.b(this.f87567a) && (str = this.f87567a.f87530m) != null && str.equals(key)) {
            com.tencent.mm.plugin.appbrand.pip.o0 o0Var2 = this.f87567a;
            if (o0Var2.f87523f != null) {
                com.tencent.mars.xlog.Log.i(o0Var2.f87518a, "processTransferFromOnPlay for other video is playing");
                this.f87567a.f87523f.post(new com.tencent.mm.plugin.appbrand.pip.x(this, z17));
                return;
            }
        }
        java.lang.String str2 = this.f87567a.f87530m;
        if (str2 != null && str2.equals(key)) {
            com.tencent.mars.xlog.Log.i(this.f87567a.f87518a, "onPlay, mark pip video play");
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.pip.u(this));
            com.tencent.mm.plugin.appbrand.pip.o0 o0Var3 = this.f87567a;
            o0Var3.f87536s = false;
            o0Var3.f87543z.requestFocus();
            return;
        }
        if (c17 != null) {
            this.f87567a.d(c17.intValue(), key, "onPlay");
        }
        com.tencent.mm.plugin.appbrand.pip.o0 o0Var4 = this.f87567a;
        if ((o0Var4.f87538u && o0Var4.f87539v) || o0Var4.f87530m == null || (appBrandPipContainerView = o0Var4.f87523f) == null) {
            return;
        }
        appBrandPipContainerView.post(new com.tencent.mm.plugin.appbrand.pip.x(this, z17));
    }

    public void f(pd1.o oVar) {
        java.lang.String key = oVar.getKey();
        com.tencent.mars.xlog.Log.i(this.f87567a.f87518a, "onPlayEnd, key: " + key);
        java.lang.String str = this.f87567a.f87530m;
        if (str != null && str.equals(key)) {
            com.tencent.mm.plugin.appbrand.pip.o0 o0Var = this.f87567a;
            if (o0Var.f87523f != null) {
                o0Var.a("onPlayEnd");
                o0Var.f87536s = true;
            }
        }
        java.lang.Integer c17 = oVar.c();
        if (c17 != null) {
            com.tencent.mm.plugin.appbrand.pip.o0 o0Var2 = this.f87567a;
            int intValue = c17.intValue();
            pd1.n type = oVar.getType();
            com.tencent.mm.plugin.appbrand.pip.d h17 = o0Var2.h(intValue);
            if (h17 != null) {
                h17.c(type, key);
            }
            java.lang.String str2 = this.f87567a.f87530m;
            if (str2 == null || !str2.equals(key)) {
                this.f87567a.l(c17.intValue(), key, "onPlayEnd");
            }
        } else {
            com.tencent.mars.xlog.Log.w(this.f87567a.f87518a, "onPlayEnd, pageViewId is null");
        }
        if (this.f87567a.f87529l != null) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.pip.w(this));
        }
    }

    public void g(pd1.o oVar) {
        java.lang.String key = oVar.getKey();
        com.tencent.mm.plugin.appbrand.pip.o0 o0Var = this.f87567a;
        com.tencent.mars.xlog.Log.i(o0Var.f87518a, "onStop, key: " + key);
        java.lang.String str = o0Var.f87530m;
        if (str != null && str.equals(key) && o0Var.f87523f != null) {
            o0Var.a("onStop");
            o0Var.f87536s = true;
        }
        java.lang.Integer c17 = oVar.c();
        if (c17 == null) {
            com.tencent.mars.xlog.Log.w(o0Var.f87518a, "onStop, pageViewId is null");
            return;
        }
        int intValue = c17.intValue();
        pd1.n type = oVar.getType();
        com.tencent.mm.plugin.appbrand.pip.d h17 = o0Var.h(intValue);
        if (h17 != null) {
            h17.c(type, key);
        }
        java.lang.String str2 = o0Var.f87530m;
        if (str2 == null || !str2.equals(key)) {
            o0Var.l(c17.intValue(), key, "onStop");
        }
    }
}
