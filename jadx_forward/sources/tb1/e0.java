package tb1;

/* loaded from: classes13.dex */
public abstract class e0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 {

    /* renamed from: CTRL_INDEX */
    private static final int f76782x366c91de = 455;

    /* renamed from: NAME */
    public static final java.lang.String f76783x24728b = "onCameraScanCode";

    public static void u(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, java.lang.String str, int i18, java.lang.String str2, byte[] bArr, com.p314xaae8f345.p2891x34da02.C25303x87b156a3 c25303x87b156a3) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("cameraId", java.lang.Integer.valueOf(i17));
        hashMap.put("type", str);
        hashMap.put("result", str2);
        hashMap.put("codeVersion", java.lang.Integer.valueOf(i18));
        if (c25303x87b156a3 != null) {
            hashMap.put("scanArea", new float[]{c25303x87b156a3.f296763x0 / ik1.w.f(), c25303x87b156a3.f296767y0 / ik1.w.f(), (c25303x87b156a3.f296764x1 - c25303x87b156a3.f296763x0) / ik1.w.f(), (c25303x87b156a3.f296770y3 - c25303x87b156a3.f296767y0) / ik1.w.f()});
        }
        if (bArr != null && bArr.length > 0) {
            java.lang.String encodeToString = android.util.Base64.encodeToString(bArr, 2);
            hashMap.put("charSet", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            hashMap.put("rawData", encodeToString);
        }
        lVar.d(f76783x24728b, new org.json.JSONObject(hashMap).toString(), null);
    }
}
