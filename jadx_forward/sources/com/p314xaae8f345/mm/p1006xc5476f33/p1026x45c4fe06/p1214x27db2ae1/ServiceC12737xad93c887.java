package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/v8_snapshot/AndroidWxaCommLibV8SnapshotService;", "Landroid/app/Service;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService */
/* loaded from: classes7.dex */
public final class ServiceC12737xad93c887 extends android.app.Service {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f172182e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f172183d = java.util.Collections.newSetFromMap(new java.util.HashMap());

    public final void a(android.os.ResultReceiver resultReceiver, com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d result) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12739x5dc836a4 c12739x5dc836a4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12739x5dc836a4 c12739x5dc836a42 = null;
        if (!(result instanceof com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Success)) {
            if (result instanceof com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Failure) {
                com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Failure failure = (com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Failure) result;
                int i17 = failure.f5026x5c4d1e6;
                java.lang.String errMsg = failure.f5025xb2d4efdc;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(errMsg, "errMsg");
                c12739x5dc836a4 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12739x5dc836a4(false, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12738x3fae91e0(i17, errMsg));
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("result", c12739x5dc836a42);
            resultReceiver.send(0, bundle);
        }
        com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Success success = (com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Success) result;
        java.lang.String snapshotPath = success.f5030xc8782c09;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(snapshotPath, "snapshotPath");
        java.util.Map<java.lang.String, java.lang.Integer> contextNameToSnapshotIndexMap = success.f5029x86815c23;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(contextNameToSnapshotIndexMap, "contextNameToSnapshotIndexMap");
        c12739x5dc836a4 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12739x5dc836a4(true, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12740xea772199(snapshotPath, contextNameToSnapshotIndexMap), null);
        c12739x5dc836a42 = c12739x5dc836a4;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putParcelable("result", c12739x5dc836a42);
        resultReceiver.send(0, bundle2);
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        android.os.Bundle extras;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j jVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j(this);
        if (intent == null || (extras = intent.getExtras()) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "parseParamsAndDoCreateSnapshot, extras is null");
            jVar.mo152xb9724478();
            return 2;
        }
        if (!extras.containsKey("createNodeEmbedSnapshot")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "parseParamsAndDoCreateSnapshot, createNodeEmbedSnapshot is null");
            jVar.mo152xb9724478();
            return 2;
        }
        if (extras.getBoolean("createNodeEmbedSnapshot")) {
            java.lang.String string = extras.getString("snapshotDirPath");
            if (string == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "parseParamsAndDoCreateSnapshot, snapshotDirPath is null");
                jVar.mo152xb9724478();
                return 2;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AndroidWxaCommLibV8SnapshotService", "doCreateNodeEmbedSnapshot, snapshotDirPath: ".concat(string));
            boolean z17 = cl.x.f124350a;
            com.p159x477cd522.p160x333422.V8.m16094x6b8d2606(null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NodeEmbedV8SnapshotCreateLogic", "doCreateSnapshot, snapshotDirPath: ".concat(string));
            com.p159x477cd522.p160x333422.V8.m16055x54bf2102(string);
            jVar.mo152xb9724478();
            return 2;
        }
        extras.setClassLoader(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80.class.getClassLoader());
        android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) extras.getParcelable("resultReceiver");
        if (resultReceiver == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "parseParamsAndDoCreateSnapshot, resultReceiver is null");
            jVar.mo152xb9724478();
            return 2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33) extras.getParcelable("commLibReader");
        if (interfaceC11702x4ae7c33 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "parseParamsAndDoCreateSnapshot, commLibReader is null");
            a(resultReceiver, new com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Failure(-202, "Serialize/Deserialize params failure"));
            jVar.mo152xb9724478();
            return 2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 c12745x1ee4df80 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80) extras.getParcelable("snapshotInfo");
        if (c12745x1ee4df80 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "parseParamsAndDoCreateSnapshot, snapshotInfo is null");
            a(resultReceiver, new com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Failure(-202, "Serialize/Deserialize params failure"));
            jVar.mo152xb9724478();
            return 2;
        }
        if (!extras.containsKey("enableNodeSnapshot")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "parseParamsAndDoCreateSnapshot, enableNodeSnapshot is null");
            a(resultReceiver, new com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Failure(-202, "Serialize/Deserialize params failure"));
            jVar.mo152xb9724478();
            return 2;
        }
        boolean z18 = extras.getBoolean("enableNodeSnapshot");
        if (extras.containsKey("createNodeOnlySnapshot")) {
            ((ku5.t0) ku5.t0.f394148d).r(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.h(this, interfaceC11702x4ae7c33, extras.getBoolean("createNodeOnlySnapshot"), c12745x1ee4df80, z18, resultReceiver, jVar), "MicroMsg.AndroidWxaCommLibV8SnapshotService");
            return 2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "parseParamsAndDoCreateSnapshot, createNodeOnlySnapshot is null");
        jVar.mo152xb9724478();
        return 2;
    }
}
