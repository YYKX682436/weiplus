package ac1;

/* loaded from: classes7.dex */
public class g extends gb1.h {

    /* renamed from: CTRL_INDEX */
    public static final int f19x366c91de = 510;

    /* renamed from: NAME */
    public static final java.lang.String f20x24728b = "updatePositioningContainer";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("containerId");
    }

    @Override // gb1.h
    public boolean K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        if (!(view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1082xe7814c81.C12071xcd11487c)) {
            return false;
        }
        int j17 = ik1.w.j(jSONObject, "contentOffsetLeft", 0);
        int j18 = ik1.w.j(jSONObject, "contentOffsetTop", 0);
        int optInt = jSONObject.optInt("animate", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1082xe7814c81.C12071xcd11487c c12071xcd11487c = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1082xe7814c81.C12071xcd11487c) view;
        try {
            c12071xcd11487c.setVisibility(jSONObject.getBoolean("visible") ? 0 : 4);
        } catch (org.json.JSONException unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1082xe7814c81.C12070x7562ec09 c12070x7562ec09 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1082xe7814c81.C12070x7562ec09) c12071xcd11487c.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1082xe7814c81.C12070x7562ec09.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdatePositioningContainer", "scrollLeft:%d, scrollTop:%d, animation:%d", java.lang.Integer.valueOf(j17), java.lang.Integer.valueOf(j18), java.lang.Integer.valueOf(optInt));
        if (optInt == 1) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(c12070x7562ec09, "x", c12070x7562ec09.getX(), -j17);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(c12070x7562ec09, "y", c12070x7562ec09.getY(), -j18);
            ofFloat.addUpdateListener(new ac1.d(this, c12070x7562ec09));
            ofFloat2.addUpdateListener(new ac1.e(this, c12070x7562ec09));
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.setDuration(1000L);
            animatorSet.setInterpolator(new ac1.f(this, 0.0f, 0.0f, 0.58f, 1.0f));
            animatorSet.setTarget(c12070x7562ec09);
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.start();
        } else {
            c12070x7562ec09.setX(-j17);
            c12070x7562ec09.setY(-j18);
        }
        int j19 = ik1.w.j(jSONObject, "innerHeight", c12070x7562ec09.getHeight());
        int j27 = ik1.w.j(jSONObject, "innerWidth", c12070x7562ec09.getWidth());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdatePositioningContainer", "innerHeight:%d, innerWidth:%d", java.lang.Integer.valueOf(j19), java.lang.Integer.valueOf(j27));
        android.view.ViewGroup.LayoutParams layoutParams = c12070x7562ec09.getLayoutParams();
        layoutParams.height = j19;
        layoutParams.width = j27;
        c12070x7562ec09.setLayoutParams(layoutParams);
        return true;
    }
}
