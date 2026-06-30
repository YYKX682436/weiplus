package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a1 f199086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199087e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a1 a1Var, java.lang.String str) {
        super(0);
        this.f199086d = a1Var;
        this.f199087e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean w17;
        java.lang.String m75945x2fec8307;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpGame ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a1 a1Var = this.f199086d;
        r45.z53 z53Var = a1Var.f198420w;
        sb6.append(z53Var != null ? z53Var.m75945x2fec8307(4) : null);
        sb6.append(", ");
        r45.z53 z53Var2 = a1Var.f198420w;
        sb6.append(z53Var2 != null ? z53Var2.m75945x2fec8307(0) : null);
        sb6.append(", ");
        java.lang.String str = this.f199087e;
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = a1Var.f198404d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7);
        java.lang.String t17 = r26.i0.t(r26.i0.t(str, "=", "%3d", false), "&", "%26", false);
        java.lang.String concat = "JUNMFORM_Pandora_WeChatLive_ShiPinHao_".concat(t17);
        r45.xl6 xl6Var = a1Var.f198421x;
        if (xl6Var != null && (m75945x2fec8307 = xl6Var.m75945x2fec8307(4)) != null) {
            concat = "JUNMFORM_Pandora_WeChatLive_ShiPinHao_AuthCode_" + m75945x2fec8307 + "_Start_" + t17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "jumpGame buff:" + concat);
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699 c11272xd6622699 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699();
        c11272xd6622699.f33061xb2206a6f = concat;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504(c11272xd6622699);
        c11286x34a5504.f33127xc9f07109 = com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.C11223x3d8d64e.f32730x9efbee2a;
        c11286x34a5504.f33125x9b39409a = concat;
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str3 = a1Var.f198417t;
        ((kt.c) i0Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m i17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.i(str3, Integer.MAX_VALUE);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("jumpGame, openId:");
        sb8.append(i17 != null ? i17.f67384x996f3ea : null);
        sb8.append(", appInfo:");
        sb8.append(i17 == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb8.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.q0 q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.q0(a1Var);
        r45.xl6 xl6Var2 = a1Var.f198421x;
        if ((xl6Var2 != null && xl6Var2.m75939xb282bd08(2) == 1) || a1Var.A) {
            java.lang.String str4 = i17.f67386xa1e9e82c;
            if (str4 == null) {
                str4 = "";
            }
            java.lang.String str5 = str4;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "jumpGame without openId, pkg:".concat(str5));
            lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
            android.app.Activity m80379x76847179 = a1Var.m80379x76847179();
            java.lang.String str6 = a1Var.f198417t;
            android.os.Bundle bundle = new android.os.Bundle();
            ((kt.c) i0Var2).getClass();
            w17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.w(m80379x76847179, str5, c11286x34a5504, str6, "", 2, q0Var, bundle);
        } else {
            w17 = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).fj(a1Var.m80379x76847179(), a1Var.f198417t, c11286x34a5504, 2, q0Var, new android.os.Bundle());
        }
        if (!w17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "launchAppByWeChat failed, request and toast");
            lt.i0 i0Var3 = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str7 = a1Var.f198417t;
            r45.z53 z53Var3 = a1Var.f198420w;
            ((kt.c) i0Var3).Ri(str7, z53Var3 != null ? z53Var3.m75945x2fec8307(4) : null, null);
            db5.t7.m123882x26a183b(a1Var.m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.dgq, 0).show();
        }
        return jz5.f0.f384359a;
    }
}
