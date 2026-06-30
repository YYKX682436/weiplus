package f91;

/* loaded from: classes13.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f341771a = new java.util.HashMap();

    public f() {
        a(new f91.i());
        a(new f91.g());
        a(new f91.h());
        a(new f91.j());
        a(new f91.d());
        a(new f91.b());
        a(new f91.c());
        a(new f91.k());
    }

    public final void a(f91.a aVar) {
        if (aVar == null) {
            return;
        }
        this.f341771a.put(aVar.mo129197x24dcf3d7(), aVar);
    }

    public android.graphics.Path b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11793x44b4f698 c11793x44b4f698) {
        android.graphics.Path path = new android.graphics.Path();
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11791x6a1daa2a> list = c11793x44b4f698.f158679e;
        if (list != null && list.size() != 0) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.p1042x346425.C11791x6a1daa2a c11791x6a1daa2a : list) {
                if (c11791x6a1daa2a != null) {
                    f91.a aVar = (f91.a) ((java.util.HashMap) this.f341771a).get(c11791x6a1daa2a.f158574d);
                    if (aVar != null) {
                        aVar.a(path, c11791x6a1daa2a);
                    }
                }
            }
        }
        return path;
    }

    public android.graphics.Path c(org.json.JSONArray jSONArray) {
        android.graphics.Path path = new android.graphics.Path();
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
                if (optJSONObject != null) {
                    java.lang.String optString = optJSONObject.optString(ya.b.f77491x8758c4e1);
                    org.json.JSONArray optJSONArray = optJSONObject.optJSONArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                    f91.a aVar = (f91.a) ((java.util.HashMap) this.f341771a).get(optString);
                    if (aVar != null) {
                        aVar.b(path, optJSONArray);
                    }
                }
            }
        }
        return path;
    }
}
