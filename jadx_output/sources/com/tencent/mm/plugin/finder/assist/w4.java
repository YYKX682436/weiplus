package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class w4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f102651e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        super(0);
        this.f102650d = context;
        this.f102651e = baseFinderFeed;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.assist.n5.f102402a.e(this.f102650d, pm0.v.u(this.f102651e.getItemId()), 1);
        return jz5.f0.f302826a;
    }
}
