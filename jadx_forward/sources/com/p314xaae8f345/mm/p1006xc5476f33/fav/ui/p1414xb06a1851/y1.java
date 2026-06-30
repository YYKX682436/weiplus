package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes9.dex */
public abstract class y1 {
    public static void a(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, o72.r2 r2Var) {
        java.lang.String y17;
        if (14 != r2Var.f67657x2262335f || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r2Var.f67640x5ab01132.f452505q)) {
            r45.jq0 jq0Var = r2Var.f67640x5ab01132.f452495d;
            if (jq0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jq0Var.f459575o)) {
                y17 = o72.x1.y(r2Var.f67642xd3939c3a);
            } else {
                java.lang.String w17 = o72.x1.w(jq0Var.f459575o);
                if (c01.z1.r().equals(jq0Var.f459569f)) {
                    java.lang.String y18 = o72.x1.y(jq0Var.f459571h);
                    if (!(y18 != null ? y18 : "").equals(jq0Var.f459571h)) {
                        y17 = w17 + " - " + y18;
                    }
                    y17 = w17;
                } else {
                    java.lang.String y19 = o72.x1.y(jq0Var.f459569f);
                    if (!(y19 != null ? y19 : "").equals(jq0Var.f459569f)) {
                        y17 = w17 + " - " + y19;
                    }
                    y17 = w17;
                }
            }
        } else {
            y17 = r2Var.f67640x5ab01132.f452505q;
        }
        abstractActivityC21394xb3d2c0cf.mo54449x3f86539a(java.lang.String.format(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_n), y17, android.text.format.DateFormat.format("yyyy/M/d", r2Var.f67659xa783a79b)));
    }
}
