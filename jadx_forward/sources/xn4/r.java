package xn4;

/* loaded from: classes11.dex */
public final class r implements xn4.q {
    @Override // xn4.q
    public void a(java.lang.String mediaId, double d17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XUpdate.XUpdateHelper", "defaultXUpdateCallback onDownloadProgress");
    }

    @Override // xn4.q
    public void b(java.lang.String mediaId, r45.mm6 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XUpdate.XUpdateHelper", "defaultXUpdateCallback onMergeSuccess");
        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).wi(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, xn4.e0.f537147d.b().f462204g);
    }

    @Override // xn4.q
    public void c(java.lang.String mediaId, java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XUpdate.XUpdateHelper", "defaultXUpdateCallback onDownloadSuccess");
        xn4.c0 c0Var = xn4.c0.f537137a;
        r45.mm6 mm6Var = null;
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_NAME_XUPDATE_DIALOGINFO").getString(mediaId, null);
        if (string != null) {
            mm6Var = new r45.mm6();
            mm6Var.mo75930xb5cb93b2(string);
        }
        if (mm6Var != null) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            c0Var.k(context, mm6Var);
        }
    }

    @Override // xn4.q
    public void d(java.lang.String mediaId, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.XUpdate.XUpdateHelper", "defaultXUpdateCallback onDownloadFail() called with: mediaId = " + mediaId + ", msg = " + msg);
    }
}
