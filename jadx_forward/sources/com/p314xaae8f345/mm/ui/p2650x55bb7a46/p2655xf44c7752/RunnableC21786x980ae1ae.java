package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$y */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC21786x980ae1ae implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f282270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f282272f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f282273g;

    public /* synthetic */ RunnableC21786x980ae1ae(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.Long l17) {
        this.f282270d = viewOnClickListenerC21748xb3d38e6b;
        this.f282271e = str;
        this.f282272f = f9Var;
        this.f282273g = l17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282270d;
        if (viewOnClickListenerC21748xb3d38e6b.V1 || viewOnClickListenerC21748xb3d38e6b.isFinishing() || viewOnClickListenerC21748xb3d38e6b.isDestroyed()) {
            return;
        }
        java.lang.String str = this.f282271e;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f282272f;
        if (K0) {
            h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
            h90.a[] aVarArr = h90.a.f361204d;
            ((g90.u) wVar).Vi(f9Var, 2);
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(viewOnClickListenerC21748xb3d38e6b);
            e4Var.f293309c = viewOnClickListenerC21748xb3d38e6b.getText(com.p314xaae8f345.mm.R.C30867xcad56011.obn);
            e4Var.c();
            viewOnClickListenerC21748xb3d38e6b.q9();
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).xj(f9Var, false, 1);
            return;
        }
        t21.v2 h17 = t21.d3.h(f9Var.z0());
        int mo69286x51e8b0a = h17 == null ? viewOnClickListenerC21748xb3d38e6b.f282144g.v().f282971p.mo69286x51e8b0a() / 1000 : h17.f496548m;
        android.content.Intent intent = new android.content.Intent(viewOnClickListenerC21748xb3d38e6b, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72.class);
        intent.putExtra("KEY_PATH", str);
        intent.putExtra("KEY_URI_ID", this.f282273g);
        intent.putExtra("KEY_THUMB_PATH", ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(f9Var, f9Var.z0(), false));
        intent.putExtra("KEY_VIDEO_DURATION", mo69286x51e8b0a);
        intent.putExtra("KEY_EXTERNAL_ORIGIN_VIDEO", true);
        intent.putExtra("KEY_FAVORITE", true);
        intent.putExtra("KEY_VIDEO_FILE_NAME", f9Var.z0());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(viewOnClickListenerC21748xb3d38e6b, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "lambda$goToPreviewExternalVideo$21", "(Ljava/lang/String;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/Long;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        viewOnClickListenerC21748xb3d38e6b.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(viewOnClickListenerC21748xb3d38e6b, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "lambda$goToPreviewExternalVideo$21", "(Ljava/lang/String;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/Long;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        viewOnClickListenerC21748xb3d38e6b.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1);
        ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).xj(f9Var, true, 0);
    }
}
