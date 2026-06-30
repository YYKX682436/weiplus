package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class q0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 874;
    public static final java.lang.String NAME = "adOperateWXData";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        B(yVar, jSONObject, i17, yVar.getF147808e());
    }

    public final java.lang.String C(com.tencent.mm.plugin.appbrand.y yVar) {
        java.lang.String k96 = ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).k9();
        ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).Bi();
        java.lang.String Ai = ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).Ai();
        java.lang.String str = ((uh1.a) yVar.b(uh1.a.class)).B;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("oaid", k96);
        hashMap.put("imei", "");
        hashMap.put("devIdInfo", Ai);
        hashMap.put("ua", str);
        return new org.json.JSONObject(hashMap).toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[Catch: Exception -> 0x0139, TRY_LEAVE, TryCatch #0 {Exception -> 0x0139, blocks: (B:12:0x0034, B:14:0x0042, B:18:0x0059), top: B:11:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0090  */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void B(com.tencent.mm.plugin.appbrand.y r11, org.json.JSONObject r12, int r13, com.tencent.mm.plugin.appbrand.jsruntime.c0 r14) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.auth.q0.B(com.tencent.mm.plugin.appbrand.y, org.json.JSONObject, int, com.tencent.mm.plugin.appbrand.jsruntime.c0):void");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.k0
    public boolean m() {
        return true;
    }
}
