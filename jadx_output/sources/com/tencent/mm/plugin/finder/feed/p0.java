package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class p0 implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a1 f108689d;

    public p0(com.tencent.mm.plugin.finder.feed.a1 a1Var) {
        this.f108689d = a1Var;
    }

    @Override // in5.y
    public boolean c(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f108689d.L(adapter, view, i17);
        return true;
    }
}
