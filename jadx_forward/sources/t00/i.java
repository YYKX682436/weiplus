package t00;

/* loaded from: classes.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f495819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f495820e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.String[] strArr, c00.n3 n3Var) {
        super(1);
        this.f495819d = strArr;
        this.f495820e = n3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String[] strings = (java.lang.String[]) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(strings, "strings");
        int length = strings.length;
        int length2 = this.f495819d.length;
        c00.n3 n3Var = this.f495820e;
        if (length != length2) {
            n3Var.a();
        } else {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (java.lang.String str : strings) {
                jSONArray.put(str);
            }
            jSONObject.put("resultStrings", jSONArray);
            n3Var.b(jSONObject);
        }
        return jz5.f0.f384359a;
    }
}
