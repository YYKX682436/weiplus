package fu3;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final fu3.e f348413a = new fu3.e();

    public final boolean a() {
        int g17 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Media_PhotoImproveEdit_Int, 0);
        if (g17 != 0) {
            return g17 == 1;
        }
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_photo_edit_improve_enable, true);
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 provider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(provider, "provider");
        boolean a17 = a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoConfig", "getPhotoEditProvider >> " + a17);
        provider.M.putBoolean("key_edit_enable_emoji_search", true);
        if (a17) {
            provider.a(1, "com.tencent.mm.plugin.recordvideo.plugin.improve_photo.ImproveBaseEditPhotoLayout");
        }
    }
}
