package uc1;

/* loaded from: classes13.dex */
public class p1 extends gb1.f {

    /* renamed from: CTRL_INDEX */
    public static final int f76900x366c91de = 3;

    /* renamed from: NAME */
    public static final java.lang.String f76901x24728b = "removeMap";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return vc1.e3.c(jSONObject);
    }

    @Override // gb1.f
    public boolean J(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRemoveMap", "data is null");
            return false;
        }
        vc1.d3.a(6);
        if (vc1.h3.a(tVar.mo48798x74292566(), vc1.e3.b(tVar, jSONObject))) {
            vc1.d3.a(7);
            return true;
        }
        vc1.d3.a(8);
        return true;
    }
}
