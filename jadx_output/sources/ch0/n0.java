package ch0;

/* loaded from: classes8.dex */
public final class n0 implements com.tencent.wechat.aff.websearch.WebSearchPlatformManagerBase {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.websearch.WebSearchPlatformManagerBase.Callback f41244a;

    @Override // com.tencent.wechat.aff.websearch.WebSearchPlatformManagerBase
    public void createPlatformView(double d17, boolean z17) {
        int a17 = ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, (float) d17);
        java.lang.String content = "into createPlatformView, height: " + d17 + ", h: " + a17 + ", sugVisible: " + z17;
        kotlin.jvm.internal.o.g(content, "content");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content);
        ch0.j0 j0Var = new ch0.j0(a17, z17);
        if (kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            j0Var.run();
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).D(new tg0.e2(j0Var));
    }

    @Override // com.tencent.wechat.aff.websearch.WebSearchPlatformManagerBase
    public void dispose(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "into platform webview scene dispose");
        ch0.k0 k0Var = new ch0.k0(i17);
        if (kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            k0Var.run();
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new tg0.d2(k0Var));
    }

    @Override // com.tencent.wechat.aff.websearch.WebSearchPlatformManagerBase
    public void getWebViewPixelsAsync(long j17) {
        java.lang.Object m521constructorimpl;
        ch0.h hVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "into getWebViewPixelsAsync");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            tg0.k1 Ri = ((yg0.o3) ((tg0.l1) i95.n0.c(tg0.l1.class))).Ri();
            jz5.f0 f0Var = null;
            ch0.z zVar = Ri instanceof ch0.z ? (ch0.z) Ri : null;
            byte[] b17 = (zVar == null || (hVar = zVar.f41273m) == null) ? null : hVar.b();
            com.tencent.wechat.aff.websearch.WebSearchPlatformManagerBase.Callback callback = this.f41244a;
            if (callback != null) {
                callback.onGetWebViewPixelsComplete(j17, b17);
                f0Var = jz5.f0.f302826a;
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            java.lang.String content = "getWebViewPixelsAsync exception: " + m524exceptionOrNullimpl;
            kotlin.jvm.internal.o.g(content, "content");
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", content);
        }
    }

    @Override // com.tencent.wechat.aff.websearch.WebSearchPlatformManagerBase
    public void notifyFilterShowOrHideAsync(long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "into notifyFilterShowOrHideAsync");
        ch0.l0 l0Var = new ch0.l0(z17, this, j17);
        if (kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            l0Var.run();
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new tg0.d2(l0Var));
    }

    @Override // com.tencent.wechat.aff.websearch.WebSearchPlatformManagerBase
    public void notifyFocusChanged(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "into notifyFocusChanged");
        ch0.m0 m0Var = new ch0.m0(z17);
        if (kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            m0Var.run();
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new tg0.d2(m0Var));
    }

    @Override // com.tencent.wechat.aff.websearch.WebSearchPlatformManagerBase
    public void notifyH5BoxResult(int i17, java.lang.String boxId, java.lang.String query, java.lang.String requestId, java.lang.String parentSearchId, java.lang.String resultJson) {
        java.lang.Object m521constructorimpl;
        kotlin.jvm.internal.o.g(boxId, "boxId");
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(requestId, "requestId");
        kotlin.jvm.internal.o.g(parentSearchId, "parentSearchId");
        kotlin.jvm.internal.o.g(resultJson, "resultJson");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "into create h5 box");
        tg0.l1 l1Var = (tg0.l1) i95.n0.c(tg0.l1.class);
        jz5.l[] lVarArr = new jz5.l[8];
        lVarArr[0] = new jz5.l("boxId", boxId);
        lVarArr[1] = new jz5.l("query", query);
        lVarArr[2] = new jz5.l("resultJson", resultJson);
        lVarArr[3] = new jz5.l("businessType", java.lang.String.valueOf(i17));
        lVarArr[4] = new jz5.l("requestId", requestId);
        lVarArr[5] = new jz5.l("parentSearchId", parentSearchId);
        lVarArr[6] = new jz5.l("mode", "2");
        yg0.o3 o3Var = (yg0.o3) l1Var;
        tg0.k1 Ri = o3Var.Ri();
        ch0.z zVar = Ri instanceof ch0.z ? (ch0.z) Ri : null;
        lVarArr[7] = new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.String.valueOf(zVar != null ? java.lang.Integer.valueOf(zVar.f41262b) : null));
        java.util.Map l17 = kz5.c1.l(lVarArr);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            o3Var.Ai(l17);
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            java.lang.String content = "create h5 box exception: " + m524exceptionOrNullimpl;
            kotlin.jvm.internal.o.g(content, "content");
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", content);
        }
    }

    @Override // com.tencent.wechat.aff.websearch.WebSearchPlatformManagerBase
    public void setCallback(com.tencent.wechat.aff.websearch.WebSearchPlatformManagerBase.Callback callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f41244a = callback;
    }
}
