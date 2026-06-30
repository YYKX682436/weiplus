package l44;

/* loaded from: classes4.dex */
public class x4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f397951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f397952e;

    public x4(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17) {
        this.f397951d = c17933xe8d1b226;
        this.f397952e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f397952e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f397951d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$5");
        try {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            l44.a5.c(context, c17933xe8d1b226.m70354x74235b3e(), c17933xe8d1b226, i17);
            l44.a5.d(context, c17933xe8d1b226.m70347x10413e67(i17), c17933xe8d1b226, i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderAdPreloadHelper", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$5");
    }
}
