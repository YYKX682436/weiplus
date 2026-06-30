package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2;

/* loaded from: classes2.dex */
public final class f0 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 f203833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.vx0 f203834b;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 l0Var, r45.vx0 vx0Var) {
        this.f203833a = l0Var;
        this.f203834b = vx0Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 l0Var = this.f203833a;
        java.util.Map s17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0.s(l0Var, null, 1, null);
        if (s17 == null) {
            return null;
        }
        r45.vx0 vx0Var = this.f203834b;
        s17.put("collection_type", vx0Var != null ? java.lang.Integer.valueOf(vx0Var.m75939xb282bd08(9)) : null);
        s17.put("feed_id", pm0.v.u(l0Var.f203871d.h().f203814a));
        return s17;
    }
}
