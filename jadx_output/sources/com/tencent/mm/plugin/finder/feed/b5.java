package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class b5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f106353d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        super(1);
        this.f106353d = a7Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String b17;
        fp0.r task = (fp0.r) obj;
        kotlin.jvm.internal.o.g(task, "task");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadNextPage before lastBuffer ");
        if (this.f106353d.f106222s == null) {
            b17 = "null";
        } else {
            com.tencent.mm.protobuf.g gVar = this.f106353d.f106222s;
            b17 = com.tencent.mm.sdk.platformtools.w2.b(gVar != null ? gVar.g() : null);
        }
        sb6.append(b17);
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", sb6.toString());
        android.content.Context context = this.f106353d.f106207d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        int i17 = nyVar != null ? nyVar.f135380n : 0;
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f106353d;
        a7Var.getClass();
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        android.content.Context context2 = a7Var.f106207d;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = a7Var.f106212i;
        if (finderItem == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        o3Var.Di(context2, finderItem);
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = a7Var.f106212i;
        if (finderItem2 == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        long id6 = finderItem2.getId();
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem3 = a7Var.f106212i;
        if (finderItem3 == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        java.lang.String dupFlag = finderItem3.getDupFlag();
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem4 = a7Var.f106212i;
        if (finderItem4 == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        java.lang.String objectNonceId = finderItem4.getObjectNonceId();
        int i18 = a7Var.f106215n;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem5 = a7Var.f106212i;
        if (finderItem5 == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        java.lang.String userName = finderItem5.getUserName();
        com.tencent.mm.protobuf.g gVar2 = a7Var.f106222s;
        android.content.Context context3 = a7Var.f106207d;
        kotlin.jvm.internal.o.g(context3, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context3 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        pq5.g l17 = new db2.j4(id6, dupFlag, objectNonceId, i17, i18, userName, gVar2, null, 0L, false, nyVar2 != null ? nyVar2.V6() : null, 1, a7Var.Z(), a7Var.j0(), 0, 17280, null).l();
        pq5.g h17 = l17.q(new com.tencent.mm.plugin.finder.feed.z4(a7Var, l17, task)).h(new com.tencent.mm.plugin.finder.feed.a5(a7Var, task));
        android.content.Context context4 = a7Var.f106207d;
        kotlin.jvm.internal.o.e(context4, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        h17.f((com.tencent.mm.ui.MMActivity) context4);
        return jz5.f0.f302826a;
    }
}
