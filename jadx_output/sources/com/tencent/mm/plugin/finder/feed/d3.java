package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class d3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f106539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f106540e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f106541f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f106542g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(com.tencent.mm.plugin.finder.feed.a7 a7Var, so2.y0 y0Var, yz5.a aVar, yz5.a aVar2) {
        super(0);
        this.f106539d = a7Var;
        this.f106540e = y0Var;
        this.f106541f = aVar;
        this.f106542g = aVar2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f106539d;
        android.content.Context context = a7Var.f106207d;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = a7Var.f106212i;
        if (finderItem == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        o3Var.Di(context, finderItem);
        android.content.Context context2 = a7Var.f106207d;
        kotlin.jvm.internal.o.g(context2, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        so2.y0 y0Var = this.f106540e;
        long t07 = y0Var.f410703d.t0();
        long j17 = y0Var.f410703d.field_feedId;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = a7Var.f106212i;
        if (finderItem2 == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        java.lang.String dupFlag = finderItem2.getDupFlag();
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem3 = a7Var.f106212i;
        if (finderItem3 == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        pq5.g l17 = new db2.h(t07, j17, dupFlag, finderItem3.getObjectNonceId(), a7Var.f106215n, V6).l();
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        l17.f((com.tencent.mm.ui.MMActivity) context2);
        l17.h(new com.tencent.mm.plugin.finder.feed.c3(this.f106541f, this.f106542g));
        return jz5.f0.f302826a;
    }
}
