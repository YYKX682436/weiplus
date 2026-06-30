package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class am implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.em f106312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f106313e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f106314f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f106315g;

    public am(com.tencent.mm.plugin.finder.feed.em emVar, boolean z17, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var) {
        this.f106312d = emVar;
        this.f106313e = z17;
        this.f106314f = baseFinderFeed;
        this.f106315g = s0Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.wh2 req = (r45.wh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        int integer = ret.getInteger(1);
        boolean z17 = this.f106313e;
        com.tencent.mm.plugin.finder.feed.em emVar = this.f106312d;
        if (integer == 0) {
            com.tencent.mars.xlog.Log.i(emVar.f106569s, "modifyFeedBullet: isClose = " + z17 + ", success");
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.zl(z17, this.f106314f, emVar, this.f106315g));
            db5.t7.makeText(emVar.f106421d, z17 ? com.tencent.mm.R.string.f491362cv3 : com.tencent.mm.R.string.cwe, 0).show();
            return;
        }
        com.tencent.mars.xlog.Log.i(emVar.f106569s, "modifyFeedBullet: isClose = " + z17 + ", resultCode = " + ret.getInteger(1));
        db5.t7.makeText(emVar.f106421d, z17 ? com.tencent.mm.R.string.f491361cv2 : com.tencent.mm.R.string.cwd, 0).show();
    }
}
