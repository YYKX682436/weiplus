package ie4;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ie4.a f372535a = new ie4.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f372536b = je4.c.f380850a.a();

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18437xfbc5d82 item) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteLivePhotoDir", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiPicFileHelper", "deleteLivePhotoDir " + item.h());
        java.lang.String b17 = b(item);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("safeDeleteDir", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiPicFileHelper", "safeDeleteDir >> " + b17);
        if (r26.n0.D(b17, "draft", false, 2, null) && !r26.n0.B(b17, "DCIM", true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiPicFileHelper", "delete dir ret >> " + com.p314xaae8f345.mm.vfs.w6.g(b17, true));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("safeDeleteDir", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteLivePhotoDir", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
    }

    public final java.lang.String b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18437xfbc5d82 c18437xfbc5d82) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLivePhotoDir", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
        java.lang.String str = f372536b + c18437xfbc5d82.h() + '/';
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiPicFileHelper", "create sns draft livePhoto dir:" + str + " result:" + com.p314xaae8f345.mm.vfs.w6.u(str));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLivePhotoDir", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
        return str;
    }

    public final java.lang.String c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18437xfbc5d82 item) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLivePhotoParsePath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.String b17 = b(item);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(b17);
        sb6.append("pre_temp_sns_live_photo_parse_");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        java.lang.String b18 = item.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b18);
        sb7.append(b18);
        sb7.append(java.lang.System.currentTimeMillis());
        byte[] bytes = sb7.toString().getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        java.lang.String sb8 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLivePhotoParsePath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
        return sb8;
    }

    public final long d(java.lang.String fromPath, java.lang.String toPath) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("safeCopyFile", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromPath, "fromPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toPath, "toPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiPicFileHelper", "copyFile >> fromPath: " + fromPath + " toPath: " + toPath);
        if (r26.n0.B(fromPath, "draft", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiPicFileHelper", "is already copy");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("safeCopyFile", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
            return -1L;
        }
        long d17 = com.p314xaae8f345.mm.vfs.w6.d(fromPath, toPath, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("safeCopyFile", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
        return d17;
    }
}
