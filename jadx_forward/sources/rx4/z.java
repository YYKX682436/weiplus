package rx4;

/* loaded from: classes8.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.e0 f482875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f482876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f482877f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(rx4.e0 e0Var, org.json.JSONArray jSONArray, java.lang.String str) {
        super(0);
        this.f482875d = e0Var;
        this.f482876e = jSONArray;
        this.f482877f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.List list;
        java.util.List list2;
        rx4.e0 e0Var = this.f482875d;
        ((java.util.ArrayList) e0Var.f482677n).clear();
        org.json.JSONArray jSONArray = this.f482876e;
        int length = jSONArray.length();
        int i17 = 0;
        while (true) {
            list = e0Var.f482677n;
            if (i17 >= length) {
                break;
            }
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optJSONObject, "optJSONObject(...)");
            java.lang.String searchID = this.f482877f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(searchID, "$searchID");
            ((java.util.ArrayList) list).add(new rx4.j(optJSONObject, searchID));
            i17++;
        }
        rx4.h hVar = e0Var.f482674h;
        if (hVar != null && (list2 = hVar.f482694d) != null && ((java.util.ArrayList) list2).size() > 0) {
            rx4.h hVar2 = e0Var.f482674h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar2);
            hVar2.a(list);
            pm0.v.X(new rx4.d0(e0Var, false));
        }
        return jz5.f0.f384359a;
    }
}
