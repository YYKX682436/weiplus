package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes5.dex */
public final class g4 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f188355a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f188356b;

    public g4(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var) {
        this.f188355a = j17;
        this.f188356b = a7Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[2];
        lVarArr[0] = new jz5.l("comment_id", pm0.v.u(this.f188355a));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 X = this.f188356b.X();
        lVarArr[1] = new jz5.l("comment_action_type", java.lang.Integer.valueOf((X != null ? X.getTag() : null) != null ? 1 : 0));
        return kz5.c1.k(lVarArr);
    }
}
