package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes12.dex */
public class h1 {

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h1 f258088c = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h1();

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 f258089a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f258090b = new java.util.concurrent.locks.ReentrantLock();

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h1 h1Var = f258088c;
        if (h1Var.f258089a == null) {
            h1Var.f258090b.lock();
            try {
                if (h1Var.f258089a == null) {
                    h1Var.f258089a = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1();
                }
            } finally {
                h1Var.f258090b.unlock();
            }
        }
        return h1Var.f258089a;
    }
}
