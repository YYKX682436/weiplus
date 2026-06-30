package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class ws implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f104900a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f104901b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f104902c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104904e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f104905f;

    public ws(long j17, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, java.lang.String str, java.lang.String str2, r45.qt2 qt2Var) {
        this.f104900a = j17;
        this.f104901b = baseFinderFeed;
        this.f104902c = i17;
        this.f104903d = str;
        this.f104904e = str2;
        this.f104905f = qt2Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[8];
        lVarArr[0] = new jz5.l("source_feedid", pm0.v.u(this.f104900a));
        lVarArr[1] = new jz5.l("feed_id", pm0.v.u(this.f104901b.getItemId()));
        lVarArr[2] = new jz5.l("profile_feed_index", java.lang.Integer.valueOf(this.f104902c));
        lVarArr[3] = new jz5.l("source_feed_sessionbuffer", this.f104903d);
        lVarArr[4] = new jz5.l("session_buffer", this.f104904e);
        r45.qt2 qt2Var = this.f104905f;
        lVarArr[5] = new jz5.l("finder_context_id", qt2Var != null ? qt2Var.getString(1) : null);
        lVarArr[6] = new jz5.l("finder_tab_context_id", qt2Var != null ? qt2Var.getString(2) : null);
        lVarArr[7] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : null);
        return kz5.c1.k(lVarArr);
    }
}
