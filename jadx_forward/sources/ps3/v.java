package ps3;

/* loaded from: classes15.dex */
public final class v implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ps3.w f439663d;

    public v(ps3.w wVar) {
        this.f439663d = wVar;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public final boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.lbs.C19621x752a03d5 c19621x752a03d5;
        ps3.w wVar = this.f439663d;
        if (wVar.f439666f || (c19621x752a03d5 = wVar.f439667g) != null) {
            return false;
        }
        ps3.q qVar = wVar.f439664d;
        if (z17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16953xeaa414a7) qVar).i(true, c19621x752a03d5);
            int i18 = (int) d18;
            ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46357xe9bcaf57, f17, f18, i18);
            wVar.f439667g = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.lbs.C19621x752a03d5(f18, f17, i18, i17, "", "");
            wVar.f439676s.c(0L, 0L);
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16953xeaa414a7) qVar).i(false, c19621x752a03d5);
            wVar.g();
        }
        return false;
    }
}
