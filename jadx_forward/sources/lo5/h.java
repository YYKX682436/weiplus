package lo5;

/* loaded from: classes14.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public lo5.a f401747a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f401748b;

    /* renamed from: c, reason: collision with root package name */
    public final lo5.m f401749c = new lo5.m(new lo5.c(this), new lo5.d(this));

    public static /* synthetic */ void b(lo5.h hVar, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        hVar.a(z17);
    }

    public final void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPFloatCardController", "dismissFloatCard: ");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f401748b;
        if (j0Var != null) {
            j0Var.dismiss();
        }
        this.f401748b = null;
        if (z17) {
            lo5.m mVar = this.f401749c;
            wu5.c cVar = mVar.f382755w;
            if (cVar != null) {
                cVar.cancel(false);
            }
            mVar.f382755w = null;
        }
        jq4.z0.c(this.f401749c, false, false, false, 3, null);
    }
}
