package ls0;

/* loaded from: classes.dex */
public final class c1 {
    public c1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(java.lang.String file) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(file, "file");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            java.lang.String str = gm0.j1.u().h() + "videoMix/";
            com.p314xaae8f345.mm.vfs.w6.u(str);
            return str + com.p314xaae8f345.mm.vfs.w6.p(file) + "_cp_video.temp";
        }
        java.lang.String str2 = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a + "tmp";
        if (!com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            com.p314xaae8f345.mm.vfs.w6.u(str2);
        }
        return str2 + '/' + com.p314xaae8f345.mm.vfs.w6.p(file) + "_cp_video.temp";
    }
}
