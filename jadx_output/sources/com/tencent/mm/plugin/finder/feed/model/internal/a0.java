package com.tencent.mm.plugin.finder.feed.model.internal;

/* loaded from: classes2.dex */
public abstract class a0 {
    private final boolean DEBUG;

    public a0() {
        boolean z17;
        boolean z18;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean z19 = true;
        if (!((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127870p1).getValue()).r()).booleanValue()) {
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                z17 = false;
            }
            if (z17 || z65.c.a()) {
                z18 = true;
            } else {
                kb2.b bVar = kb2.b.f306225a;
                z18 = false;
            }
            if (!z18) {
                z19 = false;
            }
        }
        this.DEBUG = z19;
    }

    public static /* synthetic */ int findMergeIndex$default(com.tencent.mm.plugin.finder.feed.model.internal.a0 a0Var, java.util.ArrayList arrayList, java.util.List list, int i17, java.lang.Object obj, int i18, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findMergeIndex");
        }
        if ((i18 & 8) != 0) {
            obj = null;
        }
        return a0Var.findMergeIndex(arrayList, list, i17, obj);
    }

    public static /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.u0 mergeDataAndNotify$default(com.tencent.mm.plugin.finder.feed.model.internal.a0 a0Var, int i17, java.util.List list, boolean z17, java.lang.Object obj, int i18, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mergeDataAndNotify");
        }
        if ((i18 & 8) != 0) {
            obj = null;
        }
        return a0Var.mergeDataAndNotify(i17, list, z17, obj);
    }

    public static /* synthetic */ void mergeInit$default(com.tencent.mm.plugin.finder.feed.model.internal.a0 a0Var, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse, yz5.l lVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mergeInit");
        }
        if ((i17 & 2) != 0) {
            lVar = null;
        }
        a0Var.mergeInit(iResponse, lVar);
    }

    public static /* synthetic */ void mergeInsert$default(com.tencent.mm.plugin.finder.feed.model.internal.a0 a0Var, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse, yz5.l lVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mergeInsert");
        }
        if ((i17 & 2) != 0) {
            lVar = null;
        }
        a0Var.mergeInsert(iResponse, lVar);
    }

    public static /* synthetic */ void mergeInsertSpecifiedLocation$default(com.tencent.mm.plugin.finder.feed.model.internal.a0 a0Var, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse, com.tencent.mm.plugin.finder.feed.model.internal.t0 t0Var, yz5.l lVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mergeInsertSpecifiedLocation");
        }
        if ((i17 & 4) != 0) {
            lVar = null;
        }
        a0Var.mergeInsertSpecifiedLocation(iResponse, t0Var, lVar);
    }

    public static /* synthetic */ void mergeLoadMore$default(com.tencent.mm.plugin.finder.feed.model.internal.a0 a0Var, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse, yz5.l lVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mergeLoadMore");
        }
        if ((i17 & 2) != 0) {
            lVar = null;
        }
        a0Var.mergeLoadMore(iResponse, lVar);
    }

    public static /* synthetic */ void mergeRefresh$default(com.tencent.mm.plugin.finder.feed.model.internal.a0 a0Var, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse, yz5.l lVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mergeRefresh");
        }
        if ((i17 & 2) != 0) {
            lVar = null;
        }
        a0Var.mergeRefresh(iResponse, lVar);
    }

    public boolean areContentsTheSame(com.tencent.mm.plugin.finder.feed.model.internal.r0 item1, com.tencent.mm.plugin.finder.feed.model.internal.r0 item2) {
        kotlin.jvm.internal.o.g(item1, "item1");
        kotlin.jvm.internal.o.g(item2, "item2");
        return true;
    }

    public boolean areItemsTheSame(com.tencent.mm.plugin.finder.feed.model.internal.r0 item1, com.tencent.mm.plugin.finder.feed.model.internal.r0 item2) {
        kotlin.jvm.internal.o.g(item1, "item1");
        kotlin.jvm.internal.o.g(item2, "item2");
        return item1.d(item2) == 0;
    }

    public final void diff(java.util.List<com.tencent.mm.plugin.finder.feed.model.internal.r0> oldList, java.util.List<com.tencent.mm.plugin.finder.feed.model.internal.r0> newList) {
        kotlin.jvm.internal.o.g(oldList, "oldList");
        kotlin.jvm.internal.o.g(newList, "newList");
        androidx.recyclerview.widget.h0.a(getDiffCallback(oldList, newList), true).a(getListUpdateCallback());
    }

    public boolean diffDetectMoves() {
        return false;
    }

    public boolean finallyHandleMergeList(java.util.ArrayList<com.tencent.mm.plugin.finder.feed.model.internal.r0> srcList, java.util.LinkedList<com.tencent.mm.plugin.finder.feed.model.internal.r0> newList, int i17, int i18, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(srcList, "srcList");
        kotlin.jvm.internal.o.g(newList, "newList");
        return false;
    }

    public int findMergeIndex(java.util.ArrayList srcList, java.util.List newList, int i17, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(srcList, "srcList");
        kotlin.jvm.internal.o.g(newList, "newList");
        return 0;
    }

    public java.lang.Object getChangePayload(com.tencent.mm.plugin.finder.feed.model.internal.r0 item1, com.tencent.mm.plugin.finder.feed.model.internal.r0 item2) {
        kotlin.jvm.internal.o.g(item1, "item1");
        kotlin.jvm.internal.o.g(item2, "item2");
        return null;
    }

    public final boolean getDEBUG() {
        return this.DEBUG;
    }

    public androidx.recyclerview.widget.b0 getDiffCallback(java.util.List<com.tencent.mm.plugin.finder.feed.model.internal.r0> oldList, java.util.List<com.tencent.mm.plugin.finder.feed.model.internal.r0> newList) {
        kotlin.jvm.internal.o.g(oldList, "oldList");
        kotlin.jvm.internal.o.g(newList, "newList");
        return new com.tencent.mm.plugin.finder.feed.model.internal.z(this, oldList, newList);
    }

    public abstract androidx.recyclerview.widget.r1 getListUpdateCallback();

    public abstract com.tencent.mm.plugin.finder.feed.model.internal.u0 mergeDataAndNotify(int i17, java.util.List list, boolean z17, java.lang.Object obj);

    public abstract void mergeInit(com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse, yz5.l lVar);

    public abstract void mergeInsert(com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse, yz5.l lVar);

    public abstract void mergeInsertSpecifiedLocation(com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse, com.tencent.mm.plugin.finder.feed.model.internal.t0 t0Var, yz5.l lVar);

    public abstract void mergeLoadMore(com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse, yz5.l lVar);

    public abstract void mergeRefresh(com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse, yz5.l lVar);

    public boolean needCleanWhenRefresh(java.util.List<com.tencent.mm.plugin.finder.feed.model.internal.r0> newList) {
        kotlin.jvm.internal.o.g(newList, "newList");
        return true;
    }
}
