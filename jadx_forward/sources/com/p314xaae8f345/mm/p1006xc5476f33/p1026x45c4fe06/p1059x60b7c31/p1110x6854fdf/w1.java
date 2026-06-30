package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes9.dex */
public final class w1 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f164826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164827b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164828c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.C12064xbfcfaad6 f164829d;

    public w1(yz5.l lVar, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.C12064xbfcfaad6 c12064xbfcfaad6) {
        this.f164826a = lVar;
        this.f164827b = str;
        this.f164828c = str2;
        this.f164829d = c12064xbfcfaad6;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doShare, requestCode: ");
        sb6.append(i17);
        sb6.append(", resultCode: ");
        sb6.append(i18);
        sb6.append(", data exists: ");
        boolean z17 = false;
        sb6.append(intent != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareFileMessage", sb6.toString());
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.b2.f164650a != i17) {
            return false;
        }
        yz5.l lVar = this.f164826a;
        if (i18 != -1) {
            if (intent != null && true == intent.getBooleanExtra("finish_by_forward_to_wework", false)) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareFileMessage", "doShare, share to wework");
                lVar.mo146xb9724478(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t2.f164782f);
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareFileMessage", "doShare, cancel");
            lVar.mo146xb9724478(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t2.f164783g);
            return true;
        }
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareFileMessage", "doShare, fail since data is null");
            lVar.mo146xb9724478(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t2.f164784h);
            return true;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        if (stringExtra == null || stringExtra.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareFileMessage", "doShare, fail since selectedUsers is empty 1");
            lVar.mo146xb9724478(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t2.f164784h);
            return true;
        }
        java.util.List<java.lang.String> O1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1(stringExtra, ",");
        if (O1 == null || O1.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareFileMessage", "doShare, fail since selectedUsers is empty 2");
            lVar.mo146xb9724478(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t2.f164784h);
            return true;
        }
        java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.b2.f164650a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(O1);
        java.lang.String filePath = this.f164827b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        java.lang.String fileName = this.f164828c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.C12064xbfcfaad6 params = this.f164829d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504();
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11280xa65cf99c c11280xa65cf99c = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11280xa65cf99c();
        c11280xa65cf99c.m48460x4ab94e43(filePath);
        c11286x34a5504.f33122xe4128443 = c11280xa65cf99c;
        c11286x34a5504.f33130x6942258 = fileName;
        c11286x34a5504.f33121x993583fc = fileName;
        boolean z18 = !(stringExtra2 == null || stringExtra2.length() == 0);
        for (java.lang.String str : O1) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5168xc1431d4c c5168xc1431d4c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5168xc1431d4c();
            am.x xVar = c5168xc1431d4c.f135517g;
            xVar.f89863a = c11286x34a5504;
            xVar.f89864b = str;
            boolean z19 = params.f161878d;
            if (z19 || params.f161884m) {
                ot0.a aVar = new ot0.a();
                xVar.f89865c = aVar;
                if (z19) {
                    p15.x xVar2 = new p15.x();
                    xVar2.p(params.f161879e);
                    xVar2.q(params.f161880f);
                    xVar2.w(params.f161881g);
                    xVar2.t(params.f161882h);
                    xVar2.u(params.f161883i);
                    xVar2.x(params.f161887p);
                    aVar.P = xVar2;
                }
                xVar.f89865c.R = params.f161886o;
            }
            c5168xc1431d4c.e();
            if (z18) {
                ((dk5.s5) tg3.t1.a()).fj(str, stringExtra2, c01.e2.C(str), 0);
            }
        }
        lVar.mo146xb9724478(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t2.f164782f);
        return true;
    }
}
