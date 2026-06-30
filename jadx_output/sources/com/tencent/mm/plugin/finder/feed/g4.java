package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes5.dex */
public final class g4 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f106822a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f106823b;

    public g4(long j17, com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        this.f106822a = j17;
        this.f106823b = a7Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[2];
        lVarArr[0] = new jz5.l("comment_id", pm0.v.u(this.f106822a));
        com.tencent.mm.plugin.finder.view.FinderCommentEditText X = this.f106823b.X();
        lVarArr[1] = new jz5.l("comment_action_type", java.lang.Integer.valueOf((X != null ? X.getTag() : null) != null ? 1 : 0));
        return kz5.c1.k(lVarArr);
    }
}
