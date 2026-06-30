package h03;

/* loaded from: classes2.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24451x12373195 f359457d;

    public t(com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24451x12373195 c24451x12373195) {
        this.f359457d = c24451x12373195;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 b17 = c03.i.b(this.f359457d);
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LVNativePlugin", "showLastExitFeedHint fail, finderObject is null");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5505x8c69712b c5505x8c69712b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5505x8c69712b();
        long m76784x5db1b11 = b17.m76784x5db1b11();
        am.ic icVar = c5505x8c69712b.f135836g;
        icVar.f88469a = m76784x5db1b11;
        icVar.f88470b = b17;
        c5505x8c69712b.e();
    }
}
