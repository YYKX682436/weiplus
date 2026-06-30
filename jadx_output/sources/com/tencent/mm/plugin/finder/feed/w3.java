package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class w3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f110950d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        super(1);
        this.f110950d = a7Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String b17;
        fp0.r task = (fp0.r) obj;
        kotlin.jvm.internal.o.g(task, "task");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadPrevPage before lastBuffer ");
        if (this.f110950d.f106222s == null) {
            b17 = "null";
        } else {
            com.tencent.mm.protobuf.g gVar = this.f110950d.f106222s;
            b17 = com.tencent.mm.sdk.platformtools.w2.b(gVar != null ? gVar.g() : null);
        }
        sb6.append(b17);
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", sb6.toString());
        android.content.Context context = this.f110950d.f106207d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.feed.a7.y(this.f110950d, nyVar != null ? nyVar.f135380n : 0, task);
        return jz5.f0.f302826a;
    }
}
