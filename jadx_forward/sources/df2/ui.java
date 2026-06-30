package df2;

/* loaded from: classes3.dex */
public final class ui extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.wi f313067d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui(df2.wi wiVar) {
        super(6);
        this.f313067d = wiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.t
    public java.lang.Object J(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        r45.m01 m01Var;
        byte[] byteArray;
        r45.nw1 nw1Var;
        r45.z53 z53Var;
        java.lang.String m75945x2fec8307;
        yg2.c m57685x35ecf0b4;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        java.lang.String str = (java.lang.String) obj4;
        android.os.Bundle bundle = (android.os.Bundle) obj5;
        r45.l01 l01Var = (r45.l01) obj6;
        df2.wi wiVar = this.f313067d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wiVar.f313223m, "postExternalLive success:" + booleanValue + " errCode:" + intValue + " errType:" + intValue2 + " errMsg:" + str + " extInfo:" + bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 b76 = wiVar.b7();
        r45.qp1 qp1Var = null;
        qp1Var = null;
        qp1Var = null;
        if (b76 != null && (m57685x35ecf0b4 = b76.m57685x35ecf0b4()) != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(m57685x35ecf0b4, null);
        }
        if (booleanValue) {
            if (wiVar.g7()) {
                dk2.ef.h(dk2.ef.f314905a, wiVar.getStore().getLiveRoomData(), wiVar.getStore(), null, 1, null, 20, null);
            }
            h63.s1 s1Var = (h63.s1) i95.n0.c(h63.s1.class);
            android.content.Context O6 = wiVar.O6();
            r45.n73 c76 = wiVar.c7();
            java.lang.String str2 = (c76 == null || (z53Var = (r45.z53) c76.m75936x14adae67(1)) == null || (m75945x2fec8307 = z53Var.m75945x2fec8307(0)) == null) ? "" : m75945x2fec8307;
            int i17 = ((mm2.c1) wiVar.m56788xbba4bfc0(mm2.c1.class)).f410321c5;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((mm2.s1) wiVar.m56788xbba4bfc0(mm2.s1.class)).f410931u);
            mm2.e1 e1Var = (mm2.e1) wiVar.m56788xbba4bfc0(mm2.e1.class);
            ((h63.g1) s1Var).Di(O6, str2, i17, bool, valueOf, java.lang.Long.valueOf((e1Var == null || (nw1Var = e1Var.f410521r) == null) ? 0L : nw1Var.m75942xfb822ef2(0)));
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5472x6f20df62 c5472x6f20df62 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5472x6f20df62();
            am.hb hbVar = c5472x6f20df62.f135810g;
            hbVar.f88362a = true;
            hbVar.f88363b = true;
            c5472x6f20df62.e();
        } else {
            java.lang.String str3 = "handleStartMiniGameLiveFail: errCode:" + intValue + ", errType:" + intValue2 + ", errMsg:" + str;
            java.lang.String str4 = wiVar.f313223m;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, str3);
            if (intValue == -200008) {
                java.lang.String string = bundle != null ? bundle.getString("EXT_INFO_KEY_REAL_NAME_URL", "") : null;
                java.lang.String str5 = string != null ? string : "";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "handleStartMiniGameLiveFail: realnameUrl".concat(str5));
                if ((str5.length() > 0) == true) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "gotoFaceVerify ".concat(str5));
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("LIVE_HELP_TYPE", 1);
                    intent.putExtra("FACE_VERIFY_URL", str5);
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = wiVar.N6();
                    if (N6 != null) {
                        intent.setClass(N6, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4.class);
                        N6.startActivityForResult(intent, 10000);
                    }
                } else {
                    db5.t7.m123883x26a183b(wiVar.O6(), wiVar.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dzz), 0).show();
                }
            } else {
                if (bundle != null && (byteArray = bundle.getByteArray("EXT_INFO_KEY_ERROR_PAGE")) != null) {
                    r45.qp1 qp1Var2 = new r45.qp1();
                    try {
                        qp1Var2.mo11468x92b714fd(byteArray);
                        qp1Var = qp1Var2;
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                    }
                }
                if (!hz2.d.f367846a.j(intValue2, intValue, qp1Var)) {
                    if (intValue != -200196) {
                        if (intValue != -100038) {
                            switch (intValue) {
                                default:
                                    switch (intValue) {
                                        case -200013:
                                            break;
                                        case -200012:
                                        case -200011:
                                            db5.t7.m123883x26a183b(wiVar.O6(), wiVar.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dcd), 0).show();
                                            break;
                                        case -200010:
                                            db5.t7.m123883x26a183b(wiVar.O6(), wiVar.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d4k), 0).show();
                                            break;
                                        case -200009:
                                            db5.t7.m123883x26a183b(wiVar.O6(), wiVar.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.clb), 0).show();
                                            break;
                                        default:
                                            db5.t7.m123883x26a183b(wiVar.O6(), wiVar.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cla), 0).show();
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "unknown errCode:" + intValue);
                                            break;
                                    }
                                case -200018:
                                case -200017:
                                    db5.t7.m123883x26a183b(wiVar.O6(), wiVar.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cla), 0).show();
                                    break;
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "handleStartMiniGameLiveFail: errCode = LiveSvrErrCode.MM_LIVE_ERR_LIVE_CLOSED");
                        }
                    } else if (l01Var != null && (m01Var = (r45.m01) l01Var.m75936x14adae67(6)) != null) {
                        wiVar.f7(m01Var);
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9 d9Var = wiVar.f313225o;
        if (d9Var != null) {
            d9Var.b();
        }
        return jz5.f0.f384359a;
    }
}
