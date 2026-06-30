package com.tencent.matrix.lifecycle.supervisor;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0010\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001cB1\u0012\u0018\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u00170\u0014\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/tencent/matrix/lifecycle/supervisor/DispatcherStateOwner;", "Lcom/tencent/matrix/lifecycle/MultiSourceStatefulOwner;", "Lcom/tencent/matrix/lifecycle/j;", "Ljz5/f0;", "dispatchOn", "dispatchOff", "", "toString", "Lcom/tencent/matrix/lifecycle/k;", "attachedObserver", "Lcom/tencent/matrix/lifecycle/k;", "Lcom/tencent/matrix/lifecycle/IStatefulOwner;", "attachedSource", "Lcom/tencent/matrix/lifecycle/IStatefulOwner;", "getAttachedSource", "()Lcom/tencent/matrix/lifecycle/IStatefulOwner;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lkotlin/Function1;", "", "Lcom/tencent/matrix/lifecycle/l;", "", "reduceOperator", "<init>", "(Lyz5/l;Lcom/tencent/matrix/lifecycle/IStatefulOwner;Ljava/lang/String;)V", "Companion", "com/tencent/matrix/lifecycle/supervisor/c", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public class DispatcherStateOwner extends com.tencent.matrix.lifecycle.MultiSourceStatefulOwner implements com.tencent.matrix.lifecycle.j {
    public static final com.tencent.matrix.lifecycle.supervisor.c Companion = new com.tencent.matrix.lifecycle.supervisor.c(null);
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner> dispatchOwners = new java.util.concurrent.ConcurrentHashMap<>();
    private com.tencent.matrix.lifecycle.k attachedObserver;
    private final com.tencent.matrix.lifecycle.IStatefulOwner attachedSource;
    private final java.lang.String name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DispatcherStateOwner(yz5.l reduceOperator, com.tencent.matrix.lifecycle.IStatefulOwner attachedSource, java.lang.String name) {
        super(reduceOperator, new com.tencent.matrix.lifecycle.IStatefulOwner[0]);
        kotlin.jvm.internal.o.g(reduceOperator, "reduceOperator");
        kotlin.jvm.internal.o.g(attachedSource, "attachedSource");
        kotlin.jvm.internal.o.g(name, "name");
        this.attachedSource = attachedSource;
        this.name = name;
        dispatchOwners.put(name, this);
    }

    public static final /* synthetic */ void access$dispatchOff(com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner dispatcherStateOwner) {
        dispatcherStateOwner.dispatchOff();
    }

    public static final /* synthetic */ void access$dispatchOn(com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner dispatcherStateOwner) {
        dispatcherStateOwner.dispatchOn();
    }

    public static final /* synthetic */ java.util.concurrent.ConcurrentHashMap access$getDispatchOwners$cp() {
        return dispatchOwners;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchOff() {
        turnOff();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchOn() {
        turnOn();
    }

    public final com.tencent.matrix.lifecycle.IStatefulOwner getAttachedSource() {
        return this.attachedSource;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    @Override // com.tencent.matrix.lifecycle.j
    public boolean serial() {
        return true;
    }

    public java.lang.String toString() {
        return "DispatcherStateOwner_" + this.name;
    }
}
