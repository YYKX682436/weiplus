package com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5;

/* loaded from: classes7.dex */
public final class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f29746x366c91de = 1520;

    /* renamed from: NAME */
    public static final java.lang.String f29747x24728b = "addDownloadTaskForWVA";

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.e f150585g = new com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.e(null);

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f150586h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.d f150587i = new com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.d();

    /* renamed from: m, reason: collision with root package name */
    public static volatile boolean f150588m;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject data, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 service = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        try {
            com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.C10917xbadaf420 c10917xbadaf420 = new com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.C10917xbadaf420(false, this, service, i17, data);
            com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.m.B(service);
            c10917xbadaf420.d();
        } catch (java.io.IOException unused) {
            java.lang.String str = android.text.TextUtils.isEmpty("fail: destPath resolve failed") ? "fail:jsapi invalid request data" : "fail: destPath resolve failed";
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            service.a(i17, u(str, jSONObject));
        }
    }
}
