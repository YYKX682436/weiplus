package com.tencent.mm.plugin.finder.feed.model.internal;

/* loaded from: classes2.dex */
public abstract class p0 {
    public static final com.tencent.mm.plugin.finder.feed.model.internal.o0 Companion = new com.tencent.mm.plugin.finder.feed.model.internal.o0(null);
    private static final boolean DEBUG = false;
    private java.lang.String TAG = "Finder." + getClass().getSimpleName() + '_' + hashCode();

    public static /* synthetic */ void fetch$default(com.tencent.mm.plugin.finder.feed.model.internal.p0 p0Var, java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var, boolean z17, int i17, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetch");
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        p0Var.fetch(obj, n0Var, z17);
    }

    public static /* synthetic */ void fetchLoadMore$default(com.tencent.mm.plugin.finder.feed.model.internal.p0 p0Var, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchLoadMore");
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        p0Var.fetchLoadMore(n0Var, z17);
    }

    public void alive() {
        com.tencent.mars.xlog.Log.i(getTAG(), "alive.");
    }

    public void dead() {
        com.tencent.mars.xlog.Log.i(getTAG(), "dead.");
    }

    public void fetch(java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    public abstract void fetchInit(com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var);

    public abstract void fetchLoadMore(com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var, boolean z17);

    public void fetchPreload(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    public abstract void fetchRefresh(com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var);

    public java.lang.String getTAG() {
        return this.TAG;
    }

    public void setTAG(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.TAG = str;
    }
}
