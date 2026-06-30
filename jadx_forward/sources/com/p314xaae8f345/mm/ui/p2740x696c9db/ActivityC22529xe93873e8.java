package com.p314xaae8f345.mm.ui.p2740x696c9db;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/ui/tools/ShareToBizPhotoAccountUI;", "Lcom/tencent/mm/pluginsdk/ui/AutoLoginActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.tools.ShareToBizPhotoAccountUI */
/* loaded from: classes11.dex */
public final class ActivityC22529xe93873e8 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f291711d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f291712e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f291713f = "";

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409
    public boolean T6() {
        if (c01.d9.h() && !gm0.m.r()) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShareToBizPhotoAccountUI", "not login");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273980j || !getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getBoolean("gprs_alert", true)) {
            a7(false);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409
    public void X6(com.p314xaae8f345.mm.p2470x93e71c27.ui.p loginResult, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loginResult, "loginResult");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (com.p314xaae8f345.mm.ui.p2740x696c9db.da.f291890a[loginResult.ordinal()] != 1) {
            finish();
            return;
        }
        setIntent(intent);
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SystemShareControlBitset"), 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToBizPhotoAccountUI", "system share control bit = %d", java.lang.Integer.valueOf(P));
        if ((P & 2) <= 0) {
            a7(true);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareToBizPhotoAccountUI", "share blocked by MM_SYSTEM_SHARE_NOT_ALLOW_SHARE_TO_TIMELINE");
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409
    public boolean Y6(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a7(boolean z17) {
        java.util.ArrayList arrayList;
        android.content.Intent intent = getIntent();
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareToBizPhotoAccountUI", "deal fail, intent is null");
            c7(1);
            return;
        }
        java.lang.String action = intent.getAction();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(action)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareToBizPhotoAccountUI", "deal fail, action is null");
            c7(1);
            return;
        }
        java.lang.String resolveType = intent.resolveType(this);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(resolveType)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(resolveType);
            if (r26.n0.B(resolveType, "image", true)) {
                java.lang.String m78512xb8359e85 = m78512xb8359e85();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m78512xb8359e85, "getCallerPackage(...)");
                this.f291713f = m78512xb8359e85;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToBizPhotoAccountUI", "deal, currentCallerPackage: " + this.f291713f);
                android.os.Bundle e17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.e(intent);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(action, "android.intent.action.SEND")) {
                    if (e17 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareToBizPhotoAccountUI", "deal fail, bundle is null for ACTION_SEND");
                        c7(1);
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToBizPhotoAccountUI", "send signal: android.intent.action.SEND");
                    android.os.Parcelable parcelable = e17.getParcelable("android.intent.extra.STREAM");
                    if (parcelable == null || !(parcelable instanceof android.net.Uri)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareToBizPhotoAccountUI", "deal fail, uri is null or illegal: " + parcelable);
                        c7(2);
                        return;
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.W0((android.net.Uri) parcelable)) {
                        this.f291712e = kz5.c0.d(parcelable);
                        e7(kz5.b0.c(parcelable), z17);
                        return;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareToBizPhotoAccountUI", "deal fail, not accept, " + parcelable);
                        c7(2);
                        return;
                    }
                }
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(action, "android.intent.action.SEND_MULTIPLE")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareToBizPhotoAccountUI", "deal fail, unsupported action: " + action);
                    c7(1);
                    return;
                }
                if (e17 == null || !e17.containsKey("android.intent.extra.STREAM")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareToBizPhotoAccountUI", "deal fail, action or bundle is illegal, action: " + action + " bundle:" + e17);
                    c7(1);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToBizPhotoAccountUI", "send multiple signal: android.intent.action.SEND_MULTIPLE");
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    arrayList = e17.getParcelableArrayList("android.intent.extra.STREAM", android.net.Uri.class);
                } else {
                    java.util.ArrayList parcelableArrayList = e17.getParcelableArrayList("android.intent.extra.STREAM");
                    if (parcelableArrayList != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (java.lang.Object obj : parcelableArrayList) {
                            if (obj instanceof android.net.Uri) {
                                arrayList2.add(obj);
                            }
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                }
                java.util.ArrayList arrayList3 = arrayList == null || arrayList.isEmpty() ? null : new java.util.ArrayList(arrayList);
                if (arrayList3 == null || arrayList3.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareToBizPhotoAccountUI", "deal fail, uri list is null or empty");
                    c7(2);
                    return;
                }
                if (arrayList3.size() > 20) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareToBizPhotoAccountUI", "deal fail, too many images: " + arrayList3.size() + ", max=20");
                    d7();
                    dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575420pi2, 20), 1).show();
                    finish();
                    return;
                }
                java.util.Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    android.net.Uri uri = (android.net.Uri) it.next();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.W0(uri)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareToBizPhotoAccountUI", "deal fail, not accept uri: " + uri);
                        c7(2);
                        return;
                    }
                }
                this.f291712e = arrayList3;
                e7(arrayList3, z17);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareToBizPhotoAccountUI", "deal fail, mimeType is not supported: " + resolveType);
        c7(3);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b7(java.util.List r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 1298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22529xe93873e8.b7(java.util.List, boolean):void");
    }

    public final void c7(int i17) {
        d7();
        dp.a.m125853x26a183b(this, i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? com.p314xaae8f345.mm.R.C30867xcad56011.phz : com.p314xaae8f345.mm.R.C30867xcad56011.f575421pi3 : com.p314xaae8f345.mm.R.C30867xcad56011.f575419pi1 : com.p314xaae8f345.mm.R.C30867xcad56011.f575418pi0 : com.p314xaae8f345.mm.R.C30867xcad56011.f575422pi4, 1).show();
        finish();
    }

    public final void d7() {
        try {
            android.app.ProgressDialog progressDialog = this.f291711d;
            if (progressDialog != null) {
                if (!progressDialog.isShowing()) {
                    progressDialog = null;
                }
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShareToBizPhotoAccountUI", e17, "", new java.lang.Object[0]);
        }
    }

    public final void e7(java.util.List list, boolean z17) {
        boolean z18;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                android.net.Uri uri = (android.net.Uri) it.next();
                java.lang.String str = q35.e.f441509a;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.e1(this, uri)) {
                    z18 = true;
                    break;
                }
            }
        }
        z18 = false;
        if (!z18) {
            b7(list, z17);
            return;
        }
        boolean Di = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this, new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 145, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), android.os.Build.VERSION.SDK_INT < 33 ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.fip) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.msk));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToBizPhotoAccountUI", "checkPermission checkMediaStorage[%b]", java.lang.Boolean.valueOf(Di));
        if (Di) {
            b7(list, z17);
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
        boolean z17 = true;
        if (grantResults.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToBizPhotoAccountUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToBizPhotoAccountUI", "onRequestPermissionsResult requestCode[%d], grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(grantResults[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 == 145) {
            if (grantResults[0] != 0) {
                db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhi), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.fic), false, new com.p314xaae8f345.mm.ui.p2740x696c9db.fa(this), new com.p314xaae8f345.mm.ui.p2740x696c9db.ga(this));
                return;
            }
            java.util.ArrayList arrayList = this.f291712e;
            if (arrayList != null && !arrayList.isEmpty()) {
                z17 = false;
            }
            if (z17) {
                finish();
            } else {
                b7(arrayList, false);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 scene) {
        r45.g20 g20Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareToBizPhotoAccountUI", "onSceneEnd, errType = " + i17 + ", errCode = " + i18 + ", errMsg = " + str);
        c01.d9.e().q(837, this);
        d7();
        if (scene instanceof com.p314xaae8f345.mm.p957x53236a1b.c0) {
            if (i17 == 0 && i18 == 0) {
                a7(false);
                return;
            }
            com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558 = ((com.p314xaae8f345.mm.p957x53236a1b.c0) scene).mo47948x7f0c4558();
            if (mo47948x7f0c4558 == null || (g20Var = (r45.g20) ((com.p314xaae8f345.mm.p944x882e457a.o) mo47948x7f0c4558).f152244b.f152233a) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g20Var.f456366d)) {
                a7(false);
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", g20Var.f456366d);
            intent.putExtra("showShare", false);
            intent.putExtra("show_bottom", false);
            intent.putExtra("needRedirect", false);
            j45.l.j(this, "webview", ".ui.tools.WebViewUI", intent, null);
            finish();
        }
    }
}
