package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class vp implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.kr f110920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f110921e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f110922f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f110923g;

    public vp(com.tencent.mm.plugin.finder.feed.kr krVar, boolean z17, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var) {
        this.f110920d = krVar;
        this.f110921e = z17;
        this.f110922f = baseFinderFeed;
        this.f110923g = s0Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.wh2 req = (r45.wh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        int integer = ret.getInteger(1);
        boolean z17 = this.f110921e;
        com.tencent.mm.plugin.finder.feed.kr krVar = this.f110920d;
        if (integer == 0) {
            com.tencent.mars.xlog.Log.i(krVar.f107243t, "modifyFeedBullet: isClose = " + z17 + ", success");
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.up(z17, this.f110922f, krVar, this.f110923g));
            db5.t7.makeText(krVar.f107230d, z17 ? com.tencent.mm.R.string.f491362cv3 : com.tencent.mm.R.string.cwe, 0).show();
            return;
        }
        com.tencent.mars.xlog.Log.i(krVar.f107243t, "modifyFeedBullet: isClose = " + z17 + ", resultCode = " + ret.getInteger(1));
        db5.t7.makeText(krVar.f107230d, z17 ? com.tencent.mm.R.string.f491361cv2 : com.tencent.mm.R.string.cwd, 0).show();
    }
}
