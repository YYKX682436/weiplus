package xv2;

/* loaded from: classes10.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f538925d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.mb4 f538926e;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObj, r45.mb4 media) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        this.f538925d = finderObj;
        this.f538926e = media;
    }

    public final int a(java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        if (str2 == null || str2.length() == 0) {
            return -1;
        }
        android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObj = this.f538925d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
        int c17 = finderObj.m59322x4b694432() ? j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2554x6e06889c.C20583xd89b37f4()) : 0;
        if (c17 == 0) {
            return -1;
        }
        if (c17 == 1) {
            return ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).cj(str, str2, n07.outWidth, n07.outHeight, 8);
        }
        if (c17 != 2) {
            return -1;
        }
        return ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).fj(str, str2, n07.outWidth, n07.outHeight, 8, true);
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[finderpost] WxamCompressTask run begin ");
        r45.mb4 mb4Var = this.f538926e;
        sb6.append(mb4Var.m75945x2fec8307(9));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewLife.LogPost.NewLifeMediaProcessStage", sb6.toString());
        java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(0);
        java.lang.String str = m75945x2fec8307 + "_wxam";
        java.lang.String m75945x2fec83072 = mb4Var.m75945x2fec8307(1);
        java.lang.String str2 = m75945x2fec83072 + "_wxam";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(mb4Var.m75945x2fec8307(0)) && com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(mb4Var.m75945x2fec8307(1))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NewLife.LogPost.NewLifeMediaProcessStage", "[finderpost]:WxamCompressTask wxam : already wxam! [" + mb4Var.m75945x2fec8307(0) + "]-[" + mb4Var.m75945x2fec8307(1) + ']');
        } else {
            int a17 = a(m75945x2fec8307, str);
            int a18 = a(m75945x2fec83072, str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewLife.LogPost.NewLifeMediaProcessStage", "[finderpost]:WxamCompressTask wxam : originPath:" + m75945x2fec8307 + " originWxamPath:" + str + " thumbPath:" + m75945x2fec83072 + " thumbWxamPath:" + str2 + " originWxamRet:" + a17 + " targetWxamRet:" + a18);
            if (a17 == 0 && a18 == 0) {
                com.p314xaae8f345.mm.vfs.w6.h(m75945x2fec8307);
                com.p314xaae8f345.mm.vfs.w6.h(m75945x2fec83072);
                com.p314xaae8f345.mm.vfs.w6.c(str, m75945x2fec8307);
                com.p314xaae8f345.mm.vfs.w6.c(str2, m75945x2fec83072);
                com.p314xaae8f345.mm.vfs.w6.h(str);
                com.p314xaae8f345.mm.vfs.w6.h(str2);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewLife.LogPost.NewLifeMediaProcessStage", "[finderpost] WxamCompressTask run end " + mb4Var.m75945x2fec8307(9) + ": cost:[" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " ms]");
    }
}
