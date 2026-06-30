package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class t3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f109029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f109030e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f109031f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f109032g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(so2.y0 y0Var, com.tencent.mm.plugin.finder.feed.a7 a7Var, boolean z17, int i17) {
        super(1);
        this.f109029d = y0Var;
        this.f109030e = a7Var;
        this.f109031f = z17;
        this.f109032g = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String b17;
        fp0.r task = (fp0.r) obj;
        kotlin.jvm.internal.o.g(task, "task");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMoreLevel2Comments before lastBuffer ");
        so2.y0 y0Var = this.f109029d;
        if (y0Var.f410703d.u0().getLastBuffer() == null) {
            b17 = "null";
        } else {
            com.tencent.mm.protobuf.g lastBuffer = y0Var.f410703d.u0().getLastBuffer();
            b17 = com.tencent.mm.sdk.platformtools.w2.b(lastBuffer != null ? lastBuffer.g() : null);
        }
        sb6.append(b17);
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", sb6.toString());
        boolean z17 = this.f109031f;
        int i17 = this.f109032g;
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f109030e;
        a7Var.getClass();
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = a7Var.f106212i;
        if (finderItem == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        android.content.Context context = a7Var.f106207d;
        o3Var.Di(context, finderItem);
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
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var = y0Var.f410703d;
        com.tencent.mm.protobuf.g lastBuffer2 = yj0Var.u0().getLastBuffer();
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        new db2.j4(id6, dupFlag, objectNonceId, i17, i18, userName, lastBuffer2, yj0Var, 0L, z17, nyVar != null ? nyVar.V6() : null, 1, a7Var.Z(), a7Var.j0(), 0, 16640, null).l().q(new com.tencent.mm.plugin.finder.feed.u3(y0Var, a7Var)).h(new com.tencent.mm.plugin.finder.feed.v3(a7Var, y0Var, z17, task)).f((com.tencent.mm.ui.MMActivity) context);
        return jz5.f0.f302826a;
    }
}
