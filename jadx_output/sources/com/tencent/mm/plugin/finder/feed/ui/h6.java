package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class h6 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.p6 f110110d;

    public h6(com.tencent.mm.plugin.finder.feed.ui.p6 p6Var) {
        this.f110110d = p6Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        so2.e5 e5Var = (so2.e5) holder.f293125i;
        kotlin.jvm.internal.o.d(e5Var);
        com.tencent.mm.plugin.finder.feed.ui.p6 p6Var = this.f110110d;
        p6Var.getClass();
        java.util.List c17 = kz5.b0.c(new com.tencent.mm.plugin.finder.feed.ui.b6(e5Var));
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = p6Var.f110408q;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        java.lang.String inEditTextQuery = fTSSearchView.getFtsEditText().getInEditTextQuery();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView2 = p6Var.f110408q;
        if (fTSSearchView2 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView2.getFtsEditText().n(inEditTextQuery, c17);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = c17.iterator();
        while (it.hasNext()) {
            java.lang.String string = ((com.tencent.mm.plugin.finder.feed.ui.b6) it.next()).f109697d.f410330d.getString(0);
            if (string == null) {
                string = "";
            }
            linkedList.add(string);
        }
        p6Var.f110398d.hideVKB();
        kotlin.jvm.internal.o.d(inEditTextQuery);
        p6Var.f110399e.h(inEditTextQuery, linkedList);
    }
}
