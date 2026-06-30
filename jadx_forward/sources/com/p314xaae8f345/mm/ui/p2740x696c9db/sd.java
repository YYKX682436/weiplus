package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes9.dex */
public final class sd {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2740x696c9db.sd f292275a = new com.p314xaae8f345.mm.ui.p2740x696c9db.sd();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f292276b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f292277c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f292278d;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("com.tencent.mm.ui.chatting.gallery.ImageGalleryUI");
        hashSet.add("com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        hashSet.add("com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI");
        hashSet.add("com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI");
        hashSet.add("com.tencent.mm.ui.chatting.AppAttachNewDownloadUI");
        hashSet.add("com.tencent.mm.compose_chatting.VoiceSeekUI");
        f292276b = hashSet;
        f292278d = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_enable_background_voice, 1) == 1;
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().a0(0, new com.p314xaae8f345.mm.ui.p2740x696c9db.rd());
    }

    public final void a(java.lang.String toWhere) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toWhere, "toWhere");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jump to ");
        sb6.append(toWhere);
        sb6.append(", from:");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        sb6.append(" " + com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceStateHolder", sb6.toString());
        if (f292276b.contains(toWhere)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceStateHolder", "need stop set to false");
            b(false);
        }
    }

    public final void b(boolean z17) {
        if (f292278d) {
            f292277c = z17;
        }
    }
}
