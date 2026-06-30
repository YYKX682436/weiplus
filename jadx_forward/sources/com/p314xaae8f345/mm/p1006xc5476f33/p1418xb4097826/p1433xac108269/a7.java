package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class a7 implements com.p314xaae8f345.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f183541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f183542e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f183543f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f183544g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f183545h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f183546i;

    public a7(boolean z17, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, yz5.p pVar, int i17, r45.qt2 qt2Var) {
        this.f183541d = z17;
        this.f183542e = activityC21401x6ce6f73f;
        this.f183543f = c14994x9b99c079;
        this.f183544g = pVar;
        this.f183545h = i17;
        this.f183546i = qt2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        boolean z17 = i18 == -1;
        java.lang.Boolean bool = null;
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("sns_upload_desc") : null;
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity = this.f183542e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedItem = this.f183543f;
        if (z17) {
            if (this.f183541d) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activity);
                e4Var.f293309c = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572093yi);
                e4Var.c();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", "share feed to sns desc = " + stringExtra);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "context");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qf qfVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qf) pf5.z.f435481a.a(activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qf.class);
                if (qfVar != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedItem, "feedItem");
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = feedItem.getFeedObject();
                    jz5.g gVar = hc2.o0.f361869a;
                    boolean z18 = ((feedObject != null ? feedObject.m76810x98d986d1() : 0) & 67108864) == 0;
                    int e17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e(stringExtra, com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enable=");
                    boolean z19 = qfVar.f217233m;
                    sb6.append(z19);
                    sb6.append(" hasPermission:");
                    sb6.append(z18);
                    sb6.append(" maxLen=");
                    jz5.g gVar2 = qfVar.f217234n;
                    sb6.append(((java.lang.Number) ((jz5.n) gVar2).mo141623x754a37bb()).intValue());
                    sb6.append(" desc=");
                    sb6.append(stringExtra);
                    sb6.append(" len:");
                    sb6.append(stringExtra != null ? java.lang.Integer.valueOf(stringExtra.length()) : null);
                    sb6.append(" count:");
                    sb6.append(e17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedShareDescToCommentUIC", sb6.toString());
                    if (z19) {
                        if (!(stringExtra == null || stringExtra.length() == 0) && e17 <= ((java.lang.Number) ((jz5.n) gVar2).mo141623x754a37bb()).intValue() && z18) {
                            qfVar.f217229f = feedItem;
                            qfVar.f217230g = stringExtra;
                            qfVar.f217227d = true;
                            if (qfVar.f217228e) {
                                qfVar.f217227d = true;
                            } else {
                                android.view.View m80380x71e92c1d = qfVar.m80380x71e92c1d();
                                jz5.n nVar = (jz5.n) qfVar.f217236p;
                                m80380x71e92c1d.removeCallbacks((java.lang.Runnable) nVar.mo141623x754a37bb());
                                qfVar.m80380x71e92c1d().postDelayed((java.lang.Runnable) nVar.mo141623x754a37bb(), 500L);
                            }
                        }
                    }
                }
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.Object a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        ec2.d e27 = zy2.ra.e2((zy2.ra) a17, 0, 1, null);
        if (e27 != null) {
            feedItem.m59233x87980ca();
            if (z17) {
                e27.a(new ec2.a(2, feedItem.m59233x87980ca(), feedItem.m59229xb5af1dd5()));
            } else {
                e27.a(new ec2.a(4, feedItem.m59233x87980ca(), feedItem.m59229xb5af1dd5()));
            }
        }
        java.lang.String stringExtra2 = intent != null ? intent.getStringExtra("sns_upload_session_id") : null;
        yz5.p pVar = this.f183544g;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Boolean.valueOf(z17), stringExtra2);
        }
        long j17 = z17 ? 1L : 2L;
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
        long m59251x5db1b11 = feedItem.m59251x5db1b11();
        java.lang.String m59229xb5af1dd5 = feedItem.m59229xb5af1dd5();
        int i19 = this.f183545h;
        r45.qt2 qt2Var = this.f183546i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f183543f;
        if (stringExtra != null) {
            bool = java.lang.Boolean.valueOf(stringExtra.length() > 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Vj(o3Var, m59251x5db1b11, m59229xb5af1dd5, i19, j17, "", qt2Var, 0L, c14994x9b99c079, bool, 64, null);
    }
}
