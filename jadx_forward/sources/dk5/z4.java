package dk5;

/* loaded from: classes9.dex */
public class z4 implements dk5.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 f316550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316551b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f316552c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f316553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 f316554e;

    public z4(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, java.lang.String str, int i17, java.util.LinkedList linkedList) {
        this.f316554e = activityC22573x19a79d99;
        this.f316550a = c11286x34a5504;
        this.f316551b = str;
        this.f316552c = i17;
        this.f316553d = linkedList;
    }

    public void b(int i17, java.lang.Object obj) {
        k91.v5 v5Var;
        java.util.Iterator it;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb c11287xc333feeb;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504;
        java.lang.String str;
        char c17;
        java.lang.String b17;
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        java.lang.String str2 = this.f316551b;
        int i18 = this.f316552c;
        int i19 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99.B;
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99 = this.f316554e;
        activityC22573x19a79d99.getClass();
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a55042 = this.f316550a;
        if (c11286x34a55042 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SendAppMessageWrapperUI", "dealSendWXMediaMessageCallBack error, WXMediaMessage == null");
            activityC22573x19a79d99.finish();
            return;
        }
        java.util.LinkedList linkedList2 = this.f316553d;
        if (linkedList2 == null || linkedList2.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SendAppMessageWrapperUI", "dealSendWXMediaMessageCallBack error, toUserList is isEmpty, status:%d, text:%s", java.lang.Integer.valueOf(i17), str2);
            activityC22573x19a79d99.finish();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendAppMessageWrapperUI", "dealSendWXMediaMessageCallBack  status:%d, type:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(c11286x34a55042.m48467xfb85f7b0()));
        int m48467xfb85f7b0 = c11286x34a55042.m48467xfb85f7b0();
        int i27 = 1;
        if (m48467xfb85f7b0 == 2) {
            if (i17 == 1) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h7.c(activityC22573x19a79d99.f292564t, activityC22573x19a79d99.f292552e, c11286x34a55042, linkedList2);
                return;
            }
            if (i17 == 2) {
                activityC22573x19a79d99.b7(str2, linkedList2, i18);
                return;
            } else {
                if (i17 != 3) {
                    return;
                }
                activityC22573x19a79d99.setResult(0);
                activityC22573x19a79d99.b7(str2, linkedList2, i18);
                return;
            }
        }
        if (m48467xfb85f7b0 == 5) {
            if (i17 == 1) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h7.c(activityC22573x19a79d99.f292564t, activityC22573x19a79d99.f292552e, c11286x34a55042, linkedList2);
                return;
            }
            if (i17 == 2) {
                activityC22573x19a79d99.b7(str2, linkedList2, i18);
                return;
            } else {
                if (i17 != 3) {
                    return;
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C0(obj, "cb_msg_is_null") && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C0(obj, "cb_key_user_list_is_empty")) {
                    activityC22573x19a79d99.finish();
                }
                activityC22573x19a79d99.b7(str2, linkedList2, i18);
                return;
            }
        }
        if (m48467xfb85f7b0 == 8) {
            if (i17 != 1) {
                if (i17 == 2) {
                    activityC22573x19a79d99.b7(str2, linkedList2, i18);
                    return;
                } else {
                    if (i17 != 3) {
                        return;
                    }
                    activityC22573x19a79d99.finish();
                    return;
                }
            }
            if (obj instanceof java.lang.Integer) {
                int intValue = ((java.lang.Integer) obj).intValue();
                if (intValue > com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("InputLimitSendThirdPartyAppMsgEmotionBufSize"), 524288)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendAppMessageWrapperUI", "third party shared emoji can't bigger 512 KB");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar2 = activityC22573x19a79d99.f292552e;
                g0Var.d(13461, mVar2.f67370x28d45f97, mVar2.f67372x453d1e07, java.lang.Integer.valueOf(intValue));
                return;
            }
            return;
        }
        if (m48467xfb85f7b0 != 36) {
            if (m48467xfb85f7b0 == 38) {
                if (i17 == 1) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h7.c(activityC22573x19a79d99.f292564t, activityC22573x19a79d99.f292552e, c11286x34a55042, linkedList2);
                    return;
                }
                if (i17 == 2) {
                    if (obj instanceof com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c3) {
                        linkedList = linkedList2;
                        activityC22573x19a79d99.f292557m = db5.e1.Q(activityC22573x19a79d99, activityC22573x19a79d99.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC22573x19a79d99.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new dk5.d5(activityC22573x19a79d99, obj));
                    } else {
                        linkedList = linkedList2;
                    }
                    activityC22573x19a79d99.b7(str2, linkedList, i18);
                    return;
                }
                if (i17 == 3) {
                    activityC22573x19a79d99.b7(str2, linkedList2, i18);
                    return;
                } else {
                    if (i17 == 6 && (u3Var = activityC22573x19a79d99.f292557m) != null) {
                        u3Var.dismiss();
                        activityC22573x19a79d99.f292557m = null;
                        return;
                    }
                    return;
                }
            }
            if (m48467xfb85f7b0 == 76) {
                if (i17 == 1) {
                    activityC22573x19a79d99.f292557m = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(activityC22573x19a79d99, activityC22573x19a79d99.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, 0, null);
                    return;
                }
                if (i17 != 2) {
                    if (i17 == 3) {
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C0(obj, "cb_msg_is_null") || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C0(obj, "cb_key_user_list_is_empty")) {
                            return;
                        }
                        activityC22573x19a79d99.finish();
                        return;
                    }
                    if (i17 == 5) {
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.c(activityC22573x19a79d99, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.a(activityC22573x19a79d99.getIntent().getExtras(), -1), true, false);
                        activityC22573x19a79d99.finish();
                        return;
                    } else if (i17 != 6) {
                        return;
                    }
                }
                activityC22573x19a79d99.runOnUiThread(new dk5.e5(activityC22573x19a79d99, str2, linkedList2, i18));
                return;
            }
            if (m48467xfb85f7b0 == 45) {
                if (i17 == 1) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h7.c(activityC22573x19a79d99.f292564t, activityC22573x19a79d99.f292552e, c11286x34a55042, linkedList2);
                    return;
                }
                if (i17 == 2) {
                    activityC22573x19a79d99.b7(str2, linkedList2, i18);
                    return;
                } else {
                    if (i17 != 3) {
                        return;
                    }
                    activityC22573x19a79d99.setResult(0);
                    activityC22573x19a79d99.finish();
                    activityC22573x19a79d99.b7(str2, linkedList2, i18);
                    return;
                }
            }
            if (m48467xfb85f7b0 != 46 && m48467xfb85f7b0 != 48) {
                if (m48467xfb85f7b0 == 49) {
                    activityC22573x19a79d99.Z6(i17, obj, c11286x34a55042, str2, i18, linkedList2);
                    return;
                }
                if (i17 == 1) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h7.c(activityC22573x19a79d99.f292564t, activityC22573x19a79d99.f292552e, c11286x34a55042, linkedList2);
                    return;
                }
                if (i17 == 2) {
                    activityC22573x19a79d99.b7(str2, linkedList2, i18);
                    return;
                } else {
                    if (i17 != 3) {
                        return;
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C0(obj, "cb_msg_is_null") && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C0(obj, "cb_key_user_list_is_empty")) {
                        activityC22573x19a79d99.finish();
                    }
                    activityC22573x19a79d99.b7(str2, linkedList2, i18);
                    return;
                }
            }
        }
        if (i17 == 2 || i17 == 3) {
            activityC22573x19a79d99.b7(str2, linkedList2, i18);
            return;
        }
        if (i17 != 4) {
            if (i17 == 5) {
                activityC22573x19a79d99.setResult(-1);
                activityC22573x19a79d99.finish();
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.c(activityC22573x19a79d99, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.a(activityC22573x19a79d99.getIntent().getExtras(), -1), true, false);
                return;
            }
            if (i17 == 6 && obj != null && (obj instanceof java.lang.String) && (c11286x34a55042.f33122xe4128443 instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb)) {
                java.util.Iterator it6 = linkedList2.iterator();
                while (it6.hasNext()) {
                    java.lang.String str3 = (java.lang.String) it6.next();
                    boolean endsWith = str3.endsWith("chatroom");
                    com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb c11287xc333feeb2 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb) c11286x34a55042.f33122xe4128443;
                    java.lang.String str4 = c11287xc333feeb2.f33178xa1713a8c;
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (str4 == null) {
                        str4 = "";
                    }
                    java.lang.String a17 = fp.s0.a(str4);
                    java.lang.String str5 = c11286x34a55042.f33130x6942258;
                    if (str5 == null) {
                        str5 = "";
                    }
                    java.lang.String a18 = fp.s0.a(str5);
                    java.lang.String str6 = c11286x34a55042.f33121x993583fc;
                    if (str6 == null) {
                        str6 = "";
                    }
                    java.lang.String a19 = fp.s0.a(str6);
                    java.lang.String str7 = c11287xc333feeb2.f33176x346425;
                    if (str7 == null) {
                        str7 = "";
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14127, activityC22573x19a79d99.f292552e.f67370x28d45f97, c11287xc333feeb2.f33177xf01afcf6, fp.s0.a(str7), a18, a19, "", a17, 0, java.lang.Integer.valueOf(i27), 0, java.lang.Integer.valueOf(endsWith ? 1 : 0), str3, java.lang.Integer.valueOf(i27), obj, "");
                    c11286x34a55042 = c11286x34a55042;
                    activityC22573x19a79d99 = activityC22573x19a79d99;
                    i27 = 1;
                }
                return;
            }
            return;
        }
        if (obj instanceof k91.v5) {
            int i28 = activityC22573x19a79d99.f292564t;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar3 = activityC22573x19a79d99.f292552e;
            k91.v5 v5Var2 = (k91.v5) obj;
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a55043 = c11286x34a55042;
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb c11287xc333feeb3 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb) c11286x34a55043.f33122xe4128443;
            java.lang.String str8 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c;
            java.util.Iterator it7 = linkedList2.iterator();
            while (it7.hasNext()) {
                java.lang.String str9 = (java.lang.String) it7.next();
                java.lang.String str10 = mVar3.f67370x28d45f97;
                java.lang.String str11 = mVar3.f67372x453d1e07;
                boolean k17 = mVar3.k();
                int m48467xfb85f7b02 = c11286x34a55043.m48467xfb85f7b0();
                boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str9);
                try {
                    java.lang.String str12 = c11287xc333feeb3.f33178xa1713a8c;
                    if (str12 == null) {
                        str12 = "";
                    }
                    b17 = fp.s0.b(str12, str8);
                    it = it7;
                } catch (java.io.UnsupportedEncodingException unused) {
                    v5Var = v5Var2;
                    it = it7;
                }
                try {
                    java.lang.String str13 = c11286x34a55043.f33130x6942258;
                    if (str13 == null) {
                        str13 = "";
                    }
                    java.lang.String b18 = fp.s0.b(str13, str8);
                    mVar = mVar3;
                    try {
                        java.lang.String str14 = c11286x34a55043.f33121x993583fc;
                        if (str14 == null) {
                            str14 = "";
                        }
                        java.lang.String b19 = fp.s0.b(str14, str8);
                        c11286x34a5504 = c11286x34a55043;
                        try {
                            java.lang.String str15 = v5Var2.f68904x28d45f97;
                            v5Var = v5Var2;
                            try {
                                java.lang.String str16 = c11287xc333feeb3.f33176x346425;
                                if (str16 == null) {
                                    str16 = "";
                                }
                                java.lang.String b27 = fp.s0.b(str16, str8);
                                str = str8;
                                try {
                                    int i29 = c11287xc333feeb3.f33175xc6c9cf27;
                                    c11287xc333feeb = c11287xc333feeb3;
                                    try {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareReport", i28 + "," + str10 + "," + str11 + "," + (k17 ? 1 : 0) + "," + m48467xfb85f7b02 + "," + (R4 ? 1 : 0) + ",1," + str9 + "," + b18 + "," + b19 + "," + b17 + "," + str15 + "," + b27 + "," + i29);
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                                        java.lang.Object[] objArr = new java.lang.Object[15];
                                        objArr[0] = java.lang.Integer.valueOf(i28);
                                        objArr[1] = str10;
                                        objArr[2] = str11;
                                        objArr[3] = java.lang.Integer.valueOf(k17 ? 1 : 0);
                                        java.lang.Integer valueOf = java.lang.Integer.valueOf(m48467xfb85f7b02);
                                        c17 = 4;
                                        try {
                                            objArr[4] = valueOf;
                                            try {
                                                objArr[5] = java.lang.Integer.valueOf(R4 ? 1 : 0);
                                                try {
                                                    objArr[6] = 1;
                                                    objArr[7] = str9;
                                                    try {
                                                        objArr[8] = b18;
                                                        objArr[9] = b19;
                                                        objArr[10] = b17;
                                                        objArr[11] = str15;
                                                        objArr[12] = b27;
                                                        objArr[13] = java.lang.Integer.valueOf(i29);
                                                        objArr[14] = "";
                                                        g0Var2.d(16492, objArr);
                                                    } catch (java.io.UnsupportedEncodingException unused2) {
                                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                                                        it7 = it;
                                                        v5Var2 = v5Var;
                                                        mVar3 = mVar;
                                                        c11286x34a55043 = c11286x34a5504;
                                                        str8 = str;
                                                        c11287xc333feeb3 = c11287xc333feeb;
                                                    }
                                                } catch (java.io.UnsupportedEncodingException unused3) {
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                                                    it7 = it;
                                                    v5Var2 = v5Var;
                                                    mVar3 = mVar;
                                                    c11286x34a55043 = c11286x34a5504;
                                                    str8 = str;
                                                    c11287xc333feeb3 = c11287xc333feeb;
                                                }
                                            } catch (java.io.UnsupportedEncodingException unused4) {
                                            }
                                        } catch (java.io.UnsupportedEncodingException unused5) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                                            it7 = it;
                                            v5Var2 = v5Var;
                                            mVar3 = mVar;
                                            c11286x34a55043 = c11286x34a5504;
                                            str8 = str;
                                            c11287xc333feeb3 = c11287xc333feeb;
                                        }
                                    } catch (java.io.UnsupportedEncodingException unused6) {
                                        c17 = 4;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                                        it7 = it;
                                        v5Var2 = v5Var;
                                        mVar3 = mVar;
                                        c11286x34a55043 = c11286x34a5504;
                                        str8 = str;
                                        c11287xc333feeb3 = c11287xc333feeb;
                                    }
                                } catch (java.io.UnsupportedEncodingException unused7) {
                                    c11287xc333feeb = c11287xc333feeb3;
                                }
                            } catch (java.io.UnsupportedEncodingException unused8) {
                                c11287xc333feeb = c11287xc333feeb3;
                                str = str8;
                                c17 = 4;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                                it7 = it;
                                v5Var2 = v5Var;
                                mVar3 = mVar;
                                c11286x34a55043 = c11286x34a5504;
                                str8 = str;
                                c11287xc333feeb3 = c11287xc333feeb;
                            }
                        } catch (java.io.UnsupportedEncodingException unused9) {
                            v5Var = v5Var2;
                        }
                    } catch (java.io.UnsupportedEncodingException unused10) {
                        v5Var = v5Var2;
                        c11287xc333feeb = c11287xc333feeb3;
                        c11286x34a5504 = c11286x34a55043;
                        str = str8;
                        c17 = 4;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                        it7 = it;
                        v5Var2 = v5Var;
                        mVar3 = mVar;
                        c11286x34a55043 = c11286x34a5504;
                        str8 = str;
                        c11287xc333feeb3 = c11287xc333feeb;
                    }
                } catch (java.io.UnsupportedEncodingException unused11) {
                    v5Var = v5Var2;
                    mVar = mVar3;
                    c11287xc333feeb = c11287xc333feeb3;
                    c11286x34a5504 = c11286x34a55043;
                    str = str8;
                    c17 = 4;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                    it7 = it;
                    v5Var2 = v5Var;
                    mVar3 = mVar;
                    c11286x34a55043 = c11286x34a5504;
                    str8 = str;
                    c11287xc333feeb3 = c11287xc333feeb;
                }
                it7 = it;
                v5Var2 = v5Var;
                mVar3 = mVar;
                c11286x34a55043 = c11286x34a5504;
                str8 = str;
                c11287xc333feeb3 = c11287xc333feeb;
            }
        }
    }
}
