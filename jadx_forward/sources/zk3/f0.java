package zk3;

/* loaded from: classes8.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f554980d;

    public f0(java.util.List list) {
        this.f554980d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c> list = this.f554980d;
        if (list != null) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c : list) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.u0 u0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.u0.f232039a;
                java.lang.String str = c16601x7ed0e40c != null ? c16601x7ed0e40c.f66791xc8a07680 : null;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.v0.f232145a + str;
                java.lang.String str3 = c16601x7ed0e40c != null ? c16601x7ed0e40c.f66791xc8a07680 : null;
                java.lang.String b17 = u0Var.b(str3 != null ? str3 : "");
                if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
                    if (!com.p314xaae8f345.mm.vfs.w6.j(b17)) {
                        com.p314xaae8f345.mm.vfs.w6.c(str2, b17);
                    }
                    com.p314xaae8f345.mm.vfs.w6.h(str2);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.u0 u0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.u0.f232039a;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.v0.f232145a);
        if (r6Var.m()) {
            com.p314xaae8f345.mm.vfs.w6.f(r6Var.o());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskTipsHelper", "setMultiTaskTransImgFileFlag, time: false");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("multitask_tips_config").putBoolean("multitask_first_trans_img_path", false);
    }
}
