package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes.dex */
public final class mc implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f205512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f205513b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f205514c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205515d;

    public mc(r45.qt2 qt2Var, long j17, int i17, java.lang.String str) {
        this.f205512a = qt2Var;
        this.f205513b = j17;
        this.f205514c = i17;
        this.f205515d = str;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[8];
        r45.qt2 qt2Var = this.f205512a;
        lVarArr[0] = new jz5.l("behaviour_session_id", qt2Var != null ? qt2Var.m75945x2fec8307(0) : null);
        lVarArr[1] = new jz5.l("finder_context_id", qt2Var != null ? qt2Var.m75945x2fec8307(1) : null);
        lVarArr[2] = new jz5.l("finder_tab_context_id", qt2Var != null ? qt2Var.m75945x2fec8307(2) : null);
        lVarArr[3] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)) : null);
        lVarArr[4] = new jz5.l("ref_commentscene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(7)) : null);
        lVarArr[5] = new jz5.l("source_feedid", pm0.v.u(this.f205513b));
        lVarArr[6] = new jz5.l("source_feed_commentScene", java.lang.Integer.valueOf(this.f205514c));
        lVarArr[7] = new jz5.l("source_feed_sessionbuffer", this.f205515d);
        return kz5.c1.k(lVarArr);
    }
}
