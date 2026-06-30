package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class e6 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.p6 f109970d;

    public e6(com.tencent.mm.plugin.finder.feed.ui.p6 p6Var) {
        this.f109970d = p6Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.feed.ui.p6 p6Var = this.f109970d;
        p6Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.feed.ui.a6 a6Var = p6Var.f110399e;
        intent.putExtra("KEY_FAV_QUERY", a6Var.f109660q);
        intent.putExtra("KEY_REQUEST_ID", a6Var.f109661r);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(a6Var.f109662s);
        intent.putExtra("KEY_TAGS", arrayList);
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        w04.l lVar = w04.l.INSTANCE;
        java.util.ArrayList arrayList2 = a6Var.f109663t;
        int i18 = p6Var.f110401g;
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = p6Var.f110398d;
        if (i18 == 2) {
            lVar.b(540999706);
            int a07 = i17 - ((in5.n0) adapter).a0();
            if (a07 < 0 || a07 >= arrayList2.size()) {
                return;
            }
            java.lang.Object obj = arrayList2.get(a07);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            so2.j5 j5Var = (so2.j5) obj;
            if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                com.tencent.mars.xlog.Log.i("Finder.InteractionSearchViewCallback", "onClick " + a07 + " id:" + ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getId() + ", pos:" + a07);
                a6Var.f(i17, j5Var.getItemId());
                a6Var.g(intent, a07);
                iyVar.c(mMFragmentActivity, intent);
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).fj(mMFragmentActivity, intent, 10001);
                return;
            }
            return;
        }
        lVar.b(540999705);
        int a08 = i17 - ((in5.n0) adapter).a0();
        if (a08 < 0 || a08 >= arrayList2.size()) {
            return;
        }
        java.lang.Object obj2 = arrayList2.get(a08);
        kotlin.jvm.internal.o.f(obj2, "get(...)");
        so2.j5 j5Var2 = (so2.j5) obj2;
        if (j5Var2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            a6Var.f(i17, j5Var2.getItemId());
            com.tencent.mars.xlog.Log.i("Finder.InteractionSearchViewCallback", "onClick " + a08 + " id:" + ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2).getFeedObject().getId() + ", pos:" + a08);
            a6Var.g(intent, a08);
            iyVar.c(mMFragmentActivity, intent);
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            i0Var.Dj(context, intent);
        }
    }
}
