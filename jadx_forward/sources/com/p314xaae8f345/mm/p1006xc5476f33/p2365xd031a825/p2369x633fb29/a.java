package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29;

/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public int f261350a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.ShowInfo f261351b;

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.a a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.a aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.a();
        aVar.f261350a = jSONObject.optInt(dm.i4.f66865x76d1ec5a);
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("show_info");
        if (optJSONObject != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.ShowInfo showInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.ShowInfo();
            showInfo.f261338d = optJSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
            showInfo.f261339e = optJSONObject.optString("value");
            showInfo.f261346o = optJSONObject.optInt("value_attr");
            showInfo.f261340f = optJSONObject.optString("name_color");
            showInfo.f261341g = optJSONObject.optString("value_color");
            aVar.f261351b = showInfo;
        }
        return aVar;
    }
}
