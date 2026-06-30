package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class p3 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f104233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f104234e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.u4 f104235f;

    public p3(so2.y0 y0Var, int i17, com.tencent.mm.plugin.finder.convert.u4 u4Var) {
        this.f104233d = y0Var;
        this.f104234e = i17;
        this.f104235f = u4Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.nh2 req = (r45.nh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        r45.oh2 oh2Var = new r45.oh2();
        com.tencent.mm.protobuf.g byteString = ret.getByteString(3);
        if (byteString != null) {
            oh2Var.parseFrom(byteString.g());
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("modComment level1 item=");
        sb6.append(this.f104233d.getItemId());
        sb6.append(" opType=");
        int i17 = this.f104234e;
        sb6.append(i17);
        sb6.append(",ret=");
        sb6.append(ret.getInteger(1));
        sb6.append(',');
        sb6.append(ret.getString(2));
        sb6.append(",affected_comment_ids=");
        sb6.append(oh2Var.getList(0));
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedCommentConvert", sb6.toString());
        if (i17 == 4) {
            java.util.LinkedList<java.lang.Long> list = oh2Var.getList(0);
            kotlin.jvm.internal.o.f(list, "getAffected_comment_ids(...)");
            for (java.lang.Long l17 : list) {
                com.tencent.mm.plugin.finder.convert.u4 u4Var = this.f104235f;
                com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter nPresenter = u4Var.f104670e;
                kotlin.jvm.internal.o.d(l17);
                so2.y0 N = nPresenter.N(l17.longValue());
                if (N != null) {
                    so2.g0.f(N, false);
                    u4Var.f104670e.g0(l17.longValue());
                }
            }
        }
    }
}
