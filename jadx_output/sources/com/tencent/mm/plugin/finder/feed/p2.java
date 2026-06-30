package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f108694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f108695b;

    public p2(com.tencent.mm.plugin.finder.feed.a7 a7Var, androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        this.f108695b = a7Var;
        this.f108694a = recyclerView;
    }

    public final void a(long j17, long j18, boolean z17) {
        yw2.a0 a0Var;
        yw2.a0 a0Var2;
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f108694a;
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f108695b;
        if (j17 != 0) {
            int h17 = a7Var.f106210g.h();
            jz5.l c17 = a7Var.f106210g.c(j17);
            if (z17) {
                java.lang.Object obj = c17.f302833d;
                if (((java.lang.Number) obj).intValue() >= 0) {
                    int intValue = ((java.lang.Number) obj).intValue();
                    java.lang.Object obj2 = c17.f302834e;
                    if (intValue + ((java.lang.Number) obj2).intValue() <= h17 && (adapter = recyclerView.getAdapter()) != null) {
                        adapter.notifyItemRangeRemoved(((java.lang.Number) obj).intValue(), ((java.lang.Number) obj2).intValue());
                    }
                }
            }
        } else {
            java.util.ArrayList arrayList = a7Var.f106210g.f108469d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (((so2.y0) next).f410703d.field_localCommentId == j18) {
                    arrayList2.add(next);
                }
            }
            arrayList.removeAll(arrayList2);
        }
        com.tencent.mm.plugin.finder.feed.model.y yVar = a7Var.f106210g;
        if (yVar.f108468c == null) {
            if (yVar.h() == 0 && (a0Var2 = a7Var.f106216o) != null) {
                a0Var2.x();
            }
        } else if (yVar.h() == 1 && (a0Var = a7Var.f106216o) != null) {
            a0Var.x();
        }
        androidx.recyclerview.widget.f2 adapter2 = recyclerView.getAdapter();
        if (adapter2 != null) {
            adapter2.notifyDataSetChanged();
        }
    }

    public final boolean b(com.tencent.mm.plugin.finder.storage.yj0 target, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(target, "target");
        com.tencent.mm.plugin.finder.feed.model.y yVar = this.f108695b.f106210g;
        yVar.getClass();
        long t07 = target.t0();
        java.util.ArrayList arrayList = yVar.f108469d;
        if (t07 == 0) {
            java.util.Iterator it = arrayList.iterator();
            i18 = 0;
            while (it.hasNext()) {
                if (((so2.y0) it.next()).f410703d.field_localCommentId == target.field_localCommentId) {
                    break;
                }
                i18++;
            }
            i18 = -1;
        } else {
            java.util.Iterator it6 = arrayList.iterator();
            i18 = 0;
            while (it6.hasNext()) {
                if (((so2.y0) it6.next()).f410703d.t0() == target.t0()) {
                    break;
                }
                i18++;
            }
            i18 = -1;
        }
        if (i18 >= 0 && i18 < arrayList.size()) {
            so2.y0 y0Var = (so2.y0) arrayList.get(i18);
            y0Var.getClass();
            y0Var.f410703d = target;
        }
        int intValue = java.lang.Integer.valueOf(i18).intValue();
        if (intValue >= 0) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f108694a;
            androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
            if (intValue < (adapter != null ? adapter.getItemCount() : 0)) {
                androidx.recyclerview.widget.f2 adapter2 = recyclerView.getAdapter();
                if (adapter2 != null) {
                    adapter2.notifyItemChanged(intValue, java.lang.Integer.valueOf(i17));
                }
                return true;
            }
        }
        return false;
    }
}
