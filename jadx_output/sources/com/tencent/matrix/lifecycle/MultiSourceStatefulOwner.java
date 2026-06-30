package com.tencent.matrix.lifecycle;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B5\u0012\u0018\u0010\u0017\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\u0012\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0019\"\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0001H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0001H\u0016J\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0001H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R&\u0010\u0017\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u000f0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/tencent/matrix/lifecycle/MultiSourceStatefulOwner;", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "Lcom/tencent/matrix/lifecycle/k;", "", "Lcom/tencent/matrix/lifecycle/IStatefulOwner;", "owner", "Ljz5/f0;", "register", "unregister", "onStateChanged", "addSourceOwner", "Landroidx/lifecycle/y;", "removeSourceOwner", "on", "off", "", "active", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "sourceOwners", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lkotlin/Function1;", "", "Lcom/tencent/matrix/lifecycle/l;", "reduceOperator", "Lyz5/l;", "", "statefulOwners", "<init>", "(Lyz5/l;[Lcom/tencent/matrix/lifecycle/IStatefulOwner;)V", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public class MultiSourceStatefulOwner extends com.tencent.matrix.lifecycle.StatefulOwner implements com.tencent.matrix.lifecycle.k {
    private final yz5.l reduceOperator;
    private final java.util.concurrent.ConcurrentLinkedQueue<com.tencent.matrix.lifecycle.IStatefulOwner> sourceOwners;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiSourceStatefulOwner(yz5.l reduceOperator, com.tencent.matrix.lifecycle.IStatefulOwner... statefulOwners) {
        super(true);
        kotlin.jvm.internal.o.g(reduceOperator, "reduceOperator");
        kotlin.jvm.internal.o.g(statefulOwners, "statefulOwners");
        this.reduceOperator = reduceOperator;
        this.sourceOwners = new java.util.concurrent.ConcurrentLinkedQueue<>();
        for (com.tencent.matrix.lifecycle.IStatefulOwner iStatefulOwner : statefulOwners) {
            register(iStatefulOwner);
        }
    }

    private final void onStateChanged() {
        if (((java.lang.Boolean) this.reduceOperator.invoke(this.sourceOwners)).booleanValue()) {
            turnOn();
        } else {
            turnOff();
        }
    }

    private final void register(com.tencent.matrix.lifecycle.IStatefulOwner iStatefulOwner) {
        if (iStatefulOwner instanceof com.tencent.matrix.lifecycle.MultiSourceStatefulOwner) {
            throw new java.lang.IllegalArgumentException("NOT allow to add MultiSourceStatefulOwner as source, consider to add its shadow owner");
        }
        this.sourceOwners.add(iStatefulOwner);
        iStatefulOwner.observeForever(this);
    }

    private final void unregister(com.tencent.matrix.lifecycle.StatefulOwner statefulOwner) {
        this.sourceOwners.remove(statefulOwner);
        statefulOwner.removeObserver(this);
        onStateChanged();
    }

    @Override // com.tencent.matrix.lifecycle.StatefulOwner, com.tencent.matrix.lifecycle.IStatefulOwner, com.tencent.matrix.lifecycle.l
    public boolean active() {
        if (this.sourceOwners.isEmpty()) {
            return super.active();
        }
        java.lang.Boolean bool = (java.lang.Boolean) this.reduceOperator.invoke(this.sourceOwners);
        if (bool.booleanValue()) {
            turnOn();
        } else {
            turnOff();
        }
        return bool.booleanValue();
    }

    public void addSourceOwner(com.tencent.matrix.lifecycle.StatefulOwner owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        register(owner);
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void off() {
        onStateChanged();
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void on() {
        onStateChanged();
    }

    public void removeSourceOwner(com.tencent.matrix.lifecycle.StatefulOwner owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        unregister(owner);
    }

    public com.tencent.matrix.lifecycle.StatefulOwner addSourceOwner(androidx.lifecycle.y owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        com.tencent.matrix.lifecycle.LifecycleDelegateStatefulOwner.Companion.getClass();
        com.tencent.matrix.lifecycle.LifecycleDelegateStatefulOwner lifecycleDelegateStatefulOwner = new com.tencent.matrix.lifecycle.LifecycleDelegateStatefulOwner(owner, false, 2, null);
        addSourceOwner(lifecycleDelegateStatefulOwner);
        return lifecycleDelegateStatefulOwner;
    }
}
