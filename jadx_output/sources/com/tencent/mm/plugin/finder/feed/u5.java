package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class u5 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f109139a;

    public u5(com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        this.f109139a = a7Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.tencent.mm.plugin.finder.feed.f7 f7Var = this.f109139a.X;
        boolean z17 = false;
        if (f7Var != null && f7Var.a()) {
            z17 = true;
        }
        return kz5.b1.e(new jz5.l("comment_area_filter_type", java.lang.Integer.valueOf(z17 ? 1 : 2)));
    }
}
