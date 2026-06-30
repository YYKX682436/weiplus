package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.j f266736a = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.j();

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 msgHandler, int i17, boolean z17, boolean z18, int i18, boolean z19) {
        int i19 = i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgHandler, "msgHandler");
        android.content.Intent type = z17 ? new android.content.Intent().setType("video/*") : new android.content.Intent().setType("image/*");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(type);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            type.setAction("android.provider.action.PICK_IMAGES");
            if (i19 > 1) {
                int pickImagesMaxLimit = android.provider.MediaStore.getPickImagesMaxLimit();
                java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = pu5.f.f440003a;
                if (i19 < 1) {
                    i19 = 1;
                } else if (i19 > pickImagesMaxLimit) {
                    i19 = pickImagesMaxLimit;
                }
                type.putExtra("android.provider.extra.PICK_IMAGES_MAX", i19);
            }
            type.putExtra("android.intent.extra.LOCAL_ONLY", true);
        } else {
            type.setAction("android.intent.action.GET_CONTENT");
            type.addCategory("android.intent.category.OPENABLE");
            type.putExtra("android.intent.extra.ALLOW_MULTIPLE", i19 > 1);
        }
        android.app.Activity a17 = q75.a.a(msgHandler.f266508d);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.d dVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.d(z17, msgHandler, i17, z18);
        if (a17 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) a17).m78545xde66c1f2(dVar);
        } else {
            if (!(a17 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebView.ChooseMediaFromSystemHelper", "chooseFromCamera activity(" + a17 + ") invalid");
                msgHandler.mo9729x757c998b(i17, 1, new android.content.Intent());
                return;
            }
            ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) a17).m78750xc5512edd(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.a(dVar));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(219);
        arrayList.add(type);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(a17, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/jsapi/ChooseMediaFromSystemHelper", "chooseFromAlbum", "(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/MsgHandler;IZZIZ)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 msgHandler, int i17, boolean z17, boolean z18, boolean z19) {
        com.p314xaae8f345.mm.vfs.r6 c17;
        android.net.Uri b17;
        android.content.Intent addFlags;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgHandler, "msgHandler");
        if (z17) {
            c17 = c("capture_video");
            b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, c17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getUriForFile(...)");
            addFlags = new android.content.Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", b17).addFlags(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(addFlags);
        } else {
            c17 = c("capture_image");
            b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, c17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getUriForFile(...)");
            addFlags = new android.content.Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", b17).addFlags(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(addFlags);
        }
        android.content.Intent intent = addFlags;
        android.app.Activity a17 = q75.a.a(msgHandler.f266508d);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.i iVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.i(b17, msgHandler, i17, c17, z17, z19, z18);
        if (a17 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) a17).m78545xde66c1f2(iVar);
        } else {
            if (!(a17 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebView.ChooseMediaFromSystemHelper", "chooseFromCamera activity(" + a17 + ") invalid");
                msgHandler.mo9729x757c998b(i17, 1, new android.content.Intent());
                return;
            }
            ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) a17).m78750xc5512edd(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e(iVar));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(219);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(a17, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/jsapi/ChooseMediaFromSystemHelper", "chooseFromCamera", "(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/MsgHandler;IZZZ)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final com.p314xaae8f345.mm.vfs.r6 c(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a("wcf://temp/wv_choose_media"));
        r6Var.J();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append('_');
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var, sb6.toString());
        r6Var2.k();
        return r6Var2;
    }
}
