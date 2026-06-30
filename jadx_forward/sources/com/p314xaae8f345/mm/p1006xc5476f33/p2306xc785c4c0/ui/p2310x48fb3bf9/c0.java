package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9;

/* loaded from: classes7.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f256713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f256714e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f256715f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l f256716g;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l lVar, boolean z17, boolean z18, java.lang.String str) {
        this.f256716g = lVar;
        this.f256713d = z17;
        this.f256714e = z18;
        this.f256715f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("granted", this.f256713d);
            jSONObject.put("retCode", 0);
            jSONObject.put("dialogShowed", this.f256714e);
        } catch (org.json.JSONException unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.b.a(this.f256716g, this.f256715f, jSONObject.toString());
    }
}
