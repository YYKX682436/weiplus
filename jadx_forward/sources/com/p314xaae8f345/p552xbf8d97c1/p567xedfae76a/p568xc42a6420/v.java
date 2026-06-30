package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420;

/* loaded from: classes12.dex */
public final class v implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134272u = false;
        java.util.HashSet hashSet = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134271t;
        synchronized (hashSet) {
            java.util.Iterator it = new java.util.ArrayList(hashSet).iterator();
            while (it.hasNext()) {
                ((ei.a) it.next()).a(false);
            }
        }
    }
}
