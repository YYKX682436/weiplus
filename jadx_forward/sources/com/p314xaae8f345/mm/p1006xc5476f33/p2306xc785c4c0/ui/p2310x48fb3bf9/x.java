package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9;

/* loaded from: classes8.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f256783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l f256784e;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l lVar, org.json.JSONObject jSONObject) {
        this.f256784e = lVar;
        this.f256783d = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f256784e.f256752f.mo14660x738236e6(java.lang.String.format("javascript:window.activity_state_change && activity_state_change(%s)", this.f256783d.toString()), null);
    }
}
