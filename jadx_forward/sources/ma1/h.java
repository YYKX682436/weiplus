package ma1;

/* loaded from: classes7.dex */
public class h extends ma1.f {

    /* renamed from: CTRL_INDEX */
    public static final int f72801x366c91de = 669;

    /* renamed from: NAME */
    public static final java.lang.String f72802x24728b = "editGameRecorderVideo";

    @Override // ma1.f
    public void G(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17, ma1.c cVar, java.lang.String str, org.json.JSONArray jSONArray, ta1.n0 n0Var, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsApiScreenRecorderEditWC", "hy: wc start edit screen recorder, with result is %s", n0Var);
        int a17 = cf.b.a(this);
        android.app.Activity Z0 = c0Var.Z0();
        if (Z0 == null) {
            c0Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(1);
        if (jSONArray == null || jSONArray.length() <= 0) {
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.api.C15698x77f8a9c2(0, c0Var.getF229340d().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572166a23), false));
        } else {
            for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                try {
                    org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i18);
                    arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.api.C15698x77f8a9c2(jSONObject2.getInt(dm.i4.f66865x76d1ec5a), jSONObject2.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d), jSONObject2.optBoolean("needExtUrl", false)));
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WAGameJsApiScreenRecorderEditWC", e17, "hy: json exception!", new java.lang.Object[0]);
                    arrayList.clear();
                    arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.api.C15698x77f8a9c2(0, c0Var.getF229340d().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572166a23), false));
                }
            }
        }
        nf.g.a(Z0).f(new ma1.g(this, a17, c0Var, i17));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("k_ext_wording", str);
        bundle.putParcelableArrayList("k_ext_share_options", arrayList);
        ta1.b bVar = ta1.q0.b(c0Var.mo48798x74292566(), c0Var).f498199b;
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = bVar != null ? ((ta1.f) bVar).f498149e : null;
        c11120x15dce88d.f152731n = 64000;
        c11120x15dce88d.f152732o = n0Var.f498182b;
        c11120x15dce88d.f152733p = 1;
        bundle.putParcelable("k_preferred_trans_param", c11120x15dce88d);
        ((i53.x3) ((m33.v1) i95.n0.c(m33.v1.class))).Bi(Z0, c0Var.mo48798x74292566(), (c0Var.t3() == null || c0Var.t3().E0() == null) ? "" : c0Var.t3().E0().f387374d, cVar.f406685a, a17, bundle);
    }
}
