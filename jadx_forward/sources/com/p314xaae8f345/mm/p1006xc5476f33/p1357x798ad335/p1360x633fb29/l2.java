package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes.dex */
public class l2 implements vz.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m2 f178614a;

    public l2(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m2 m2Var) {
        this.f178614a = m2Var;
    }

    @Override // vz.z1
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m2 m2Var = this.f178614a;
        if (str != null) {
            m2Var.f178620f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t2.a(str), str);
            return;
        }
        if (jSONObject == null) {
            m2Var.f178620f.d(809, "fail");
            return;
        }
        long optLong = jSONObject.optLong("download_id", -1L);
        if (optLong <= 0) {
            m2Var.f178620f.d(809, "fail");
        } else {
            m2Var.f178620f.d(0, java.lang.String.valueOf(optLong));
        }
    }
}
