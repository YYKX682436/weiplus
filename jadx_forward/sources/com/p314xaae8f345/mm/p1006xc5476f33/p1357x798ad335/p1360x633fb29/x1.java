package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public class x1 implements m02.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f178728a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f178729b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f178730c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vz.z1 f178731d;

    public x1(boolean z17, boolean z18, boolean z19, vz.z1 z1Var) {
        this.f178728a = z17;
        this.f178729b = z18;
        this.f178730c = z19;
        this.f178731d = z1Var;
    }

    @Override // m02.b
    public void a(m02.a aVar, long j17) {
        m02.a aVar2 = m02.a.OK;
        vz.z1 z1Var = this.f178731d;
        if (aVar != aVar2) {
            if (aVar == m02.a.CANCEL) {
                if (z1Var != null) {
                    z1Var.a("cancel", null);
                    return;
                }
                return;
            } else {
                if (z1Var != null) {
                    z1Var.a("fail", null);
                    return;
                }
                return;
            }
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("download_id", j17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j1.a(this.f178728a, jSONObject);
            if (this.f178729b && !com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                jSONObject.put("reserve_for_wifi", 1);
            }
            if (this.f178730c) {
                jSONObject.put("show_wifi_download_btn", true);
            }
        } catch (org.json.JSONException unused) {
        }
        if (z1Var != null) {
            z1Var.a(null, jSONObject);
        }
    }
}
