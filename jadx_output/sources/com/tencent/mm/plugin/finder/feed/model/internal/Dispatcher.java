package com.tencent.mm.plugin.finder.feed.model.internal;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/internal/Dispatcher;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/r0;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Lcom/tencent/mm/plugin/finder/feed/model/internal/DataStore;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/j0;", "dispatcher", "Lym5/q1;", "callback", "", "isAutoAlive", "Ljz5/f0;", "register", "unregister", "Ljava/util/LinkedList;", "viewCallbacks", "Ljava/util/LinkedList;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/a0;", "merger", "Lcom/tencent/mm/plugin/finder/feed/model/internal/a0;", "getMerger", "()Lcom/tencent/mm/plugin/finder/feed/model/internal/a0;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/j0;", "<init>", "()V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class Dispatcher<T extends com.tencent.mm.plugin.finder.feed.model.internal.r0> extends com.tencent.mm.plugin.finder.feed.model.internal.DataStore<T> {
    private final com.tencent.mm.plugin.finder.feed.model.internal.j0 dispatcher;
    private final com.tencent.mm.plugin.finder.feed.model.internal.a0 merger;
    private final java.util.LinkedList<ym5.q1> viewCallbacks;

    public Dispatcher() {
        java.util.LinkedList<ym5.q1> linkedList = new java.util.LinkedList<>();
        this.viewCallbacks = linkedList;
        this.merger = createDataMerger();
        this.dispatcher = new com.tencent.mm.plugin.finder.feed.model.internal.j0(linkedList);
    }

    public static /* synthetic */ void register$default(com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher dispatcher, ym5.q1 q1Var, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        dispatcher.register(q1Var, z17);
    }

    public abstract com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger();

    /* renamed from: dispatcher, reason: from getter */
    public final com.tencent.mm.plugin.finder.feed.model.internal.j0 getDispatcher() {
        return this.dispatcher;
    }

    public final com.tencent.mm.plugin.finder.feed.model.internal.a0 getMerger() {
        return this.merger;
    }

    public abstract void onAlive();

    public abstract void onDead();

    public final void register(ym5.q1 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.viewCallbacks.add(callback);
        com.tencent.mars.xlog.Log.i(getTAG(), "register callback " + callback + " size:" + this.viewCallbacks.size());
        if (z17 && this.viewCallbacks.size() == 1) {
            onAlive();
        }
    }

    public final void unregister(ym5.q1 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.LinkedList<ym5.q1> linkedList = this.viewCallbacks;
        synchronized (linkedList) {
            for (ym5.q1 q1Var : linkedList) {
                if (kotlin.jvm.internal.o.b(q1Var, callback)) {
                    this.viewCallbacks.remove(q1Var);
                }
            }
        }
        java.lang.String tag = getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unregister callback ");
        sb6.append(callback);
        sb6.append(" size ");
        sb6.append(this.viewCallbacks.size());
        sb6.append(" from ");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        sb6.append('}');
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        if (this.viewCallbacks.size() == 0) {
            onDead();
        }
    }
}
