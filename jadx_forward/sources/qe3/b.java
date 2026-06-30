package qe3;

/* loaded from: classes7.dex */
public final class b extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "removeFrameSet";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        se3.e eVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        org.json.JSONObject optJSONObject = data.optJSONObject("frameJson");
        int optInt = optJSONObject != null ? optJSONObject.optInt(ya.b.f77479x42930b2, 0) : 0;
        oe3.c cVar = (oe3.c) this.f399423a;
        if (cVar != null && (eVar = cVar.f426329z) != null) {
            p012xc85e97e9.p093xedfae76a.j0 j0Var = eVar.f488448e;
            java.util.Collection collection = (java.util.List) j0Var.mo3195x754a37bb();
            if (collection == null) {
                collection = kz5.p0.f395529d;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(collection);
            arrayList.remove(optInt);
            j0Var.mo523x53d8522f(arrayList);
        }
        s().mo146xb9724478(k());
    }
}
