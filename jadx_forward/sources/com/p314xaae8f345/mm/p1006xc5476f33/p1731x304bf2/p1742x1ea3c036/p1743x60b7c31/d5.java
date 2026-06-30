package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes15.dex */
public final class d5 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "showAtSomeoneView";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
        if (bVar == null) {
            return;
        }
        org.json.JSONObject jSONObject = bVar.f488130b.f426039c;
        android.content.Context mo64555x76847179 = ((sd.a) bVar.f488129a).mo64555x76847179();
        if (jSONObject == null || mo64555x76847179 == null) {
            bVar.c("invalid_params", null);
            return;
        }
        java.lang.String optString = jSONObject.optString("gamecenterIdentifier");
        java.lang.String optString2 = jSONObject.optString("configDict");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            bVar.c("invalid_params", null);
            return;
        }
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.api.C15881xba5ff6ef c15881xba5ff6ef = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.api.C15881xba5ff6ef();
            c15881xba5ff6ef.f221042d = jSONObject2.optString("searchContentText", "");
            c15881xba5ff6ef.f221043e = jSONObject2.optBoolean("showAtSomeoneView", false);
            c15881xba5ff6ef.f221044f = jSONObject2.optBoolean("enableAtSomeoneService", false);
            c15881xba5ff6ef.f221046h = jSONObject2.optString("AtList", "");
            c15881xba5ff6ef.f221045g = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s();
            c15881xba5ff6ef.f221048m = jSONObject2.optString("atContentId", "");
            c15881xba5ff6ef.f221049n = jSONObject2.optString("atContext", "");
            c15881xba5ff6ef.f221050o = jSONObject2.optInt("atLimit", 50);
            c15881xba5ff6ef.f221051p = jSONObject2.optInt("bottomHeight", 0);
            c15881xba5ff6ef.f221047i = optString;
            java.lang.Object obj = bVar.f488129a;
            if (obj instanceof sd.k) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.luggage.container.LuggagePage");
                android.content.Context context = ((sd.k) obj).f488143d;
                if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825) {
                    cl0.e eVar = f53.f.f341177a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825 ctx = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825) context;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
                    f53.f.f341181e = c15881xba5ff6ef;
                    f53.f.f341180d = c15881xba5ff6ef.f221045g;
                    ((ku5.t0) ku5.t0.f394148d).B(new f53.e(ctx, c15881xba5ff6ef));
                }
            }
            s43.j jVar = s43.i.f484489a;
            jVar.f484490a.put(optString, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.c5(this, bVar, optString));
        } catch (org.json.JSONException unused) {
            bVar.c("configDict is not json obj", null);
        }
    }
}
