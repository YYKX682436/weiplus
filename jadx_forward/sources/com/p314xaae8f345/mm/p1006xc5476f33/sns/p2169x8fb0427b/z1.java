package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public final class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f247718d;

    public z1(java.lang.String... paths) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paths, "paths");
        this.f247718d = paths;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage$SnsCoverClearTask");
        for (java.lang.String str : this.f247718d) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.y1 y1Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a2.f247453g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTAG", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage$Companion");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTAG$cp", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTAG$cp", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTAG", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage$Companion");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCoverStorage", "delete path:" + str + " size:" + com.p314xaae8f345.mm.vfs.w6.k(str));
            com.p314xaae8f345.mm.vfs.w6.h(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage$SnsCoverClearTask");
    }
}
