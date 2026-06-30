package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes9.dex */
public final class x2 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f164839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.v2 f164840b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f164841c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164843e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.C12064xbfcfaad6 f164844f;

    public x2(yz5.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.v2 v2Var, android.app.Activity activity, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.C12064xbfcfaad6 c12064xbfcfaad6) {
        this.f164839a = lVar;
        this.f164840b = v2Var;
        this.f164841c = activity;
        this.f164842d = str;
        this.f164843e = str2;
        this.f164844f = c12064xbfcfaad6;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        r45.xz6 xz6Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doShare, requestCode: ");
        sb6.append(i17);
        sb6.append(", resultCode: ");
        sb6.append(i18);
        sb6.append(", data exists: ");
        boolean z17 = false;
        sb6.append(intent != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareVideoMessage", sb6.toString());
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.d3.f164661a != i17) {
            return false;
        }
        yz5.l lVar = this.f164839a;
        if (i18 != -1) {
            if (intent != null && true == intent.getBooleanExtra("finish_by_forward_to_wework", false)) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareVideoMessage", "doShare, share to wework");
                lVar.mo146xb9724478(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t2.f164782f);
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareVideoMessage", "doShare, cancel");
            lVar.mo146xb9724478(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t2.f164783g);
            return true;
        }
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareVideoMessage", "doShare, fail since data is null");
            lVar.mo146xb9724478(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t2.f164784h);
            return true;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        if (stringExtra == null || stringExtra.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareVideoMessage", "doShare, fail since selectedUsers is empty 1");
            lVar.mo146xb9724478(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t2.f164784h);
            return true;
        }
        java.util.List<java.lang.String> O1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1(stringExtra, ",");
        if (O1 == null || O1.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareVideoMessage", "doShare, fail since selectedUsers is empty 2");
            lVar.mo146xb9724478(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t2.f164784h);
            return true;
        }
        java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.v2 v2Var = this.f164840b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v2Var);
        int i19 = v2Var.f164823a;
        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.d3.f164661a;
        android.app.Activity activity = this.f164841c;
        java.lang.String str = this.f164842d;
        java.lang.String str2 = this.f164843e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(O1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.w2 w2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.w2(lVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var.f391649d = O1.size();
        boolean z18 = true ^ (stringExtra2 == null || stringExtra2.length() == 0);
        for (java.lang.String str3 : O1) {
            tg3.a1 a17 = tg3.t1.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.C12064xbfcfaad6 c12064xbfcfaad6 = this.f164844f;
            if (c12064xbfcfaad6.f161878d) {
                xz6Var = new r45.xz6();
                xz6Var.f472166d = c12064xbfcfaad6.f161879e;
                xz6Var.f472167e = c12064xbfcfaad6.f161883i;
                xz6Var.f472168f = c12064xbfcfaad6.f161882h;
                xz6Var.f472169g = c12064xbfcfaad6.f161880f;
                xz6Var.f472171i = java.lang.String.valueOf(c12064xbfcfaad6.f161881g);
                xz6Var.f472172m = c12064xbfcfaad6.f161887p;
            } else {
                xz6Var = null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.w2 w2Var2 = w2Var;
            java.lang.String str4 = str2;
            java.lang.String str5 = str;
            android.app.Activity activity2 = activity;
            ((dk5.s5) a17).oj(activity, str3, str, str2, 1, i19, false, false, "", "", xz6Var, c12064xbfcfaad6.f161884m ? c12064xbfcfaad6.f161886o : "", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.a3(str3, f0Var, w2Var));
            if (z18) {
                ((dk5.s5) tg3.t1.a()).fj(str3, stringExtra2, c01.e2.C(str3), 0);
            }
            w2Var = w2Var2;
            str2 = str4;
            str = str5;
            activity = activity2;
        }
        return true;
    }
}
