package com.tencent.mm.plugin.facedetect;

/* loaded from: classes5.dex */
public class j implements gm5.a {
    public static void b(com.tencent.mm.plugin.facedetect.j jVar, java.lang.String str, java.lang.String str2) {
        jVar.getClass();
        if (o35.a.b(str)) {
            jVar.d(str, str2);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskInitFace", "copy detect model file detector: %s", str);
            c(com.tencent.mm.sdk.platformtools.x2.f193071a, str2, str);
        }
    }

    public static void c(android.content.Context context, java.lang.String str, java.lang.String str2) {
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).getClass();
        byte[] bArr = com.tencent.mm.plugin.expansions.i0.f99751a;
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.facedetect.model.s0.d(context, str, str2);
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskInitFace", "[TaskInitFace init] do copy face model files");
        s75.d.b(new com.tencent.mm.plugin.facedetect.i(this, new java.lang.String[]{"net1_18.rpnmodel", "net1_18_bin.rpnproto", "net2_36.rpnmodel", "net2_36_bin.rpnproto"}, com.tencent.mm.plugin.facedetect.model.s0.h().concat("/"), new java.lang.String[]{"align.rpdm", "align.stb", "align_bin.rpdc", "eye.rpdm", "eye_bin.rpdc"}, new java.lang.String[]{"rotBasis.bin"}), "FaceReflectCopyModelFile");
        return null;
    }

    public final void d(java.lang.String str, java.lang.String str2) {
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).getClass();
        byte[] bArr = com.tencent.mm.plugin.expansions.i0.f99751a;
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(str);
        java.lang.String p18 = com.tencent.mm.vfs.w6.p("assets:///" + str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskInitFace", "localMD5 : " + p17);
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskInitFace", "assetMD5 : " + p18);
        if (p17 == null || p17.equals(p18)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskInitFace", "SDPath:%s   exists ", str);
            return;
        }
        com.tencent.mm.vfs.w6.h(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskInitFace", str + " md5 is wrong");
        com.tencent.mm.plugin.facedetect.model.s0.d(com.tencent.mm.sdk.platformtools.x2.f193071a, str2, str);
    }
}
