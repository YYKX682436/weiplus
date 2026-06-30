package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a1 f198904d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a1 a1Var) {
        super(6);
        this.f198904d = a1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.t
    public java.lang.Object J(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        r45.m01 m01Var;
        byte[] byteArray;
        r45.nw1 nw1Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        java.lang.String str = (java.lang.String) obj4;
        android.os.Bundle bundle = (android.os.Bundle) obj5;
        r45.l01 l01Var = (r45.l01) obj6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a1 a1Var = this.f198904d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a1Var.f198404d, "postExternalLive success:" + booleanValue + " errCode:" + intValue + " errType:" + intValue2 + " errMsg:" + str + " extInfo:" + bundle);
        android.app.Activity context = a1Var.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qp1 qp1Var = null;
        qp1Var = null;
        qp1Var = null;
        p3325xe03a0797.p3326xc267989b.z0.e(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.u) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.u.class)).P6().m57685x35ecf0b4(), null, 1, null);
        if (booleanValue) {
            a1Var.G = false;
            a1Var.F = true;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = a1Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.u.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            h63.s1 s1Var = (h63.s1) i95.n0.c(h63.s1.class);
            android.app.Activity m80379x76847179 = a1Var.m80379x76847179();
            java.lang.String str2 = a1Var.f198417t;
            int i17 = a1Var.f198422y;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a1Var.f198423z);
            gk2.e eVar = gk2.e.f354004n;
            ((h63.g1) s1Var).Di(m80379x76847179, str2, i17, bool, valueOf, java.lang.Long.valueOf((eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r) == null) ? 0L : nw1Var.m75942xfb822ef2(0)));
            if (a1Var.f198423z) {
                a1Var.m158354x19263085().finish();
                a1Var.m158354x19263085().overridePendingTransition(0, 0);
            }
        } else {
            a1Var.U6().setEnabled(true);
            java.lang.String str3 = "handleStartMiniGameLiveFail: errCode:" + intValue + ", errType:" + intValue2 + ", errMsg:" + str;
            java.lang.String str4 = a1Var.f198404d;
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
                    intent.setClass(a1Var.m158354x19263085(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4.class);
                    a1Var.m158354x19263085().startActivityForResult(intent, 10000);
                } else {
                    db5.t7.m123883x26a183b(a1Var.m158354x19263085(), a1Var.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dzz), 0).show();
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
                                            db5.t7.m123883x26a183b(a1Var.m80379x76847179(), a1Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dcd), 0).show();
                                            break;
                                        case -200010:
                                            db5.t7.m123883x26a183b(a1Var.m80379x76847179(), a1Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d4k), 0).show();
                                            break;
                                        case -200009:
                                            db5.t7.m123883x26a183b(a1Var.m80379x76847179(), a1Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.clb), 0).show();
                                            break;
                                        default:
                                            db5.t7.m123883x26a183b(a1Var.m80379x76847179(), a1Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cla), 0).show();
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "unknown errCode:" + intValue);
                                            break;
                                    }
                                case -200018:
                                case -200017:
                                    db5.t7.m123883x26a183b(a1Var.m80379x76847179(), a1Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cla), 0).show();
                                    break;
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "handleStartMiniGameLiveFail: errCode = LiveSvrErrCode.MM_LIVE_ERR_LIVE_CLOSED");
                        }
                    } else if (l01Var != null && (m01Var = (r45.m01) l01Var.m75936x14adae67(6)) != null) {
                        a1Var.V6(m01Var);
                    }
                }
            }
            a1Var.G = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9 d9Var = a1Var.D;
        if (d9Var != null) {
            d9Var.b();
        }
        return jz5.f0.f384359a;
    }
}
