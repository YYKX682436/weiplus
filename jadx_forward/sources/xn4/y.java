package xn4;

/* loaded from: classes11.dex */
public final class y implements xn4.q {
    @Override // xn4.q
    public void a(java.lang.String mediaId, double d17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_NAME_XUPDATE_DOWNLOAD_PROGRESS").putInt(mediaId, (int) d17);
    }

    @Override // xn4.q
    public void b(java.lang.String mediaId, r45.mm6 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_NAME_XUPDATE_DOWNLOAD_PROGRESS").putInt(mediaId, 0);
    }

    @Override // xn4.q
    public void c(java.lang.String mediaId, java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_NAME_XUPDATE_DOWNLOAD_PROGRESS").putInt(mediaId, 0);
    }

    @Override // xn4.q
    public void d(java.lang.String mediaId, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_NAME_XUPDATE_DOWNLOAD_PROGRESS").putInt(mediaId, 0);
    }
}
