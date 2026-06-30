package kf3;

/* loaded from: classes5.dex */
public class f2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f388877a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f388878b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 f388879c;

    public f2(com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e6679, int i17, android.content.Intent intent) {
        this.f388879c = activityC16488xbf7e6679;
        this.f388877a = i17;
        this.f388878b = intent;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public void a() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679.f230072v;
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e6679 = this.f388879c;
        activityC16488xbf7e6679.getClass();
        int i18 = this.f388877a;
        android.content.Intent intent = this.f388878b;
        switch (i18) {
            case 1:
                if (intent == null) {
                    return;
                }
                java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_select_video_list");
                if (stringArrayListExtra != null && stringArrayListExtra.size() == 1) {
                    java.lang.String str = stringArrayListExtra.get(0);
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.setData(android.net.Uri.parse("file://" + str));
                    activityC16488xbf7e6679.b7(intent2);
                    return;
                }
                java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("CropImage_OutputPath_List");
                if (stringArrayListExtra2 == null || stringArrayListExtra2.size() < 1) {
                    return;
                }
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("CropImage_OutputPath", stringArrayListExtra2.get(0));
                intent3.putExtra("CropImage_Compress_Img", intent.getBooleanExtra("CropImage_Compress_Img", true));
                activityC16488xbf7e6679.V6(intent3);
                return;
            case 2:
                vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                android.content.Context applicationContext = activityC16488xbf7e6679.getApplicationContext();
                java.lang.String a17 = if3.f0.a();
                ((ub0.r) oVar).getClass();
                java.lang.String b17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.b(applicationContext, intent, a17);
                activityC16488xbf7e6679.f230078i = b17;
                if (b17 == null) {
                    return;
                }
                android.content.Intent intent4 = new android.content.Intent();
                intent4.putExtra("CropImageMode", 4);
                intent4.putExtra("CropImage_Filter", true);
                intent4.putExtra("CropImage_ImgPath", activityC16488xbf7e6679.f230078i);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.p(activityC16488xbf7e6679.mo55332x76847179(), intent4, 4);
                return;
            case 3:
            default:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MassSendMsgUI", "onActivityResult: not found this requestCode");
                return;
            case 4:
                activityC16488xbf7e6679.V6(intent);
                return;
            case 5:
                activityC16488xbf7e6679.W6(intent);
                return;
            case 6:
                activityC16488xbf7e6679.b7(intent);
                return;
            case 7:
                if (intent != null) {
                    if (intent.getBooleanExtra("from_record", false)) {
                        activityC16488xbf7e6679.W6(intent);
                        return;
                    } else {
                        activityC16488xbf7e6679.b7(intent);
                        return;
                    }
                }
                return;
            case 8:
                com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886 c16527xe4fc886 = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886) intent.getParcelableExtra("key_req_result");
                if (c16527xe4fc886 == null) {
                    return;
                }
                if (!c16527xe4fc886.f230340e) {
                    java.lang.String str2 = c16527xe4fc886.f230343h;
                    java.lang.String str3 = c16527xe4fc886.f230342g;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendMsgUI", "video path %s thumb path ", str3, str2);
                    java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f104104s, c16527xe4fc886.f230344i, true);
                    if (!str3.equals(rj6)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendMsgUI", "filepath not videopath and move it %s %s", str3, rj6);
                        com.p314xaae8f345.mm.vfs.w6.w(str3, rj6);
                    }
                    activityC16488xbf7e6679.a7(c16527xe4fc886.f230344i, c16527xe4fc886.f230346n);
                    return;
                }
                java.lang.String str4 = c16527xe4fc886.f230348p;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                    return;
                }
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendMsgUI", "doSendChattingImage, path: %s", str4);
                    if3.y m07 = if3.k0.Ai().m0(str4, activityC16488xbf7e6679.f230074e, ((java.util.ArrayList) activityC16488xbf7e6679.f230073d).size(), 0);
                    if (m07 == null) {
                        return;
                    }
                    if3.g0 g0Var = new if3.g0(m07, activityC16488xbf7e6679.f230084r, 0);
                    c01.d9.e().g(g0Var);
                    activityC16488xbf7e6679.f230082p = db5.e1.Q(activityC16488xbf7e6679.mo55332x76847179(), activityC16488xbf7e6679.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC16488xbf7e6679.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iin), true, true, new kf3.h1(activityC16488xbf7e6679, g0Var));
                    return;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MassSendMsgUI", "doSendChattingImage error: %s", e17.getMessage());
                    return;
                }
            case 9:
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046 = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046) intent.getParcelableExtra("KSEGMENTMEDIAINFO");
                intent.putExtra("K_SEGMENTVIDEOPATH", c16991x15ced046.f237194e);
                intent.putExtra("KSEGMENTVIDEOTHUMBPATH", c16991x15ced046.f237195f);
                if (!c16991x15ced046.f237197h.booleanValue()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendMsgUI", "video path %s thumb path ", c16991x15ced046.f237194e, c16991x15ced046.f237195f);
                    java.lang.String q17 = com.p314xaae8f345.mm.vfs.w6.q(c16991x15ced046.f237194e);
                    java.lang.String rj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f104104s, q17, true);
                    if (!c16991x15ced046.f237194e.equals(rj7)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendMsgUI", "filepath not videopath and move it %s %s", c16991x15ced046.f237194e, rj7);
                        com.p314xaae8f345.mm.vfs.w6.w(c16991x15ced046.f237194e, rj7);
                    }
                    activityC16488xbf7e6679.a7(q17, (int) (c16991x15ced046.f237196g.longValue() / 1000));
                    return;
                }
                java.lang.String str5 = c16991x15ced046.f237195f;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                    return;
                }
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendMsgUI", "doSendChattingImage, path: %s", str5);
                    if3.y m08 = if3.k0.Ai().m0(str5, activityC16488xbf7e6679.f230074e, ((java.util.ArrayList) activityC16488xbf7e6679.f230073d).size(), 0);
                    if (m08 == null) {
                        return;
                    }
                    if3.g0 g0Var2 = new if3.g0(m08, activityC16488xbf7e6679.f230084r, 0);
                    c01.d9.e().g(g0Var2);
                    activityC16488xbf7e6679.f230082p = db5.e1.Q(activityC16488xbf7e6679.mo55332x76847179(), activityC16488xbf7e6679.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC16488xbf7e6679.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iin), true, true, new kf3.g1(activityC16488xbf7e6679, g0Var2));
                    return;
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MassSendMsgUI", "doSendChattingImage error: %s", e18.getMessage());
                    return;
                }
            case 10:
                byte[] byteArrayExtra = intent.getByteArrayExtra("SELECT_OBJECT");
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
                try {
                    c19792x256d2725.mo11468x92b714fd(byteArrayExtra);
                    kf3.u uVar = activityC16488xbf7e6679.f230086t;
                    uVar.getClass();
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    java.lang.String u17 = ot0.q.u(((b92.s2) ((zy2.db) i95.n0.c(zy2.db.class))).wi(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, c19792x256d2725.m76805x2dd7a70f()), false, null, 4, null)), null, null);
                    if3.y yVar = new if3.y();
                    yVar.f372750m = uVar.f388975g;
                    yVar.f372751n = uVar.f388976h.size();
                    yVar.f372748h = u17;
                    yVar.f372752o = 49;
                    yVar.f372755r = u17.getBytes().length;
                    if3.g0 g0Var3 = new if3.g0(yVar, uVar.f388977i, 0);
                    c01.d9.e().g(g0Var3);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e66792 = uVar.f388969a;
                    uVar.f388974f = db5.e1.Q(activityC16488xbf7e66792, activityC16488xbf7e66792.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC16488xbf7e66792.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iin), true, true, new kf3.i(uVar, g0Var3));
                    return;
                } catch (java.io.IOException e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MassSendMsgUI", e19, "", new java.lang.Object[0]);
                    return;
                }
        }
    }
}
