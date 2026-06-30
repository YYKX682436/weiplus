package qe3;

/* loaded from: classes7.dex */
public final class a extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "createFrameSet";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        se3.e eVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        org.json.JSONObject optJSONObject = data.optJSONObject("frameJson");
        int optInt = optJSONObject != null ? optJSONObject.optInt(ya.b.f77479x42930b2, 0) : 0;
        java.lang.String optString = optJSONObject != null ? optJSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "") : null;
        java.lang.String str = optString != null ? optString : "";
        java.lang.String optString2 = data.optString("frameSetName", "mp_timeline_card");
        oe3.c cVar = (oe3.c) this.f399423a;
        if (cVar != null && (eVar = cVar.f426329z) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
            p012xc85e97e9.p093xedfae76a.j0 j0Var = eVar.f488448e;
            java.util.Collection collection = (java.util.List) j0Var.mo3195x754a37bb();
            if (collection == null) {
                collection = kz5.p0.f395529d;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(collection);
            arrayList.add(optInt, new se3.f(optString2, str));
            j0Var.mo523x53d8522f(arrayList);
        }
        s().mo146xb9724478(k());
    }
}
