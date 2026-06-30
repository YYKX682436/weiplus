package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class kx implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f107257d;

    public kx(com.tencent.mm.plugin.finder.feed.pz pzVar) {
        this.f107257d = pzVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.wh2 req = (r45.wh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        int integer = ret.getInteger(1);
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f107257d;
        if (integer == 0) {
            db5.t7.makeText(pzVar.f108755g, com.tencent.mm.R.string.cwh, 0).show();
            return;
        }
        db5.t7.makeText(pzVar.f108755g, com.tencent.mm.R.string.cwg, 0).show();
        com.tencent.mars.xlog.Log.i(pzVar.U, "finder_feed_open_comment_no_ok " + ret.getInteger(1));
    }
}
