package kd1;

/* loaded from: classes7.dex */
public class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.i<android.os.Bundle, android.os.Bundle> {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("0,");
        kd1.e.b().getClass();
        sb6.append((java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOICE_OFFLINE_RES_IDS_STRING_SYNC, ""));
        java.lang.String sb7 = sb6.toString();
        kd1.e.b();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOICE_OFFLINE_RES_ID_STRING_SYNC, "0");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.IPCLoadPaySpeechDialectConfig", "idsStr:%s  resId:%s", sb7, str);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("idsStr", sb7);
        bundle.putString("resId", str);
        if (rVar != null) {
            rVar.a(bundle);
        }
    }
}
