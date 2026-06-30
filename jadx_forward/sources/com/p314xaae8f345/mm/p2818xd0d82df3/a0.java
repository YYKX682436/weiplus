package com.p314xaae8f345.mm.p2818xd0d82df3;

/* loaded from: classes.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f295880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f295881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f295882f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f295883g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f295884h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2818xd0d82df3.p f295885i;

    public a0(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, com.p314xaae8f345.mm.p2818xd0d82df3.p pVar) {
        this.f295880d = str;
        this.f295881e = str2;
        this.f295882f = i17;
        this.f295883g = i18;
        this.f295884h = i19;
        this.f295885i = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String filePath = this.f295880d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        java.lang.String originalMd5 = this.f295881e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originalMd5, "originalMd5");
        com.p314xaae8f345.mm.p2818xd0d82df3.p scene = this.f295885i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XNET.XNetLibResHelper", "[processXnetSoResourceUpdate] from scene:" + scene, filePath);
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.XNET.XNetLibResHelper", "account not ready");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isResourceProcessSuccess#");
        int i17 = this.f295883g;
        sb6.append(i17);
        int i18 = this.f295884h;
        sb6.append(i18);
        int i19 = this.f295882f;
        sb6.append(i19);
        if (L.getBoolean(sb6.toString(), false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XNET.XNetLibResHelper", "The resource has been processed. resType=" + i17 + " ,subType=" + i18 + ",fileVersion=" + i19);
            return;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(filePath);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.XNET.XNetLibResHelper", "file not exits :%s", filePath);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(filePath);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XNET.XNetLibResHelper", "getFileMD5String cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
        if (android.text.TextUtils.isEmpty(p17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.XNET.XNetLibResHelper", "current_file_md5 is empty");
            return;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p17, originalMd5)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1868L, 6L, 1L, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.XNET.XNetLibResHelper", "md5 is diff, current md5:%s, original md5:%s", p17, originalMd5);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XNET.XNetLibResHelper", "md5 is same, current md5:%s, original md5:%s", p17, originalMd5);
        java.lang.String c17 = com.p314xaae8f345.mm.p2818xd0d82df3.y.f295913a.c();
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(c17);
        if (!r6Var.m()) {
            try {
                r6Var.J();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.XNET.XNetLibResHelper", e17, "create file:%s", r6Var);
            }
        }
        java.lang.String str2 = c17 + '/' + i19;
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(str2);
        if (r6Var2.m()) {
            r6Var2.l();
        }
        try {
            r6Var2.J();
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.XNET.XNetLibResHelper", e18, "create file:%s", str2);
        }
        int Q = com.p314xaae8f345.mm.vfs.w6.Q(filePath, str2);
        if (Q < 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1868L, 5L, 1L, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.XNET.XNetLibResHelper", "unzip fail, ret = " + Q + ", zipFilePath = " + filePath + ", unzipPath = " + str2);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XNET.XNetLibResHelper", "unzip file success, unzipFolder file :%s to path:%s", filePath, str2);
        ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Ri(i17, i18, i19);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putBoolean("isResourceProcessSuccess#" + i17 + i18 + i19, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1868L, 4L, 1L, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XNET.XNetLibResHelper", "recycleOldVersionSo current fileVersion", java.lang.Integer.valueOf(i19));
        int i27 = i19 + (-2);
        if (i27 < 0) {
            return;
        }
        while (-1 < i27) {
            java.lang.String str3 = c17 + '/' + i27;
            if (com.p314xaae8f345.mm.vfs.w6.j(str3)) {
                com.p314xaae8f345.mm.vfs.w6.f(str3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XNET.XNetLibResHelper", "delete versionFolder:%s", str3);
            }
            i27--;
        }
    }
}
