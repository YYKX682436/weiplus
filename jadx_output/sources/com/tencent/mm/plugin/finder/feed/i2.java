package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class i2 extends xc2.o {
    @Override // xc2.j
    public org.json.JSONObject n(xc2.p0 infoEx) {
        android.view.View p17;
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        org.json.JSONObject n17 = super.n(infoEx);
        if (n17 == null) {
            n17 = new org.json.JSONObject();
        }
        try {
            in5.s0 s0Var = this.f453161a;
            int i17 = 1;
            if (!((s0Var == null || (p17 = s0Var.p(com.tencent.mm.R.id.f484511tf2)) == null || p17.getVisibility() != 0) ? false : true)) {
                i17 = 0;
            }
            n17.put("phase", i17);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FinderCollectionJumperViewHandler", e17, "message: %s", e17.getMessage());
        }
        return n17;
    }
}
