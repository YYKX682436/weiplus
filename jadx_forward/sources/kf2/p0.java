package kf2;

/* loaded from: classes.dex */
public final class p0 extends kf2.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(df2.k controller, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s liteAppStore) {
        super(controller, liteAppStore);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteAppStore, "liteAppStore");
    }

    @Override // kf2.x
    public boolean d(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        org.json.JSONObject jSONObject = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
        if (jSONObject == null) {
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("vertical_scroll_rects");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray, "getJSONArray(...)");
        c75.c.d(jSONArray, new kf2.n0(arrayList));
        org.json.JSONArray jSONArray2 = jSONObject.getJSONArray("horizontal_scroll_rects");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray2, "getJSONArray(...)");
        c75.c.d(jSONArray2, new kf2.o0(arrayList2));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1488x6c222b6a.C14198xcf03f077 c14198xcf03f077 = this.f388844a.f312058p;
        if (c14198xcf03f077 == null) {
            return false;
        }
        pm0.v.X(new kf2.f(c14198xcf03f077, arrayList, arrayList2));
        return false;
    }

    @Override // kf2.x
    public java.lang.String e() {
        return "setScrollRangeParams";
    }
}
