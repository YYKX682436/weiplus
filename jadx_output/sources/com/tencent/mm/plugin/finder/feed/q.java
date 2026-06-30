package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class q implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.c0 f108780d;

    public q(com.tencent.mm.plugin.finder.feed.c0 c0Var) {
        this.f108780d = c0Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.wh2 req = (r45.wh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        int integer = ret.getInteger(1);
        com.tencent.mm.plugin.finder.feed.c0 c0Var = this.f108780d;
        if (integer == 0) {
            db5.t7.makeText(c0Var.f106421d, com.tencent.mm.R.string.cwh, 0).show();
            return;
        }
        db5.t7.makeText(c0Var.f106421d, com.tencent.mm.R.string.cwg, 0).show();
        com.tencent.mars.xlog.Log.i(c0Var.v(), "finder_feed_open_comment_no_ok " + ret.getInteger(1));
    }
}
