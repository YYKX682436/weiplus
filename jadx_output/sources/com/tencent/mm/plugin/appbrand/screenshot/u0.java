package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class u0 {
    public u0(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.lang.String posterTaskId, android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(posterTaskId, "posterTaskId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("completePosterTask: posterTaskId=");
        sb6.append(posterTaskId);
        sb6.append(", bitmap=");
        sb6.append(bitmap != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiReturnGeneratedPoster", sb6.toString());
        com.tencent.mm.plugin.appbrand.screenshot.v0 v0Var = (com.tencent.mm.plugin.appbrand.screenshot.v0) com.tencent.mm.plugin.appbrand.screenshot.z0.f88597h.remove(posterTaskId);
        if (v0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiReturnGeneratedPoster", "poster task not found, posterTaskId=".concat(posterTaskId));
            return;
        }
        oz5.i iVar = v0Var.f88584c;
        if (((kotlinx.coroutines.c3) iVar).A()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiReturnGeneratedPoster", "poster task already completed, posterTaskId=".concat(posterTaskId));
        } else {
            ((kotlinx.coroutines.a0) iVar).U(bitmap);
        }
    }
}
