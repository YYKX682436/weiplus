package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class t4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f195871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5 f195872e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f195873f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f195874g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f195875h;

    public t4(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5 a5Var, int i18, int i19, int i27) {
        this.f195871d = i17;
        this.f195872e = a5Var;
        this.f195873f = i18;
        this.f195874g = i19;
        this.f195875h = i27;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        int i18 = this.f195871d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5 a5Var = this.f195872e;
        if (itemId == i18) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 4);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5.y1(a5Var, jSONObject2);
            hf2.x xVar = (hf2.x) a5Var.U0(hf2.x.class);
            if (xVar != null) {
                xVar.w7(1, "");
                return;
            }
            return;
        }
        if (itemId == this.f195873f) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("type", 4);
            java.lang.String jSONObject4 = jSONObject3.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5.y1(a5Var, jSONObject4);
            hf2.x xVar2 = (hf2.x) a5Var.U0(hf2.x.class);
            if (xVar2 != null) {
                xVar2.w7(1, "");
                return;
            }
            return;
        }
        if (itemId == this.f195874g) {
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            jSONObject5.put("type", 6);
            java.lang.String jSONObject6 = jSONObject5.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject6, "toString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5.y1(a5Var, jSONObject6);
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            android.content.Context context = a5Var.f446856d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            int i19 = a5Var.W;
            ((ub0.r) oVar).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.e((android.app.Activity) context, i19, 1, 28, null);
            return;
        }
        if (itemId == this.f195875h) {
            org.json.JSONObject jSONObject7 = new org.json.JSONObject();
            jSONObject7.put("type", 6);
            java.lang.String jSONObject8 = jSONObject7.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject8, "toString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5.y1(a5Var, jSONObject8);
            hf2.x xVar3 = (hf2.x) a5Var.U0(hf2.x.class);
            if (xVar3 != null) {
                xVar3.w7(2, "");
            }
        }
    }
}
