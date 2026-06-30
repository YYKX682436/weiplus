package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes8.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f270447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h3 f270448e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f f270449f;

    public h(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f fVar, int i17, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h3 h3Var) {
        this.f270449f = fVar;
        this.f270447d = i17;
        this.f270448e = h3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f fVar = this.f270449f;
        java.util.Map map = fVar.f270416d;
        int i17 = this.f270447d;
        if (((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17)) != null) {
            ((java.util.Set) ((java.util.HashMap) fVar.f270416d).get(java.lang.Integer.valueOf(i17))).remove(this.f270448e);
        }
    }
}
