package sb4;

/* loaded from: classes4.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f486976d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        this.f486976d = c17933xe8d1b226;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f486976d;
        if (c17933xe8d1b226 != null) {
            long j17 = c17933xe8d1b226.f68891x29d1292e;
            if (!sb4.z.a().containsKey(java.lang.Long.valueOf(j17))) {
                sb4.e0 e0Var = new sb4.e0();
                if (c17933xe8d1b226.m70371x485d7() != null && c17933xe8d1b226.m70371x485d7().f39014x86965dde != null && c17933xe8d1b226.m70405x7b43eb28() && c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451373h != null && c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451373h.size() > 0) {
                    e0Var.f487015a = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451373h.size();
                    e0Var.f487016b = new java.util.HashSet();
                    e0Var.f487017c = new java.util.HashSet();
                    e0Var.f487018d = new java.util.HashSet();
                    e0Var.f487019e = new java.util.HashSet();
                    e0Var.f487022h = c17933xe8d1b226.m70371x485d7().Id;
                    e0Var.f487027m = c17933xe8d1b226.m70371x485d7().f39034xebc78809;
                    try {
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 e17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.e(c17933xe8d1b226);
                        e0Var.f487025k = e17.f38982x6c24f798;
                        e0Var.f487026l = e17.f38962x37aaea10;
                    } catch (java.lang.Exception unused) {
                        e0Var.f487025k = 0;
                        e0Var.f487026l = 0;
                    }
                    try {
                        gm0.j1.i();
                        e0Var.f487024j = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().j7(c17933xe8d1b226.m70374x6bf53a6c());
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        gm0.j1.i();
                        e0Var.f487023i = (currentTimeMillis - ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().m5(c17933xe8d1b226.m70374x6bf53a6c())) / 1000;
                    } catch (java.lang.Exception unused2) {
                        e0Var.f487024j = 0;
                        e0Var.f487023i = 0L;
                    }
                    sb4.z.a().put(java.lang.Long.valueOf(j17), e0Var);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter$4");
    }
}
