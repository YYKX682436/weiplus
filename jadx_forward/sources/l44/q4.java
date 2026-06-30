package l44;

/* loaded from: classes4.dex */
public class q4 extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final l44.r4 f397849a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f397850b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q4(l44.r4 r4, long r5) {
        /*
            r3 = this;
            java.lang.String r0 = "access$000"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            int r2 = r4.f397861c
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            long r0 = (long) r2
            r3.<init>(r5, r0)
            r5 = 0
            r3.f397850b = r5
            r3.f397849a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l44.q4.<init>(l44.r4, long):void");
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFinish", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer$Impl");
        this.f397850b = true;
        l44.r4 r4Var = this.f397849a;
        if (r4Var != null) {
            r4Var.a(0L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinish", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer$Impl");
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTick", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer$Impl");
        l44.r4 r4Var = this.f397849a;
        if (r4Var != null) {
            r4Var.a(j17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTick", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer$Impl");
    }
}
