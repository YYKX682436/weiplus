package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes9.dex */
public final class e1 extends kj1.m {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.cgi.C12593xa2ff72c4 f171206b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12639x67ea3d2c f171207c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f171209e;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.cgi.C12593xa2ff72c4 c12593xa2ff72c4, java.lang.String shortLink, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12639x67ea3d2c activityC12639x67ea3d2c, java.lang.String str, int i17, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l1 l1Var) {
        this.f171206b = c12593xa2ff72c4;
        this.f171207c = activityC12639x67ea3d2c;
        this.f171208d = str;
        this.f171209e = i17;
        if (c12593xa2ff72c4 != null) {
            kj1.w wVar = kj1.w.f389912a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shortLink, "shortLink");
            kj1.w.f389913b.put(shortLink, c12593xa2ff72c4);
        }
    }

    @Override // kj1.m
    public kj1.v a() {
        return kj1.w.f389912a;
    }

    @Override // kj1.m
    public void b(android.content.Context ctx, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.C12590x3a54364b params, yz5.l launchResultCallback) {
        int i17;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(launchResultCallback, "launchResultCallback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12639x67ea3d2c activityC12639x67ea3d2c = this.f171207c;
        java.lang.String stringExtra = activityC12639x67ea3d2c.getIntent().getStringExtra("prescene_for_report");
        java.lang.String stringExtra2 = activityC12639x67ea3d2c.getIntent().getStringExtra(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
        java.lang.String stringExtra3 = activityC12639x67ea3d2c.getIntent().getStringExtra("presceneNote_for_report");
        try {
            i17 = java.lang.Integer.parseInt(stringExtra);
        } catch (java.lang.Exception unused) {
            i17 = 0;
        }
        java.lang.String stringExtra4 = activityC12639x67ea3d2c.getIntent().getStringExtra("use_chat_tool");
        boolean parseBoolean = stringExtra4 != null ? java.lang.Boolean.parseBoolean(stringExtra4) : false;
        java.lang.String stringExtra5 = activityC12639x67ea3d2c.getIntent().getStringExtra("weapp_source_username");
        java.lang.String stringExtra6 = activityC12639x67ea3d2c.getIntent().getStringExtra("talkerUsername");
        boolean z17 = stringExtra6 == null || stringExtra6.length() == 0;
        int i18 = this.f171209e;
        java.lang.String str2 = this.f171208d;
        if (!z17) {
            str = stringExtra2 + ':' + str2 + ':' + str2 + "::" + i18 + ':' + stringExtra6;
        } else if (i17 == 3) {
            str = stringExtra2 + ':' + str2 + "::5";
        } else {
            str = stringExtra2 + ':' + str2;
        }
        l81.b1 b1Var = new l81.b1();
        java.lang.String str3 = params.f170398d;
        b1Var.f398547b = str3;
        java.lang.String str4 = params.f170403i;
        b1Var.f398545a = str4;
        b1Var.f398555f = params.f170399e;
        b1Var.f398551d = params.f170400f;
        b1Var.f398549c = params.f170401g;
        b1Var.P = params.f170402h;
        b1Var.f398565k = ae1.h.f33x366c91de;
        b1Var.f398568m = i17;
        b1Var.f398567l = str;
        b1Var.f398569n = stringExtra3;
        b1Var.Q = i18;
        if (parseBoolean) {
            b1Var.f398550c0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11811x8e083f42("subpackage");
            b1Var.f398548b0 = stringExtra5;
        }
        b1Var.f398576u = stringExtra6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCheckWxaShortLinkUI", "launchWxa  appId=" + b1Var.f398547b + " \nenterPath=" + b1Var.f398555f + " \nversion=" + b1Var.f398551d + " \nversionType=" + b1Var.f398549c + " \nshortLink=" + b1Var.P + " \nscene=" + b1Var.f398565k + " \nsceneNote=" + b1Var.f398567l + " \npresceneNote=" + b1Var.f398569n + " \nprescene=" + i17 + '\n');
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(ctx, b1Var);
        launchResultCallback.mo146xb9724478(java.lang.Boolean.TRUE);
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12639x67ea3d2c.f170862g;
        activityC12639x67ea3d2c.getClass();
        if (!(str4.length() > 0)) {
            str4 = null;
        }
        if (str4 != null) {
            str3 = str4;
        }
        java.lang.String stringExtra7 = activityC12639x67ea3d2c.getIntent().getStringExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
        if (stringExtra7 == null) {
            stringExtra7 = "";
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l1 m75717xdce0328 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l1.m75717xdce0328(stringExtra7);
        java.lang.String stringExtra8 = activityC12639x67ea3d2c.getIntent().getStringExtra("talkerUsername");
        java.lang.String stringExtra9 = activityC12639x67ea3d2c.getIntent().getStringExtra("senderUsername");
        if (m75717xdce0328 == com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l1.f272787h) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.v0.f262526a.a(str3, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19156xb6112c3(stringExtra9, null));
        } else if (m75717xdce0328 == com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l1.f272785f || m75717xdce0328 == com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l1.f272786g) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.v0.f262526a.a(str3, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19156xb6112c3(stringExtra8, stringExtra9, 0, (java.lang.String) null, "", (java.lang.String) null, 0L, 96, (p3321xbce91901.jvm.p3324x21ffc6bd.i) null));
        }
    }

    @Override // kj1.m
    public void c(android.app.Activity ctx, java.lang.String url, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        super.c(ctx, url, z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.cgi.C12593xa2ff72c4 c12593xa2ff72c4 = this.f171206b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c12593xa2ff72c4);
        this.f171207c.T6(1, c12593xa2ff72c4);
    }

    @Override // kj1.m
    public boolean d(android.app.Activity ctx, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        return true;
    }

    @Override // kj1.m
    public void e(android.app.Activity ctx, java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        super.e(ctx, url);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.cgi.C12593xa2ff72c4 c12593xa2ff72c4 = this.f171206b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c12593xa2ff72c4);
        this.f171207c.T6(2, c12593xa2ff72c4);
    }
}
