package bh2;

/* loaded from: classes10.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bh2.v f102419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102420e;

    public p(bh2.v vVar, java.lang.String str) {
        this.f102419d = vVar;
        this.f102420e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        om2.q qVar;
        om2.q qVar2;
        bh2.v vVar = this.f102419d;
        if (vVar.f102437l != com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole.TXChorusRoleLeadSinger) {
            com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusExternalMusicParams tXChorusExternalMusicParams = new com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusExternalMusicParams();
            om2.s sVar = vVar.f102427b;
            java.lang.String str = null;
            tXChorusExternalMusicParams.f57247x324c710a = (sVar == null || (qVar2 = sVar.f427913c) == null) ? null : qVar2.f427907c;
            tXChorusExternalMusicParams.f57246x54340220 = this.f102420e;
            if (sVar != null && (qVar = sVar.f427913c) != null) {
                str = qVar.f427906b;
            }
            tXChorusExternalMusicParams.f57243x4c3a2d54 = str;
            tXChorusExternalMusicParams.f57245xa66d7bba = false;
            com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc abstractC26790x777b55bc = vVar.f102430e;
            if (abstractC26790x777b55bc != null) {
                abstractC26790x777b55bc.mo30451x4b1651d4(tXChorusExternalMusicParams);
            }
            vVar.e(((dh2.w) vVar.f102426a).d() ? bh2.w.f102439e : bh2.w.f102438d);
        }
    }
}
