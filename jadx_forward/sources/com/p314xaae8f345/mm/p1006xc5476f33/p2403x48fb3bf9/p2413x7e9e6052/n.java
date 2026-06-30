package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052;

/* loaded from: classes8.dex */
public class n implements zg0.s2 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f264855a = null;

    /* renamed from: b, reason: collision with root package name */
    public android.webkit.ValueCallback f264856b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f264857c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f264858d = false;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f264859e;

    /* renamed from: f, reason: collision with root package name */
    public android.util.Pair f264860f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f264861g;

    public n() {
        boolean z17 = false;
        if (gm0.j1.a() || !com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2582x48fb3bf9.C20821x5b48643e()) == 1) {
                z17 = true;
            }
        }
        this.f264859e = z17;
        this.f264860f = null;
    }

    public final void a(android.net.Uri[] uriArr) {
        try {
            android.webkit.ValueCallback valueCallback = this.f264856b;
            if (valueCallback != null) {
                if (uriArr == null) {
                    valueCallback.onReceiveValue(null);
                } else {
                    valueCallback.onReceiveValue(uriArr);
                }
            }
        } catch (java.lang.IllegalStateException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewUI.FileChooser", "callbackOnReceiveValue get exception %s", e17);
        }
    }

    public void b() {
        this.f264856b = null;
        this.f264855a = null;
        this.f264860f = null;
        this.f264857c = 0;
        this.f264858d = false;
    }

    public void c(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar, android.webkit.ValueCallback valueCallback, java.lang.String[] strArr, java.lang.String str, android.content.Intent intent, int i17) {
        java.lang.String str2;
        android.content.Intent[] intentArr;
        boolean z17;
        android.content.Intent intent2;
        boolean z18;
        boolean z19;
        android.content.Intent[] intentArr2;
        android.content.Intent[] intentArr3;
        java.lang.String str3 = str;
        android.content.Intent intent3 = intent;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI.FileChooser", "openFileChooser with wvPerm(%s), callbackLL(%s), acceptType(%s), capture(%s)", wVar, valueCallback, strArr, str);
        b();
        if (wVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewUI.FileChooser", "openFileChooser fail, wvPerm is null");
            a(null);
            return;
        }
        if (!wVar.c().f(56)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewUI.FileChooser", "open file chooser failed, permission fail");
            a(null);
            return;
        }
        this.f264857c = i17;
        this.f264856b = valueCallback;
        this.f264855a = java.lang.System.currentTimeMillis() + "";
        if ("user".equalsIgnoreCase(str3) || "environment".equalsIgnoreCase(str3)) {
            str3 = "true";
        }
        java.lang.String str4 = this.f264855a;
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.f264583a;
        if (intent3 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewJSSDKUtil", "createOpenFileChooserIntent type: %s, action: %s", intent.getType(), intent.getAction());
            if (!"android.intent.action.GET_CONTENT".equalsIgnoreCase(intent.getAction())) {
                intent3.setAction("android.intent.action.GET_CONTENT");
            }
            if (intent.getCategories() == null || !intent.getCategories().contains("android.intent.category.OPENABLE")) {
                intent3.addCategory("android.intent.category.OPENABLE");
            }
            if (!(intent3.resolveActivity(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager()) != null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebviewJSSDKUtil", "createOpenFileChooserIntent fileIntent resolve failed");
                intent3.setType("*/*");
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            str2 = "MicroMsg.WebViewUI.FileChooser";
            if (fp.h.a(16)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewJSSDKUtil", "android API version is below 16.");
                intentArr = new android.content.Intent[]{com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.b(str4)};
                z17 = false;
            }
            z17 = false;
            intentArr = null;
        } else {
            if ("camera".equalsIgnoreCase(str3)) {
                intentArr3 = new android.content.Intent[]{com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.b(str4)};
            } else if ("camcorder".equalsIgnoreCase(str3)) {
                intentArr3 = new android.content.Intent[]{new android.content.Intent("android.media.action.VIDEO_CAPTURE")};
            } else if ("microphone".equalsIgnoreCase(str3)) {
                android.content.Intent intent4 = new android.content.Intent("android.provider.MediaStore.RECORD_SOUND");
                if (intent4.resolveActivity(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager()) == null) {
                    intent4 = null;
                }
                if (intent4 != null) {
                    str2 = "MicroMsg.WebViewUI.FileChooser";
                    intentArr = new android.content.Intent[]{intent4};
                    z17 = false;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebviewJSSDKUtil", "createChooserIntent no sound recorder");
                    str2 = "MicroMsg.WebViewUI.FileChooser";
                    z17 = true;
                    intentArr = null;
                }
            } else if ("*".equalsIgnoreCase(str3) || "true".equalsIgnoreCase(str3) || "false".equalsIgnoreCase(str3)) {
                str2 = "MicroMsg.WebViewUI.FileChooser";
                if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.f(strArr, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.f264583a, "image/*")) {
                    intentArr2 = new android.content.Intent[]{com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.b(str4)};
                } else {
                    if (strArr != null) {
                        int length = strArr.length;
                        int i18 = 0;
                        while (i18 < length) {
                            int i19 = length;
                            if (strArr[i18].equalsIgnoreCase("audio/*")) {
                                z18 = true;
                                break;
                            } else {
                                i18++;
                                length = i19;
                            }
                        }
                    }
                    z18 = false;
                    if (z18) {
                        android.content.Intent intent5 = new android.content.Intent("android.provider.MediaStore.RECORD_SOUND");
                        if (intent5.resolveActivity(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager()) == null) {
                            intent5 = null;
                        }
                        if (intent5 != null) {
                            intentArr2 = new android.content.Intent[]{intent5};
                        } else {
                            z19 = true;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebviewJSSDKUtil", "createChooserIntent no sound recorder");
                            intentArr2 = null;
                        }
                    } else if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.f(strArr, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.f264584b, "video/*")) {
                        intentArr2 = new android.content.Intent[]{new android.content.Intent("android.media.action.VIDEO_CAPTURE")};
                    } else {
                        z19 = false;
                        intentArr2 = null;
                    }
                    if (!"false".equalsIgnoreCase(str3) || "*".equalsIgnoreCase(str3)) {
                        intentArr = intentArr2;
                        z17 = true;
                    } else {
                        z17 = z19;
                        intentArr = intentArr2;
                    }
                }
                z19 = false;
                if ("false".equalsIgnoreCase(str3)) {
                }
                intentArr = intentArr2;
                z17 = true;
            } else {
                str2 = "MicroMsg.WebViewUI.FileChooser";
                z17 = false;
                intentArr = null;
            }
            intentArr = intentArr3;
            str2 = "MicroMsg.WebViewUI.FileChooser";
            z17 = false;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(intentArr != null ? intentArr.length : 0);
        objArr[1] = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewJSSDKUtil", "createChooseIntent intents size: %d, addLocalFile: %s", objArr);
        if (z17 || intentArr == null) {
            intent2 = new android.content.Intent("android.intent.action.CHOOSER");
            intent2.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
            intent2.putExtra("android.intent.extra.TITLE", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575227lb4));
            if (intent3 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebviewJSSDKUtil", "createChooseIntent fileIntent null");
                intent3 = new android.content.Intent("android.intent.action.GET_CONTENT");
                intent3.addCategory("android.intent.category.OPENABLE");
                intent3.setType("*/*");
            }
            intent2.putExtra("android.intent.extra.INTENT", intent3);
        } else {
            intent2 = intentArr[0];
        }
        android.content.Intent intent6 = intent2;
        if (this.f264857c == 1) {
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                intent6.putExtra("android.provider.extra.PICK_IMAGES_MAX", android.provider.MediaStore.getPickImagesMaxLimit());
            } else {
                intent6.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            }
        }
        java.lang.String str5 = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str5, "openFileChooser action: %s", intent6.getAction());
        if (e(intent6)) {
            h(activity, intent6);
            return;
        }
        if (!"android.intent.action.CHOOSER".equals(intent6.getAction())) {
            d(activity, intent6);
            return;
        }
        android.content.Intent[] intentArr4 = (android.content.Intent[]) intent6.getParcelableArrayExtra("android.intent.extra.INITIAL_INTENTS");
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        objArr2[0] = java.lang.Integer.valueOf(intentArr4 != null ? intentArr4.length : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str5, "openFileChooser originIntentList: %d", objArr2);
        if (intentArr4 != null && intentArr4.length > 0) {
            for (android.content.Intent intent7 : intentArr4) {
                if (e(intent7)) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activity, 1, false);
                    this.f264861g = k0Var;
                    k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.o(this);
                    k0Var.f293387d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.p(this);
                    k0Var.C = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.q(this);
                    k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.r(this, activity, intent7, strArr, intent6, intentArr4);
                    k0Var.v();
                    return;
                }
            }
        }
        d(activity, intent6);
    }

    public void d(android.app.Activity activity, android.content.Intent intent) {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(201);
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/webview/modeltools/FileChooserHelper", "doOpenFileChooserByIntent", "(Landroid/app/Activity;Landroid/content/Intent;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewUI.FileChooser", "openFileChooser e = %s", e17);
        }
    }

    public final boolean e(android.content.Intent intent) {
        return "android.media.action.IMAGE_CAPTURE".equals(intent.getAction()) || "android.media.action.VIDEO_CAPTURE".equals(intent.getAction());
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01b6, code lost:
    
        if (r0 != null) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.app.Activity r7, int r8, int r9, android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.n.f(android.app.Activity, int, int, android.content.Intent):void");
    }

    public boolean g(android.app.Activity activity, int i17, java.lang.String[] strArr, int[] iArr) {
        android.util.Pair pair = this.f264860f;
        if (pair == null) {
            b();
            return false;
        }
        if (119 != i17) {
            return true;
        }
        if (iArr[0] != 0) {
            this.f264860f = null;
            f(activity, 201, 0, null);
            return true;
        }
        android.content.Intent intent = (android.content.Intent) pair.first;
        int intValue = ((java.lang.Integer) pair.second).intValue();
        this.f264860f = null;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(intValue));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/webview/modeltools/FileChooserHelper", "onRequestPermissionsResult", "(Landroid/app/Activity;I[Ljava/lang/String;[I)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        return true;
    }

    public final void h(android.app.Activity activity, android.content.Intent intent) {
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (j35.u.d(activity, "android.permission.CAMERA", true)) {
            d(activity, intent);
            return;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        j35.u.i(activity, "android.permission.CAMERA", 119);
        this.f264860f = android.util.Pair.create(intent, 201);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewUI.FileChooser", "openFileChooser takePhotoFromSystemCamera no camera Permission");
    }
}
