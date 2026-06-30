package ac1;

/* loaded from: classes7.dex */
public class b extends gb1.d {

    /* renamed from: CTRL_INDEX */
    public static final int f15x366c91de = 509;

    /* renamed from: NAME */
    public static final java.lang.String f16x24728b = "insertPositioningContainer";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("containerId");
    }

    @Override // gb1.d
    public android.view.View K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1082xe7814c81.C12070x7562ec09 c12070x7562ec09 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1082xe7814c81.C12070x7562ec09(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.d.a(tVar.mo50352x76847179()));
        c12070x7562ec09.setBackgroundColor(0);
        boolean optBoolean = jSONObject.optBoolean("visible", true);
        boolean optBoolean2 = jSONObject.optBoolean("canFullScreenByChild", false);
        int j17 = ik1.w.j(jSONObject, "contentOffsetLeft", 0);
        int j18 = ik1.w.j(jSONObject, "contentOffsetTop", 0);
        c12070x7562ec09.setX(-j17);
        c12070x7562ec09.setY(-j18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1082xe7814c81.C12071xcd11487c c12071xcd11487c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1082xe7814c81.C12071xcd11487c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.d.a(tVar.mo50352x76847179()), c12070x7562ec09);
        c12071xcd11487c.setVisibility(optBoolean ? 0 : 4);
        c12071xcd11487c.setDuplicateParentStateEnabled(true);
        c12070x7562ec09.setDuplicateParentStateEnabled(true);
        c12070x7562ec09.m50849xf80e22b9(optBoolean2);
        return c12071xcd11487c;
    }

    @Override // gb1.d
    public void N(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        view.setOnTouchListener(new ac1.a(this));
    }
}
