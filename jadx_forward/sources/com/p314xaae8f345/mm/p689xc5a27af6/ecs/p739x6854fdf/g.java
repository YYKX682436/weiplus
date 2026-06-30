package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf;

/* loaded from: classes.dex */
public final class g implements db5.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f147517a;

    public g(java.lang.Object obj) {
        this.f147517a = obj;
    }

    @Override // db5.p4
    public final void a(db5.h4 h4Var, android.view.View view) {
        org.json.JSONObject optJSONObject;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h4Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.f fVar = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.f.f147516d;
        if ((h4Var instanceof db5.v5) && (str = ((db5.v5) h4Var).A) != null) {
            dy1.a.j(view, "to_user", str);
            optJSONObject = (org.json.JSONObject) fVar.mo146xb9724478("share_quick");
        } else {
            if (!(h4Var instanceof com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.c)) {
                return;
            }
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.p pVar = ((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.c) h4Var).L;
            int ordinal = pVar.f147531a.ordinal();
            if (ordinal == 0) {
                org.json.JSONObject jSONObject = pVar.f147532b;
                optJSONObject = jSONObject != null ? jSONObject.optJSONObject("sourceItemReportData") : null;
                if (optJSONObject == null) {
                    optJSONObject = new org.json.JSONObject();
                }
            } else if (ordinal == 1) {
                optJSONObject = (org.json.JSONObject) fVar.mo146xb9724478("share_to_friend");
            } else if (ordinal == 2) {
                optJSONObject = (org.json.JSONObject) fVar.mo146xb9724478("share_to_circle");
            } else if (ordinal == 3) {
                optJSONObject = (org.json.JSONObject) fVar.mo146xb9724478("copy_link_btn");
            } else if (ordinal == 4) {
                optJSONObject = (org.json.JSONObject) fVar.mo146xb9724478("report_btn");
            } else {
                if (ordinal != 5) {
                    throw new jz5.j();
                }
                optJSONObject = (org.json.JSONObject) fVar.mo146xb9724478("search_btn");
            }
        }
        dy1.a.i(view, "ecs_share_dialog_view");
        java.lang.Object obj = this.f147517a;
        if (obj != null) {
            dy1.a.j(view, "source_report_data", obj);
        }
        dy1.a.j(view, "source_item_report_data", optJSONObject);
        dy1.a.d(view, 24, 12, false);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).rj(view);
    }
}
