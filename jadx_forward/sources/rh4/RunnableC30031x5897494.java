package rh4;

/* renamed from: rh4.c0$$a */
/* loaded from: classes8.dex */
public final /* synthetic */ class RunnableC30031x5897494 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80 f477239d;

    public /* synthetic */ RunnableC30031x5897494(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80 c18566x5b11ed80) {
        this.f477239d = c18566x5b11ed80;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80.f254242t2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80 c18566x5b11ed80 = this.f477239d;
        if (!c18566x5b11ed80.E0() && c18566x5b11ed80.mo7958x54496c8e() == 0) {
            c18566x5b11ed80.v1(c18566x5b11ed80.getContext(), c18566x5b11ed80.f254249k2);
            return;
        }
        int i18 = c18566x5b11ed80.f254255q2;
        if (i18 > 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "update item offset delay count reach max");
        } else {
            c18566x5b11ed80.f254255q2 = i18 + 1;
            c18566x5b11ed80.postDelayed(new rh4.RunnableC30031x5897494(c18566x5b11ed80), 300L);
        }
    }
}
