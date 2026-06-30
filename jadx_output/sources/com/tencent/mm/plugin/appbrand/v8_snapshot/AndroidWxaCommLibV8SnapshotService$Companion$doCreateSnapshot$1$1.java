package com.tencent.mm.plugin.appbrand.v8_snapshot;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/v8_snapshot/AndroidWxaCommLibV8SnapshotService$Companion$doCreateSnapshot$1$1", "Landroid/os/ResultReceiver;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AndroidWxaCommLibV8SnapshotService$Companion$doCreateSnapshot$1$1 extends android.os.ResultReceiver {
    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i17, android.os.Bundle bundle) {
        com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult;
        com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceiveResult, resultCode: ");
        sb6.append(i17);
        sb6.append(", resultData exists: ");
        sb6.append(bundle != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AndroidWxaCommLibV8SnapshotService", sb6.toString());
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a.getClass();
        if (com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AndroidWxaCommLibV8SnapshotService", "onReceiveResult, resultData: " + bundle);
        }
        if (i17 != 0 || bundle == null) {
            ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.appbrand.v8_snapshot.d(null));
            return;
        }
        bundle.setClassLoader(com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult.class.getClassLoader());
        com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult = (com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult) bundle.getParcelable("result");
        if (androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "onReceiveResult, ipcResult is null");
            ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.appbrand.v8_snapshot.e(null));
            return;
        }
        boolean z17 = androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult.f90653d;
        com.eclipsesource.mmv8.snapshot.CreateSnapshotResult failure = (!z17 || (androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult = androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult.f90654e) == null) ? (z17 || (androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult = androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult.f90655f) == null) ? null : new com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Failure(androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult.f90651d, androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult.f90652e) : new com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success(androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult.f90656d, androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult.f90657e);
        if (failure != null) {
            ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.appbrand.v8_snapshot.g(null, failure));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "onReceiveResult, result is null");
            ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.appbrand.v8_snapshot.f(null));
        }
    }
}
