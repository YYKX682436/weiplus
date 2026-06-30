package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/v8_snapshot/AndroidWxaCommLibV8SnapshotService$Companion$doCreateSnapshot$1$1", "Landroid/os/ResultReceiver;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$doCreateSnapshot$1$1 */
/* loaded from: classes7.dex */
public final class ResultReceiverC12741x779f831a extends android.os.ResultReceiver {
    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12738x3fae91e0 c12738x3fae91e0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12740xea772199 c12740xea772199;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceiveResult, resultCode: ");
        sb6.append(i17);
        sb6.append(", resultData exists: ");
        sb6.append(bundle != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AndroidWxaCommLibV8SnapshotService", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172282a.getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172284c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AndroidWxaCommLibV8SnapshotService", "onReceiveResult, resultData: " + bundle);
        }
        if (i17 != 0 || bundle == null) {
            ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.d(null));
            return;
        }
        bundle.setClassLoader(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12739x5dc836a4.class.getClassLoader());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12739x5dc836a4 c12739x5dc836a4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12739x5dc836a4) bundle.getParcelable("result");
        if (c12739x5dc836a4 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "onReceiveResult, ipcResult is null");
            ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.e(null));
            return;
        }
        boolean z17 = c12739x5dc836a4.f172186d;
        com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d failure = (!z17 || (c12740xea772199 = c12739x5dc836a4.f172187e) == null) ? (z17 || (c12738x3fae91e0 = c12739x5dc836a4.f172188f) == null) ? null : new com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Failure(c12738x3fae91e0.f172184d, c12738x3fae91e0.f172185e) : new com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Success(c12740xea772199.f172189d, c12740xea772199.f172190e);
        if (failure != null) {
            ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.g(null, failure));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "onReceiveResult, result is null");
            ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.f(null));
        }
    }
}
