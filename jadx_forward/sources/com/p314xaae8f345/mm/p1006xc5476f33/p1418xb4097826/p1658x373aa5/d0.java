package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15213xbf81077c f213398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f213399e;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15213xbf81077c c15213xbf81077c, boolean z17) {
        this.f213398d = c15213xbf81077c;
        this.f213399e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15213xbf81077c c15213xbf81077c = this.f213398d;
        yz5.p onExpandStateChangeListener = c15213xbf81077c.getOnExpandStateChangeListener();
        if (onExpandStateChangeListener != null) {
            onExpandStateChangeListener.mo149xb9724478(java.lang.Boolean.valueOf(this.f213399e), java.lang.Boolean.valueOf(c15213xbf81077c.f212354q.getVisibility() == 0));
        }
    }
}
