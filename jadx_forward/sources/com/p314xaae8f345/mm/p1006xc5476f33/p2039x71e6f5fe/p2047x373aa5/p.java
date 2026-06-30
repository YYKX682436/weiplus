package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5;

/* loaded from: classes13.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17345xe981d116 f241502d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17345xe981d116 c17345xe981d116) {
        this.f241502d = c17345xe981d116;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2046x36f002.C17339x2dbc71fa c17339x2dbc71fa = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2046x36f002.C17339x2dbc71fa.f241362l;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17345xe981d116.A;
        try {
            c17339x2dbc71fa.f241364b = ((xy3.a) this.f241502d.f296835e).d(true);
            c17339x2dbc71fa.c();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanCameraLightDetector", e17, "start error: %s", e17.getMessage());
        }
    }
}
