package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* loaded from: classes7.dex */
public class x extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    public static final int f33835x366c91de = 291;

    /* renamed from: NAME */
    public static final java.lang.String f33836x24728b = "createAudioInstance";

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Vector f160831g = new java.util.Vector();

    public static java.lang.String B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
        java.lang.String a17 = dl3.h.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.JsApiCreateAudioInstance", "createAudioInstance appId:%s, audioId:%s", mo48798x74292566, a17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.w();
        wVar.f160827e = a17;
        wVar.f160828f = 0;
        wVar.f160826d = mo48798x74292566;
        wVar.c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.v vVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.v(mo48798x74292566, lVar);
        java.util.Vector vector = f160831g;
        if (!vector.contains(mo48798x74292566)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(mo48798x74292566, vVar);
            vector.add(mo48798x74292566);
        }
        return a17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("audioId", B(lVar));
        return p("ok", hashMap);
    }
}
