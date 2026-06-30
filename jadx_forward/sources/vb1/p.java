package vb1;

/* loaded from: classes13.dex */
public class p extends gb1.d {

    /* renamed from: CTRL_INDEX */
    public static final int f77270x366c91de = 67;

    /* renamed from: NAME */
    public static final java.lang.String f77271x24728b = "insertCanvas";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("canvasId");
    }

    @Override // gb1.d
    public android.view.View K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, org.json.JSONObject jSONObject) {
        android.content.Context mo50352x76847179 = tVar.mo50352x76847179();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1043xd1075a44.C11802x7cf69d89 c11802x7cf69d89 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1043xd1075a44.C11802x7cf69d89(mo50352x76847179);
        c11802x7cf69d89.m50054xdf6a3295().f552249f = (z81.k) tVar.q(z81.k.class);
        c11802x7cf69d89.m50054xdf6a3295().f552251h = tVar;
        c11802x7cf69d89.setContentDescription(mo50352x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571550il));
        tVar.R(new vb1.n(this, c11802x7cf69d89));
        tVar.U(new vb1.o(this, c11802x7cf69d89));
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505(mo50352x76847179, c11802x7cf69d89);
    }
}
