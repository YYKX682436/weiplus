package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f289399d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 f289400e;

    public m3(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226, int i17) {
        this.f289400e = viewOnTouchListenerC22366xcd5c2226;
        this.f289399d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.r rVar;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = this.f289400e;
        if (!viewOnTouchListenerC22366xcd5c2226.f288848g || (rVar = viewOnTouchListenerC22366xcd5c2226.f288851m) == null) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z) rVar).a(this.f289399d);
    }
}
