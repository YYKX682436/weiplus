package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public abstract class u8 implements com.tencent.mm.plugin.appbrand.launching.n1, im5.a {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.AppBrandRuntime f85230d;

    /* renamed from: e, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.launching.n1 f85231e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f85232f;

    public u8(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime, com.tencent.mm.plugin.appbrand.launching.n1 referenced) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(referenced, "referenced");
        this.f85230d = runtime;
        com.tencent.mars.xlog.Log.i("MicroMsg.LaunchPrepareCallbackWrapper", "<init> hash=" + hashCode());
        runtime.keep(this);
        this.f85231e = referenced;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.n1
    public void A() {
        try {
            com.tencent.mm.plugin.appbrand.launching.n1 n1Var = this.f85231e;
            if (n1Var != null) {
                n1Var.A();
            }
        } catch (java.lang.Throwable th6) {
            if (!this.f85232f) {
                throw th6;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.LaunchPrepareCallbackWrapper", "tryOfThrows when dead, get exception: " + android.util.Log.getStackTraceString(th6));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.n1
    public void C() {
        try {
            com.tencent.mm.plugin.appbrand.launching.n1 n1Var = this.f85231e;
            if (n1Var != null) {
                n1Var.C();
            }
        } catch (java.lang.Throwable th6) {
            if (!this.f85232f) {
                throw th6;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.LaunchPrepareCallbackWrapper", "tryOfThrows when dead, get exception: " + android.util.Log.getStackTraceString(th6));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.y4
    public void E(int i17) {
        try {
            com.tencent.mm.plugin.appbrand.launching.n1 n1Var = this.f85231e;
            if (n1Var != null) {
                n1Var.E(i17);
            }
        } catch (java.lang.Throwable th6) {
            if (!this.f85232f) {
                throw th6;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.LaunchPrepareCallbackWrapper", "tryOfThrows when dead, get exception: " + android.util.Log.getStackTraceString(th6));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.n1
    public void F() {
        try {
            com.tencent.mm.plugin.appbrand.launching.n1 n1Var = this.f85231e;
            if (n1Var != null) {
                n1Var.F();
            }
        } catch (java.lang.Throwable th6) {
            if (!this.f85232f) {
                throw th6;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.LaunchPrepareCallbackWrapper", "tryOfThrows when dead, get exception: " + android.util.Log.getStackTraceString(th6));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.n1
    public void G(com.tencent.luggage.sdk.config.AppBrandSysConfigLU appBrandSysConfigLU, com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction appBrandLaunchErrorAction, com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle appStartupPerformanceReportBundle) {
        try {
            com.tencent.mm.plugin.appbrand.launching.n1 n1Var = this.f85231e;
            if (n1Var != null) {
                n1Var.G(appBrandSysConfigLU, appBrandLaunchErrorAction, appStartupPerformanceReportBundle);
            }
        } catch (java.lang.Throwable th6) {
            if (!this.f85232f) {
                throw th6;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.LaunchPrepareCallbackWrapper", "tryOfThrows when dead, get exception: " + android.util.Log.getStackTraceString(th6));
        }
        if (this.f85232f) {
            return;
        }
        dead();
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.n1
    public void H(int i17) {
        try {
            com.tencent.mm.plugin.appbrand.launching.n1 n1Var = this.f85231e;
            if (n1Var != null) {
                n1Var.H(i17);
            }
        } catch (java.lang.Throwable th6) {
            if (!this.f85232f) {
                throw th6;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.LaunchPrepareCallbackWrapper", "tryOfThrows when dead, get exception: " + android.util.Log.getStackTraceString(th6));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.n1
    public void J() {
        try {
            com.tencent.mm.plugin.appbrand.launching.n1 n1Var = this.f85231e;
            if (n1Var != null) {
                n1Var.J();
            }
        } catch (java.lang.Throwable th6) {
            if (!this.f85232f) {
                throw th6;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.LaunchPrepareCallbackWrapper", "tryOfThrows when dead, get exception: " + android.util.Log.getStackTraceString(th6));
        }
    }

    public abstract void dead();

    @Override // com.tencent.mm.plugin.appbrand.launching.n1
    public void w(long j17) {
        try {
            com.tencent.mm.plugin.appbrand.launching.n1 n1Var = this.f85231e;
            if (n1Var != null) {
                n1Var.w(j17);
            }
        } catch (java.lang.Throwable th6) {
            if (!this.f85232f) {
                throw th6;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.LaunchPrepareCallbackWrapper", "tryOfThrows when dead, get exception: " + android.util.Log.getStackTraceString(th6));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.n1
    public void y() {
        try {
            com.tencent.mm.plugin.appbrand.launching.n1 n1Var = this.f85231e;
            if (n1Var != null) {
                n1Var.y();
            }
        } catch (java.lang.Throwable th6) {
            if (!this.f85232f) {
                throw th6;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.LaunchPrepareCallbackWrapper", "tryOfThrows when dead, get exception: " + android.util.Log.getStackTraceString(th6));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.n1
    public void z(java.lang.String migrateTargetAppId) {
        kotlin.jvm.internal.o.g(migrateTargetAppId, "migrateTargetAppId");
        try {
            com.tencent.mm.plugin.appbrand.launching.n1 n1Var = this.f85231e;
            if (n1Var != null) {
                n1Var.z(migrateTargetAppId);
            }
        } catch (java.lang.Throwable th6) {
            if (!this.f85232f) {
                throw th6;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.LaunchPrepareCallbackWrapper", "tryOfThrows when dead, get exception: " + android.util.Log.getStackTraceString(th6));
        }
    }
}
