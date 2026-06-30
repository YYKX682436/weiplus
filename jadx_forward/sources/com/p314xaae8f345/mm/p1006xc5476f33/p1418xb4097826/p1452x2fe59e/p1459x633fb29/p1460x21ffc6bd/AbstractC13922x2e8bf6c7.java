package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/internal/Dispatcher;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/r0;", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, "Lcom/tencent/mm/plugin/finder/feed/model/internal/DataStore;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/j0;", "dispatcher", "Lym5/q1;", "callback", "", "isAutoAlive", "Ljz5/f0;", "register", "unregister", "Ljava/util/LinkedList;", "viewCallbacks", "Ljava/util/LinkedList;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/a0;", "merger", "Lcom/tencent/mm/plugin/finder/feed/model/internal/a0;", "getMerger", "()Lcom/tencent/mm/plugin/finder/feed/model/internal/a0;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/j0;", "<init>", "()V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher */
/* loaded from: classes2.dex */
public abstract class AbstractC13922x2e8bf6c7<T extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0> extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13921x61207337<T> {
    private final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.j0 dispatcher;
    private final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0 merger;
    private final java.util.LinkedList<ym5.q1> viewCallbacks;

    public AbstractC13922x2e8bf6c7() {
        java.util.LinkedList<ym5.q1> linkedList = new java.util.LinkedList<>();
        this.viewCallbacks = linkedList;
        this.merger = mo55748xaddc49a0();
        this.dispatcher = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.j0(linkedList);
    }

    /* renamed from: register$default */
    public static /* synthetic */ void m56397xe61f0140(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13922x2e8bf6c7 abstractC13922x2e8bf6c7, ym5.q1 q1Var, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        abstractC13922x2e8bf6c7.m56400xd6dc2ea3(q1Var, z17);
    }

    /* renamed from: createDataMerger */
    public abstract com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0 mo55748xaddc49a0();

    /* renamed from: dispatcher, reason: from getter */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.j0 getDispatcher() {
        return this.dispatcher;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0 getMerger() {
        return this.merger;
    }

    /* renamed from: onAlive */
    public abstract void mo56107xaf4f6e2e();

    /* renamed from: onDead */
    public abstract void mo56109xc39876e3();

    /* renamed from: register */
    public final void m56400xd6dc2ea3(ym5.q1 callback, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.viewCallbacks.add(callback);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getTAG(), "register callback " + callback + " size:" + this.viewCallbacks.size());
        if (z17 && this.viewCallbacks.size() == 1) {
            mo56107xaf4f6e2e();
        }
    }

    /* renamed from: unregister */
    public final void m56401x31d4943c(ym5.q1 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.LinkedList<ym5.q1> linkedList = this.viewCallbacks;
        synchronized (linkedList) {
            for (ym5.q1 q1Var : linkedList) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(q1Var, callback)) {
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
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        sb6.append('}');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, sb6.toString());
        if (this.viewCallbacks.size() == 0) {
            mo56109xc39876e3();
        }
    }
}
