package dw3;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final dw3.h f325744a;

    static {
        dw3.h hVar = new dw3.h();
        f325744a = hVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFilePathUtil", "useMediaTempPath:" + hVar.f());
        ((ku5.t0) ku5.t0.f394148d).g(dw3.g.f325742d);
    }

    public static /* synthetic */ java.lang.String d(dw3.h hVar, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = null;
        }
        if ((i17 & 2) != 0) {
            str2 = null;
        }
        return hVar.c(str, str2);
    }

    public final java.lang.String a(java.lang.String biz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(biz, "biz");
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        com.p314xaae8f345.mm.vfs.r6 h07 = lp0.b.h0(biz);
        if (!h07.m()) {
            h07.J();
        }
        java.lang.String u17 = h07.u();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u17, "getPath(...)");
        return u17;
    }

    public final java.lang.String b(java.lang.String biz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(biz, "biz");
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        java.lang.String str = lp0.b.h0("media") + java.io.File.separator + biz;
        com.p314xaae8f345.mm.vfs.w6.u(str);
        return str;
    }

    public final java.lang.String c(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            str2 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        }
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
            return lp0.b.h0("media") + java.io.File.separator + str2;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        return b(str) + java.io.File.separator + str2;
    }

    public final java.lang.String[] e(java.lang.String biz, java.lang.String... desc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(biz, "biz");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        java.lang.String b17 = b(biz);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int length = desc.length;
        java.lang.String[] strArr = new java.lang.String[length];
        for (int i17 = 0; i17 < length; i17++) {
            strArr[i17] = b17 + java.io.File.separator + desc[i17] + '_' + currentTimeMillis;
        }
        return strArr;
    }

    public final boolean f() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_media_file_temp_path, true);
    }
}
