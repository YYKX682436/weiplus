package com.tencent.mm.plugin.appbrand.jsapi.nfc.hce;

/* loaded from: classes15.dex */
public class HCEService extends android.nfc.cardemulation.HostApduService {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f82403d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f82404e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f82405f = false;

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.tencent.mars.xlog.Log.i("MicroMsg.HCEService", "HCEService onCreate");
        this.f82404e = cd1.p.b();
        try {
            ka3.m mVar = ka3.u.f306087r;
        } catch (java.lang.ClassNotFoundException unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HCEService", "onCreate init LiteAppNFCServiceMgr");
        }
    }

    @Override // android.nfc.cardemulation.HostApduService
    public void onDeactivated(int i17) {
        boolean z17 = false;
        if (!this.f82405f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HCEService", "HCEService onDeactivated reason: %d", java.lang.Integer.valueOf(i17));
            cd1.o oVar = cd1.o.f40641n;
            oVar.f40647f = false;
            oVar.f40648g = false;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("key_on_deactivated_reason", i17);
            oVar.g(this.f82403d, 41, bundle);
            return;
        }
        if (ed1.f.f251242d == null) {
            ed1.f.f251242d = new ed1.f();
        }
        ed1.f fVar = ed1.f.f251242d;
        fVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("HCE_KEY_COMMAND_TYPE", "HCE_EVENT_DISCONNECT");
        jSONObject.put("HCE_KEY_REASON", i17);
        dd1.a aVar = ed1.f.f251241c;
        if (aVar != null && fVar.f251243b != null) {
            z17 = true;
        }
        if (z17 && aVar != null) {
            aVar.a(jSONObject, this);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.HCEService", "HCEService onDestroy");
        if (!this.f82405f) {
            cd1.o.f40641n.h();
        } else {
            this.f82405f = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.HCEService", "HCEService LiteAppHce onDestroy");
        }
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.HCEService", "HCEService onStartCommand");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.HCEService", "HCEService onStartCommand start: %d", java.lang.Long.valueOf(currentTimeMillis));
        if (intent == null) {
            return super.onStartCommand(intent, i17, i18);
        }
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.HCEService", e17, "under dos attack(?): invalid key_result_receiver", new java.lang.Object[0]);
        }
        if (intent.getIntExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP, 0) == 1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_aid_list");
            if (stringArrayListExtra == null) {
                return super.onStartCommand(intent, i17, i18);
            }
            if (this.f82404e == null) {
                this.f82404e = new java.util.ArrayList();
            }
            ((java.util.ArrayList) this.f82404e).addAll(stringArrayListExtra);
            return super.onStartCommand(intent, i17, i18);
        }
        cd1.o oVar = cd1.o.f40641n;
        android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) intent.getParcelableExtra("HCE_Result_Receiver");
        oVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.HCEServiceMgr", "setHceService");
        oVar.f40652k = this;
        oVar.f40651j = resultReceiver;
        this.f82403d = intent.getStringExtra("key_appid");
        oVar.b(intent);
        java.lang.String str = this.f82403d;
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("key_aid_list");
        oVar.f40642a = str;
        oVar.f40643b = stringArrayListExtra2;
        oVar.f();
        oVar.f40645d = false;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.HCEService", "HCEService onStartCommand end: %d, total: %d", java.lang.Long.valueOf(currentTimeMillis2), java.lang.Long.valueOf(currentTimeMillis2 - currentTimeMillis));
        return super.onStartCommand(intent, i17, i18);
    }

    @Override // android.nfc.cardemulation.HostApduService
    public byte[] processCommandApdu(byte[] bArr, android.os.Bundle bundle) {
        cd1.j jVar = new cd1.j(this, bArr);
        java.lang.String hexCommand = jVar.f40635b;
        com.tencent.mars.xlog.Log.i("MicroMsg.HCEService", "HCECOMMAND processCommandApdu, received command from system: %s", hexCommand);
        if (this.f82404e == null) {
            this.f82404e = new java.util.ArrayList();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.HCEService", "liteAppAidList=%s", this.f82404e.toString());
        if (hexCommand.startsWith("00a4")) {
            if (((java.util.ArrayList) this.f82404e).contains(jVar.a())) {
                this.f82405f = true;
            }
        }
        boolean z17 = false;
        if (!this.f82405f) {
            android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("keyguard");
            if (keyguardManager == null) {
                com.tencent.mars.xlog.Log.w("HCEService.Utils", "isScreenLocked failed, cause keyguardManager is null");
            } else {
                z17 = keyguardManager.inKeyguardRestrictedInputMode();
            }
            if (z17) {
                return null;
            }
            byte[] encode = android.util.Base64.encode(bArr, 2);
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("key_apdu_command", new java.lang.String(encode, java.nio.charset.StandardCharsets.UTF_8));
            cd1.o.f40641n.c(31, this.f82403d, bundle2);
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.HCEService", "send liteapp hce command");
        if (ed1.f.f251242d == null) {
            ed1.f.f251242d = new ed1.f();
        }
        ed1.f fVar = ed1.f.f251242d;
        java.lang.String aidCommand = jVar.a();
        fVar.getClass();
        kotlin.jvm.internal.o.g(hexCommand, "hexCommand");
        kotlin.jvm.internal.o.g(aidCommand, "aidCommand");
        fVar.f251243b = this;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("HCE_KEY_COMMAND_TYPE", "HCE_EVENT_HEX_COMMAND");
        jSONObject.put("HCE_KEY_HEX", hexCommand);
        jSONObject.put("HCE_KEY_AID", aidCommand);
        dd1.a aVar = ed1.f.f251241c;
        if (((aVar == null || fVar.f251243b == null) ? false : true) && aVar != null) {
            aVar.a(jSONObject, this);
        }
        return null;
    }
}
