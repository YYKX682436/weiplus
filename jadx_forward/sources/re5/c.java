package re5;

/* loaded from: classes11.dex */
public final class c extends sh5.d {
    @Override // sh5.d, hg3.a
    public void a(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 videoView, gg3.c param) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoView, "videoView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        super.a(videoView, param);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6452x1b1ee249 c6452x1b1ee249 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6452x1b1ee249();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        re5.e[] eVarArr = re5.e.f476102d;
        linkedHashMap.put("tp_flow_id", param.f353259a);
        re5.e[] eVarArr2 = re5.e.f476102d;
        java.lang.String path = param.f353261c;
        java.lang.String n17 = com.p314xaae8f345.mm.vfs.w6.n(path);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "getFileExt(...)");
        linkedHashMap.put("file_ext", n17);
        re5.e[] eVarArr3 = re5.e.f476102d;
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(path);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getMD5String(...)");
        linkedHashMap.put("file_path_md5", a17);
        re5.e[] eVarArr4 = re5.e.f476102d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        linkedHashMap.put("tp_audio_format_support_check", java.lang.Boolean.valueOf(((be0.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class))).Bi(path)));
        re5.e[] eVarArr5 = re5.e.f476102d;
        linkedHashMap.put("file_size", java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(path)));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465) videoView).f(new re5.e0(linkedHashMap, c6452x1b1ee249, 0L, 4, null));
    }
}
