package fp4;

/* loaded from: classes10.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd.C18800xbc8bc43d f346893d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd.C18800xbc8bc43d c18800xbc8bc43d) {
        this.f346893d = c18800xbc8bc43d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd.C18800xbc8bc43d c18800xbc8bc43d = this.f346893d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd.C18799x4530423d seekSlider = c18800xbc8bc43d.getSeekSlider();
        if (seekSlider != null) {
            seekSlider.f(true, c18800xbc8bc43d.f257478r + (((float) c18800xbc8bc43d.f257475o) * c18800xbc8bc43d.f257477q));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd.C18799x4530423d seekSlider2 = c18800xbc8bc43d.getSeekSlider();
        if (seekSlider2 != null) {
            seekSlider2.f(false, c18800xbc8bc43d.f257478r + (((float) c18800xbc8bc43d.f257476p) * c18800xbc8bc43d.f257477q));
        }
    }
}
