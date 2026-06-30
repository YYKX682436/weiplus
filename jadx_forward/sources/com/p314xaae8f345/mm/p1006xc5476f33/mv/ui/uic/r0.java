package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes.dex */
public final class r0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.t0 f232926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f232927e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f232928f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f232929g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f232930h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f232931i;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.t0 t0Var, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2, org.json.JSONObject jSONObject3) {
        this.f232926d = t0Var;
        this.f232927e = jSONObject;
        this.f232928f = jSONObject2;
        this.f232929g = jSONArray;
        this.f232930h = jSONArray2;
        this.f232931i = jSONObject3;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        if (itemId == 1201) {
            com.p314xaae8f345.mm.vfs.w6.f(gm0.j1.u().d() + "music/cover/");
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.t0 t0Var = this.f232926d;
            t0Var.m158354x19263085().finish();
            dp.a.m125853x26a183b(t0Var.m158354x19263085(), com.p314xaae8f345.mm.R.C30867xcad56011.f571888sn, 0).show();
            return;
        }
        if (itemId != 1202) {
            return;
        }
        java.lang.String str = "music_mv_info_" + k35.m1.d("yyyy-MM-dd_HH_mm_ss", java.lang.System.currentTimeMillis() / 1000) + ".json";
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("songInfoText", this.f232927e);
            jSONObject.put("mvHeadInfoText", this.f232928f);
            jSONObject.put("mvTrackInfoText", this.f232929g);
            jSONObject.put("mvRefObjInfoText", this.f232930h);
            jSONObject.put("cgiInfo", this.f232931i);
        } finally {
            xs.i1 i1Var = (xs.i1) i95.n0.c(xs.i1.class);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            byte[] bytes = jSONObject2.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            ((zc0.h) i1Var).aj(str, bytes, true);
        }
    }
}
