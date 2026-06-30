package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes9.dex */
public final class z2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f164868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164869e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164870f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f164871g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.C12064xbfcfaad6 f164872h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(yz5.l lVar, java.lang.String str, java.lang.String str2, android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.C12064xbfcfaad6 c12064xbfcfaad6) {
        super(2);
        this.f164868d = lVar;
        this.f164869e = str;
        this.f164870f = str2;
        this.f164871g = activity;
        this.f164872h = c12064xbfcfaad6;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.v2 v2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.v2) obj2;
        yz5.l lVar = this.f164868d;
        if (booleanValue) {
            java.lang.String str = this.f164869e;
            java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.xf.a(str, this.f164870f);
            if (a17 == null || a17.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiShareVideoMessage", "doShare, thumbPath is empty");
                lVar.mo146xb9724478(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t2.f164784h);
            } else {
                android.app.Activity activity = this.f164871g;
                nf.g.a(activity).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.x2(this.f164868d, v2Var, this.f164871g, this.f164869e, a17, this.f164872h));
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doShare, SHARE_VIDEO_REQUEST_CODE: ");
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.d3.f164661a;
                sb6.append(i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareVideoMessage", sb6.toString());
                int i18 = v2Var != null ? v2Var.f164823a : 0;
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("image_path", a17);
                intent.putExtra("Retr_Msg_Type", 1);
                intent.putExtra("Select_Conv_Type", 3);
                intent.putExtra("select_is_ret", true);
                intent.putExtra("mutil_select_is_ret", true);
                intent.putExtra("Retr_File_Name", str);
                intent.putExtra("Retr_length", i18);
                intent.putExtra("content_type_forward_to_wework", 3);
                intent.putExtra("Select_Data_Send_To_WeWork", new com.p314xaae8f345.mm.p2610xe8058ca2.C21015xc6dde2a5(str));
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.C12064xbfcfaad6 c12064xbfcfaad6 = this.f164872h;
                if (c12064xbfcfaad6.f161884m) {
                    intent.putExtra("Select_Conv_User", c12064xbfcfaad6.f161885n);
                }
                ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
                jd5.c cVar = new jd5.c();
                cVar.r(str);
                cVar.o(a17);
                cVar.q(v2Var != null ? v2Var.f164823a : 0);
                if (c12064xbfcfaad6.f161884m) {
                    java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
                    n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.y2 y2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.y2(intent, activity);
                    n13.t tVar = new n13.t();
                    tVar.f415666a = y2Var;
                    ((dk5.y) a0Var).wi(activity, cVar, stringExtra, tVar);
                } else {
                    n13.r rVar = new n13.r();
                    rVar.f415651b = i17;
                    ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(activity, cVar, rVar);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareVideoMessage", "doShare, fail since video illegal");
            lVar.mo146xb9724478(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t2.f164784h);
        }
        return jz5.f0.f384359a;
    }
}
