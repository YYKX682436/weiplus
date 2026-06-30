package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208;

/* loaded from: classes12.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.C15587x9e6f975b f219354d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.C15587x9e6f975b c15587x9e6f975b) {
        this.f219354d = c15587x9e6f975b;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.C15587x9e6f975b c15587x9e6f975b = this.f219354d;
        try {
            c15587x9e6f975b.m63583x337e440d();
        } finally {
            atomicBoolean = c15587x9e6f975b.f36408x2576db3a;
            atomicBoolean.set(false);
            c15587x9e6f975b.f36407xc23a383a = true;
        }
    }
}
