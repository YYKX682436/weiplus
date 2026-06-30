package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class o0 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a1 f108610d;

    public o0(com.tencent.mm.plugin.finder.feed.a1 a1Var) {
        this.f108610d = a1Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f108610d.K(adapter, view, i17);
    }
}
