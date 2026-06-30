package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui;

/* loaded from: classes11.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final int f232298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.ActivityC16633xa26a1872 f232299e;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.ActivityC16633xa26a1872 activityC16633xa26a1872, int i17) {
        this.f232299e = activityC16633xa26a1872;
        this.f232298d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        kl3.z zVar = (kl3.z) ((kl3.i) sl3.b.b(kl3.i.class));
        java.util.ArrayList arrayList = (java.util.ArrayList) zVar.f390389e;
        if (arrayList.size() != 0) {
            int size = (this.f232298d - 100000) % arrayList.size();
            if (size < 0) {
                size += arrayList.size();
            }
            if (size != zVar.f390388d) {
                zVar.f390388d = size;
                ((kl3.t) zVar.B()).n(null);
            }
        }
        ql3.a z17 = ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).z();
        if (z17 == null) {
            return;
        }
        boolean t07 = z17.t0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.ActivityC16633xa26a1872 activityC16633xa26a1872 = this.f232299e;
        if (t07) {
            activityC16633xa26a1872.V6(z17);
        }
        if (((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).y()) {
            activityC16633xa26a1872.f232239h.m78873x6e5cce43(true);
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.ActivityC16633xa26a1872.I;
        activityC16633xa26a1872.X6(z17);
    }
}
