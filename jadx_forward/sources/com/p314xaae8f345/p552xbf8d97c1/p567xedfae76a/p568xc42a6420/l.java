package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420;

/* loaded from: classes12.dex */
public final class l implements com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.a {
    public void a(java.lang.Object o17) {
        android.os.Handler handler;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o17, "o");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4670x2e7549c9 c4670x2e7549c9 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4670x2e7549c9.f19946x4fbc8495;
        handler = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4670x2e7549c9.mainHandler;
        handler.post(new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.k(this, o17));
    }

    public void b(java.lang.Object o17) {
        java.util.HashSet hashSet;
        java.util.HashSet hashSet2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o17, "o");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4670x2e7549c9 c4670x2e7549c9 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4670x2e7549c9.f19946x4fbc8495;
        hashSet = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4670x2e7549c9.overlayViews;
        hashSet.remove(o17);
        hashSet2 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4670x2e7549c9.overlayViews;
        if (hashSet2.isEmpty()) {
            c4670x2e7549c9.m40992xc67387b2();
        }
    }
}
