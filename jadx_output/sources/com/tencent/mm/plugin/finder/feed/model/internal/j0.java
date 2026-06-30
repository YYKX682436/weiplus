package com.tencent.mm.plugin.finder.feed.model.internal;

/* loaded from: classes2.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f108008a;

    public j0(java.util.LinkedList viewCallbacks) {
        kotlin.jvm.internal.o.g(viewCallbacks, "viewCallbacks");
        this.f108008a = viewCallbacks;
    }

    public static void f(com.tencent.mm.plugin.finder.feed.model.internal.j0 j0Var, ym5.s3 reason, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        j0Var.getClass();
        kotlin.jvm.internal.o.g(reason, "reason");
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.internal.h0(j0Var, z17, reason));
    }

    public final void a() {
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.internal.c0(this));
    }

    public final void b(int i17, int i18) {
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.internal.d0(this, i17, i18));
    }

    public final void c(int i17, int i18, java.lang.Object obj) {
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.internal.e0(this, i17, i18, obj));
    }

    public final void d(int i17, int i18) {
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.internal.f0(this, i17, i18));
    }

    public final void e(int i17, int i18) {
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.internal.g0(this, i17, i18));
    }

    public final void g(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.internal.i0(this, reason));
    }
}
