package com.tencent.mm.plugin.appbrand.v8_snapshot;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/v8_snapshot/AndroidWxaCommLibV8SnapshotService;", "Landroid/app/Service;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AndroidWxaCommLibV8SnapshotService extends android.app.Service {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f90649e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f90650d = java.util.Collections.newSetFromMap(new java.util.HashMap());

    public final void a(android.os.ResultReceiver resultReceiver, com.eclipsesource.mmv8.snapshot.CreateSnapshotResult result) {
        com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult;
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult2 = null;
        if (!(result instanceof com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success)) {
            if (result instanceof com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Failure) {
                com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Failure failure = (com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Failure) result;
                int i17 = failure.errno;
                java.lang.String errMsg = failure.errMsg;
                kotlin.jvm.internal.o.f(errMsg, "errMsg");
                androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult = new com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult(false, null, new com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult(i17, errMsg));
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("result", androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult2);
            resultReceiver.send(0, bundle);
        }
        com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success success = (com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success) result;
        java.lang.String snapshotPath = success.snapshotPath;
        kotlin.jvm.internal.o.f(snapshotPath, "snapshotPath");
        java.util.Map<java.lang.String, java.lang.Integer> contextNameToSnapshotIndexMap = success.contextNameToSnapshotIndexMap;
        kotlin.jvm.internal.o.f(contextNameToSnapshotIndexMap, "contextNameToSnapshotIndexMap");
        androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult = new com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult(true, new com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult(snapshotPath, contextNameToSnapshotIndexMap), null);
        androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult2 = androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putParcelable("result", androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult2);
        resultReceiver.send(0, bundle2);
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        android.os.Bundle extras;
        com.tencent.mm.plugin.appbrand.v8_snapshot.j jVar = new com.tencent.mm.plugin.appbrand.v8_snapshot.j(this);
        if (intent == null || (extras = intent.getExtras()) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "parseParamsAndDoCreateSnapshot, extras is null");
            jVar.invoke();
            return 2;
        }
        if (!extras.containsKey("createNodeEmbedSnapshot")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "parseParamsAndDoCreateSnapshot, createNodeEmbedSnapshot is null");
            jVar.invoke();
            return 2;
        }
        if (extras.getBoolean("createNodeEmbedSnapshot")) {
            java.lang.String string = extras.getString("snapshotDirPath");
            if (string == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "parseParamsAndDoCreateSnapshot, snapshotDirPath is null");
                jVar.invoke();
                return 2;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AndroidWxaCommLibV8SnapshotService", "doCreateNodeEmbedSnapshot, snapshotDirPath: ".concat(string));
            boolean z17 = cl.x.f42817a;
            com.eclipsesource.mmv8.V8.requireSoLoaded(null);
            com.tencent.mars.xlog.Log.i("MicroMsg.NodeEmbedV8SnapshotCreateLogic", "doCreateSnapshot, snapshotDirPath: ".concat(string));
            com.eclipsesource.mmv8.V8.createNodeSnapshot(string);
            jVar.invoke();
            return 2;
        }
        extras.setClassLoader(com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo.class.getClassLoader());
        android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) extras.getParcelable("resultReceiver");
        if (resultReceiver == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "parseParamsAndDoCreateSnapshot, resultReceiver is null");
            jVar.invoke();
            return 2;
        }
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = (com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader) extras.getParcelable("commLibReader");
        if (iCommLibReader == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "parseParamsAndDoCreateSnapshot, commLibReader is null");
            a(resultReceiver, new com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Failure(-202, "Serialize/Deserialize params failure"));
            jVar.invoke();
            return 2;
        }
        com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = (com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo) extras.getParcelable("snapshotInfo");
        if (wxaPkgV8SnapshotInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "parseParamsAndDoCreateSnapshot, snapshotInfo is null");
            a(resultReceiver, new com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Failure(-202, "Serialize/Deserialize params failure"));
            jVar.invoke();
            return 2;
        }
        if (!extras.containsKey("enableNodeSnapshot")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "parseParamsAndDoCreateSnapshot, enableNodeSnapshot is null");
            a(resultReceiver, new com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Failure(-202, "Serialize/Deserialize params failure"));
            jVar.invoke();
            return 2;
        }
        boolean z18 = extras.getBoolean("enableNodeSnapshot");
        if (extras.containsKey("createNodeOnlySnapshot")) {
            ((ku5.t0) ku5.t0.f312615d).r(new com.tencent.mm.plugin.appbrand.v8_snapshot.h(this, iCommLibReader, extras.getBoolean("createNodeOnlySnapshot"), wxaPkgV8SnapshotInfo, z18, resultReceiver, jVar), "MicroMsg.AndroidWxaCommLibV8SnapshotService");
            return 2;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "parseParamsAndDoCreateSnapshot, createNodeOnlySnapshot is null");
        jVar.invoke();
        return 2;
    }
}
