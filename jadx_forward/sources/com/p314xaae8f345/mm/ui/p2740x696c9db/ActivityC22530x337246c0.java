package com.p314xaae8f345.mm.ui.p2740x696c9db;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/ui/tools/ShareToStatusUI;", "Lcom/tencent/mm/pluginsdk/ui/AutoLoginActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.tools.ShareToStatusUI */
/* loaded from: classes11.dex */
public final class ActivityC22530x337246c0 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f291714d;

    /* renamed from: e, reason: collision with root package name */
    public int f291715e = -1;

    /* renamed from: f, reason: collision with root package name */
    public android.net.Uri f291716f;

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409
    public boolean T6() {
        if (c01.d9.h() && !gm0.m.r()) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShareToStatusUI", "not login");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273980j || !getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getBoolean("gprs_alert", true)) {
            a7(false);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409
    public void X6(com.p314xaae8f345.mm.p2470x93e71c27.ui.p loginResult, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loginResult, "loginResult");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (com.p314xaae8f345.mm.ui.p2740x696c9db.ia.f292028a[loginResult.ordinal()] != 1) {
            finish();
            return;
        }
        setIntent(intent);
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SystemShareControlBitset"), 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToStatusUI", "now permission = %d", java.lang.Integer.valueOf(P));
        if ((P & 2) <= 0) {
            a7(true);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareToStatusUI", "now allowed to share to friend");
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409
    public boolean Y6(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        return true;
    }

    public final void a7(boolean z17) {
        if (getIntent() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareToStatusUI", "deal fail, intent is null");
            b7(1);
            finish();
            return;
        }
        java.lang.String action = getIntent().getAction();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(action)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareToStatusUI", "deal fail, action is null");
            b7(1);
            finish();
            return;
        }
        java.lang.String resolveType = getIntent().resolveType(this);
        int i17 = 0;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(resolveType)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareToStatusUI", "getFileType, mimeType is NONE");
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(resolveType);
            if (r26.n0.B(resolveType, "image", true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToStatusUI", "getFileType, mimeType is image");
                i17 = 1;
            } else if (r26.n0.B(resolveType, "video", true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToStatusUI", "getFileType, mimeType is video");
                i17 = 2;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToStatusUI", "getFileType, mimeType is NONE");
            }
        }
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareToStatusUI", "deal fail, mimeType is illegal：" + resolveType);
            b7(3);
            finish();
            return;
        }
        android.os.Bundle e17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.e(getIntent());
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(action, "android.intent.action.SEND") || e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareToStatusUI", "deal fail, action or bundle is illegal, action: " + action + "  bundle:" + e17);
            b7(1);
            finish();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToStatusUI", "send signal: " + action);
        android.os.Parcelable parcelable = e17.getParcelable("android.intent.extra.STREAM");
        if (parcelable == null || !(parcelable instanceof android.net.Uri)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareToStatusUI", "deal fail, uri is null or illegal：" + parcelable);
            b7(2);
            finish();
            return;
        }
        android.net.Uri uri = (android.net.Uri) parcelable;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.W0(uri)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareToStatusUI", "deal fail, not accept, " + parcelable);
            b7(2);
            finish();
            return;
        }
        this.f291716f = uri;
        this.f291715e = i17;
        java.lang.String str = q35.e.f441509a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.e1(this, uri)) {
            c7(uri, i17, z17);
            return;
        }
        boolean Di = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this, new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 145, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(android.os.Build.VERSION.SDK_INT < 33 ? com.p314xaae8f345.mm.R.C30867xcad56011.fip : com.p314xaae8f345.mm.R.C30867xcad56011.msk));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToStatusUI", "checkPermission checkMediaStorage[%b]", java.lang.Boolean.valueOf(Di));
        if (Di) {
            c7(uri, i17, z17);
        }
    }

    public final void b7(int i17) {
        d7();
        dp.a.m125853x26a183b(this, i17 != 1 ? i17 != 2 ? i17 != 3 ? com.p314xaae8f345.mm.R.C30867xcad56011.f574656j40 : com.p314xaae8f345.mm.R.C30867xcad56011.f574658j42 : com.p314xaae8f345.mm.R.C30867xcad56011.f574657j41 : com.p314xaae8f345.mm.R.C30867xcad56011.f574659j43, 1).show();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c7(android.net.Uri r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22530x337246c0.c7(android.net.Uri, int, boolean):void");
    }

    public final void d7() {
        try {
            android.app.ProgressDialog progressDialog = this.f291714d;
            if (progressDialog != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(progressDialog);
                if (progressDialog.isShowing()) {
                    android.app.ProgressDialog progressDialog2 = this.f291714d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(progressDialog2);
                    progressDialog2.dismiss();
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShareToStatusUI", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        c01.d9.e().q(837, this);
        d7();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        if (grantResults.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToStatusUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToStatusUI", "onRequestPermissionsResult requestCode[%d], grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(grantResults[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 == 145) {
            if (grantResults[0] != 0) {
                db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhi), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.fic), false, new com.p314xaae8f345.mm.ui.p2740x696c9db.ja(this), new com.p314xaae8f345.mm.ui.p2740x696c9db.ka(this));
                return;
            }
            android.net.Uri uri = this.f291716f;
            if (uri == null) {
                finish();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(uri);
                c7(uri, this.f291715e, false);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToStatusUI", "onSceneEnd, errType = " + i17 + ", errCode = " + i17 + ", errMsg = " + str);
        c01.d9.e().q(837, this);
        d7();
        if (scene instanceof com.p314xaae8f345.mm.p957x53236a1b.c0) {
            if (i17 == 0 && i18 == 0) {
                a7(false);
            } else if (scene.mo47948x7f0c4558() != null) {
                com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558 = scene.mo47948x7f0c4558();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo47948x7f0c4558, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((com.p314xaae8f345.mm.p944x882e457a.o) mo47948x7f0c4558).f152244b.f152233a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CheckShareExtensionResponse");
                r45.g20 g20Var = (r45.g20) fVar;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g20Var.f456366d)) {
                    a7(false);
                } else {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("rawUrl", g20Var.f456366d);
                    intent.putExtra("showShare", false);
                    intent.putExtra("show_bottom", false);
                    intent.putExtra("needRedirect", false);
                    j45.l.j(this, "webview", ".ui.tools.WebViewUI", intent, null);
                }
            }
            finish();
        }
    }
}
