package com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47;

/* loaded from: classes8.dex */
public class s implements n75.b {

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.s f156238e = new com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.s();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f156239d = false;

    @Override // n75.b
    public l75.k0 Q4() {
        if (!this.f156239d) {
            synchronized (this) {
                if (!this.f156239d) {
                    dm.a2.m124781xe1f0e832(gm0.j1.u().f354686f);
                }
                this.f156239d = true;
            }
        }
        return gm0.j1.u().f354686f;
    }
}
