package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

/* loaded from: classes7.dex */
public enum j0 {
    /* JADX INFO: Fake field, exist only in values array */
    X5,
    MMV8,
    /* JADX INFO: Fake field, exist only in values array */
    WebViewBased,
    /* JADX INFO: Fake field, exist only in values array */
    NativeScript,
    NodeJS,
    J2V8,
    /* JADX INFO: Fake field, exist only in values array */
    WebViewX5,
    WebViewXW,
    WebViewSystem,
    Invalid;


    /* renamed from: m, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j0[] f169416m;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j0 j0Var = MMV8;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j0 j0Var2 = NodeJS;
        f169416m = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j0[]{j0Var, J2V8, j0Var2};
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j0 a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar) {
        if (tVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.g) {
            return J2V8;
        }
        if (tVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.o0) {
            return NodeJS;
        }
        boolean z17 = tVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j0 j0Var = Invalid;
        if (z17) {
            return j0Var;
        }
        if (!(tVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb)) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            return j0Var;
        }
        boolean z18 = tVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.na;
        java.lang.Object obj = tVar;
        if (z18) {
            obj = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.na) tVar).f168460d;
        }
        if (obj instanceof com.p314xaae8f345.p3210x3857dc.C27816xac2547f9) {
            com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9 = (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9) obj;
            if (c27816xac2547f9.m120170x43962b60()) {
                return WebViewSystem;
            }
            if (c27816xac2547f9.m120171x1f05d274()) {
                return WebViewXW;
            }
        }
        return j0Var;
    }
}
