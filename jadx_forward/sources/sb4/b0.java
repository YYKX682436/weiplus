package sb4;

/* loaded from: classes4.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f486977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f486978e;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17) {
        this.f486977d = c17933xe8d1b226;
        this.f486978e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter$5");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f486977d;
        if (c17933xe8d1b226 != null) {
            long j17 = c17933xe8d1b226.f68891x29d1292e;
            if (sb4.z.a().containsKey(java.lang.Long.valueOf(j17))) {
                sb4.e0 e0Var = (sb4.e0) sb4.z.a().get(java.lang.Long.valueOf(j17));
                int i17 = e0Var.f487020f;
                int i18 = this.f486978e;
                if (i17 == 0) {
                    e0Var.f487020f = i18 + 1;
                }
                if (e0Var.f487016b == null) {
                    e0Var.f487016b = new java.util.HashSet();
                }
                e0Var.f487016b.add(java.lang.Integer.valueOf(i18 + 1));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter$5");
    }
}
