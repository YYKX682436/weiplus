package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes8.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f270433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h3 f270434e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f f270435f;

    public g(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f fVar, int i17, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h3 h3Var) {
        this.f270435f = fVar;
        this.f270433d = i17;
        this.f270434e = h3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f fVar = this.f270435f;
        java.util.Map map = fVar.f270416d;
        int i17 = this.f270433d;
        if (!((java.util.HashMap) map).containsKey(java.lang.Integer.valueOf(i17))) {
            ((java.util.HashMap) fVar.f270416d).put(java.lang.Integer.valueOf(i17), new java.util.HashSet());
        }
        if (((java.util.HashMap) fVar.f270416d).get(java.lang.Integer.valueOf(i17)) != null) {
            java.util.Set set = (java.util.Set) ((java.util.HashMap) fVar.f270416d).get(java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h3 h3Var = this.f270434e;
            if (set.contains(h3Var)) {
                return;
            }
            ((java.util.Set) ((java.util.HashMap) fVar.f270416d).get(java.lang.Integer.valueOf(i17))).add(h3Var);
        }
    }
}
