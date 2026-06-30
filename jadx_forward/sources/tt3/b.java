package tt3;

/* loaded from: classes10.dex */
public final class b extends st3.u {

    /* renamed from: b, reason: collision with root package name */
    public static final tt3.b f503570b = new tt3.b();

    @Override // es0.c
    public java.lang.Object d() {
        return new tt3.a(0, false, 0, 0, 15, null);
    }

    @Override // es0.c
    public void e() {
        ((tt3.a) b()).f503562b = c("StoryEditVideoBgmSwitch", 1) == 1;
        int b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 1) * 100;
        ((tt3.a) b()).f503563c = b17;
        ((tt3.a) b()).f503564d = b17;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_story_favorite_enable, 0);
        ((tt3.a) b()).f503565e = true;
        ((tt3.a) b()).f503567g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_story_image_2_video_enable, 1) == 1;
        ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_story_edit_tip_enable, 1);
        c("StoryFeaturedExpiredTime", 15552000);
        ((tt3.a) b()).f503569i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_story_album_duration, 10);
        ((tt3.a) b()).f503566f = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_story_edit_lyrics_enable, 1) == 1;
        ((tt3.a) b()).f503568h = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_story_add_music_enable, 1) == 1;
    }
}
