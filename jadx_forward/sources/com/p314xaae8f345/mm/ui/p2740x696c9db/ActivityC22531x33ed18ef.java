package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* renamed from: com.tencent.mm.ui.tools.ShareToTimeLineUI */
/* loaded from: classes11.dex */
public class ActivityC22531x33ed18ef extends com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f291717g = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Intent f291718d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f291719e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.content.Intent f291720f;

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409
    public boolean T6() {
        if (c01.d9.h() && !gm0.m.r()) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShareToTimeLine", "not login");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273980j || !getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getBoolean("gprs_alert", true)) {
            a7();
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409
    public void X6(com.p314xaae8f345.mm.p2470x93e71c27.ui.p pVar, android.content.Intent intent) {
        if (pVar.ordinal() != 0) {
            finish();
            return;
        }
        this.f291718d = intent;
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SystemShareControlBitset"), 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToTimeLine", "now permission = %d", java.lang.Integer.valueOf(P));
        if ((P & 2) > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareToTimeLine", "now allowed to share to friend");
            finish();
            return;
        }
        java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "android.intent.extra.TEXT");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToTimeLine", "postLogin, text = %s", l17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l17)) {
            a7();
            return;
        }
        java.lang.String format = java.lang.String.format("weixin://dl/business/systemshare/?txt=%s", java.net.URLEncoder.encode(l17));
        e7();
        c01.d9.e().a(1200, this);
        c01.d9.e().g(new com.p314xaae8f345.mm.p957x53236a1b.h1(format, 15, null));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409
    public boolean Y6(android.content.Intent intent) {
        return true;
    }

    public void a7() {
        android.content.Intent intent = getIntent();
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareToTimeLine", "launch : fail, intent is null");
            b7();
            finish();
            return;
        }
        java.lang.String action = intent.getAction();
        android.os.Bundle e17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.e(intent);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(action)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareToTimeLine", "launch : fail, action is null");
            b7();
            finish();
            return;
        }
        java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "Kdescription");
        java.lang.String resolveType = getIntent().resolveType(this);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(resolveType)) {
            b7();
            finish();
            return;
        }
        if (!resolveType.contains("image")) {
            b7();
            finish();
            return;
        }
        android.os.Parcelable parcelable = e17.getParcelable("android.intent.extra.STREAM");
        if (parcelable instanceof android.net.Uri) {
            java.lang.String str = q35.e.f441509a;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.e1(this, (android.net.Uri) parcelable)) {
                c7(action, e17, l17);
                return;
            }
        }
        boolean Di = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this, new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 145, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), android.os.Build.VERSION.SDK_INT < 33 ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.fip) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.msk));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToTimeLine", "checkPermission checkMediaStorage[%b]", java.lang.Boolean.valueOf(Di));
        if (Di) {
            c7(action, e17, l17);
        }
    }

    public final void b7() {
        dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.j4d, 1).show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d1, code lost:
    
        if (r3 == false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c7(java.lang.String r13, android.os.Bundle r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22531x33ed18ef.c7(java.lang.String, android.os.Bundle, java.lang.String):void");
    }

    public final void d7(java.lang.String str, java.lang.String str2, int i17) {
        android.content.Intent intent = new android.content.Intent();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            intent.putExtra("sns_kemdia_path", str);
            intent.putExtra("KFilterId", -1);
            arrayList.add(str);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            intent.putExtra("Kdescription", str2);
        }
        if (i17 == 4 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            arrayList.add(str2);
        }
        if (!c01.d9.h() || gm0.m.r()) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                b7();
            } else {
                android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22531x33ed18ef.class);
                intent2.putExtra("android.intent.extra.STREAM", com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(mo55332x76847179(), new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str))));
                intent2.addFlags(32768).addFlags(268435456);
                intent2.setType("image/*");
                intent2.setAction("android.intent.action.SEND");
                com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.Y6(this, new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11470xc22f6d8b.class).addFlags(268435456).addFlags(32768), intent2);
            }
            finish();
            return;
        }
        intent.putExtra("K_go_to_SnsTimeLineUI", true);
        intent.putExtra("Ksnsupload_source", 12);
        if (i17 == 0) {
            intent.putExtra("KBlockAdd", true);
        }
        intent.setClassName(this, "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        this.f291720f = intent;
        com.p314xaae8f345.mm.p957x53236a1b.c0 c0Var = i17 != 0 ? i17 != 4 ? null : new com.p314xaae8f345.mm.p957x53236a1b.c0(5, arrayList, m78512xb8359e85()) : new com.p314xaae8f345.mm.p957x53236a1b.c0(1, arrayList, m78512xb8359e85());
        if (c0Var != null) {
            c01.d9.e().a(837, this);
            gm0.j1.d().g(c0Var);
            e7();
        }
    }

    public final void e7() {
        this.f291719e = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.ui.p2740x696c9db.ma(this));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        c01.d9.e().q(837, this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToTimeLine", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToTimeLine", "onRequestPermissionsResult requestCode[%d], grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 145) {
            return;
        }
        if (iArr[0] != 0) {
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhi), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.fic), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.ui.tools.ShareToTimeLineUI$$a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i18) {
                    int i19 = com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22531x33ed18ef.f291717g;
                    com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22531x33ed18ef activityC22531x33ed18ef = com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22531x33ed18ef.this;
                    activityC22531x33ed18ef.getClass();
                    tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC22531x33ed18ef.mo55332x76847179();
                    ((sb0.f) jVar).getClass();
                    j35.u.g(mo55332x76847179);
                    activityC22531x33ed18ef.finish();
                }
            }, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.ui.tools.ShareToTimeLineUI$$b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i18) {
                    int i19 = com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22531x33ed18ef.f291717g;
                    com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22531x33ed18ef.this.finish();
                }
            });
            return;
        }
        if (this.f291718d == null) {
            this.f291718d = getIntent();
        }
        android.content.Intent intent = this.f291718d;
        if (intent == null || intent.getAction() == null) {
            return;
        }
        java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(this.f291718d, "Kdescription");
        c7(this.f291718d.getAction(), com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.e(this.f291718d), l17);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToTimeLine", "onSceneEnd, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        c01.d9.e().q(1200, this);
        android.app.ProgressDialog progressDialog = this.f291719e;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f291719e.dismiss();
        }
        if (m1Var instanceof com.p314xaae8f345.mm.p957x53236a1b.h1) {
            if (i17 == 0 && i18 == 0) {
                a7();
                return;
            } else {
                b7();
                finish();
                return;
            }
        }
        if (m1Var instanceof com.p314xaae8f345.mm.p957x53236a1b.c0) {
            if (i17 == 0 && i18 == 0) {
                android.content.Intent intent = this.f291720f;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/tools/ShareToTimeLineUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/ui/tools/ShareToTimeLineUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (m1Var.mo47948x7f0c4558() != null) {
                r45.g20 g20Var = (r45.g20) ((com.p314xaae8f345.mm.p944x882e457a.o) m1Var.mo47948x7f0c4558()).f152244b.f152233a;
                if (g20Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g20Var.f456366d)) {
                    android.content.Intent intent2 = this.f291720f;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent2);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/ui/tools/ShareToTimeLineUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(this, "com/tencent/mm/ui/tools/ShareToTimeLineUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.putExtra("rawUrl", g20Var.f456366d);
                    intent3.putExtra("showShare", false);
                    intent3.putExtra("show_bottom", false);
                    intent3.putExtra("needRedirect", false);
                    j45.l.j(this, "webview", ".ui.tools.WebViewUI", intent3, null);
                }
            }
            finish();
        }
    }
}
