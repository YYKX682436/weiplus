package e43;

/* loaded from: classes8.dex */
public abstract class c {
    public static final java.lang.String a(boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, u33.i downloadCallback) {
        java.lang.String sb6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadCallback, "downloadCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("gameimgdownload_");
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(c01.z1.r());
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb8.append(java.lang.System.currentTimeMillis());
        sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(sb8.toString()));
        java.lang.String sb9 = sb7.toString();
        h0Var.f391656d = sb9;
        if (str == null) {
            return sb9;
        }
        if (z17) {
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("thumb_download_");
            sb10.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str + str2));
            sb6 = sb10.toString();
        } else {
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder("image_download_");
            sb11.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str + str2));
            sb6 = sb11.toString();
        }
        java.lang.String str4 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.m.b(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.l.ONE_WEEK) + "image/chatroom/" + sb6;
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str4);
        java.lang.String str5 = a17.f294812f;
        if (str5 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str5, false, false);
            if (!a17.f294812f.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRoomMediaDownloader", "local cache file");
            downloadCallback.b(true, 0, (java.lang.String) h0Var.f391656d, str4);
            return (java.lang.String) h0Var.f391656d;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new e43.a(h0Var, z17, str, str4, str2, new e43.b(downloadCallback, str4)));
        return (java.lang.String) h0Var.f391656d;
    }
}
