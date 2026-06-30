package cw2;

/* loaded from: classes15.dex */
public final class s7 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd f305540d;

    public s7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd) {
        this.f305540d = c15188xd8bd4bd;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        zy2.ub videoViewCallback;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f305540d;
        long j17 = c15188xd8bd4bd.Z1;
        long j18 = c15188xd8bd4bd.f212178a2;
        int mo100924x2d67b867 = (int) ((kk4.f0) c15188xd8bd4bd.getPlayer()).mo100924x2d67b867(206);
        c15188xd8bd4bd.Z1 = ((kk4.f0) c15188xd8bd4bd.getPlayer()).mo100924x2d67b867(208);
        long mo100924x2d67b8672 = ((kk4.f0) c15188xd8bd4bd.getPlayer()).mo100924x2d67b867(209);
        c15188xd8bd4bd.f212178a2 = mo100924x2d67b8672;
        if (j17 <= 0 || j18 <= 0) {
            return true;
        }
        long j19 = c15188xd8bd4bd.Z1;
        if (j19 > 999999 || j19 < 0 || mo100924x2d67b8672 < 0 || mo100924x2d67b8672 > 999999) {
            return true;
        }
        long j27 = j19 - j17;
        if (j27 - mo100924x2d67b867 > 10 || j27 < 0 || mo100924x2d67b8672 - j18 < 0 || (videoViewCallback = c15188xd8bd4bd.getVideoViewCallback()) == null) {
            return true;
        }
        cw2.wa waVar = c15188xd8bd4bd.mediaSource;
        videoViewCallback.v3("", waVar != null ? waVar.f305629c : null, mo100924x2d67b867, (int) (c15188xd8bd4bd.Z1 - j17), (int) (c15188xd8bd4bd.f212178a2 - j18));
        return true;
    }
}
