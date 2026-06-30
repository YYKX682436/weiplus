package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340;

/* loaded from: classes5.dex */
public class j implements gm5.a {
    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.j jVar, java.lang.String str, java.lang.String str2) {
        jVar.getClass();
        if (o35.a.b(str)) {
            jVar.d(str, str2);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskInitFace", "copy detect model file detector: %s", str);
            c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str2, str);
        }
    }

    public static void c(android.content.Context context, java.lang.String str, java.lang.String str2) {
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).getClass();
        byte[] bArr = com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.i0.f181284a;
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.d(context, str, str2);
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskInitFace", "[TaskInitFace init] do copy face model files");
        s75.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.i(this, new java.lang.String[]{"net1_18.rpnmodel", "net1_18_bin.rpnproto", "net2_36.rpnmodel", "net2_36_bin.rpnproto"}, com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.h().concat("/"), new java.lang.String[]{"align.rpdm", "align.stb", "align_bin.rpdc", "eye.rpdm", "eye_bin.rpdc"}, new java.lang.String[]{"rotBasis.bin"}), "FaceReflectCopyModelFile");
        return null;
    }

    public final void d(java.lang.String str, java.lang.String str2) {
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).getClass();
        byte[] bArr = com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.i0.f181284a;
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(str);
        java.lang.String p18 = com.p314xaae8f345.mm.vfs.w6.p("assets:///" + str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskInitFace", "localMD5 : " + p17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskInitFace", "assetMD5 : " + p18);
        if (p17 == null || p17.equals(p18)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskInitFace", "SDPath:%s   exists ", str);
            return;
        }
        com.p314xaae8f345.mm.vfs.w6.h(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskInitFace", str + " md5 is wrong");
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str2, str);
    }
}
