package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes.dex */
public final class ws implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f186433a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f186434b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f186435c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186437e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f186438f;

    public ws(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, int i17, java.lang.String str, java.lang.String str2, r45.qt2 qt2Var) {
        this.f186433a = j17;
        this.f186434b = abstractC14490x69736cb5;
        this.f186435c = i17;
        this.f186436d = str;
        this.f186437e = str2;
        this.f186438f = qt2Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[8];
        lVarArr[0] = new jz5.l("source_feedid", pm0.v.u(this.f186433a));
        lVarArr[1] = new jz5.l("feed_id", pm0.v.u(this.f186434b.mo2128x1ed62e84()));
        lVarArr[2] = new jz5.l("profile_feed_index", java.lang.Integer.valueOf(this.f186435c));
        lVarArr[3] = new jz5.l("source_feed_sessionbuffer", this.f186436d);
        lVarArr[4] = new jz5.l("session_buffer", this.f186437e);
        r45.qt2 qt2Var = this.f186438f;
        lVarArr[5] = new jz5.l("finder_context_id", qt2Var != null ? qt2Var.m75945x2fec8307(1) : null);
        lVarArr[6] = new jz5.l("finder_tab_context_id", qt2Var != null ? qt2Var.m75945x2fec8307(2) : null);
        lVarArr[7] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)) : null);
        return kz5.c1.k(lVarArr);
    }
}
