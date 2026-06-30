package zl2;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final zl2.k f555384a = new zl2.k();

    /* renamed from: b, reason: collision with root package name */
    public static final zl2.h f555385b = new zl2.h();

    public final void a(android.app.Activity activity, java.lang.String originalPath, int i17, java.lang.String str, boolean z17, r45.bo1 hdScene, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originalPath, "originalPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hdScene, "hdScene");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.b(originalPath, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x1.f184197h.a());
        b17.f237221z = false;
        b17.F = 20;
        try {
            fu3.e.class.getDeclaredMethod("updatePhotoEditProvider", com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.class).invoke(null, b17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderLiveCoverEditHelper", e17, "ImproveEditPhotoConfig.updatePhotoEditProvider failed", new java.lang.Object[0]);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("key_edit_enable_crop_rotate", false);
        bundle.putString("original_image_path", originalPath);
        if (!(str == null || str.length() == 0)) {
            bundle.putString("original_cdn_url", str);
        }
        bundle.putBoolean("enable_cover_enhance", z17);
        bundle.putInt("hd_scene", hdScene.f452448d);
        bundle.putBoolean("show_hd_red_dot", z18);
        b17.M = bundle;
        com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468 c10402x5bc41468 = new com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468((hp.a) null);
        java.util.Map map = c10402x5bc41468.f146312h;
        ((java.util.HashMap) map).put("plugin_filter", java.lang.Boolean.TRUE);
        ((java.util.HashMap) map).put("plugin_poi", true);
        ((java.util.HashMap) map).put("plugin_tip", true);
        ((java.util.HashMap) map).put("plugin_menu", true);
        b17.f237210o = c10402x5bc41468;
        ((s40.w0) i95.n0.c(s40.w0.class)).getClass();
        b17.a(1, "com.tencent.mm.plugin.recordvideo.plugin.improve_photo.finder_cover.FinderLiveAvatarEditPluginLayout");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setVideoGeneratedCallback: setting callback=");
        zl2.h hVar = f555385b;
        sb6.append(hVar.hashCode());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCoverEditHelper", sb6.toString());
        ut3.f.f512709c.f512710a = hVar;
        ut3.m.f512715a.f(activity, i17, com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, -1, b17, 1, 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCoverEditHelper", "jumpToNewCoverEditor: originalPath=" + originalPath + ", requestCode=" + i17);
    }
}
