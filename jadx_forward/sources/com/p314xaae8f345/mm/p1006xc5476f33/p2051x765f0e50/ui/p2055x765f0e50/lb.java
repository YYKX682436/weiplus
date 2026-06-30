package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class lb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.nb f242822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f242823e;

    public lb(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.nb nbVar, int i17) {
        this.f242822d = nbVar;
        this.f242823e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("inputContainer.height: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.nb nbVar = this.f242822d;
        sb6.append(nbVar.T6().c().getHeight());
        sb6.append(", screenHeight: ");
        int i17 = this.f242823e;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.SettingsEmailEditUIC", sb6.toString());
        if (nbVar.T6().c().getHeight() > i17) {
            nbVar.T6().e().scrollBy(0, nbVar.T6().c().getHeight() - i17);
        }
    }
}
