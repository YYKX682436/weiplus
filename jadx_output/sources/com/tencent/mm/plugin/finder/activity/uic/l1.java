package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes2.dex */
public final class l1 implements in5.x {
    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        ra2.b bVar = (ra2.b) holder.f293125i;
        bVar.f393485e.a(i17);
        bVar.f393485e.notifyObservers();
        adapter.notifyDataSetChanged();
    }
}
