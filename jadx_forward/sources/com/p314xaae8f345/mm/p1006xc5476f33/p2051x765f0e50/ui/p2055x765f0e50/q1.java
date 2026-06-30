package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class q1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17379xdc3f7e5f f242992d;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17379xdc3f7e5f activityC17379xdc3f7e5f) {
        this.f242992d = activityC17379xdc3f7e5f;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17379xdc3f7e5f context = this.f242992d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tq tqVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tq) context.m80391xac8f1cfd(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tq.class);
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17379xdc3f7e5f.f241689f;
        context.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.kq kqVar = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.kq.f242782e;
        if (itemId == 1) {
            kqVar = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.kq.f242784g;
        } else if (itemId == 2) {
            kqVar = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.kq.f242787m;
        } else if (itemId == 3) {
            kqVar = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.kq.f242786i;
        } else if (itemId == 4) {
            kqVar = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.kq.f242785h;
        } else if (itemId == 5) {
            kqVar = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.kq.f242783f;
        }
        tqVar.P6(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.mq(kqVar));
        if (itemId == 1) {
            ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Ui(context);
        } else if (itemId == 2) {
            v14.p pVar = (v14.p) context.m80391xac8f1cfd(v14.p.class);
            java.lang.String username = context.f241690d;
            pVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
            p3325xe03a0797.p3326xc267989b.l.d(pVar.mo144225x95f74600(), null, null, new v14.i(pVar, username, null), 3, null);
        } else if (itemId == 3) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(context.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ViewOnClickListenerC17386xd1d83869.class);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            intent.putExtra("CropImage_OutputPath", com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().i(c01.z1.r() + ".crop", true, false));
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            intent.putExtra("last_avatar_path", com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().i(c01.z1.r() + ".last", true, false));
            context.startActivityForResult(intent, 4);
        } else if (itemId == 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tq tqVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tq) context.m80391xac8f1cfd(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tq.class);
            tqVar2.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            xj.m mVar = tqVar2.f243120d;
            if (mVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.YuanBaoAvatarUIC", "handleAdClick: adInfo is null, skip");
            } else {
                ((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).bj(context, "wxid_wi_1d142z0zdj03", 0, "", new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.sq(mVar, context));
            }
        } else if (itemId == 5) {
            context.getClass();
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            boolean a17 = j35.u.a(context, "android.permission.CAMERA", 16, "", "");
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreviewHdHeadImg", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), context);
            if (a17) {
                vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                java.lang.String K = lp0.b.K();
                java.lang.String str = "microMsg." + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
                ((ub0.r) oVar).getClass();
                if (!com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.l(context, K, str, 3)) {
                    dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.igw), 1).show();
                }
            }
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tq) context.m80391xac8f1cfd(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tq.class)).Q6();
    }
}
