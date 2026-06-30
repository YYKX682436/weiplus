package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class x4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f102679e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qd2.g1 f102680f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, qd2.g1 g1Var) {
        super(0);
        this.f102678d = context;
        this.f102679e = baseFinderFeed;
        this.f102680f = g1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.xn2 xn2Var;
        com.tencent.mm.plugin.finder.assist.n5 n5Var = com.tencent.mm.plugin.finder.assist.n5.f102402a;
        android.content.Context context = this.f102678d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f102679e;
        long itemId = baseFinderFeed.getItemId();
        java.lang.String objectNonceId = baseFinderFeed.getFeedObject().getObjectNonceId();
        r45.ao2 ao2Var = this.f102680f.f361763q;
        if (ao2Var != null) {
            r45.xn2 xn2Var2 = new r45.xn2();
            xn2Var2.getList(0).add(java.lang.Integer.valueOf(ao2Var.getInteger(0)));
            xn2Var = xn2Var2;
        } else {
            xn2Var = null;
        }
        com.tencent.mm.plugin.finder.assist.n5.c(n5Var, context, itemId, null, objectNonceId, xn2Var, new com.tencent.mm.plugin.finder.assist.w4(this.f102678d, baseFinderFeed), 4, null);
        return jz5.f0.f302826a;
    }
}
