package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.hce;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.HCEService */
/* loaded from: classes15.dex */
public class C12193x5bbe54ab extends android.nfc.cardemulation.HostApduService {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f163936d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f163937e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f163938f = false;

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEService", "HCEService onCreate");
        this.f163937e = cd1.p.b();
        try {
            ka3.m mVar = ka3.u.f387620r;
        } catch (java.lang.ClassNotFoundException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEService", "onCreate init LiteAppNFCServiceMgr");
        }
    }

    @Override // android.nfc.cardemulation.HostApduService
    public void onDeactivated(int i17) {
        boolean z17 = false;
        if (!this.f163938f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEService", "HCEService onDeactivated reason: %d", java.lang.Integer.valueOf(i17));
            cd1.o oVar = cd1.o.f122174n;
            oVar.f122180f = false;
            oVar.f122181g = false;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("key_on_deactivated_reason", i17);
            oVar.g(this.f163936d, 41, bundle);
            return;
        }
        if (ed1.f.f332775d == null) {
            ed1.f.f332775d = new ed1.f();
        }
        ed1.f fVar = ed1.f.f332775d;
        fVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("HCE_KEY_COMMAND_TYPE", "HCE_EVENT_DISCONNECT");
        jSONObject.put("HCE_KEY_REASON", i17);
        dd1.a aVar = ed1.f.f332774c;
        if (aVar != null && fVar.f332776b != null) {
            z17 = true;
        }
        if (z17 && aVar != null) {
            aVar.a(jSONObject, this);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEService", "HCEService onDestroy");
        if (!this.f163938f) {
            cd1.o.f122174n.h();
        } else {
            this.f163938f = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEService", "HCEService LiteAppHce onDestroy");
        }
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEService", "HCEService onStartCommand");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEService", "HCEService onStartCommand start: %d", java.lang.Long.valueOf(currentTimeMillis));
        if (intent == null) {
            return super.onStartCommand(intent, i17, i18);
        }
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.HCEService", e17, "under dos attack(?): invalid key_result_receiver", new java.lang.Object[0]);
        }
        if (intent.getIntExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14346xd56cf4f0, 0) == 1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_aid_list");
            if (stringArrayListExtra == null) {
                return super.onStartCommand(intent, i17, i18);
            }
            if (this.f163937e == null) {
                this.f163937e = new java.util.ArrayList();
            }
            ((java.util.ArrayList) this.f163937e).addAll(stringArrayListExtra);
            return super.onStartCommand(intent, i17, i18);
        }
        cd1.o oVar = cd1.o.f122174n;
        android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) intent.getParcelableExtra("HCE_Result_Receiver");
        oVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEServiceMgr", "setHceService");
        oVar.f122185k = this;
        oVar.f122184j = resultReceiver;
        this.f163936d = intent.getStringExtra("key_appid");
        oVar.b(intent);
        java.lang.String str = this.f163936d;
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("key_aid_list");
        oVar.f122175a = str;
        oVar.f122176b = stringArrayListExtra2;
        oVar.f();
        oVar.f122178d = false;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEService", "HCEService onStartCommand end: %d, total: %d", java.lang.Long.valueOf(currentTimeMillis2), java.lang.Long.valueOf(currentTimeMillis2 - currentTimeMillis));
        return super.onStartCommand(intent, i17, i18);
    }

    @Override // android.nfc.cardemulation.HostApduService
    public byte[] processCommandApdu(byte[] bArr, android.os.Bundle bundle) {
        cd1.j jVar = new cd1.j(this, bArr);
        java.lang.String hexCommand = jVar.f122168b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEService", "HCECOMMAND processCommandApdu, received command from system: %s", hexCommand);
        if (this.f163937e == null) {
            this.f163937e = new java.util.ArrayList();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEService", "liteAppAidList=%s", this.f163937e.toString());
        if (hexCommand.startsWith("00a4")) {
            if (((java.util.ArrayList) this.f163937e).contains(jVar.a())) {
                this.f163938f = true;
            }
        }
        boolean z17 = false;
        if (!this.f163938f) {
            android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("keyguard");
            if (keyguardManager == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("HCEService.Utils", "isScreenLocked failed, cause keyguardManager is null");
            } else {
                z17 = keyguardManager.inKeyguardRestrictedInputMode();
            }
            if (z17) {
                return null;
            }
            byte[] encode = android.util.Base64.encode(bArr, 2);
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("key_apdu_command", new java.lang.String(encode, java.nio.charset.StandardCharsets.UTF_8));
            cd1.o.f122174n.c(31, this.f163936d, bundle2);
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEService", "send liteapp hce command");
        if (ed1.f.f332775d == null) {
            ed1.f.f332775d = new ed1.f();
        }
        ed1.f fVar = ed1.f.f332775d;
        java.lang.String aidCommand = jVar.a();
        fVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hexCommand, "hexCommand");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aidCommand, "aidCommand");
        fVar.f332776b = this;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("HCE_KEY_COMMAND_TYPE", "HCE_EVENT_HEX_COMMAND");
        jSONObject.put("HCE_KEY_HEX", hexCommand);
        jSONObject.put("HCE_KEY_AID", aidCommand);
        dd1.a aVar = ed1.f.f332774c;
        if (((aVar == null || fVar.f332776b == null) ? false : true) && aVar != null) {
            aVar.a(jSONObject, this);
        }
        return null;
    }
}
