package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class c4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158562a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j3 f158563b;

    public c4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j3 j3Var, java.lang.String str) {
        this.f158563b = j3Var;
        this.f158562a = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var;
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        if (this.f158563b.f159985d) {
            this.f158563b.g("tryGetProcessPreloadedPageView process EXPIRED, hasWaited[%b]", bool);
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.WASERVICE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.b0 b0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.f170693a;
        iz5.a.e(x0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.NIL);
        java.util.Queue queue = (java.util.Queue) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.f170695c.get(x0Var);
        if (queue == null || queue.isEmpty()) {
            n7Var = null;
        } else {
            n7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) queue.poll();
            iz5.a.g(null, queue.isEmpty());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j3 j3Var = this.f158563b;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = bool;
        objArr[1] = java.lang.Boolean.valueOf(n7Var != null);
        j3Var.h("tryGetProcessPreloadedPageView hasWaited[%b] loaded[%b]", objArr);
        if (n7Var == null) {
            return null;
        }
        if (!bool.booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.g(this.f158563b.f159983b.f156336n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35259x1504001a);
        }
        if (this.f158563b.f159983b.S2(false) == null) {
            km5.u.b().a(new java.lang.RuntimeException("Runtime.getLibReader() == NULL"));
            n7Var.h();
            return null;
        }
        boolean z17 = n7Var.x().compareTo(this.f158563b.f159983b.S2(false)) == 0;
        this.f158563b.h("tryGetProcessPreloadedPageView process preloaded, hasWaited[%b] commLibMatched[%b]", bool, java.lang.Boolean.valueOf(z17));
        if (!z17) {
            n7Var.h();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.b(this.f158563b.f159983b.f156336n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35259x1504001a);
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.e(this.f158563b.f159983b.f156336n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35259x1504001a);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.b(this.f158562a, true).E = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0.PreloadOnProcessCreated;
        } catch (java.lang.Exception unused) {
            this.f158563b.g("tryGetProcessPreloadedPageView process preloaded but get NULL session", new java.lang.Object[0]);
        }
        return n7Var;
    }
}
