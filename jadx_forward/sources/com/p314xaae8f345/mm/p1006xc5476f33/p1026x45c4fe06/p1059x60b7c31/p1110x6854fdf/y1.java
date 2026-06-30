package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes9.dex */
public final class y1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f164855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f164856e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164857f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164858g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.C12064xbfcfaad6 f164859h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(yz5.l lVar, android.app.Activity activity, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.C12064xbfcfaad6 c12064xbfcfaad6) {
        super(2);
        this.f164855d = lVar;
        this.f164856e = activity;
        this.f164857f = str;
        this.f164858g = str2;
        this.f164859h = c12064xbfcfaad6;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.Long l17 = (java.lang.Long) obj2;
        yz5.l lVar = this.f164855d;
        if (booleanValue) {
            android.app.Activity activity = this.f164856e;
            nf.g a17 = nf.g.a(activity);
            java.lang.String str2 = this.f164858g;
            java.lang.String str3 = this.f164857f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.C12064xbfcfaad6 c12064xbfcfaad6 = this.f164859h;
            a17.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.w1(lVar, str2, str3, c12064xbfcfaad6));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doShare, SHARE_VIDEO_REQUEST_CODE: ");
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.b2.f164650a;
            sb6.append(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareFileMessage", sb6.toString());
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("desc_title", str3);
            intent.putExtra("Retr_Msg_Type", 3);
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("select_is_ret", true);
            intent.putExtra("mutil_select_is_ret", true);
            intent.putExtra("from_scene_forward_to_wework", 6);
            intent.putExtra("content_type_forward_to_wework", 4);
            intent.putExtra("Select_Data_Send_To_WeWork", new com.p314xaae8f345.mm.p2610xe8058ca2.C21010xd7fb9f66(str2, l17, str3));
            if (c12064xbfcfaad6.f161884m) {
                intent.putExtra("Select_Conv_User", c12064xbfcfaad6.f161885n);
            }
            ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
            int O = r26.n0.O(this.f164857f, '.', 0, false, 6, null);
            if (O < 0 || O == str3.length() - 1) {
                str = "";
            } else {
                str = str3.substring(O + 1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
            }
            ec5.a aVar = new ec5.a();
            aVar.l(str2);
            aVar.k(n13.v.f415673a.b(str3, str, l17 != null ? l17.longValue() : 0L));
            if (c12064xbfcfaad6.f161884m) {
                java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
                n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.x1 x1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.x1(intent, activity);
                n13.t tVar = new n13.t();
                tVar.f415666a = x1Var;
                ((dk5.y) a0Var).wi(activity, aVar, stringExtra, tVar);
            } else {
                n13.r rVar = new n13.r();
                rVar.f415651b = i17;
                ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(activity, aVar, rVar);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareFileMessage", "doShare, fail since file illegal");
            lVar.mo146xb9724478(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t2.f164784h);
        }
        return jz5.f0.f384359a;
    }
}
