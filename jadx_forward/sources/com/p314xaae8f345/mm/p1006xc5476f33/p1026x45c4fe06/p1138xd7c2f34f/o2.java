package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes5.dex */
public final class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f166375d;

    public o2(p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f166375d = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3325xe03a0797.p3326xc267989b.q qVar = this.f166375d;
        if (((p3325xe03a0797.p3326xc267989b.r) qVar).n()) {
            ((p3325xe03a0797.p3326xc267989b.r) qVar).d(new java.util.concurrent.TimeoutException());
        }
    }
}
