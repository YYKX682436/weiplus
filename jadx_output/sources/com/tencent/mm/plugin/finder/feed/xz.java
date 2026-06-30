package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class xz implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.g00 f111126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f111127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.g5 f111128f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.rz f111129g;

    public xz(com.tencent.mm.plugin.finder.feed.g00 g00Var, int i17, so2.g5 g5Var, com.tencent.mm.plugin.finder.feed.rz rzVar) {
        this.f111126d = g00Var;
        this.f111127e = i17;
        this.f111128f = g5Var;
        this.f111129g = rzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.g00 g00Var = this.f111126d;
        g00Var.getClass();
        ym5.s3 s3Var = new ym5.s3(0);
        s3Var.f463517b = this.f111127e;
        s3Var.f463520e = this.f111128f;
        int ordinal = this.f111129g.ordinal();
        com.tencent.mm.plugin.finder.feed.ct ctVar = g00Var.f106798c;
        if (ordinal == 0) {
            if (ctVar != null) {
                ((com.tencent.mm.plugin.finder.feed.v00) ctVar).l().Q(s3Var);
            }
        } else if (ordinal == 1) {
            if (ctVar != null) {
                ((com.tencent.mm.plugin.finder.feed.v00) ctVar).l().O(s3Var);
            }
        } else if (ordinal == 2 && ctVar != null) {
            ((com.tencent.mm.plugin.finder.feed.v00) ctVar).l().Q(s3Var);
        }
    }
}
