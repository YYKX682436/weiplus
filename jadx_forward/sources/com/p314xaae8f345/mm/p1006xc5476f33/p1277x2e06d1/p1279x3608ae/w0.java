package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

/* loaded from: classes9.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req f175346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175347e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840 f175348f;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840 activityC12946xbb486840, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req req, java.lang.String str) {
        this.f175348f = activityC12946xbb486840;
        this.f175346d = req;
        this.f175347e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.qa qaVar;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject iMediaObject;
        boolean z17;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req req = this.f175346d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840 activityC12946xbb486840 = this.f175348f;
        try {
            if (((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Bi(req.f33049x38eb0007)) {
                android.os.Bundle bundle = new android.os.Bundle();
                req.mo48427x792022dd(bundle);
                activityC12946xbb486840.getIntent().putExtras(bundle);
            }
            java.lang.String d17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.d(activityC12946xbb486840, activityC12946xbb486840.f175220e);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g5 g5Var = activityC12946xbb486840.f175225m;
            if (d17 != null) {
                g5Var.f270446a = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f5.SUCCESS;
            } else {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.i5 i5Var = activityC12946xbb486840.f175222g;
                if (i5Var == null || i5Var.f270469c != null) {
                    g5Var.f270446a = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f5.SUCCESS_BY_TOKEN;
                } else {
                    g5Var.f270446a = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f5.NO_TOKEN_SIGNATURE;
                }
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 wxMsg = activityC12946xbb486840.f175233u;
            int i17 = req.f33050x683188c;
            java.lang.String str = activityC12946xbb486840.f175219d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxMsg, "wxMsg");
            if (i17 == 0 && (((z17 = (iMediaObject = wxMsg.f33122xe4128443) instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11296xa95b008d)) || (iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11283x90d63ed9) || (iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11298x4d56d1f9) || (iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1) || (iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb) || (iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936))) {
                java.lang.String str2 = wxMsg.f33126x2a5bf237;
                if (!(str2 == null || r26.n0.N(str2))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgSignatureHelper", "getAppMsgSignature3rd type " + wxMsg.m48467xfb85f7b0() + ", msgSignature = " + wxMsg.f33126x2a5bf237);
                    r45.qa qaVar2 = new r45.qa();
                    qaVar2.f465323f = wxMsg.f33126x2a5bf237;
                    java.util.LinkedList linkedList2 = qaVar2.f465322e;
                    r45.z56 z56Var = new r45.z56();
                    z56Var.f473270d = "appid";
                    z56Var.f473271e = str;
                    linkedList2.add(z56Var);
                    if (z17) {
                        qaVar2.f465321d = 1;
                        java.util.LinkedList linkedList3 = qaVar2.f465322e;
                        r45.z56 z56Var2 = new r45.z56();
                        z56Var2.f473270d = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24;
                        z56Var2.f473271e = ((com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11296xa95b008d) iMediaObject).f33229x36452d;
                        linkedList3.add(z56Var2);
                    } else if (iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11283x90d63ed9) {
                        qaVar2.f465321d = 2;
                        java.util.LinkedList linkedList4 = qaVar2.f465322e;
                        r45.z56 z56Var3 = new r45.z56();
                        z56Var3.f473270d = "imgDataHash";
                        z56Var3.f473271e = ((com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11283x90d63ed9) iMediaObject).f33106x2b12c8bb;
                        linkedList4.add(z56Var3);
                    } else if (iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11298x4d56d1f9) {
                        qaVar2.f465321d = 4;
                        java.util.LinkedList linkedList5 = qaVar2.f465322e;
                        r45.z56 z56Var4 = new r45.z56();
                        z56Var4.f473270d = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28;
                        z56Var4.f473271e = wxMsg.f33130x6942258;
                        linkedList5.add(z56Var4);
                        java.util.LinkedList linkedList6 = qaVar2.f465322e;
                        r45.z56 z56Var5 = new r45.z56();
                        z56Var5.f473270d = "description";
                        z56Var5.f473271e = wxMsg.f33121x993583fc;
                        linkedList6.add(z56Var5);
                        java.util.LinkedList linkedList7 = qaVar2.f465322e;
                        r45.z56 z56Var6 = new r45.z56();
                        z56Var6.f473270d = "thumbDataHash";
                        z56Var6.f473271e = wxMsg.f33129x73ff1fce;
                        linkedList7.add(z56Var6);
                        java.util.LinkedList linkedList8 = qaVar2.f465322e;
                        r45.z56 z56Var7 = new r45.z56();
                        z56Var7.f473270d = "videoUrl";
                        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11298x4d56d1f9 c11298x4d56d1f9 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11298x4d56d1f9) iMediaObject;
                        z56Var7.f473271e = c11298x4d56d1f9.f33238x44a0a2f4;
                        linkedList8.add(z56Var7);
                        java.util.LinkedList linkedList9 = qaVar2.f465322e;
                        r45.z56 z56Var8 = new r45.z56();
                        z56Var8.f473270d = "videoLowBandUrl";
                        z56Var8.f473271e = c11298x4d56d1f9.f33237x3accbfe1;
                        linkedList9.add(z56Var8);
                    } else if (iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1) {
                        qaVar2.f465321d = 5;
                        java.util.LinkedList linkedList10 = qaVar2.f465322e;
                        r45.z56 z56Var9 = new r45.z56();
                        z56Var9.f473270d = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28;
                        z56Var9.f473271e = wxMsg.f33130x6942258;
                        linkedList10.add(z56Var9);
                        java.util.LinkedList linkedList11 = qaVar2.f465322e;
                        r45.z56 z56Var10 = new r45.z56();
                        z56Var10.f473270d = "description";
                        z56Var10.f473271e = wxMsg.f33121x993583fc;
                        linkedList11.add(z56Var10);
                        java.util.LinkedList linkedList12 = qaVar2.f465322e;
                        r45.z56 z56Var11 = new r45.z56();
                        z56Var11.f473270d = "thumbDataHash";
                        z56Var11.f473271e = wxMsg.f33129x73ff1fce;
                        linkedList12.add(z56Var11);
                        java.util.LinkedList linkedList13 = qaVar2.f465322e;
                        r45.z56 z56Var12 = new r45.z56();
                        z56Var12.f473270d = "webpageUrl";
                        z56Var12.f473271e = ((com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1) iMediaObject).f33249xa1713a8c;
                        linkedList13.add(z56Var12);
                    } else if (iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb) {
                        qaVar2.f465321d = 6;
                        java.util.LinkedList linkedList14 = qaVar2.f465322e;
                        r45.z56 z56Var13 = new r45.z56();
                        z56Var13.f473270d = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28;
                        z56Var13.f473271e = wxMsg.f33130x6942258;
                        linkedList14.add(z56Var13);
                        java.util.LinkedList linkedList15 = qaVar2.f465322e;
                        r45.z56 z56Var14 = new r45.z56();
                        z56Var14.f473270d = "description";
                        z56Var14.f473271e = wxMsg.f33121x993583fc;
                        linkedList15.add(z56Var14);
                        java.util.LinkedList linkedList16 = qaVar2.f465322e;
                        r45.z56 z56Var15 = new r45.z56();
                        z56Var15.f473270d = "thumbDataHash";
                        z56Var15.f473271e = wxMsg.f33129x73ff1fce;
                        linkedList16.add(z56Var15);
                        java.util.LinkedList linkedList17 = qaVar2.f465322e;
                        r45.z56 z56Var16 = new r45.z56();
                        z56Var16.f473270d = "userName";
                        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb c11287xc333feeb = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb) iMediaObject;
                        z56Var16.f473271e = c11287xc333feeb.f33177xf01afcf6;
                        linkedList17.add(z56Var16);
                        java.util.LinkedList linkedList18 = qaVar2.f465322e;
                        r45.z56 z56Var17 = new r45.z56();
                        z56Var17.f473270d = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714;
                        z56Var17.f473271e = c11287xc333feeb.f33176x346425;
                        linkedList18.add(z56Var17);
                    } else if (iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936) {
                        qaVar2.f465321d = 7;
                        java.util.LinkedList linkedList19 = qaVar2.f465322e;
                        r45.z56 z56Var18 = new r45.z56();
                        z56Var18.f473270d = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28;
                        z56Var18.f473271e = wxMsg.f33130x6942258;
                        linkedList19.add(z56Var18);
                        java.util.LinkedList linkedList20 = qaVar2.f465322e;
                        r45.z56 z56Var19 = new r45.z56();
                        z56Var19.f473270d = "description";
                        z56Var19.f473271e = wxMsg.f33121x993583fc;
                        linkedList20.add(z56Var19);
                        java.util.LinkedList linkedList21 = qaVar2.f465322e;
                        r45.z56 z56Var20 = new r45.z56();
                        z56Var20.f473270d = "thumbDataHash";
                        z56Var20.f473271e = wxMsg.f33129x73ff1fce;
                        linkedList21.add(z56Var20);
                        java.util.LinkedList linkedList22 = qaVar2.f465322e;
                        r45.z56 z56Var21 = new r45.z56();
                        z56Var21.f473270d = "musicUrl";
                        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936 c11289x4ff06936 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936) iMediaObject;
                        z56Var21.f473271e = c11289x4ff06936.f33201x324c710a;
                        linkedList22.add(z56Var21);
                        java.util.LinkedList linkedList23 = qaVar2.f465322e;
                        r45.z56 z56Var22 = new r45.z56();
                        z56Var22.f473270d = "musicDataUrl";
                        z56Var22.f473271e = c11289x4ff06936.f33198xc58aab80;
                        linkedList23.add(z56Var22);
                        java.util.LinkedList linkedList24 = qaVar2.f465322e;
                        r45.z56 z56Var23 = new r45.z56();
                        z56Var23.f473270d = "singerName";
                        z56Var23.f473271e = c11289x4ff06936.f33203x2b375427;
                        linkedList24.add(z56Var23);
                        java.util.LinkedList linkedList25 = qaVar2.f465322e;
                        r45.z56 z56Var24 = new r45.z56();
                        z56Var24.f473270d = "duration";
                        z56Var24.f473271e = java.lang.String.valueOf(c11289x4ff06936.f33193x89444d94);
                        linkedList25.add(z56Var24);
                        java.util.LinkedList linkedList26 = qaVar2.f465322e;
                        r45.z56 z56Var25 = new r45.z56();
                        z56Var25.f473270d = "hdAlbumThumbFileHash";
                        z56Var25.f473271e = c11289x4ff06936.f33194x4b2cc8d;
                        linkedList26.add(z56Var25);
                        java.util.LinkedList linkedList27 = qaVar2.f465322e;
                        r45.z56 z56Var26 = new r45.z56();
                        z56Var26.f473270d = "albumName";
                        z56Var26.f473271e = c11289x4ff06936.f33192xedb9d9a;
                        linkedList27.add(z56Var26);
                        java.util.LinkedList linkedList28 = qaVar2.f465322e;
                        r45.z56 z56Var27 = new r45.z56();
                        z56Var27.f473270d = "musicGenre";
                        z56Var27.f473271e = c11289x4ff06936.f33199xd0293a5e;
                        linkedList28.add(z56Var27);
                        java.util.LinkedList linkedList29 = qaVar2.f465322e;
                        r45.z56 z56Var28 = new r45.z56();
                        z56Var28.f473270d = "issueDate";
                        z56Var28.f473271e = java.lang.String.valueOf(c11289x4ff06936.f33197xafbf827);
                        linkedList29.add(z56Var28);
                        java.util.LinkedList linkedList30 = qaVar2.f465322e;
                        r45.z56 z56Var29 = new r45.z56();
                        z56Var29.f473270d = "identification";
                        z56Var29.f473271e = c11289x4ff06936.f33196x187d426e;
                        linkedList30.add(z56Var29);
                    }
                    qaVar = qaVar2;
                    com.p314xaae8f345.mm.p957x53236a1b.h1 h1Var = new com.p314xaae8f345.mm.p957x53236a1b.h1(this.f175347e, 1, linkedList, activityC12946xbb486840.f175221f, java.lang.String.valueOf(activityC12946xbb486840.f175227o), g5Var.f270446a.f270432d, qaVar);
                    com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = gm0.j1.n().f354821b;
                    r1Var.a(1200, new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.t0(h1Var, r1Var, activityC12946xbb486840));
                    r1Var.g(h1Var);
                }
            }
            qaVar = null;
            com.p314xaae8f345.mm.p957x53236a1b.h1 h1Var2 = new com.p314xaae8f345.mm.p957x53236a1b.h1(this.f175347e, 1, linkedList, activityC12946xbb486840.f175221f, java.lang.String.valueOf(activityC12946xbb486840.f175227o), g5Var.f270446a.f270432d, qaVar);
            com.p314xaae8f345.mm.p944x882e457a.r1 r1Var2 = gm0.j1.n().f354821b;
            r1Var2.a(1200, new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.t0(h1Var2, r1Var2, activityC12946xbb486840));
            r1Var2.g(h1Var2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXEntryActivity", "copyFileIfNeed e = %s", e17.getMessage());
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840.f175218y;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.c(activityC12946xbb486840, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.e(activityC12946xbb486840.getIntent()), -1), true, false);
            activityC12946xbb486840.finish();
        }
    }
}
