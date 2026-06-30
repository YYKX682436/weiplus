package ab1;

/* loaded from: classes.dex */
public final class x extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f2x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f3x24728b = "showAddressPickerView";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject data, int i17) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y env = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        android.app.Activity a17 = q75.a.a(env.getF229340d());
        if (a17 == null) {
            env.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        org.json.JSONArray optJSONArray = data.optJSONArray("current");
        if (optJSONArray != null) {
            arrayList = new java.util.ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i18 = 0; i18 < length; i18++) {
                arrayList.add(optJSONArray.optString(i18, "undefined"));
            }
        } else {
            arrayList = null;
        }
        try {
            ab1.f fVar = (ab1.f) i95.n0.c(ab1.f.class);
            ab1.c a18 = ab1.c.f84242e.a(data.optString("mode"));
            if (a18 == null) {
                a18 = ab1.c.f84245h;
            }
            ((ab1.l) fVar).Ai(a17, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11955x784e8974(a18, arrayList, true), new ab1.v(env, i17, this), new ab1.w(env, i17, this));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShowAddressPickerView", "invoke appId:" + env.mo48798x74292566() + ", callbackId:" + i17 + ", get exception:" + e17);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fail ");
            sb6.append(e17);
            env.a(i17, o(sb6.toString()));
        }
    }
}
