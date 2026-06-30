package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae;

/* loaded from: classes7.dex */
public class d0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.NativeCallback f224989b;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w wVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.NativeCallback nativeCallback) {
        this.f224988a = str;
        this.f224989b = nativeCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.String] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.x0
    public void a(java.lang.String str) {
        gp.d dVar;
        boolean isEmpty = str.isEmpty();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.NativeCallback nativeCallback = this.f224989b;
        java.lang.String str2 = "{}";
        if (isEmpty) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMWxaLiteAppCenter", "get filepath from src: %s fail", this.f224988a);
            nativeCallback.m65629x9ad64344("{}");
            return;
        }
        gp.d dVar2 = null;
        gp.d dVar3 = null;
        try {
            try {
                try {
                    dVar = new gp.d();
                } catch (java.lang.Throwable th6) {
                    th = th6;
                }
            } catch (java.lang.Exception e17) {
                e = e17;
            }
        } catch (java.io.IOException unused) {
        }
        try {
            dVar.setDataSource(str);
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(24), 0);
            java.lang.String extractMetadata = dVar.extractMetadata(12);
            int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(9), 0);
            long k17 = com.p314xaae8f345.mm.vfs.w6.k(str);
            int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(18), 0);
            int P4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(19), 0);
            int P5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(20), 0);
            float L = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(dVar.extractMetadata(25), 0.0f);
            if (L == 0.0f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "fps is 0");
                L = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.a(str);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "filepath: %s, rotation: %d, type: %s, duration: %d, size %d, width: %d, height: %d, bitrate: %d, fps: %f", str, java.lang.Integer.valueOf(P), extractMetadata, java.lang.Integer.valueOf(P2), java.lang.Long.valueOf(k17), java.lang.Integer.valueOf(P3), java.lang.Integer.valueOf(P4), java.lang.Integer.valueOf(P5), java.lang.Float.valueOf(L));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("orientation", P != 90 ? P != 180 ? P != 270 ? "up" : "left" : "down" : "right");
            ?? r76 = "type";
            jSONObject.put("type", extractMetadata.replace("video/", ""));
            jSONObject.put("duration", P2);
            jSONObject.put("size", k17);
            jSONObject.put("height", P4);
            jSONObject.put("width", P3);
            jSONObject.put(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15517x245ebd1, (int) L);
            jSONObject.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, P5);
            str2 = jSONObject.toString();
            dVar.release();
            dVar2 = r76;
        } catch (java.lang.Exception e18) {
            e = e18;
            dVar3 = dVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMWxaLiteAppCenter", "getVideoInfo error: %s", e.toString());
            dVar2 = dVar3;
            if (dVar3 != null) {
                dVar3.release();
                dVar2 = dVar3;
            }
            nativeCallback.m65629x9ad64344(str2);
        } catch (java.lang.Throwable th7) {
            th = th7;
            dVar2 = dVar;
            if (dVar2 != null) {
                try {
                    dVar2.release();
                } catch (java.io.IOException unused2) {
                }
            }
            throw th;
        }
        nativeCallback.m65629x9ad64344(str2);
    }
}
