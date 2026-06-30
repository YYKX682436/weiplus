package com.tencent.matrix.lifecycle;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u0006\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0004R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/tencent/matrix/lifecycle/StatefulOwner;", "Lcom/tencent/matrix/lifecycle/IStatefulOwner;", "Lkotlin/Function1;", "Lcom/tencent/matrix/lifecycle/k;", "Ljz5/f0;", "observer", "invokeAsync", "dispatchStateChanged", "", "active", "observeForever", "Landroidx/lifecycle/y;", "lifecycleOwner", "observeWithLifecycle", "removeObserver", "turnOn", "turnOff", "Lcom/tencent/matrix/lifecycle/x0;", "state", "Lcom/tencent/matrix/lifecycle/x0;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/tencent/matrix/lifecycle/r0;", "observerMap", "Ljava/util/concurrent/ConcurrentHashMap;", "async", "Z", "getAsync", "()Z", "<init>", "(Z)V", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public class StatefulOwner implements com.tencent.matrix.lifecycle.IStatefulOwner {
    private final boolean async;
    private final java.util.concurrent.ConcurrentHashMap<com.tencent.matrix.lifecycle.k, com.tencent.matrix.lifecycle.r0> observerMap;
    private volatile com.tencent.matrix.lifecycle.x0 state;

    public StatefulOwner() {
        this(false, 1, null);
    }

    private final void dispatchStateChanged() {
        if (!this.async) {
            for (java.util.Map.Entry<com.tencent.matrix.lifecycle.k, com.tencent.matrix.lifecycle.r0> entry : this.observerMap.entrySet()) {
                yz5.l lVar = this.state.f52908d;
                if (lVar != null) {
                }
            }
            return;
        }
        com.tencent.matrix.lifecycle.x0 x0Var = this.state;
        for (java.util.Map.Entry<com.tencent.matrix.lifecycle.k, com.tencent.matrix.lifecycle.r0> entry2 : this.observerMap.entrySet()) {
            yz5.l lVar2 = x0Var.f52908d;
            if (lVar2 != null) {
                invokeAsync(lVar2, entry2.getKey());
            }
        }
    }

    private final void invokeAsync(yz5.l lVar, com.tencent.matrix.lifecycle.k kVar) {
        if ((kVar instanceof com.tencent.matrix.lifecycle.j) && ((com.tencent.matrix.lifecycle.j) kVar).serial()) {
            com.tencent.matrix.lifecycle.q0.f52785f.a().post(new com.tencent.matrix.lifecycle.y0(lVar, kVar));
        } else {
            com.tencent.matrix.lifecycle.p pVar = com.tencent.matrix.lifecycle.q0.f52780a;
            ((java.util.concurrent.Executor) com.tencent.matrix.lifecycle.q0.f52783d.getValue()).execute(new com.tencent.matrix.lifecycle.z0(lVar, kVar));
        }
    }

    @Override // com.tencent.matrix.lifecycle.IStatefulOwner, com.tencent.matrix.lifecycle.l
    public boolean active() {
        return this.state == com.tencent.matrix.lifecycle.x0.ON;
    }

    public final boolean getAsync() {
        return this.async;
    }

    @Override // com.tencent.matrix.lifecycle.IStatefulOwner
    public synchronized void observeForever(com.tencent.matrix.lifecycle.k observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        com.tencent.matrix.lifecycle.r0 r0Var = this.observerMap.get(observer);
        if (r0Var == null) {
            this.observerMap.put(observer, new com.tencent.matrix.lifecycle.r0(observer, this));
            if (this.async) {
                yz5.l lVar = this.state.f52908d;
                if (lVar != null) {
                    invokeAsync(lVar, observer);
                }
            } else {
                yz5.l lVar2 = this.state.f52908d;
                if (lVar2 != null) {
                }
            }
        } else if (r0Var instanceof com.tencent.matrix.lifecycle.AutoReleaseObserverWrapper) {
            throw new java.lang.IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
    }

    @Override // com.tencent.matrix.lifecycle.IStatefulOwner
    public synchronized void observeWithLifecycle(androidx.lifecycle.y lifecycleOwner, com.tencent.matrix.lifecycle.k observer) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(observer, "observer");
        com.tencent.matrix.lifecycle.r0 r0Var = this.observerMap.get(observer);
        if (r0Var == null) {
            this.observerMap.put(observer, new com.tencent.matrix.lifecycle.AutoReleaseObserverWrapper(lifecycleOwner, this, observer));
            if (this.async) {
                yz5.l lVar = this.state.f52908d;
                if (lVar != null) {
                    invokeAsync(lVar, observer);
                }
            } else {
                yz5.l lVar2 = this.state.f52908d;
                if (lVar2 != null) {
                }
            }
        } else if (r0Var.a(lifecycleOwner)) {
            throw new java.lang.IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
    }

    @Override // com.tencent.matrix.lifecycle.IStatefulOwner
    public synchronized void removeObserver(com.tencent.matrix.lifecycle.k observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        this.observerMap.remove(observer);
    }

    public final synchronized void turnOff() {
        com.tencent.matrix.lifecycle.x0 x0Var = this.state;
        com.tencent.matrix.lifecycle.x0 x0Var2 = com.tencent.matrix.lifecycle.x0.OFF;
        if (x0Var == x0Var2) {
            return;
        }
        this.state = x0Var2;
        dispatchStateChanged();
    }

    public final synchronized void turnOn() {
        com.tencent.matrix.lifecycle.x0 x0Var = this.state;
        com.tencent.matrix.lifecycle.x0 x0Var2 = com.tencent.matrix.lifecycle.x0.ON;
        if (x0Var == x0Var2) {
            return;
        }
        this.state = x0Var2;
        dispatchStateChanged();
    }

    public StatefulOwner(boolean z17) {
        this.async = z17;
        this.state = com.tencent.matrix.lifecycle.x0.INIT;
        this.observerMap = new java.util.concurrent.ConcurrentHashMap<>();
    }

    public /* synthetic */ StatefulOwner(boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? true : z17);
    }
}
