package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9;

/* loaded from: classes8.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f256727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l f256728e;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l lVar, org.json.JSONObject jSONObject) {
        this.f256728e = lVar;
        this.f256727d = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String jSONObject = this.f256727d.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l lVar = this.f256728e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.b.a(lVar, "onSearchDataReady", jSONObject);
        wm4.u.b(lVar.f256753g, "dataReady", c01.id.c());
    }
}
