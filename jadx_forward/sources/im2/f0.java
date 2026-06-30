package im2;

/* loaded from: classes3.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f373845d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(im2.z3 z3Var) {
        super(1);
        this.f373845d = z3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        bw5.n8 n8Var = (bw5.n8) obj;
        org.json.JSONArray jSONArray = null;
        try {
            jSONArray = new org.json.JSONArray(n8Var != null ? n8Var.f112077n[5] ? n8Var.f112074h : "" : null);
        } catch (org.json.JSONException unused) {
        }
        if (jSONArray != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                java.lang.String optString = jSONObject.optString("productId", "0");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
                long parseLong = java.lang.Long.parseLong(optString);
                java.lang.String optString2 = jSONObject.optString("imgUrl");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
                arrayList.add(new im2.t(parseLong, optString2));
            }
            im2.u uVar = new im2.u(arrayList);
            im2.z3 z3Var = this.f373845d;
            z3Var.f374205z1 = uVar;
            z3Var.Z6().m57280xb07cee8c().setText(z3Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oxy, java.lang.Integer.valueOf(arrayList.size())));
        }
        return jz5.f0.f384359a;
    }
}
