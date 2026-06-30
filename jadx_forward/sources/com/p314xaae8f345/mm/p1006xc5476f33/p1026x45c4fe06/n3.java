package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class n3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f167554a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j3 f167555b;

    public n3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j3 j3Var, java.lang.String str) {
        this.f167555b = j3Var;
        this.f167554a = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.md mdVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.md(this.f167554a);
        mdVar.L0(this.f167555b.f159983b.S2(false));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0 o0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0.PreloadBeforeRuntimeInit;
        mdVar.A3(o0Var);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.b(this.f167555b.f159983b.f156336n, true).E = o0Var;
        } catch (java.lang.Exception unused) {
            this.f167555b.g("doAheadPreloadPageView DONE but get NULL session", new java.lang.Object[0]);
        }
        return mdVar;
    }
}
