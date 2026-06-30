package com.tencent.mm.feature.ecs.share;

/* loaded from: classes.dex */
public final class g implements db5.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f65984a;

    public g(java.lang.Object obj) {
        this.f65984a = obj;
    }

    @Override // db5.p4
    public final void a(db5.h4 h4Var, android.view.View view) {
        org.json.JSONObject optJSONObject;
        java.lang.String str;
        kotlin.jvm.internal.o.d(h4Var);
        kotlin.jvm.internal.o.d(view);
        com.tencent.mm.feature.ecs.share.f fVar = com.tencent.mm.feature.ecs.share.f.f65983d;
        if ((h4Var instanceof db5.v5) && (str = ((db5.v5) h4Var).A) != null) {
            dy1.a.j(view, "to_user", str);
            optJSONObject = (org.json.JSONObject) fVar.invoke("share_quick");
        } else {
            if (!(h4Var instanceof com.tencent.mm.feature.ecs.share.c)) {
                return;
            }
            com.tencent.mm.feature.ecs.share.p pVar = ((com.tencent.mm.feature.ecs.share.c) h4Var).L;
            int ordinal = pVar.f65998a.ordinal();
            if (ordinal == 0) {
                org.json.JSONObject jSONObject = pVar.f65999b;
                optJSONObject = jSONObject != null ? jSONObject.optJSONObject("sourceItemReportData") : null;
                if (optJSONObject == null) {
                    optJSONObject = new org.json.JSONObject();
                }
            } else if (ordinal == 1) {
                optJSONObject = (org.json.JSONObject) fVar.invoke("share_to_friend");
            } else if (ordinal == 2) {
                optJSONObject = (org.json.JSONObject) fVar.invoke("share_to_circle");
            } else if (ordinal == 3) {
                optJSONObject = (org.json.JSONObject) fVar.invoke("copy_link_btn");
            } else if (ordinal == 4) {
                optJSONObject = (org.json.JSONObject) fVar.invoke("report_btn");
            } else {
                if (ordinal != 5) {
                    throw new jz5.j();
                }
                optJSONObject = (org.json.JSONObject) fVar.invoke("search_btn");
            }
        }
        dy1.a.i(view, "ecs_share_dialog_view");
        java.lang.Object obj = this.f65984a;
        if (obj != null) {
            dy1.a.j(view, "source_report_data", obj);
        }
        dy1.a.j(view, "source_item_report_data", optJSONObject);
        dy1.a.d(view, 24, 12, false);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).rj(view);
    }
}
