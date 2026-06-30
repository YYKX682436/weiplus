package com.tencent.mm.mnxnet;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010\u0003\u001a\u00020\u0002J)\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0086 J\t\u0010\n\u001a\u00020\u0004H\u0086 J\u0011\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086 J\u001e\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\b\u0010\u000e\u001a\u00020\rH\u0007J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\rH\u0007J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\b\u0010\u0014\u001a\u00020\u0011H\u0007J\b\u0010\u0015\u001a\u00020\u0011H\u0007J\b\u0010\u0017\u001a\u00020\u0016H\u0007J\b\u0010\u0018\u001a\u00020\u0011H\u0007J\b\u0010\u0019\u001a\u00020\u0011H\u0007R\u0016\u0010\u001a\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/tencent/mm/mnxnet/WeXNetJSBinding;", "", "Ljz5/f0;", "destroy", "", "runtime", "jsEngine", "jsContext", "uvLoop", "nativeBindTo", "nativeCreate", "nativeDestroy", "bindTo", "Lb01/a;", "getWeXNetCallback", "weXNetCallback", "setWeXNetCallback", "", com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "getLocalFilePath", "getWAAppInfo_appId", "getWAAppInfo_path", "", "getWAAppInfo_isGame", "getWAModelCache_path", "getWANpuLibs_path", "mWeXNetCallback", "Lb01/a;", "mRuntime", "J", "<init>", "()V", "mnxnet_universalRelease"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class WeXNetJSBinding {
    private long mRuntime = nativeCreate();
    private b01.a mWeXNetCallback;

    public static final /* synthetic */ b01.a access$getMWeXNetCallback$p(com.tencent.mm.mnxnet.WeXNetJSBinding weXNetJSBinding) {
        b01.a aVar = weXNetJSBinding.mWeXNetCallback;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.o.o("mWeXNetCallback");
        throw null;
    }

    public final void bindTo(long j17, long j18, long j19) {
        long j27 = this.mRuntime;
        if (j27 != 0) {
            nativeBindTo(j27, j17, j18, j19);
        }
    }

    public final void destroy() {
        long j17 = this.mRuntime;
        if (j17 != 0) {
            nativeDestroy(j17);
            this.mRuntime = 0L;
        }
    }

    public final java.lang.String getLocalFilePath(java.lang.String path) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var;
        java.lang.String o17;
        kotlin.jvm.internal.o.h(path, "path");
        return (this.mWeXNetCallback == null || (c0Var = (com.tencent.mm.plugin.appbrand.service.c0) ((com.tencent.mm.plugin.appbrand.service.o) getWeXNetCallback()).f88727a.F()) == null || c0Var.getFileSystem() == null || c0Var.getFileSystem().getAbsoluteFile(path) == null || (o17 = c0Var.getFileSystem().getAbsoluteFile(path).o()) == null) ? "" : o17;
    }

    public final java.lang.String getWAAppInfo_appId() {
        b01.a aVar = this.mWeXNetCallback;
        return aVar != null ? ((com.tencent.mm.plugin.appbrand.service.o) aVar).f88727a.N() : "";
    }

    public final boolean getWAAppInfo_isGame() {
        b01.a aVar = this.mWeXNetCallback;
        if (aVar == null) {
            return false;
        }
        if (aVar != null) {
            aVar.getClass();
            return false;
        }
        kotlin.jvm.internal.o.o("mWeXNetCallback");
        throw null;
    }

    public final java.lang.String getWAAppInfo_path() {
        b01.a aVar = this.mWeXNetCallback;
        if (aVar == null) {
            return "";
        }
        if (aVar != null) {
            com.tencent.mm.plugin.appbrand.service.j jVar = ((com.tencent.mm.plugin.appbrand.service.o) aVar).f88727a;
            return (jVar.S() == null || jVar.S().x0() == null) ? "" : jVar.S().x0().getCurrentUrl();
        }
        kotlin.jvm.internal.o.o("mWeXNetCallback");
        throw null;
    }

    public final java.lang.String getWAModelCache_path() {
        j81.k kVar;
        if (this.mWeXNetCallback == null) {
            return "";
        }
        com.tencent.mm.plugin.appbrand.service.o oVar = (com.tencent.mm.plugin.appbrand.service.o) getWeXNetCallback();
        com.tencent.mm.plugin.appbrand.service.j jVar = oVar.f88727a;
        if ((jVar.S() == null && jVar.S().x0() == null) || (kVar = (j81.k) i95.n0.c(j81.k.class)) == null) {
            return "";
        }
        java.lang.String Ai = ((k81.a) kVar).Ai(oVar.f88727a.N());
        com.tencent.mm.wexnet.WeXNet.activateCacheFiles(Ai);
        return Ai;
    }

    public final java.lang.String getWANpuLibs_path() {
        if (this.mWeXNetCallback == null) {
            return "";
        }
        com.tencent.mm.plugin.appbrand.service.j jVar = ((com.tencent.mm.plugin.appbrand.service.o) getWeXNetCallback()).f88727a;
        if (jVar.S() == null && jVar.S().x0() == null) {
            return "";
        }
        new com.tencent.mm.wexnet.a();
        return com.tencent.mm.wexnet.v.f214379a.c();
    }

    public final b01.a getWeXNetCallback() {
        b01.a aVar = this.mWeXNetCallback;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.o.o("mWeXNetCallback");
        throw null;
    }

    public final native void nativeBindTo(long j17, long j18, long j19, long j27);

    public final native long nativeCreate();

    public final native void nativeDestroy(long j17);

    public final void setWeXNetCallback(b01.a weXNetCallback) {
        kotlin.jvm.internal.o.h(weXNetCallback, "weXNetCallback");
        this.mWeXNetCallback = weXNetCallback;
    }
}
