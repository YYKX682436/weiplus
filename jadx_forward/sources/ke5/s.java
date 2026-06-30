package ke5;

/* loaded from: classes9.dex */
public abstract class s extends ke5.a {

    /* renamed from: i, reason: collision with root package name */
    public int f388655i;

    /* renamed from: j, reason: collision with root package name */
    public volatile long f388656j;

    /* renamed from: k, reason: collision with root package name */
    public volatile long f388657k;

    /* renamed from: l, reason: collision with root package name */
    public volatile long f388658l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f388659m;

    public s(yb5.d dVar, hd5.v vVar) {
        super(dVar, vVar);
        this.f388655i = 0;
        this.f388656j = 0L;
        this.f388657k = 0L;
        this.f388658l = 0L;
        this.f388659m = false;
    }

    @Override // ke5.a, ke5.f0
    public void a(hd5.n nVar, boolean z17, android.os.Bundle bundle) {
        this.f388659m = true;
        super.a(nVar, z17, bundle);
    }

    @Override // ke5.a, ke5.f0
    public void b(hd5.n nVar, boolean z17) {
        this.f388659m = true;
        a(nVar, z17, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0229  */
    @Override // ke5.a, hd5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 r18, hd5.q r19) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ke5.s.c(com.tencent.mm.ui.chatting.view.MMChattingListView, hd5.q):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0071, code lost:
    
        if (r9 > r4) goto L10;
     */
    @Override // ke5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public he5.t e(hd5.n r16, android.os.Bundle r17, hd5.q r18) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ke5.s.e(hd5.n, android.os.Bundle, hd5.q):he5.t");
    }

    public boolean h() {
        return true;
    }

    public boolean i(int i17, int i18) {
        java.lang.String x17 = this.f388574b.x();
        long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(x17);
        int F2 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).F2(x17, 0L, m07);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ChattingNormalDataPresenter", "[isShowTopAll] talker:%s createTime:%s expiredCount:%s", x17, java.lang.Long.valueOf(m07), java.lang.Integer.valueOf(F2));
        return i18 - F2 <= i17;
    }

    @Override // ke5.f0
    /* renamed from: isLoading */
    public boolean mo142542xf18228b2() {
        return this.f388659m;
    }

    public boolean j(int i17, int i18, long j17) {
        java.lang.String x17 = this.f388574b.x();
        int F2 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).F2(x17, 0L, j17);
        boolean z17 = i18 - F2 <= i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ChattingNormalDataPresenter", "[isShowTopAll] talker:%s createTime:%s expiredCount:%s isShowTopAll:%s", x17, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(F2), java.lang.Boolean.valueOf(z17));
        return z17;
    }

    @Override // ke5.a, ke5.f0
    /* renamed from: onCancel */
    public void mo142539x3d6f0539() {
        super.mo142539x3d6f0539();
        this.f388659m = false;
    }
}
