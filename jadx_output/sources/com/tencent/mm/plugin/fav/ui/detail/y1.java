package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes9.dex */
public abstract class y1 {
    public static void a(com.tencent.mm.ui.MMActivity mMActivity, o72.r2 r2Var) {
        java.lang.String y17;
        if (14 != r2Var.field_type || com.tencent.mm.sdk.platformtools.t8.K0(r2Var.field_favProto.f370972q)) {
            r45.jq0 jq0Var = r2Var.field_favProto.f370962d;
            if (jq0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(jq0Var.f378042o)) {
                y17 = o72.x1.y(r2Var.field_fromUser);
            } else {
                java.lang.String w17 = o72.x1.w(jq0Var.f378042o);
                if (c01.z1.r().equals(jq0Var.f378036f)) {
                    java.lang.String y18 = o72.x1.y(jq0Var.f378038h);
                    if (!(y18 != null ? y18 : "").equals(jq0Var.f378038h)) {
                        y17 = w17 + " - " + y18;
                    }
                    y17 = w17;
                } else {
                    java.lang.String y19 = o72.x1.y(jq0Var.f378036f);
                    if (!(y19 != null ? y19 : "").equals(jq0Var.f378036f)) {
                        y17 = w17 + " - " + y19;
                    }
                    y17 = w17;
                }
            }
        } else {
            y17 = r2Var.field_favProto.f370972q;
        }
        mMActivity.setMMSubTitle(java.lang.String.format(mMActivity.getString(com.tencent.mm.R.string.c_n), y17, android.text.format.DateFormat.format("yyyy/M/d", r2Var.field_updateTime)));
    }
}
