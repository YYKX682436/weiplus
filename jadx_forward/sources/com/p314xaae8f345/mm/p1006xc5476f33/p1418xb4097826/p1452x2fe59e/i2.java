package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class i2 extends xc2.o {
    @Override // xc2.j
    public org.json.JSONObject n(xc2.p0 infoEx) {
        android.view.View p17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        org.json.JSONObject n17 = super.n(infoEx);
        if (n17 == null) {
            n17 = new org.json.JSONObject();
        }
        try {
            in5.s0 s0Var = this.f534694a;
            int i17 = 1;
            if (!((s0Var == null || (p17 = s0Var.p(com.p314xaae8f345.mm.R.id.f566044tf2)) == null || p17.getVisibility() != 0) ? false : true)) {
                i17 = 0;
            }
            n17.put("phase", i17);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderCollectionJumperViewHandler", e17, "message: %s", e17.getMessage());
        }
        return n17;
    }
}
