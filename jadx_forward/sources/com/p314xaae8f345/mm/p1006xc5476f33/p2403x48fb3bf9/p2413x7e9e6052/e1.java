package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052;

/* JADX INFO: Access modifiers changed from: package-private */
@mk0.a
/* loaded from: classes8.dex */
public class e1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private e1() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        if (c10756x2a5d7b2d == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c10756x2a5d7b2d.f149939d)) {
            return;
        }
        b21.p pVar = new b21.p();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(c10756x2a5d7b2d.f149939d);
            pVar.f98875a = jSONObject.optString("current_musicid", "");
            pVar.f98876b = jSONObject.optString("report_list", "");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewReportOnLeaveHelper", "reportOnLeave, ex = %s", e17.getMessage());
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new b21.c(pVar));
    }
}
