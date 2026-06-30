package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class o3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.s3 f108221d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(com.tencent.mm.plugin.finder.feed.model.s3 s3Var) {
        super(0);
        this.f108221d = s3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3("FinderLiveNoticePreLoader", new com.tencent.mm.plugin.finder.feed.model.n3(this.f108221d));
        n3Var.setLogging(false);
        return n3Var;
    }
}
