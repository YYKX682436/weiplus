package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1;

/* loaded from: classes9.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f262465a;

    /* renamed from: b, reason: collision with root package name */
    public r45.n34 f262466b;

    /* renamed from: c, reason: collision with root package name */
    public r45.n34 f262467c;

    /* renamed from: d, reason: collision with root package name */
    public int f262468d;

    /* renamed from: e, reason: collision with root package name */
    public int f262469e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f262470f;

    /* renamed from: g, reason: collision with root package name */
    public int f262471g;

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.InterceptWin", "createFromJSONObject() jsonObject == null");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n();
        nVar.f262465a = jSONObject.optString("wording");
        try {
            nVar.f262466b = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.f0.a(jSONObject.getJSONObject("left_button"));
            nVar.f262467c = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.f0.a(jSONObject.getJSONObject("right_button"));
            nVar.f262468d = jSONObject.optInt("win_type");
            nVar.f262469e = jSONObject.optInt("show_type");
            nVar.f262470f = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            nVar.f262471g = jSONObject.optInt("icon_type");
            return nVar;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.InterceptWin", "createFromJSONObject() Exception:%s", e17.getMessage());
            return null;
        }
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n b(r45.g04 g04Var) {
        if (g04Var == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n();
        nVar.f262465a = g04Var.f456310d;
        nVar.f262466b = g04Var.f456311e;
        nVar.f262467c = g04Var.f456312f;
        nVar.f262468d = g04Var.f456313g;
        nVar.f262469e = g04Var.f456314h;
        nVar.f262470f = g04Var.f456315i;
        nVar.f262471g = g04Var.f456316m;
        return nVar;
    }
}
