package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes3.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3 f254216d;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3 viewOnTouchListenerC18555xc58183f3) {
        this.f254216d = viewOnTouchListenerC18555xc58183f3;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3.P;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3 viewOnTouchListenerC18555xc58183f3 = this.f254216d;
        viewOnTouchListenerC18555xc58183f3.i();
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            int color = viewOnTouchListenerC18555xc58183f3.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560394j7);
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18554x7dbdf23e c18554x7dbdf23e = viewOnTouchListenerC18555xc58183f3.f254048y;
            if (c18554x7dbdf23e != null) {
                c18554x7dbdf23e.m71586x62f3ee3d(color);
                return;
            }
            return;
        }
        int color2 = viewOnTouchListenerC18555xc58183f3.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07);
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18554x7dbdf23e c18554x7dbdf23e2 = viewOnTouchListenerC18555xc58183f3.f254048y;
        if (c18554x7dbdf23e2 != null) {
            c18554x7dbdf23e2.m71586x62f3ee3d(color2);
        }
    }
}
